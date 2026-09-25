package org.apache.commons.collections.buffer;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        java.lang.Class<?> wildcardClass3 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        int int9 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        int int5 = unboundedFifoBuffer1.head;
        unboundedFifoBuffer1.tail = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(10);
        java.lang.Class<?> wildcardClass2 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass10 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.tail = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.head;
        int int6 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        int int5 = unboundedFifoBuffer1.head;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator6 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.head;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean1 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        java.lang.Object obj9 = unboundedFifoBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        int int13 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.tail = (byte) 0;
        boolean boolean16 = unboundedFifoBuffer1.add((java.lang.Object) 100);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int19 = unboundedFifoBuffer18.tail;
        unboundedFifoBuffer18.head = 0;
        boolean boolean23 = unboundedFifoBuffer18.add((java.lang.Object) 1.0d);
        int int24 = unboundedFifoBuffer18.size();
        java.util.Iterator iterator25 = unboundedFifoBuffer18.iterator();
        java.lang.Object obj26 = unboundedFifoBuffer18.get();
        boolean boolean27 = unboundedFifoBuffer1.add(obj26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1.0d + "'", obj26, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        unboundedFifoBuffer14.head = 0;
        int int18 = unboundedFifoBuffer14.head;
        unboundedFifoBuffer14.tail = (byte) 1;
        boolean boolean21 = unboundedFifoBuffer1.add((java.lang.Object) (byte) 1);
        java.util.Iterator iterator22 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        boolean boolean11 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator12 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        boolean boolean11 = unboundedFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int14 = unboundedFifoBuffer13.tail;
        unboundedFifoBuffer13.head = 0;
        boolean boolean18 = unboundedFifoBuffer13.add((java.lang.Object) 1.0d);
        int int19 = unboundedFifoBuffer13.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer21 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int22 = unboundedFifoBuffer21.tail;
        int int23 = unboundedFifoBuffer21.size();
        java.lang.Object[] objArray24 = unboundedFifoBuffer21.buffer;
        unboundedFifoBuffer13.buffer = objArray24;
        unboundedFifoBuffer1.buffer = objArray24;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] { null, null });
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        unboundedFifoBuffer14.head = 0;
        int int18 = unboundedFifoBuffer14.head;
        unboundedFifoBuffer14.tail = (byte) 1;
        boolean boolean21 = unboundedFifoBuffer1.add((java.lang.Object) (byte) 1);
        int int22 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '#');
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int5 = unboundedFifoBuffer4.tail;
        unboundedFifoBuffer4.head = 0;
        boolean boolean9 = unboundedFifoBuffer4.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer11 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int12 = unboundedFifoBuffer11.tail;
        int int13 = unboundedFifoBuffer11.size();
        java.lang.Object[] objArray14 = unboundedFifoBuffer11.buffer;
        unboundedFifoBuffer4.buffer = objArray14;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer4.buffer = objArray20;
        unboundedFifoBuffer1.buffer = objArray20;
        int int23 = unboundedFifoBuffer1.size();
        int int24 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        boolean boolean3 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass4 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        int int19 = unboundedFifoBuffer1.head;
        boolean boolean20 = unboundedFifoBuffer1.isEmpty();
        int int21 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        boolean boolean3 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        java.util.Iterator iterator4 = unboundedFifoBuffer0.iterator();
        boolean boolean5 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        unboundedFifoBuffer1.buffer = objArray26;
        java.lang.Object obj29 = unboundedFifoBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = obj29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        boolean boolean11 = unboundedFifoBuffer1.isEmpty();
        boolean boolean13 = unboundedFifoBuffer1.add((java.lang.Object) (byte) 0);
        unboundedFifoBuffer1.tail = (byte) 1;
        int int16 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        java.util.Iterator iterator5 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        java.lang.Object obj9 = unboundedFifoBuffer1.remove();
        int int10 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int13 = unboundedFifoBuffer12.tail;
        int int14 = unboundedFifoBuffer12.size();
        java.lang.Object[] objArray15 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer1.buffer = objArray15;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int19 = unboundedFifoBuffer18.tail;
        unboundedFifoBuffer18.head = 0;
        boolean boolean23 = unboundedFifoBuffer18.add((java.lang.Object) 1.0d);
        int int24 = unboundedFifoBuffer18.size();
        java.util.Iterator iterator25 = unboundedFifoBuffer18.iterator();
        boolean boolean26 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer18);
        boolean boolean27 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, [1.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, [1.0]]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        boolean boolean5 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj9 = unboundedFifoBuffer1.get();
        java.lang.Class<?> wildcardClass10 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer9 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int10 = unboundedFifoBuffer9.tail;
        int int11 = unboundedFifoBuffer9.size();
        java.lang.Object[] objArray12 = unboundedFifoBuffer9.buffer;
        unboundedFifoBuffer1.buffer = objArray12;
        java.lang.Class<?> wildcardClass14 = objArray12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer9 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int10 = unboundedFifoBuffer9.tail;
        int int11 = unboundedFifoBuffer9.size();
        java.lang.Object[] objArray12 = unboundedFifoBuffer9.buffer;
        unboundedFifoBuffer1.buffer = objArray12;
        int int14 = unboundedFifoBuffer1.tail;
        java.lang.Class<?> wildcardClass15 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        boolean boolean2 = unboundedFifoBuffer1.isEmpty();
        int int3 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.head = (byte) 0;
        unboundedFifoBuffer1.head = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        java.lang.Object[] objArray19 = unboundedFifoBuffer1.buffer;
        int int20 = unboundedFifoBuffer1.tail;
        java.util.Iterator iterator21 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        unboundedFifoBuffer1.buffer = objArray26;
        int int29 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator30 = unboundedFifoBuffer1.iterator();
        java.lang.Class<?> wildcardClass31 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        int int19 = unboundedFifoBuffer1.head;
        int int20 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int23 = unboundedFifoBuffer22.tail;
        int int24 = unboundedFifoBuffer22.size();
        java.lang.Object[] objArray25 = unboundedFifoBuffer22.buffer;
        unboundedFifoBuffer1.buffer = objArray25;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] { null, null });
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.head = (byte) 0;
        int int15 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.tail = (byte) 1;
        boolean boolean5 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        java.lang.Object obj9 = unboundedFifoBuffer1.remove();
        int int10 = unboundedFifoBuffer1.head;
        int int11 = unboundedFifoBuffer1.size();
        boolean boolean12 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        boolean boolean2 = unboundedFifoBuffer1.isEmpty();
        int int3 = unboundedFifoBuffer1.tail;
        int int4 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        int int5 = unboundedFifoBuffer1.head;
        boolean boolean6 = unboundedFifoBuffer1.isEmpty();
        int int7 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        boolean boolean3 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        java.lang.Object obj4 = unboundedFifoBuffer0.get();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '4');
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.tail = (byte) 0;
        boolean boolean16 = unboundedFifoBuffer1.add((java.lang.Object) 100);
        int int17 = unboundedFifoBuffer1.head;
        boolean boolean18 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        unboundedFifoBuffer1.buffer = objArray26;
        int int29 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator30 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj31 = unboundedFifoBuffer1.remove();
        int int32 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int35 = unboundedFifoBuffer34.tail;
        unboundedFifoBuffer34.head = 0;
        boolean boolean39 = unboundedFifoBuffer34.add((java.lang.Object) 1.0d);
        int int40 = unboundedFifoBuffer34.size();
        java.util.Iterator iterator41 = unboundedFifoBuffer34.iterator();
        java.lang.Object obj42 = unboundedFifoBuffer34.get();
        java.lang.Object[] objArray43 = unboundedFifoBuffer34.buffer;
        int int44 = unboundedFifoBuffer34.tail;
        boolean boolean45 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer34);
        int int46 = unboundedFifoBuffer34.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1.0d + "'", obj42, 1.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1.0, null]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        int int19 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator20 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        boolean boolean11 = unboundedFifoBuffer1.isEmpty();
        java.lang.Object[] objArray12 = unboundedFifoBuffer1.buffer;
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0, null]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.head = (byte) 0;
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = unboundedFifoBuffer1.add(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Attempted to add null object to buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(10);
        unboundedFifoBuffer1.head = (short) 1;
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        java.lang.Object[] objArray19 = unboundedFifoBuffer1.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int23 = unboundedFifoBuffer22.tail;
        unboundedFifoBuffer22.head = 0;
        boolean boolean27 = unboundedFifoBuffer22.add((java.lang.Object) 1.0d);
        int int28 = unboundedFifoBuffer22.size();
        java.util.Iterator iterator29 = unboundedFifoBuffer22.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer31 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int32 = unboundedFifoBuffer31.tail;
        unboundedFifoBuffer31.head = 0;
        boolean boolean36 = unboundedFifoBuffer31.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer38 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int39 = unboundedFifoBuffer38.tail;
        int int40 = unboundedFifoBuffer38.size();
        java.lang.Object[] objArray41 = unboundedFifoBuffer38.buffer;
        unboundedFifoBuffer31.buffer = objArray41;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer44 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int45 = unboundedFifoBuffer44.tail;
        int int46 = unboundedFifoBuffer44.size();
        java.lang.Object[] objArray47 = unboundedFifoBuffer44.buffer;
        unboundedFifoBuffer31.buffer = objArray47;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer50 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int51 = unboundedFifoBuffer50.tail;
        unboundedFifoBuffer50.head = 0;
        boolean boolean55 = unboundedFifoBuffer50.add((java.lang.Object) 1.0d);
        int int56 = unboundedFifoBuffer50.size();
        java.util.Iterator iterator57 = unboundedFifoBuffer50.iterator();
        java.lang.Object obj58 = unboundedFifoBuffer50.get();
        boolean boolean59 = unboundedFifoBuffer31.add(obj58);
        boolean boolean60 = unboundedFifoBuffer31.isEmpty();
        boolean boolean61 = unboundedFifoBuffer22.add((java.lang.Object) boolean60);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer63 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int64 = unboundedFifoBuffer63.tail;
        unboundedFifoBuffer63.head = 0;
        boolean boolean68 = unboundedFifoBuffer63.add((java.lang.Object) 1.0d);
        int int69 = unboundedFifoBuffer63.size();
        java.util.Iterator iterator70 = unboundedFifoBuffer63.iterator();
        boolean boolean71 = unboundedFifoBuffer63.isEmpty();
        java.util.Iterator iterator72 = unboundedFifoBuffer63.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer74 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int75 = unboundedFifoBuffer74.tail;
        unboundedFifoBuffer74.head = 0;
        boolean boolean79 = unboundedFifoBuffer74.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer81 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int82 = unboundedFifoBuffer81.tail;
        int int83 = unboundedFifoBuffer81.size();
        java.lang.Object[] objArray84 = unboundedFifoBuffer81.buffer;
        unboundedFifoBuffer74.buffer = objArray84;
        unboundedFifoBuffer74.head = (byte) 0;
        int int88 = unboundedFifoBuffer74.size();
        java.lang.Object[] objArray89 = new java.lang.Object[] { 0, boolean61, unboundedFifoBuffer63, unboundedFifoBuffer74 };
        unboundedFifoBuffer1.buffer = objArray89;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertArrayEquals(objArray41, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertArrayEquals(objArray47, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 1.0d + "'", obj58, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertArrayEquals(objArray84, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[0, true, [1.0], [null]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[0, true, [1.0], [null]]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(100);
        boolean boolean2 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator3 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int30 = unboundedFifoBuffer29.tail;
        unboundedFifoBuffer29.head = 0;
        boolean boolean34 = unboundedFifoBuffer29.add((java.lang.Object) 1.0d);
        int int35 = unboundedFifoBuffer29.size();
        java.util.Iterator iterator36 = unboundedFifoBuffer29.iterator();
        java.lang.Object obj37 = unboundedFifoBuffer29.get();
        boolean boolean38 = unboundedFifoBuffer10.add(obj37);
        boolean boolean39 = unboundedFifoBuffer10.isEmpty();
        boolean boolean40 = unboundedFifoBuffer1.add((java.lang.Object) boolean39);
        int int41 = unboundedFifoBuffer1.tail;
        int int42 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1.0d + "'", obj37, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int30 = unboundedFifoBuffer29.tail;
        unboundedFifoBuffer29.head = 0;
        boolean boolean34 = unboundedFifoBuffer29.add((java.lang.Object) 1.0d);
        int int35 = unboundedFifoBuffer29.size();
        java.util.Iterator iterator36 = unboundedFifoBuffer29.iterator();
        java.lang.Object obj37 = unboundedFifoBuffer29.get();
        boolean boolean38 = unboundedFifoBuffer10.add(obj37);
        boolean boolean39 = unboundedFifoBuffer10.isEmpty();
        boolean boolean40 = unboundedFifoBuffer1.add((java.lang.Object) boolean39);
        java.lang.Class<?> wildcardClass41 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1.0d + "'", obj37, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.head = (byte) 0;
        int int15 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        int int8 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '4');
        int int11 = unboundedFifoBuffer10.tail;
        boolean boolean12 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer10);
        boolean boolean13 = unboundedFifoBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass14 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.size();
        boolean boolean5 = unboundedFifoBuffer1.isEmpty();
        int int6 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        java.lang.Object[] objArray19 = unboundedFifoBuffer1.buffer;
        int int20 = unboundedFifoBuffer1.tail;
        java.lang.Object[] objArray21 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] { null, null });
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        int int10 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int13 = unboundedFifoBuffer12.tail;
        unboundedFifoBuffer12.head = 0;
        boolean boolean17 = unboundedFifoBuffer12.add((java.lang.Object) 1.0d);
        int int18 = unboundedFifoBuffer12.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int21 = unboundedFifoBuffer20.tail;
        int int22 = unboundedFifoBuffer20.size();
        java.lang.Object[] objArray23 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer12.buffer = objArray23;
        unboundedFifoBuffer1.buffer = objArray23;
        unboundedFifoBuffer1.head = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] { null, null });
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        java.lang.Object obj19 = unboundedFifoBuffer1.remove();
        boolean boolean21 = unboundedFifoBuffer1.add((java.lang.Object) 10L);
        java.lang.Object[] objArray22 = unboundedFifoBuffer1.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer24 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int25 = unboundedFifoBuffer24.tail;
        unboundedFifoBuffer24.head = 0;
        boolean boolean29 = unboundedFifoBuffer24.add((java.lang.Object) 1.0d);
        int int30 = unboundedFifoBuffer24.size();
        java.util.Iterator iterator31 = unboundedFifoBuffer24.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer33 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int34 = unboundedFifoBuffer33.tail;
        unboundedFifoBuffer33.head = 0;
        boolean boolean38 = unboundedFifoBuffer33.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int41 = unboundedFifoBuffer40.tail;
        int int42 = unboundedFifoBuffer40.size();
        java.lang.Object[] objArray43 = unboundedFifoBuffer40.buffer;
        unboundedFifoBuffer33.buffer = objArray43;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer46 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int47 = unboundedFifoBuffer46.tail;
        int int48 = unboundedFifoBuffer46.size();
        java.lang.Object[] objArray49 = unboundedFifoBuffer46.buffer;
        unboundedFifoBuffer33.buffer = objArray49;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer52 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int53 = unboundedFifoBuffer52.tail;
        unboundedFifoBuffer52.head = 0;
        boolean boolean57 = unboundedFifoBuffer52.add((java.lang.Object) 1.0d);
        int int58 = unboundedFifoBuffer52.size();
        java.util.Iterator iterator59 = unboundedFifoBuffer52.iterator();
        java.lang.Object obj60 = unboundedFifoBuffer52.get();
        boolean boolean61 = unboundedFifoBuffer33.add(obj60);
        boolean boolean62 = unboundedFifoBuffer33.isEmpty();
        boolean boolean63 = unboundedFifoBuffer24.add((java.lang.Object) boolean62);
        int int64 = unboundedFifoBuffer24.tail;
        boolean boolean65 = unboundedFifoBuffer1.add((java.lang.Object) int64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] { null, null, null });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertArrayEquals(objArray43, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertArrayEquals(objArray49, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 1.0d + "'", obj60, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        int int8 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        int int16 = unboundedFifoBuffer10.size();
        java.lang.Object obj17 = unboundedFifoBuffer10.get();
        java.lang.Object obj18 = unboundedFifoBuffer10.remove();
        int int19 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer21 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int22 = unboundedFifoBuffer21.tail;
        int int23 = unboundedFifoBuffer21.size();
        java.lang.Object[] objArray24 = unboundedFifoBuffer21.buffer;
        unboundedFifoBuffer10.buffer = objArray24;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int28 = unboundedFifoBuffer27.tail;
        unboundedFifoBuffer27.head = 0;
        boolean boolean32 = unboundedFifoBuffer27.add((java.lang.Object) 1.0d);
        int int33 = unboundedFifoBuffer27.size();
        java.util.Iterator iterator34 = unboundedFifoBuffer27.iterator();
        boolean boolean35 = unboundedFifoBuffer10.add((java.lang.Object) unboundedFifoBuffer27);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer37 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int38 = unboundedFifoBuffer37.tail;
        unboundedFifoBuffer37.head = 0;
        int int41 = unboundedFifoBuffer37.head;
        int int42 = unboundedFifoBuffer37.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer44 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(10);
        boolean boolean45 = unboundedFifoBuffer44.isEmpty();
        java.lang.Object[] objArray47 = new java.lang.Object[] { unboundedFifoBuffer10, int42, boolean45, '#' };
        unboundedFifoBuffer1.buffer = objArray47;
        java.util.Iterator iterator49 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null, [1.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null, [1.0]]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[[[1.0]], 0, true, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[[[1.0]], 0, true, #]");
        org.junit.Assert.assertNotNull(iterator49);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        boolean boolean11 = unboundedFifoBuffer1.isEmpty();
        boolean boolean13 = unboundedFifoBuffer1.add((java.lang.Object) (byte) 0);
        unboundedFifoBuffer1.tail = (byte) 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray17 = unboundedFifoBuffer16.buffer;
        boolean boolean19 = unboundedFifoBuffer16.add((java.lang.Object) 0);
        java.lang.Object obj20 = unboundedFifoBuffer16.remove();
        int int21 = unboundedFifoBuffer16.head;
        boolean boolean22 = unboundedFifoBuffer1.add((java.lang.Object) int21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.tail = (byte) 0;
        boolean boolean16 = unboundedFifoBuffer1.add((java.lang.Object) 100);
        int int17 = unboundedFifoBuffer1.head;
        java.lang.Object obj18 = unboundedFifoBuffer1.get();
        boolean boolean19 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100 + "'", obj18, 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.size();
        int int6 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int21 = unboundedFifoBuffer20.tail;
        unboundedFifoBuffer20.head = 0;
        boolean boolean25 = unboundedFifoBuffer20.add((java.lang.Object) 1.0d);
        int int26 = unboundedFifoBuffer20.size();
        java.util.Iterator iterator27 = unboundedFifoBuffer20.iterator();
        java.lang.Object obj28 = unboundedFifoBuffer20.get();
        boolean boolean29 = unboundedFifoBuffer1.add(obj28);
        java.lang.Object obj30 = unboundedFifoBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0d + "'", obj28, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        java.lang.Object obj9 = unboundedFifoBuffer1.remove();
        int int10 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator11 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        java.lang.Object obj9 = unboundedFifoBuffer1.remove();
        int int10 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int13 = unboundedFifoBuffer12.tail;
        int int14 = unboundedFifoBuffer12.size();
        java.lang.Object[] objArray15 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer1.buffer = objArray15;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int19 = unboundedFifoBuffer18.tail;
        unboundedFifoBuffer18.head = 0;
        boolean boolean23 = unboundedFifoBuffer18.add((java.lang.Object) 1.0d);
        int int24 = unboundedFifoBuffer18.size();
        java.util.Iterator iterator25 = unboundedFifoBuffer18.iterator();
        boolean boolean26 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer18);
        boolean boolean27 = unboundedFifoBuffer18.isEmpty();
        java.lang.Class<?> wildcardClass28 = unboundedFifoBuffer18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, [1.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, [1.0]]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        unboundedFifoBuffer1.buffer = objArray26;
        int int29 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator30 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj31 = unboundedFifoBuffer1.remove();
        int int32 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int35 = unboundedFifoBuffer34.tail;
        unboundedFifoBuffer34.head = 0;
        boolean boolean39 = unboundedFifoBuffer34.add((java.lang.Object) 1.0d);
        int int40 = unboundedFifoBuffer34.size();
        java.util.Iterator iterator41 = unboundedFifoBuffer34.iterator();
        java.lang.Object obj42 = unboundedFifoBuffer34.get();
        java.lang.Object[] objArray43 = unboundedFifoBuffer34.buffer;
        int int44 = unboundedFifoBuffer34.tail;
        boolean boolean45 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer34);
        java.lang.Object[] objArray46 = unboundedFifoBuffer34.buffer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1.0d + "'", obj42, 1.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1.0, null]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1.0, null]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        boolean boolean11 = unboundedFifoBuffer1.isEmpty();
        boolean boolean13 = unboundedFifoBuffer1.add((java.lang.Object) (byte) 0);
        unboundedFifoBuffer1.tail = (byte) 1;
        java.lang.Object obj16 = unboundedFifoBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        int int5 = unboundedFifoBuffer1.head;
        int int6 = unboundedFifoBuffer1.head;
        java.lang.Class<?> wildcardClass7 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        boolean boolean11 = unboundedFifoBuffer1.isEmpty();
        java.lang.Object[] objArray12 = unboundedFifoBuffer1.buffer;
        int int13 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int16 = unboundedFifoBuffer15.tail;
        unboundedFifoBuffer15.head = 0;
        boolean boolean20 = unboundedFifoBuffer15.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int23 = unboundedFifoBuffer22.tail;
        int int24 = unboundedFifoBuffer22.size();
        java.lang.Object[] objArray25 = unboundedFifoBuffer22.buffer;
        unboundedFifoBuffer15.buffer = objArray25;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int29 = unboundedFifoBuffer28.tail;
        int int30 = unboundedFifoBuffer28.size();
        java.lang.Object[] objArray31 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer15.buffer = objArray31;
        int int33 = unboundedFifoBuffer15.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int36 = unboundedFifoBuffer35.tail;
        unboundedFifoBuffer35.head = 0;
        boolean boolean40 = unboundedFifoBuffer35.add((java.lang.Object) 1.0d);
        int int41 = unboundedFifoBuffer35.size();
        java.lang.Object obj42 = unboundedFifoBuffer35.get();
        java.lang.Object obj43 = unboundedFifoBuffer35.remove();
        int int44 = unboundedFifoBuffer35.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer46 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int47 = unboundedFifoBuffer46.tail;
        int int48 = unboundedFifoBuffer46.size();
        java.lang.Object[] objArray49 = unboundedFifoBuffer46.buffer;
        unboundedFifoBuffer35.buffer = objArray49;
        unboundedFifoBuffer15.buffer = objArray49;
        unboundedFifoBuffer1.buffer = objArray49;
        java.lang.Object[] objArray53 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1.0d + "'", obj42, 1.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 1.0d + "'", obj43, 1.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertArrayEquals(objArray49, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertArrayEquals(objArray53, new java.lang.Object[] { null, null });
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(100);
        boolean boolean2 = unboundedFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int5 = unboundedFifoBuffer4.tail;
        unboundedFifoBuffer4.head = 0;
        boolean boolean9 = unboundedFifoBuffer4.add((java.lang.Object) 1.0d);
        int int10 = unboundedFifoBuffer4.size();
        java.util.Iterator iterator11 = unboundedFifoBuffer4.iterator();
        boolean boolean12 = unboundedFifoBuffer4.isEmpty();
        java.util.Iterator iterator13 = unboundedFifoBuffer4.iterator();
        boolean boolean14 = unboundedFifoBuffer4.isEmpty();
        java.lang.Object[] objArray15 = unboundedFifoBuffer4.buffer;
        int int16 = unboundedFifoBuffer4.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int19 = unboundedFifoBuffer18.tail;
        unboundedFifoBuffer18.head = 0;
        boolean boolean23 = unboundedFifoBuffer18.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int26 = unboundedFifoBuffer25.tail;
        int int27 = unboundedFifoBuffer25.size();
        java.lang.Object[] objArray28 = unboundedFifoBuffer25.buffer;
        unboundedFifoBuffer18.buffer = objArray28;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer31 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int32 = unboundedFifoBuffer31.tail;
        int int33 = unboundedFifoBuffer31.size();
        java.lang.Object[] objArray34 = unboundedFifoBuffer31.buffer;
        unboundedFifoBuffer18.buffer = objArray34;
        int int36 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer38 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int39 = unboundedFifoBuffer38.tail;
        unboundedFifoBuffer38.head = 0;
        boolean boolean43 = unboundedFifoBuffer38.add((java.lang.Object) 1.0d);
        int int44 = unboundedFifoBuffer38.size();
        java.lang.Object obj45 = unboundedFifoBuffer38.get();
        java.lang.Object obj46 = unboundedFifoBuffer38.remove();
        int int47 = unboundedFifoBuffer38.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer49 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int50 = unboundedFifoBuffer49.tail;
        int int51 = unboundedFifoBuffer49.size();
        java.lang.Object[] objArray52 = unboundedFifoBuffer49.buffer;
        unboundedFifoBuffer38.buffer = objArray52;
        unboundedFifoBuffer18.buffer = objArray52;
        unboundedFifoBuffer4.buffer = objArray52;
        unboundedFifoBuffer1.buffer = objArray52;
        boolean boolean57 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1.0, null]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 1.0d + "'", obj45, 1.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 1.0d + "'", obj46, 1.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertArrayEquals(objArray52, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        boolean boolean2 = unboundedFifoBuffer1.isEmpty();
        int int3 = unboundedFifoBuffer1.tail;
        int int4 = unboundedFifoBuffer1.tail;
        boolean boolean5 = unboundedFifoBuffer1.isEmpty();
        unboundedFifoBuffer1.tail = 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer9 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int10 = unboundedFifoBuffer9.tail;
        unboundedFifoBuffer9.head = 0;
        int int13 = unboundedFifoBuffer9.head;
        boolean boolean14 = unboundedFifoBuffer9.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int17 = unboundedFifoBuffer16.tail;
        unboundedFifoBuffer16.head = 0;
        boolean boolean21 = unboundedFifoBuffer16.add((java.lang.Object) 1.0d);
        int int22 = unboundedFifoBuffer16.size();
        int int23 = unboundedFifoBuffer16.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int26 = unboundedFifoBuffer25.tail;
        unboundedFifoBuffer25.head = 0;
        boolean boolean30 = unboundedFifoBuffer25.add((java.lang.Object) 1.0d);
        int int31 = unboundedFifoBuffer25.size();
        java.lang.Object obj32 = unboundedFifoBuffer25.get();
        java.lang.Object obj33 = unboundedFifoBuffer25.remove();
        int int34 = unboundedFifoBuffer25.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer36 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int37 = unboundedFifoBuffer36.tail;
        int int38 = unboundedFifoBuffer36.size();
        java.lang.Object[] objArray39 = unboundedFifoBuffer36.buffer;
        unboundedFifoBuffer25.buffer = objArray39;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer42 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int43 = unboundedFifoBuffer42.tail;
        unboundedFifoBuffer42.head = 0;
        boolean boolean47 = unboundedFifoBuffer42.add((java.lang.Object) 1.0d);
        int int48 = unboundedFifoBuffer42.size();
        java.util.Iterator iterator49 = unboundedFifoBuffer42.iterator();
        boolean boolean50 = unboundedFifoBuffer25.add((java.lang.Object) unboundedFifoBuffer42);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer52 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int53 = unboundedFifoBuffer52.tail;
        unboundedFifoBuffer52.head = 0;
        int int56 = unboundedFifoBuffer52.head;
        int int57 = unboundedFifoBuffer52.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer59 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(10);
        boolean boolean60 = unboundedFifoBuffer59.isEmpty();
        java.lang.Object[] objArray62 = new java.lang.Object[] { unboundedFifoBuffer25, int57, boolean60, '#' };
        unboundedFifoBuffer16.buffer = objArray62;
        unboundedFifoBuffer9.buffer = objArray62;
        unboundedFifoBuffer1.buffer = objArray62;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1.0d + "'", obj32, 1.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0d + "'", obj33, 1.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[null, [1.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[null, [1.0]]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[[[1.0]], 0, true, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[[[1.0]], 0, true, #]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '4');
        int int2 = unboundedFifoBuffer1.tail;
        boolean boolean3 = unboundedFifoBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer11 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int12 = unboundedFifoBuffer11.tail;
        unboundedFifoBuffer11.head = 0;
        boolean boolean16 = unboundedFifoBuffer11.add((java.lang.Object) 1.0d);
        int int17 = unboundedFifoBuffer11.size();
        java.util.Iterator iterator18 = unboundedFifoBuffer11.iterator();
        boolean boolean19 = unboundedFifoBuffer11.isEmpty();
        java.lang.Object[] objArray20 = unboundedFifoBuffer11.buffer;
        unboundedFifoBuffer1.buffer = objArray20;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1.0, null]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) ' ');
        boolean boolean2 = unboundedFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int5 = unboundedFifoBuffer4.tail;
        int int6 = unboundedFifoBuffer4.size();
        java.lang.Object[] objArray7 = unboundedFifoBuffer4.buffer;
        int int8 = unboundedFifoBuffer4.size();
        int int9 = unboundedFifoBuffer4.tail;
        boolean boolean10 = unboundedFifoBuffer1.add((java.lang.Object) int9);
        java.lang.Object obj11 = unboundedFifoBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        int int8 = unboundedFifoBuffer1.head;
        int int9 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.tail = (byte) 0;
        boolean boolean16 = unboundedFifoBuffer1.add((java.lang.Object) 100);
        int int17 = unboundedFifoBuffer1.head;
        java.lang.Object obj18 = unboundedFifoBuffer1.get();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100 + "'", obj18, 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '4');
        int int2 = unboundedFifoBuffer1.tail;
        boolean boolean3 = unboundedFifoBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass4 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        java.lang.Object[] objArray7 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, null]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) ' ');
        boolean boolean2 = unboundedFifoBuffer1.isEmpty();
        int int3 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        int int8 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '4');
        int int11 = unboundedFifoBuffer10.tail;
        boolean boolean12 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer10);
        int int13 = unboundedFifoBuffer1.size();
        int int14 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        int int19 = unboundedFifoBuffer1.head;
        boolean boolean20 = unboundedFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int23 = unboundedFifoBuffer22.tail;
        unboundedFifoBuffer22.head = 0;
        boolean boolean27 = unboundedFifoBuffer22.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int30 = unboundedFifoBuffer29.tail;
        int int31 = unboundedFifoBuffer29.size();
        java.lang.Object[] objArray32 = unboundedFifoBuffer29.buffer;
        unboundedFifoBuffer22.buffer = objArray32;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int36 = unboundedFifoBuffer35.tail;
        int int37 = unboundedFifoBuffer35.size();
        java.lang.Object[] objArray38 = unboundedFifoBuffer35.buffer;
        unboundedFifoBuffer22.buffer = objArray38;
        int int40 = unboundedFifoBuffer22.head;
        boolean boolean41 = unboundedFifoBuffer1.add((java.lang.Object) int40);
        int int42 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertArrayEquals(objArray38, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        java.lang.Object obj9 = unboundedFifoBuffer1.remove();
        int int10 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int13 = unboundedFifoBuffer12.tail;
        int int14 = unboundedFifoBuffer12.size();
        java.lang.Object[] objArray15 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer1.buffer = objArray15;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int19 = unboundedFifoBuffer18.tail;
        unboundedFifoBuffer18.head = 0;
        boolean boolean23 = unboundedFifoBuffer18.add((java.lang.Object) 1.0d);
        int int24 = unboundedFifoBuffer18.size();
        java.util.Iterator iterator25 = unboundedFifoBuffer18.iterator();
        boolean boolean26 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer18);
        boolean boolean27 = unboundedFifoBuffer18.isEmpty();
        int int28 = unboundedFifoBuffer18.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, [1.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, [1.0]]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(10);
        boolean boolean2 = unboundedFifoBuffer1.isEmpty();
        int int3 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        unboundedFifoBuffer1.buffer = objArray26;
        int int29 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator30 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj31 = unboundedFifoBuffer1.remove();
        int int32 = unboundedFifoBuffer1.head;
        int int33 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        boolean boolean2 = unboundedFifoBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj11 = unboundedFifoBuffer1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0d + "'", obj11, 1.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.size();
        int int6 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        unboundedFifoBuffer8.head = 0;
        boolean boolean13 = unboundedFifoBuffer8.add((java.lang.Object) 1.0d);
        int int14 = unboundedFifoBuffer8.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int17 = unboundedFifoBuffer16.tail;
        int int18 = unboundedFifoBuffer16.size();
        java.lang.Object[] objArray19 = unboundedFifoBuffer16.buffer;
        unboundedFifoBuffer8.buffer = objArray19;
        boolean boolean21 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer8);
        java.lang.Object[] objArray22 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[[null], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[[null], null]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[[null], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[[null], null]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        int int8 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '4');
        int int11 = unboundedFifoBuffer10.tail;
        boolean boolean12 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer10);
        int int13 = unboundedFifoBuffer1.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int16 = unboundedFifoBuffer15.tail;
        unboundedFifoBuffer15.head = 0;
        boolean boolean20 = unboundedFifoBuffer15.add((java.lang.Object) 1.0d);
        int int21 = unboundedFifoBuffer15.size();
        boolean boolean22 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        int int5 = unboundedFifoBuffer1.head;
        boolean boolean6 = unboundedFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        unboundedFifoBuffer8.head = 0;
        boolean boolean13 = unboundedFifoBuffer8.add((java.lang.Object) 1.0d);
        int int14 = unboundedFifoBuffer8.size();
        int int15 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        unboundedFifoBuffer17.head = 0;
        boolean boolean22 = unboundedFifoBuffer17.add((java.lang.Object) 1.0d);
        int int23 = unboundedFifoBuffer17.size();
        java.lang.Object obj24 = unboundedFifoBuffer17.get();
        java.lang.Object obj25 = unboundedFifoBuffer17.remove();
        int int26 = unboundedFifoBuffer17.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int29 = unboundedFifoBuffer28.tail;
        int int30 = unboundedFifoBuffer28.size();
        java.lang.Object[] objArray31 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer17.buffer = objArray31;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int35 = unboundedFifoBuffer34.tail;
        unboundedFifoBuffer34.head = 0;
        boolean boolean39 = unboundedFifoBuffer34.add((java.lang.Object) 1.0d);
        int int40 = unboundedFifoBuffer34.size();
        java.util.Iterator iterator41 = unboundedFifoBuffer34.iterator();
        boolean boolean42 = unboundedFifoBuffer17.add((java.lang.Object) unboundedFifoBuffer34);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer44 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int45 = unboundedFifoBuffer44.tail;
        unboundedFifoBuffer44.head = 0;
        int int48 = unboundedFifoBuffer44.head;
        int int49 = unboundedFifoBuffer44.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer51 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(10);
        boolean boolean52 = unboundedFifoBuffer51.isEmpty();
        java.lang.Object[] objArray54 = new java.lang.Object[] { unboundedFifoBuffer17, int49, boolean52, '#' };
        unboundedFifoBuffer8.buffer = objArray54;
        unboundedFifoBuffer1.buffer = objArray54;
        java.lang.Class<?> wildcardClass57 = objArray54.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0d + "'", obj24, 1.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0d + "'", obj25, 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[null, [1.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[null, [1.0]]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[[[1.0]], 0, true, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[[[1.0]], 0, true, #]");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.tail = (byte) 0;
        boolean boolean16 = unboundedFifoBuffer1.add((java.lang.Object) 100);
        java.util.Iterator iterator17 = unboundedFifoBuffer1.iterator();
        java.lang.Class<?> wildcardClass18 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer9 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int10 = unboundedFifoBuffer9.tail;
        int int11 = unboundedFifoBuffer9.size();
        java.lang.Object[] objArray12 = unboundedFifoBuffer9.buffer;
        unboundedFifoBuffer1.buffer = objArray12;
        int int14 = unboundedFifoBuffer1.tail;
        boolean boolean15 = unboundedFifoBuffer1.isEmpty();
        boolean boolean16 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj9 = unboundedFifoBuffer1.get();
        int int10 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer11 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray12 = unboundedFifoBuffer11.buffer;
        unboundedFifoBuffer1.buffer = objArray12;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        boolean boolean3 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        java.lang.Object obj4 = unboundedFifoBuffer0.remove();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int7 = unboundedFifoBuffer6.tail;
        unboundedFifoBuffer6.head = 0;
        boolean boolean11 = unboundedFifoBuffer6.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int14 = unboundedFifoBuffer13.tail;
        int int15 = unboundedFifoBuffer13.size();
        java.lang.Object[] objArray16 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer6.buffer = objArray16;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer19 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int20 = unboundedFifoBuffer19.tail;
        int int21 = unboundedFifoBuffer19.size();
        java.lang.Object[] objArray22 = unboundedFifoBuffer19.buffer;
        unboundedFifoBuffer6.buffer = objArray22;
        java.lang.Object[] objArray24 = unboundedFifoBuffer6.buffer;
        unboundedFifoBuffer0.buffer = objArray24;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] { null, null });
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        boolean boolean11 = unboundedFifoBuffer1.isEmpty();
        boolean boolean13 = unboundedFifoBuffer1.add((java.lang.Object) (byte) 0);
        unboundedFifoBuffer1.tail = (byte) 1;
        unboundedFifoBuffer1.tail = (short) 0;
        boolean boolean18 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        unboundedFifoBuffer1.buffer = objArray26;
        int int29 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator30 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj31 = unboundedFifoBuffer1.remove();
        int int32 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator33 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj34 = unboundedFifoBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        int int5 = unboundedFifoBuffer1.head;
        unboundedFifoBuffer1.tail = (byte) 1;
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj9 = unboundedFifoBuffer1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        boolean boolean3 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        java.lang.Object obj4 = unboundedFifoBuffer0.remove();
        java.lang.Class<?> wildcardClass5 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        unboundedFifoBuffer0.tail = 2;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        java.lang.Object obj9 = unboundedFifoBuffer1.remove();
        int int10 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int13 = unboundedFifoBuffer12.tail;
        int int14 = unboundedFifoBuffer12.size();
        java.lang.Object[] objArray15 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer1.buffer = objArray15;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int19 = unboundedFifoBuffer18.tail;
        unboundedFifoBuffer18.head = 0;
        boolean boolean23 = unboundedFifoBuffer18.add((java.lang.Object) 1.0d);
        int int24 = unboundedFifoBuffer18.size();
        java.util.Iterator iterator25 = unboundedFifoBuffer18.iterator();
        boolean boolean26 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer18);
        boolean boolean27 = unboundedFifoBuffer18.isEmpty();
        int int28 = unboundedFifoBuffer18.head;
        unboundedFifoBuffer18.tail = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, [1.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, [1.0]]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        java.util.Iterator iterator3 = unboundedFifoBuffer1.iterator();
        java.util.Iterator iterator4 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.tail = (byte) 0;
        boolean boolean16 = unboundedFifoBuffer1.add((java.lang.Object) 100);
        java.util.Iterator iterator17 = unboundedFifoBuffer1.iterator();
        java.lang.Object[] objArray18 = unboundedFifoBuffer1.buffer;
        int int19 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, null]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.size();
        int int6 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int14 = unboundedFifoBuffer13.tail;
        unboundedFifoBuffer13.head = 0;
        boolean boolean18 = unboundedFifoBuffer13.add((java.lang.Object) 1.0d);
        int int19 = unboundedFifoBuffer13.size();
        java.util.Iterator iterator20 = unboundedFifoBuffer13.iterator();
        boolean boolean21 = unboundedFifoBuffer13.isEmpty();
        java.util.Iterator iterator22 = unboundedFifoBuffer13.iterator();
        boolean boolean23 = unboundedFifoBuffer13.isEmpty();
        java.lang.Object[] objArray24 = unboundedFifoBuffer13.buffer;
        int int25 = unboundedFifoBuffer13.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int28 = unboundedFifoBuffer27.tail;
        unboundedFifoBuffer27.head = 0;
        boolean boolean32 = unboundedFifoBuffer27.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int35 = unboundedFifoBuffer34.tail;
        int int36 = unboundedFifoBuffer34.size();
        java.lang.Object[] objArray37 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer27.buffer = objArray37;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int41 = unboundedFifoBuffer40.tail;
        int int42 = unboundedFifoBuffer40.size();
        java.lang.Object[] objArray43 = unboundedFifoBuffer40.buffer;
        unboundedFifoBuffer27.buffer = objArray43;
        int int45 = unboundedFifoBuffer27.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer47 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int48 = unboundedFifoBuffer47.tail;
        unboundedFifoBuffer47.head = 0;
        boolean boolean52 = unboundedFifoBuffer47.add((java.lang.Object) 1.0d);
        int int53 = unboundedFifoBuffer47.size();
        java.lang.Object obj54 = unboundedFifoBuffer47.get();
        java.lang.Object obj55 = unboundedFifoBuffer47.remove();
        int int56 = unboundedFifoBuffer47.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer58 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int59 = unboundedFifoBuffer58.tail;
        int int60 = unboundedFifoBuffer58.size();
        java.lang.Object[] objArray61 = unboundedFifoBuffer58.buffer;
        unboundedFifoBuffer47.buffer = objArray61;
        unboundedFifoBuffer27.buffer = objArray61;
        unboundedFifoBuffer13.buffer = objArray61;
        unboundedFifoBuffer8.buffer = objArray61;
        unboundedFifoBuffer1.buffer = objArray61;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1.0, null]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertArrayEquals(objArray37, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertArrayEquals(objArray43, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 1.0d + "'", obj54, 1.0d);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 1.0d + "'", obj55, 1.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertArrayEquals(objArray61, new java.lang.Object[] { null, null });
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int5 = unboundedFifoBuffer4.tail;
        unboundedFifoBuffer4.head = 0;
        boolean boolean9 = unboundedFifoBuffer4.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer11 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int12 = unboundedFifoBuffer11.tail;
        int int13 = unboundedFifoBuffer11.size();
        java.lang.Object[] objArray14 = unboundedFifoBuffer11.buffer;
        unboundedFifoBuffer4.buffer = objArray14;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer4.buffer = objArray20;
        unboundedFifoBuffer1.buffer = objArray20;
        int int23 = unboundedFifoBuffer1.size();
        java.lang.Class<?> wildcardClass24 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        int int8 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        int int16 = unboundedFifoBuffer10.size();
        java.lang.Object obj17 = unboundedFifoBuffer10.get();
        java.lang.Object obj18 = unboundedFifoBuffer10.remove();
        int int19 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer21 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int22 = unboundedFifoBuffer21.tail;
        int int23 = unboundedFifoBuffer21.size();
        java.lang.Object[] objArray24 = unboundedFifoBuffer21.buffer;
        unboundedFifoBuffer10.buffer = objArray24;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int28 = unboundedFifoBuffer27.tail;
        unboundedFifoBuffer27.head = 0;
        boolean boolean32 = unboundedFifoBuffer27.add((java.lang.Object) 1.0d);
        int int33 = unboundedFifoBuffer27.size();
        java.util.Iterator iterator34 = unboundedFifoBuffer27.iterator();
        boolean boolean35 = unboundedFifoBuffer10.add((java.lang.Object) unboundedFifoBuffer27);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer37 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int38 = unboundedFifoBuffer37.tail;
        unboundedFifoBuffer37.head = 0;
        int int41 = unboundedFifoBuffer37.head;
        int int42 = unboundedFifoBuffer37.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer44 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(10);
        boolean boolean45 = unboundedFifoBuffer44.isEmpty();
        java.lang.Object[] objArray47 = new java.lang.Object[] { unboundedFifoBuffer10, int42, boolean45, '#' };
        unboundedFifoBuffer1.buffer = objArray47;
        int int49 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null, [1.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null, [1.0]]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[[[1.0]], 0, true, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[[[1.0]], 0, true, #]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        unboundedFifoBuffer1.buffer = objArray26;
        int int29 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator30 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj31 = unboundedFifoBuffer1.remove();
        int int32 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int35 = unboundedFifoBuffer34.tail;
        unboundedFifoBuffer34.head = 0;
        boolean boolean39 = unboundedFifoBuffer34.add((java.lang.Object) 1.0d);
        int int40 = unboundedFifoBuffer34.size();
        java.util.Iterator iterator41 = unboundedFifoBuffer34.iterator();
        java.lang.Object obj42 = unboundedFifoBuffer34.get();
        java.lang.Object[] objArray43 = unboundedFifoBuffer34.buffer;
        int int44 = unboundedFifoBuffer34.tail;
        boolean boolean45 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer34);
        unboundedFifoBuffer1.head = 2;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1.0d + "'", obj42, 1.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1.0, null]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        unboundedFifoBuffer1.head = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        java.lang.Object obj9 = unboundedFifoBuffer1.remove();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer11 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int12 = unboundedFifoBuffer11.tail;
        unboundedFifoBuffer11.head = 0;
        boolean boolean16 = unboundedFifoBuffer11.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int19 = unboundedFifoBuffer18.tail;
        int int20 = unboundedFifoBuffer18.size();
        java.lang.Object[] objArray21 = unboundedFifoBuffer18.buffer;
        unboundedFifoBuffer11.buffer = objArray21;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer24 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int25 = unboundedFifoBuffer24.tail;
        int int26 = unboundedFifoBuffer24.size();
        java.lang.Object[] objArray27 = unboundedFifoBuffer24.buffer;
        unboundedFifoBuffer11.buffer = objArray27;
        java.lang.Object obj29 = unboundedFifoBuffer11.remove();
        boolean boolean31 = unboundedFifoBuffer11.add((java.lang.Object) 10L);
        java.lang.Object[] objArray32 = unboundedFifoBuffer11.buffer;
        unboundedFifoBuffer1.buffer = objArray32;
        int int34 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[null, 10, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[null, 10, null]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        int int19 = unboundedFifoBuffer1.head;
        int int20 = unboundedFifoBuffer1.tail;
        java.lang.Class<?> wildcardClass21 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        int int5 = unboundedFifoBuffer1.head;
        int int6 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator7 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        boolean boolean11 = unboundedFifoBuffer1.isEmpty();
        int int12 = unboundedFifoBuffer1.size();
        int int13 = unboundedFifoBuffer1.tail;
        int int14 = unboundedFifoBuffer1.head;
        java.lang.Object obj15 = unboundedFifoBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0d + "'", obj15, 1.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        boolean boolean11 = unboundedFifoBuffer1.isEmpty();
        java.lang.Object obj12 = unboundedFifoBuffer1.get();
        int int13 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0d + "'", obj12, 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        boolean boolean9 = unboundedFifoBuffer1.isEmpty();
        java.lang.Object obj10 = unboundedFifoBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0d + "'", obj10, 1.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        unboundedFifoBuffer1.tail = (byte) 0;
        boolean boolean16 = unboundedFifoBuffer1.add((java.lang.Object) 100);
        int int17 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        java.lang.Object[] objArray19 = unboundedFifoBuffer1.buffer;
        int int20 = unboundedFifoBuffer1.tail;
        int int21 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        java.lang.Object obj7 = unboundedFifoBuffer1.get();
        unboundedFifoBuffer1.tail = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.head;
        java.lang.Class<?> wildcardClass6 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        unboundedFifoBuffer1.buffer = objArray26;
        int int29 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator30 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj31 = unboundedFifoBuffer1.get();
        java.lang.Object[] objArray32 = unboundedFifoBuffer1.buffer;
        java.lang.Object obj33 = unboundedFifoBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int11 = unboundedFifoBuffer10.tail;
        unboundedFifoBuffer10.head = 0;
        boolean boolean15 = unboundedFifoBuffer10.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int18 = unboundedFifoBuffer17.tail;
        int int19 = unboundedFifoBuffer17.size();
        java.lang.Object[] objArray20 = unboundedFifoBuffer17.buffer;
        unboundedFifoBuffer10.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int24 = unboundedFifoBuffer23.tail;
        int int25 = unboundedFifoBuffer23.size();
        java.lang.Object[] objArray26 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer10.buffer = objArray26;
        unboundedFifoBuffer1.buffer = objArray26;
        int int29 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator30 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj31 = unboundedFifoBuffer1.get();
        java.lang.Object obj32 = unboundedFifoBuffer1.remove();
        int int33 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        int int8 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '4');
        int int11 = unboundedFifoBuffer10.tail;
        boolean boolean12 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer10);
        boolean boolean13 = unboundedFifoBuffer1.isEmpty();
        java.lang.Object obj14 = unboundedFifoBuffer1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        java.lang.Object obj9 = unboundedFifoBuffer1.remove();
        java.util.Iterator iterator10 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        int int19 = unboundedFifoBuffer1.head;
        boolean boolean20 = unboundedFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int23 = unboundedFifoBuffer22.tail;
        unboundedFifoBuffer22.head = 0;
        boolean boolean27 = unboundedFifoBuffer22.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int30 = unboundedFifoBuffer29.tail;
        int int31 = unboundedFifoBuffer29.size();
        java.lang.Object[] objArray32 = unboundedFifoBuffer29.buffer;
        unboundedFifoBuffer22.buffer = objArray32;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int36 = unboundedFifoBuffer35.tail;
        int int37 = unboundedFifoBuffer35.size();
        java.lang.Object[] objArray38 = unboundedFifoBuffer35.buffer;
        unboundedFifoBuffer22.buffer = objArray38;
        int int40 = unboundedFifoBuffer22.head;
        boolean boolean41 = unboundedFifoBuffer1.add((java.lang.Object) int40);
        java.lang.Object[] objArray42 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertArrayEquals(objArray38, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[null, 0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[null, 0, null]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator8 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj9 = unboundedFifoBuffer1.get();
        java.lang.Object[] objArray10 = unboundedFifoBuffer1.buffer;
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = unboundedFifoBuffer1.add(obj11);
        java.lang.Class<?> wildcardClass13 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        int int19 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator20 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 100);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        int int7 = unboundedFifoBuffer1.size();
        java.lang.Object obj8 = unboundedFifoBuffer1.get();
        int int9 = unboundedFifoBuffer1.size();
        boolean boolean10 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 1);
        int int2 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int5 = unboundedFifoBuffer4.tail;
        unboundedFifoBuffer4.head = 0;
        boolean boolean9 = unboundedFifoBuffer4.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer11 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int12 = unboundedFifoBuffer11.tail;
        int int13 = unboundedFifoBuffer11.size();
        java.lang.Object[] objArray14 = unboundedFifoBuffer11.buffer;
        unboundedFifoBuffer4.buffer = objArray14;
        unboundedFifoBuffer4.head = (byte) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer19 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int20 = unboundedFifoBuffer19.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int23 = unboundedFifoBuffer22.tail;
        unboundedFifoBuffer22.head = 0;
        boolean boolean27 = unboundedFifoBuffer22.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int30 = unboundedFifoBuffer29.tail;
        int int31 = unboundedFifoBuffer29.size();
        java.lang.Object[] objArray32 = unboundedFifoBuffer29.buffer;
        unboundedFifoBuffer22.buffer = objArray32;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int36 = unboundedFifoBuffer35.tail;
        int int37 = unboundedFifoBuffer35.size();
        java.lang.Object[] objArray38 = unboundedFifoBuffer35.buffer;
        unboundedFifoBuffer22.buffer = objArray38;
        unboundedFifoBuffer19.buffer = objArray38;
        java.lang.Object[] objArray41 = unboundedFifoBuffer19.buffer;
        unboundedFifoBuffer4.buffer = objArray41;
        unboundedFifoBuffer1.buffer = objArray41;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertArrayEquals(objArray38, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertArrayEquals(objArray41, new java.lang.Object[] { null, null });
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.head;
        int int3 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        int int19 = unboundedFifoBuffer1.tail;
        int int20 = unboundedFifoBuffer1.size();
        java.lang.Class<?> wildcardClass21 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = 0;
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int9 = unboundedFifoBuffer8.tail;
        int int10 = unboundedFifoBuffer8.size();
        java.lang.Object[] objArray11 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer1.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int15 = unboundedFifoBuffer14.tail;
        int int16 = unboundedFifoBuffer14.size();
        java.lang.Object[] objArray17 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer1.buffer = objArray17;
        int int19 = unboundedFifoBuffer1.head;
        int int20 = unboundedFifoBuffer1.tail;
        java.lang.Object[] objArray21 = unboundedFifoBuffer1.buffer;
        java.lang.Object[] objArray22 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] { null, null });
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.size();
        unboundedFifoBuffer1.tail = 1;
        java.lang.Object[] objArray8 = unboundedFifoBuffer1.buffer;
        int int9 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.head;
        int int6 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(100);
        boolean boolean2 = unboundedFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int5 = unboundedFifoBuffer4.tail;
        unboundedFifoBuffer4.head = 0;
        boolean boolean9 = unboundedFifoBuffer4.add((java.lang.Object) 1.0d);
        int int10 = unboundedFifoBuffer4.size();
        java.util.Iterator iterator11 = unboundedFifoBuffer4.iterator();
        boolean boolean12 = unboundedFifoBuffer4.isEmpty();
        java.util.Iterator iterator13 = unboundedFifoBuffer4.iterator();
        boolean boolean14 = unboundedFifoBuffer4.isEmpty();
        java.lang.Object[] objArray15 = unboundedFifoBuffer4.buffer;
        int int16 = unboundedFifoBuffer4.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int19 = unboundedFifoBuffer18.tail;
        unboundedFifoBuffer18.head = 0;
        boolean boolean23 = unboundedFifoBuffer18.add((java.lang.Object) 1.0d);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int26 = unboundedFifoBuffer25.tail;
        int int27 = unboundedFifoBuffer25.size();
        java.lang.Object[] objArray28 = unboundedFifoBuffer25.buffer;
        unboundedFifoBuffer18.buffer = objArray28;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer31 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int32 = unboundedFifoBuffer31.tail;
        int int33 = unboundedFifoBuffer31.size();
        java.lang.Object[] objArray34 = unboundedFifoBuffer31.buffer;
        unboundedFifoBuffer18.buffer = objArray34;
        int int36 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer38 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int39 = unboundedFifoBuffer38.tail;
        unboundedFifoBuffer38.head = 0;
        boolean boolean43 = unboundedFifoBuffer38.add((java.lang.Object) 1.0d);
        int int44 = unboundedFifoBuffer38.size();
        java.lang.Object obj45 = unboundedFifoBuffer38.get();
        java.lang.Object obj46 = unboundedFifoBuffer38.remove();
        int int47 = unboundedFifoBuffer38.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer49 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        int int50 = unboundedFifoBuffer49.tail;
        int int51 = unboundedFifoBuffer49.size();
        java.lang.Object[] objArray52 = unboundedFifoBuffer49.buffer;
        unboundedFifoBuffer38.buffer = objArray52;
        unboundedFifoBuffer18.buffer = objArray52;
        unboundedFifoBuffer4.buffer = objArray52;
        unboundedFifoBuffer1.buffer = objArray52;
        java.lang.Class<?> wildcardClass57 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1.0, null]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 1.0d + "'", obj45, 1.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 1.0d + "'", obj46, 1.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertArrayEquals(objArray52, new java.lang.Object[] { null, null });
        org.junit.Assert.assertNotNull(wildcardClass57);
    }
}

