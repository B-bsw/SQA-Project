package org.apache.commons.cli;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup4 = optionGroup0.addOption(option3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass3 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass2 = collection1.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup5 = optionGroup0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.lang.Class<?> wildcardClass3 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass3 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass5 = collection4.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass5 = collection4.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass9 = collection8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        org.apache.commons.cli.Option option3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup4 = optionGroup0.addOption(option3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup2 = optionGroup0.addOption(option1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass9 = collection8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup5 = optionGroup0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass7 = collection6.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass11 = collection10.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup16 = optionGroup0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        boolean boolean4 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass2 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup5 = optionGroup0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str12 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.lang.String str4 = optionGroup0.toString();
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getNames();
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup17 = optionGroup0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup5 = optionGroup0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup16 = optionGroup0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass5 = collection4.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass7 = collection6.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass6 = collection5.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass7 = collection6.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass11 = collection10.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup15 = optionGroup0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup18 = optionGroup0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str12 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.util.Collection collection15 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup5 = optionGroup0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup17 = optionGroup0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup17 = optionGroup0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup4 = optionGroup0.addOption(option3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getNames();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup19 = optionGroup0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass7 = collection6.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        boolean boolean7 = optionGroup0.isRequired();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass16 = collection15.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str14 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup16 = optionGroup0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection collection12 = optionGroup0.getNames();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass4 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass11 = collection10.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup18 = optionGroup0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.util.Collection collection14 = optionGroup0.getNames();
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup16 = optionGroup0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass9 = collection8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass7 = collection6.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass13 = collection12.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection collection13 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass14 = collection13.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.util.Collection collection13 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getNames();
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup16 = optionGroup0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass13 = collection12.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection15 = optionGroup0.getNames();
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup17 = optionGroup0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass13 = collection12.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.getSelected();
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.toString();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup15 = optionGroup0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str11 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass7 = collection6.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass13 = collection12.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup16 = optionGroup0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection collection12 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass4 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup5 = optionGroup0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup15 = optionGroup0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection13 = optionGroup0.getNames();
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup16 = optionGroup0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass7 = collection6.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass12 = collection11.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass11 = collection10.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.lang.String str4 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass4 = collection3.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getNames();
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.toString();
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        boolean boolean7 = optionGroup0.isRequired();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection collection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.String str15 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup17 = optionGroup0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.util.Collection collection15 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection18 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass19 = collection18.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.lang.String str4 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass6 = collection5.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getNames();
        boolean boolean12 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass7 = collection6.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.toString();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass9 = collection8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(false);
        java.util.Collection collection16 = optionGroup0.getNames();
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup18 = optionGroup0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str9 = optionGroup0.getSelected();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.lang.String str6 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean4 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str12 = optionGroup0.getSelected();
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.toString();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.getSelected();
        java.util.Collection collection3 = optionGroup0.getNames();
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup5 = optionGroup0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.String str10 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        optionGroup0.setRequired(false);
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass4 = collection3.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass9 = collection8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection collection13 = optionGroup0.getOptions();
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass15 = collection14.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(false);
        java.util.Collection collection16 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup18 = optionGroup0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.util.Collection collection12 = optionGroup0.getOptions();
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getNames();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection collection13 = optionGroup0.getOptions();
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.toString();
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        java.lang.String str17 = optionGroup0.toString();
        java.util.Collection collection18 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.util.Collection collection16 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass17 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.String str16 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup5 = optionGroup0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.String str13 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup15 = optionGroup0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        java.lang.String str17 = optionGroup0.toString();
        boolean boolean18 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.toString();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass13 = collection12.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.util.Collection collection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isRequired();
        boolean boolean11 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.toString();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass12 = collection11.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass4 = collection3.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str14 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.toString();
        java.util.Collection collection13 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection collection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup18 = optionGroup0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection13 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection16 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass12 = collection11.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        java.lang.Class<?> wildcardClass17 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.toString();
        boolean boolean16 = optionGroup0.isRequired();
        java.util.Collection collection17 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        boolean boolean7 = optionGroup0.isRequired();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

