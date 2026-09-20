package org.apache.commons.cli2;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 100, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) ' ', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '#', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) ' ', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (-1), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 100, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) ' ', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) -1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 0, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) -1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) ' ', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) -1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) -1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 0, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 100, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '4', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) -1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 10, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '4', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 10, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (-1), (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '#', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 100, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '#', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 0, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) -1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 100, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) ' ', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '4', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '#', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (-1), (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 10, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) 'a', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 0, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) ' ', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) -1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '#', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) -1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 100, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 100, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) 'a', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 0, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) -1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 0, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) 'a', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '4', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 100, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) -1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '4', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) ' ', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '4', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) -1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) ' ', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 10, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (-1), (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 100, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) 'a', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) ' ', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) 'a', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) ' ', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (-1), (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 100, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) -1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) '#', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '#', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) ' ', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) 'a', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) ' ', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) 'a', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 100, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) -1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 0, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 10, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) -1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 10, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 0, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) ' ', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '4', (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (-1), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (-1), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) 'a', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) 'a', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 100, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) '4', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '#', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (-1), 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 100, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '4', 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) -1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 100, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '#', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) -1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '4', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 100, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) -1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '#', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) ' ', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '#', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) 'a', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (-1), (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) -1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (-1), (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) -1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '4', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '4', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) -1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) 'a', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) ' ', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '#', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) -1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (-1), (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 100, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) 'a', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 10, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) ' ', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) ' ', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) 'a', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 100, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 10, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) 'a', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (-1), 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) -1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '#', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 100, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) ' ', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) 'a', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '#', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 10, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 100, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (-1), (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) 'a', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '#', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (-1), (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) ' ', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 10, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) -1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '4', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) ' ', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 100, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) ' ', (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) ' ', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) ' ', (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) -1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) 'a', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '#', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) ' ', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) 'a', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) 'a', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) -1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) -1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) ' ', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) -1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 10, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 100, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 100, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '#', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '4', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) -1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) '4', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 100, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 100, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 100, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 0, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) ' ', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '#', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 0, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (-1), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 0, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 10, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 0, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '4', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '4', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) 'a', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) -1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) '#', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 0, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '#', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 0, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 100, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '4', (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 0, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) 'a', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (-1), 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '4', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) -1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) 'a', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '4', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) ' ', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) '4', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '#', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) 'a', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) '#', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) '#', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 10, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) -1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) -1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", 100, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 100, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) ' ', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 100, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 100, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 0, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 100, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '#', (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) -1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 100, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) 'a', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (short) 100, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) '#', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", 100, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) 'a', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (byte) 10, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (byte) 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (-1), (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (short) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) '#', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) 'a', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "hi!", (int) (short) 10, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "", (int) (byte) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", (int) (byte) 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "hi!", "", (int) (short) 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.option.GroupImpl groupImpl6 = new org.apache.commons.cli2.option.GroupImpl(list0, "", "hi!", 100, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

