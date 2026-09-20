package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.util.Collection collection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean13 = optionGroup0.isRequired();
        boolean boolean14 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getNames();
        java.lang.String str16 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        java.lang.String str12 = optionGroup0.toString();
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        java.util.Collection collection11 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str14 = optionGroup0.getSelected();
        java.lang.String str15 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.util.Collection collection17 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        java.util.Collection collection13 = optionGroup0.getNames();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.lang.String str4 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass11 = collection10.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.getSelected();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass11 = collection10.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getNames();
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
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.toString();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        java.lang.String str18 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection5 = optionGroup0.getNames();
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
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getOptions();
        boolean boolean13 = optionGroup0.isRequired();
        boolean boolean14 = optionGroup0.isRequired();
        boolean boolean15 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        optionGroup0.setSelected(option13);
        optionGroup0.setRequired(false);
        java.util.Collection collection17 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup19 = optionGroup0.addOption(option18);
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
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        java.util.Collection collection15 = optionGroup0.getOptions();
        java.lang.String str16 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass17 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        java.lang.String str14 = optionGroup0.getSelected();
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getNames();
        java.lang.String str16 = optionGroup0.getSelected();
        java.util.Collection collection17 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        boolean boolean6 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass11 = collection10.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        java.lang.String str12 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        boolean boolean17 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        optionGroup0.setRequired(false);
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.getSelected();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection collection11 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        java.util.Collection collection13 = optionGroup0.getOptions();
        boolean boolean14 = optionGroup0.isRequired();
        java.util.Collection collection15 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        java.util.Collection collection13 = optionGroup0.getOptions();
        boolean boolean14 = optionGroup0.isRequired();
        boolean boolean15 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
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
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        java.util.Collection collection12 = optionGroup0.getOptions();
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.String str13 = optionGroup0.toString();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.toString();
        java.util.Collection collection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.util.Collection collection16 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        java.lang.String str17 = optionGroup0.getSelected();
        java.util.Collection collection18 = optionGroup0.getOptions();
        java.util.Collection collection19 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option20 = null;
        optionGroup0.setSelected(option20);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        boolean boolean17 = optionGroup0.isRequired();
        java.util.Collection collection18 = optionGroup0.getOptions();
        java.util.Collection collection19 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        java.util.Collection collection16 = optionGroup0.getOptions();
        java.util.Collection collection17 = optionGroup0.getNames();
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
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean13 = optionGroup0.isRequired();
        java.util.Collection collection14 = optionGroup0.getOptions();
        boolean boolean15 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        java.util.Collection collection18 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        optionGroup0.setRequired(false);
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass12 = collection11.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getOptions();
        boolean boolean13 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        java.lang.String str12 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.util.Collection collection8 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass11 = collection10.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        java.util.Collection collection13 = optionGroup0.getNames();
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        optionGroup0.setRequired(false);
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup5 = optionGroup0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        optionGroup0.setRequired(true);
        boolean boolean17 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection collection11 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass12 = collection11.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        boolean boolean7 = optionGroup0.isRequired();
        boolean boolean8 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        optionGroup0.setSelected(option12);
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.String str16 = optionGroup0.toString();
        java.util.Collection collection17 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option20 = null;
        optionGroup0.setSelected(option20);
        java.util.Collection collection22 = optionGroup0.getNames();
        boolean boolean23 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        java.lang.String str11 = optionGroup0.getSelected();
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.getSelected();
        java.lang.String str14 = optionGroup0.getSelected();
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        java.util.Collection collection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        optionGroup0.setRequired(false);
        boolean boolean12 = optionGroup0.isRequired();
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
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection17 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass18 = collection17.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        boolean boolean6 = optionGroup0.isRequired();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.toString();
        java.lang.String str13 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        java.util.Collection collection16 = optionGroup0.getNames();
        java.util.Collection collection17 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass18 = collection17.getClass();
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
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.util.Collection collection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option19 = null;
        optionGroup0.setSelected(option19);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        java.lang.String str14 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str11 = optionGroup0.toString();
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.toString();
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection collection13 = optionGroup0.getNames();
        java.lang.String str14 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection collection12 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
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
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.toString();
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
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.lang.String str4 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.String str13 = optionGroup0.toString();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        java.util.Collection collection15 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection18 = optionGroup0.getNames();
        java.lang.String str19 = optionGroup0.toString();
        org.apache.commons.cli.Option option20 = null;
        optionGroup0.setSelected(option20);
        org.apache.commons.cli.Option option22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup23 = optionGroup0.addOption(option22);
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
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        java.util.Collection collection15 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean18 = optionGroup0.isRequired();
        java.lang.String str19 = optionGroup0.toString();
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
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        java.lang.String str17 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup21 = optionGroup0.addOption(option20);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.getSelected();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        java.lang.String str12 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection collection15 = optionGroup0.getNames();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        boolean boolean18 = optionGroup0.isRequired();
        java.util.Collection collection19 = optionGroup0.getNames();
        org.apache.commons.cli.Option option20 = null;
        optionGroup0.setSelected(option20);
        java.util.Collection collection22 = optionGroup0.getNames();
        java.util.Collection collection23 = optionGroup0.getOptions();
        java.lang.String str24 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.util.Collection collection13 = optionGroup0.getNames();
        java.util.Collection collection14 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        optionGroup0.setRequired(true);
        java.util.Collection collection13 = optionGroup0.getNames();
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        java.lang.String str11 = optionGroup0.getSelected();
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        boolean boolean16 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup20 = optionGroup0.addOption(option19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection13 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass14 = collection13.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        java.util.Collection collection13 = optionGroup0.getNames();
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        optionGroup0.setRequired(false);
        java.lang.String str3 = optionGroup0.toString();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getOptions();
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
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass5 = collection4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        optionGroup0.setRequired(true);
        boolean boolean15 = optionGroup0.isRequired();
        java.util.Collection collection16 = optionGroup0.getOptions();
        java.util.Collection collection17 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.util.Collection collection12 = optionGroup0.getNames();
        boolean boolean13 = optionGroup0.isRequired();
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
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        java.util.Collection collection13 = optionGroup0.getNames();
        java.lang.String str14 = optionGroup0.getSelected();
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        optionGroup0.setSelected(option13);
        optionGroup0.setRequired(false);
        java.util.Collection collection17 = optionGroup0.getOptions();
        java.util.Collection collection18 = optionGroup0.getOptions();
        java.lang.String str19 = optionGroup0.toString();
        org.apache.commons.cli.Option option20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup21 = optionGroup0.addOption(option20);
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
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.toString();
        java.util.Collection collection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        optionGroup0.setSelected(option11);
        boolean boolean13 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        optionGroup0.setRequired(false);
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        optionGroup0.setRequired(false);
        java.lang.String str15 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.lang.String str6 = optionGroup0.getSelected();
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getNames();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        boolean boolean13 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getOptions();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        optionGroup0.setSelected(option13);
        optionGroup0.setRequired(false);
        java.util.Collection collection17 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option18 = null;
        optionGroup0.setSelected(option18);
        java.lang.String str20 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        optionGroup0.setSelected(option13);
        optionGroup0.setRequired(false);
        java.util.Collection collection17 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option18 = null;
        optionGroup0.setSelected(option18);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str12 = optionGroup0.toString();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        java.util.Collection collection16 = optionGroup0.getOptions();
        java.lang.String str17 = optionGroup0.toString();
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
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        java.lang.String str14 = optionGroup0.toString();
        java.util.Collection collection15 = optionGroup0.getNames();
        boolean boolean16 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        org.apache.commons.cli.Option option19 = null;
        optionGroup0.setSelected(option19);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        java.lang.String str12 = optionGroup0.getSelected();
        boolean boolean13 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.util.Collection collection13 = optionGroup0.getNames();
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        boolean boolean3 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.String str16 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getOptions();
        boolean boolean16 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.String str16 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.util.Collection collection12 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str11 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.String str15 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        java.util.Collection collection16 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.lang.String str19 = optionGroup0.toString();
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
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
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
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getNames();
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
        java.util.Collection collection15 = optionGroup0.getNames();
        java.util.Collection collection16 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        java.util.Collection collection13 = optionGroup0.getNames();
        java.lang.String str14 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.util.Collection collection16 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        java.util.Collection collection15 = optionGroup0.getNames();
        boolean boolean16 = optionGroup0.isRequired();
        boolean boolean17 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass18 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.String str13 = optionGroup0.getSelected();
        java.util.Collection collection14 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getOptions();
        boolean boolean6 = optionGroup0.isRequired();
        boolean boolean7 = optionGroup0.isRequired();
        boolean boolean8 = optionGroup0.isRequired();
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        optionGroup0.setSelected(option12);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean15 = optionGroup0.isRequired();
        boolean boolean16 = optionGroup0.isRequired();
        java.util.Collection collection17 = optionGroup0.getOptions();
        java.util.Collection collection18 = optionGroup0.getNames();
        java.lang.String str19 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.util.Collection collection19 = optionGroup0.getNames();
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
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass9 = collection8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.getSelected();
        java.lang.String str16 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.lang.String str4 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection12 = optionGroup0.getOptions();
        boolean boolean13 = optionGroup0.isRequired();
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.util.Collection collection17 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean15 = optionGroup0.isRequired();
        boolean boolean16 = optionGroup0.isRequired();
        java.util.Collection collection17 = optionGroup0.getOptions();
        java.util.Collection collection18 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection21 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection collection5 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection15 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        java.util.Collection collection17 = optionGroup0.getOptions();
        java.util.Collection collection18 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        java.util.Collection collection12 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        boolean boolean19 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option20 = null;
        optionGroup0.setSelected(option20);
        java.util.Collection collection22 = optionGroup0.getOptions();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        optionGroup0.setRequired(true);
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.String str15 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        java.lang.String str11 = optionGroup0.getSelected();
        boolean boolean12 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        optionGroup0.setRequired(false);
        java.lang.String str15 = optionGroup0.getSelected();
        java.util.Collection collection16 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass17 = collection16.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.toString();
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        boolean boolean13 = optionGroup0.isRequired();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        optionGroup0.setRequired(false);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.lang.String str15 = optionGroup0.toString();
        java.util.Collection collection16 = optionGroup0.getOptions();
        java.lang.String str17 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        optionGroup0.setRequired(true);
        java.lang.String str13 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
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
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.String str11 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        java.lang.String str18 = optionGroup0.getSelected();
        boolean boolean19 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup21 = optionGroup0.addOption(option20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.getSelected();
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.getSelected();
        java.util.Collection collection14 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
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
        optionGroup0.setRequired(false);
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
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.util.Collection collection13 = optionGroup0.getNames();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        optionGroup0.setRequired(false);
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
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
        java.lang.String str12 = optionGroup0.getSelected();
        boolean boolean13 = optionGroup0.isRequired();
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
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
        optionGroup0.setRequired(false);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass15 = collection14.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        optionGroup0.setRequired(false);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.lang.String str15 = optionGroup0.toString();
        java.util.Collection collection16 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.util.Collection collection19 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getOptions();
        boolean boolean6 = optionGroup0.isRequired();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        java.lang.String str12 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        optionGroup0.setRequired(true);
        java.util.Collection collection17 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        optionGroup0.setRequired(false);
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getNames();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.util.Collection collection16 = optionGroup0.getNames();
        java.util.Collection collection17 = optionGroup0.getOptions();
        boolean boolean18 = optionGroup0.isRequired();
        java.util.Collection collection19 = optionGroup0.getOptions();
        java.util.Collection collection20 = optionGroup0.getNames();
        java.lang.String str21 = optionGroup0.toString();
        org.apache.commons.cli.Option option22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup23 = optionGroup0.addOption(option22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        java.util.Collection collection13 = optionGroup0.getNames();
        boolean boolean14 = optionGroup0.isRequired();
        java.util.Collection collection15 = optionGroup0.getNames();
        java.util.Collection collection16 = optionGroup0.getOptions();
        java.util.Collection collection17 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup19 = optionGroup0.addOption(option18);
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
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.String str13 = optionGroup0.toString();
        java.util.Collection collection14 = optionGroup0.getOptions();
        java.lang.String str15 = optionGroup0.toString();
        java.lang.String str16 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        java.util.Collection collection16 = optionGroup0.getNames();
        java.util.Collection collection17 = optionGroup0.getOptions();
        java.lang.String str18 = optionGroup0.toString();
        java.lang.String str19 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.getSelected();
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.lang.String str4 = optionGroup0.toString();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        java.lang.String str10 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        java.util.Collection collection13 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        boolean boolean17 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass18 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        java.util.Collection collection12 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection15 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        java.lang.String str12 = optionGroup0.toString();
        java.util.Collection collection13 = optionGroup0.getOptions();
        java.util.Collection collection14 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass15 = collection14.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection collection8 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection11 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str13 = optionGroup0.toString();
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.util.Collection collection8 = optionGroup0.getNames();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        java.util.Collection collection17 = optionGroup0.getOptions();
        java.util.Collection collection18 = optionGroup0.getNames();
        java.util.Collection collection19 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        java.util.Collection collection15 = optionGroup0.getOptions();
        java.util.Collection collection16 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass17 = collection16.getClass();
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
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        java.util.Collection collection14 = optionGroup0.getOptions();
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        boolean boolean15 = optionGroup0.isRequired();
        java.lang.String str16 = optionGroup0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        boolean boolean15 = optionGroup0.isRequired();
        java.lang.String str16 = optionGroup0.toString();
        java.lang.String str17 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection collection12 = optionGroup0.getNames();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.util.Collection collection15 = optionGroup0.getNames();
        java.lang.String str16 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass17 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
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
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
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
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.toString();
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
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
        java.util.Collection collection15 = optionGroup0.getOptions();
        java.util.Collection collection16 = optionGroup0.getNames();
        java.util.Collection collection17 = optionGroup0.getOptions();
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
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        java.lang.String str16 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        boolean boolean19 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option20 = null;
        optionGroup0.setSelected(option20);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        boolean boolean17 = optionGroup0.isRequired();
        java.util.Collection collection18 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        optionGroup0.setSelected(option12);
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection collection13 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str16 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        optionGroup0.setRequired(false);
        java.util.Collection collection14 = optionGroup0.getOptions();
        java.lang.String str15 = optionGroup0.getSelected();
        java.util.Collection collection16 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
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
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection8 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.lang.String str19 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str15 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option20 = null;
        optionGroup0.setSelected(option20);
        java.lang.String str22 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.lang.String str3 = optionGroup0.getSelected();
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.util.Collection collection10 = optionGroup0.getNames();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
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
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.util.Collection collection16 = optionGroup0.getNames();
        java.lang.String str17 = optionGroup0.toString();
        boolean boolean18 = optionGroup0.isRequired();
        java.lang.String str19 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        boolean boolean3 = optionGroup0.isRequired();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.Class<?> wildcardClass7 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        boolean boolean4 = optionGroup0.isRequired();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
        boolean boolean16 = optionGroup0.isRequired();
        java.lang.String str17 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup21 = optionGroup0.addOption(option20);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
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
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
        boolean boolean12 = optionGroup0.isRequired();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        java.util.Collection collection13 = optionGroup0.getNames();
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getNames();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str16 = optionGroup0.toString();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean12 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        java.lang.String str11 = optionGroup0.getSelected();
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.String str16 = optionGroup0.toString();
        java.util.Collection collection17 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        optionGroup0.setRequired(true);
        boolean boolean17 = optionGroup0.isRequired();
        boolean boolean18 = optionGroup0.isRequired();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.util.Collection collection12 = optionGroup0.getNames();
        boolean boolean13 = optionGroup0.isRequired();
        java.util.Collection collection14 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
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
        boolean boolean10 = optionGroup0.isRequired();
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        optionGroup0.setSelected(option12);
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
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        java.lang.String str14 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        boolean boolean17 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        java.util.Collection collection12 = optionGroup0.getNames();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        boolean boolean16 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup18 = optionGroup0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
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
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.util.Collection collection16 = optionGroup0.getNames();
        java.util.Collection collection17 = optionGroup0.getOptions();
        boolean boolean18 = optionGroup0.isRequired();
        java.util.Collection collection19 = optionGroup0.getOptions();
        java.util.Collection collection20 = optionGroup0.getNames();
        java.util.Collection collection21 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass22 = collection21.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        optionGroup0.setSelected(option16);
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
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
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
        optionGroup0.setRequired(true);
        boolean boolean15 = optionGroup0.isRequired();
        java.lang.String str16 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.getSelected();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.util.Collection collection16 = optionGroup0.getNames();
        java.util.Collection collection17 = optionGroup0.getOptions();
        boolean boolean18 = optionGroup0.isRequired();
        java.util.Collection collection19 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection22 = optionGroup0.getNames();
        java.lang.String str23 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
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
        optionGroup0.setSelected(option16);
        java.util.Collection collection18 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
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
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean11 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.util.Collection collection15 = optionGroup0.getOptions();
        boolean boolean16 = optionGroup0.isRequired();
        java.util.Collection collection17 = optionGroup0.getNames();
        java.lang.String str18 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
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
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup17 = optionGroup0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        optionGroup0.setRequired(false);
        java.lang.String str15 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str18 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
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
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.util.Collection collection11 = optionGroup0.getNames();
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
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        org.apache.commons.cli.Option option18 = null;
        optionGroup0.setSelected(option18);
        java.util.Collection collection20 = optionGroup0.getOptions();
        java.lang.String str21 = optionGroup0.toString();
        java.lang.String str22 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean12 = optionGroup0.isRequired();
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        optionGroup0.setRequired(false);
        java.lang.String str21 = optionGroup0.toString();
        java.lang.String str22 = optionGroup0.getSelected();
        java.util.Collection collection23 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getNames();
        java.lang.String str14 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean11 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.util.Collection collection15 = optionGroup0.getOptions();
        java.lang.String str16 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass4 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.getSelected();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        boolean boolean11 = optionGroup0.isRequired();
        boolean boolean12 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        java.util.Collection collection13 = optionGroup0.getNames();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.toString();
        java.util.Collection collection16 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str12 = optionGroup0.getSelected();
        boolean boolean13 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.util.Collection collection16 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
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
        java.util.Collection collection12 = optionGroup0.getNames();
        java.util.Collection collection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection16 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection18 = optionGroup0.getNames();
        boolean boolean19 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
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
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
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
        java.util.Collection collection15 = optionGroup0.getOptions();
        java.util.Collection collection16 = optionGroup0.getOptions();
        java.lang.String str17 = optionGroup0.getSelected();
        java.lang.String str18 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.getSelected();
        java.lang.String str14 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.util.Collection collection8 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.String str13 = optionGroup0.getSelected();
        java.util.Collection collection14 = optionGroup0.getNames();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
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
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection16 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        java.util.Collection collection15 = optionGroup0.getNames();
        boolean boolean16 = optionGroup0.isRequired();
        boolean boolean17 = optionGroup0.isRequired();
        java.util.Collection collection18 = optionGroup0.getNames();
        org.apache.commons.cli.Option option19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup20 = optionGroup0.addOption(option19);
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
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
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
        optionGroup0.setRequired(false);
        java.util.Collection collection14 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str15 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        optionGroup0.setRequired(true);
        java.util.Collection collection14 = optionGroup0.getNames();
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
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
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        boolean boolean15 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
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
        java.util.Collection collection16 = optionGroup0.getNames();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.lang.String str19 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup21 = optionGroup0.addOption(option20);
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
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getNames();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection collection13 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
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
        java.lang.String str13 = optionGroup0.getSelected();
        java.lang.String str14 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
        boolean boolean12 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection collection10 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
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
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection collection11 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        java.lang.String str17 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass11 = collection10.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
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
        java.lang.String str12 = optionGroup0.getSelected();
        boolean boolean13 = optionGroup0.isRequired();
        boolean boolean14 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
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
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        java.util.Collection collection15 = optionGroup0.getOptions();
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
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
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
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
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
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
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
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getOptions();
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
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
    }
}

