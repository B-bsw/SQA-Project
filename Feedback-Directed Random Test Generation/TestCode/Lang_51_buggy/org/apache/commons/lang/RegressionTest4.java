package org.apache.commons.lang;

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
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (byte) 1, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 52, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) -1, (int) (short) 10, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, 0, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 35, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(false, "no", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, (int) (short) 1, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 97, (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 10, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) (short) 10, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "yes", "true", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 97);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 97, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 10, (int) (byte) 10, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "false", "on", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 97, (int) '4', 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "true", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "true", "false", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', 35, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) -1, 97, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 35, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 100, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) ' ', 32, (-1), 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) 35, (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "", "true", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(false, "off", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "no", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 1, (int) (short) 0, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "hi!", "on", "");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(97, 52, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "on", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 52, (java.lang.Integer) 10, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "hi!", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "", "on");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(97, 0, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "", "off", "false");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "true", "true", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "", "true", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 97, (java.lang.Integer) 52, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "off", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 10, 1, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "off", "no", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 0, (int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        assertBooleanArrayEquals(booleanArray1, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 1, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 32, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 0, (int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "", "no", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 97, (java.lang.Integer) 52, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '4', 97, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (int) (byte) 100, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 97, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, 32, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "false", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "no", "off", "yes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 35, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(false, "false", "false");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "false" + "'", str3, "false");
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "no", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 1, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "on", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "true", "off", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "true", "false", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "yes", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, true, true, false, true };
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Class<?> wildcardClass15 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertArrayEquals(booleanArray5, new java.lang.Boolean[] { false, true, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, true };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass11 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertArrayEquals(booleanArray3, new java.lang.Boolean[] { true, true, true });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "true", "yes", "true");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "no", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "", "no", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 35, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "yes", "", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 100, 35, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "true", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "no", "yes", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { false, false, false };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass10 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertArrayEquals(booleanArray3, new java.lang.Boolean[] { false, false, false });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "on", "", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "hi!", "no", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 1, (int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) -1, (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 10, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(true, "off", "true");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off" + "'", str3, "off");
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), (int) (short) 100, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (-1), (int) (byte) 10, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, true };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass9 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertArrayEquals(booleanArray3, new java.lang.Boolean[] { true, true, true });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (short) 100, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, (int) (short) 1, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) -1, (int) (short) -1, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (short) 10, 52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', (-1), 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "yes", "off", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "yes", "false");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "true", "off");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 52, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 32, (java.lang.Integer) 100, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 1, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), (int) (byte) 10, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        boolean[] booleanArray3 = new boolean[] { false, true, true };
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass12 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false, true, true });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 1, (int) (byte) 100, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) 52, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "off", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 97, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "off", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 32, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 1, 32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(35, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 100, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "hi!", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(35, (int) (short) 100, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "on", "false", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 52, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "true", "on", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 0, (int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "yes", "on", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "false", "no");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) 'a', (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "hi!", "no", "off");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (int) '4', 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, 32, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 32, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, (int) (short) 1, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "hi!", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(97, (int) (short) 100, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 1, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) (-1), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "hi!", "false", "true");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "yes", "hi!", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "off", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) ' ', (int) (short) 1, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', 97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 0, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) -1, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) (-1));
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (byte) 1, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (short) 100, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 1, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(false, "yes", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        boolean[] booleanArray2 = new boolean[] { true, true };
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass4 = booleanArray2.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] { true, true });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { false, false, false };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass9 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertArrayEquals(booleanArray3, new java.lang.Boolean[] { false, false, false });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 10, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, (int) (short) 0, 97, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "no", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 52, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) -1, (int) (short) -1, 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 1, 1, 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 100, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) 'a', 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, 35, (int) ' ', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "no", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 100, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "no", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 10, 100, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) ' ', (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "yes", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "off", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "on", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "no", "off");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { false, false, false };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass7 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertArrayEquals(booleanArray3, new java.lang.Boolean[] { false, false, false });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 0, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 0, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 100, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(true, "no", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "no" + "'", str3, "no");
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 100, 1, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "off", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 52, 35, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 0, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 52, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "false", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "off", "off", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 10, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "yes", "false", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        assertBooleanArrayEquals(booleanArray1, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "no", "false", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "on", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 32, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 100, 0, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "no", "on", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 1, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, 1, 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "true", "false", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "false", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        boolean[] booleanArray5 = new boolean[] { true, false, false, false, false };
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Class<?> wildcardClass10 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, false, false, false, false });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 97, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "off", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "on", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) -1, (int) (byte) 100, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "false", "no");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 1, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { false, true, false, false, true, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Class<?> wildcardClass15 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertArrayEquals(booleanArray6, new java.lang.Boolean[] { false, true, false, false, true, true });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 0, 52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "on", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '#', (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (byte) 0, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "off", "false", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "off", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "on", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer) (-1), (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 100, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, 52, 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "", "true", "true");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 52, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 97, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) -1, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 32, (java.lang.Integer) 100, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "yes", "hi!", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '#', (int) (short) 100, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 100, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "no", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "yes", "true");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "hi!", "true");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 1, (int) (short) -1, 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 0, (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', 35, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "true", "no", "off");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 35, 35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "hi!", "true", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 10, (int) (short) 100, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 35, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "true", "no", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "true", "", "on");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 97, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 100, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "yes", "", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 32, (java.lang.Integer) 100, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '4', (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, (int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 35, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', 0, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "on", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "true", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "false", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (short) -1, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "hi!", "yes", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "off", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "no", "false");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "no", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "off", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "off", "yes", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { false, true, false, false, true, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean16 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Class<?> wildcardClass17 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertArrayEquals(booleanArray6, new java.lang.Boolean[] { false, true, false, false, true, true });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "on", "yes", "true");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, 35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "true", "", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "", "yes", "hi!");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(35, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 52, (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 97, 97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 97, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 52, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "true", "off", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(97, 52, (int) (byte) -1, 97);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { false, false, false };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass8 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertArrayEquals(booleanArray3, new java.lang.Boolean[] { false, false, false });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "", "true", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertArrayEquals(booleanArray0, new java.lang.Boolean[] {});
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) -1, (int) (byte) 100, 52, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "true", "true", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(false, "off", "true");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 1, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass6 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        assertBooleanArrayEquals(booleanArray1, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 52, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "yes", "off", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', 52, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "", "on");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        boolean[] booleanArray2 = new boolean[] { true, true };
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass6 = booleanArray2.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] { true, true });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 10, (int) (byte) 1, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "false", "yes");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "on", "on", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 1, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) 'a', 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 32, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "false", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "yes", "on", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '#', 97, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "yes", "on", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 0, 1, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "off", "no", "off");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        boolean[] booleanArray3 = new boolean[] { false, false, true };
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass7 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false, false, true });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(35, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 10, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 10);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "on", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "hi!", "yes");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(true, "off", "yes");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off" + "'", str3, "off");
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', (int) '4', 32, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "yes", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "on", "false", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 32, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(35, (int) (short) -1, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 97, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', 32, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        java.lang.Integer int3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 10, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 52, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (byte) 10, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, 32, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "yes", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "yes", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '4', 97, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 97, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        boolean[] booleanArray3 = new boolean[] { false, false, true };
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass9 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false, false, true });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "", "no");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 100, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 97, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { true });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (byte) 1, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        java.lang.Integer int4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }
}

