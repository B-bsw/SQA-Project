package org.apache.commons.math3.linear;

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
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RectangularCholeskyDecomposition rectangularCholeskyDecomposition2 = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(realMatrix0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

