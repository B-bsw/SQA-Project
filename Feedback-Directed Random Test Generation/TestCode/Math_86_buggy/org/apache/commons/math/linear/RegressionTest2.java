package org.apache.commons.math.linear;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) ' ', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0, 1.0E-10d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (-1.0d), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 100.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1L), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 0, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (-1.0d), (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10L, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '4', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, 1.0E-10d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (-1.0d), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1), (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10L, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) -1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0L, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 0, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1L, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0L, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (-1.0d), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10.0f, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1L), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1.0f, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 10, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '4', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1, 1.0E-10d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) ' ', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 100, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '4', (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 100.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) -1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '4', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1L, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (-1.0d), (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 0, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) -1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1.0f, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 100.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1L), (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '4', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-10d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1L), (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 0, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0L, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10.0f, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '4', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (-1.0d), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', 1.0E-10d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) ' ', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10.0f, 1.0E-10d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-10d, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1.0f), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1L), (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) ' ', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 100.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0L, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) ' ', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1.0f), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) ' ', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) -1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-10d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) -1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-10d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0.0f, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (-1.0d), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', 1.0E-10d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10L, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) ' ', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 100.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-10d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (-1.0d), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '4', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1L), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 100.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1L), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) ' ', (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1), 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1L), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1), 1.0E-10d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, 1.0E-10d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) ' ', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 10, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100L, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 10, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-10d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) '#', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 10.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-10d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 10, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1L), (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1.0f), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 1L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-15d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 100.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 'a', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1), (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 100, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 0.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0E-10d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 10.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (-1.0d), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, 1.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) 100.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (byte) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (short) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.math.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.CholeskyDecompositionImpl choleskyDecompositionImpl3 = new org.apache.commons.math.linear.CholeskyDecompositionImpl(realMatrix0, (double) (-1), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

