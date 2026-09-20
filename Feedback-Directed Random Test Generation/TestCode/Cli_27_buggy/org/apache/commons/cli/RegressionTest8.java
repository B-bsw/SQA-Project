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
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        optionGroup0.setRequired(false);
        java.lang.String str17 = optionGroup0.getSelected();
        java.util.Collection collection18 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        java.lang.Class<?> wildcardClass24 = optionGroup0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.getSelected();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        optionGroup0.setRequired(true);
        java.util.Collection collection14 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.toString();
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
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.toString();
        java.util.Collection collection15 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection18 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        boolean boolean14 = optionGroup0.isRequired();
        boolean boolean15 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.toString();
        boolean boolean15 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        java.lang.Class<?> wildcardClass15 = collection14.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        optionGroup0.setRequired(false);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        java.lang.String str14 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.getSelected();
        java.lang.String str14 = optionGroup0.toString();
        boolean boolean15 = optionGroup0.isRequired();
        java.lang.String str16 = optionGroup0.getSelected();
        java.lang.String str17 = optionGroup0.toString();
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.String str15 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        optionGroup0.setRequired(false);
        java.util.Collection collection16 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        optionGroup0.setRequired(true);
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
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection collection13 = optionGroup0.getNames();
        java.util.Collection collection14 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        boolean boolean13 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.String str13 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        optionGroup0.setRequired(false);
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.String str15 = optionGroup0.toString();
        java.util.Collection collection16 = optionGroup0.getOptions();
        java.lang.String str17 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        java.lang.String str15 = optionGroup0.toString();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean4 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        java.util.Collection collection10 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        java.util.Collection collection21 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
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
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str13 = optionGroup0.toString();
        java.lang.String str14 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        optionGroup0.setRequired(false);
        java.util.Collection collection18 = optionGroup0.getNames();
        java.lang.String str19 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        boolean boolean22 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getNames();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str8 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        java.lang.String str17 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection collection14 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.getSelected();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        boolean boolean10 = optionGroup0.isRequired();
        boolean boolean11 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        boolean boolean13 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        optionGroup0.setRequired(false);
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        optionGroup0.setRequired(true);
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        java.lang.String str17 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str13 = optionGroup0.toString();
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
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        java.util.Collection collection14 = optionGroup0.getOptions();
        java.lang.String str15 = optionGroup0.toString();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        java.util.Collection collection18 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        java.lang.String str12 = optionGroup0.toString();
        java.lang.String str13 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection collection10 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        boolean boolean10 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean13 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection collection8 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        boolean boolean13 = optionGroup0.isRequired();
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        java.util.Collection collection14 = optionGroup0.getNames();
        java.lang.String str15 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.util.Collection collection10 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        optionGroup0.setRequired(false);
        java.lang.String str15 = optionGroup0.toString();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        boolean boolean18 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        java.lang.String str12 = optionGroup0.toString();
        boolean boolean13 = optionGroup0.isRequired();
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        optionGroup0.setRequired(false);
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.getSelected();
        java.lang.String str15 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.getSelected();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        boolean boolean15 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        java.util.Collection collection18 = optionGroup0.getOptions();
        java.util.Collection collection19 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.util.Collection collection10 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        java.util.Collection collection18 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getOptions();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        java.util.Collection collection11 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
        java.lang.String str11 = optionGroup0.toString();
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getNames();
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection collection13 = optionGroup0.getOptions();
        java.util.Collection collection14 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.util.Collection collection10 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.getSelected();
        boolean boolean7 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
        java.util.Collection collection17 = optionGroup0.getNames();
        java.lang.String str18 = optionGroup0.getSelected();
        java.lang.String str19 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.lang.String str6 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.lang.String str3 = optionGroup0.getSelected();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.util.Collection collection8 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.toString();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        java.util.Collection collection14 = optionGroup0.getOptions();
        java.lang.String str15 = optionGroup0.toString();
        java.lang.String str16 = optionGroup0.toString();
        java.util.Collection collection17 = optionGroup0.getOptions();
        java.util.Collection collection18 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean4 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection collection10 = optionGroup0.getOptions();
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.toString();
        java.util.Collection collection2 = optionGroup0.getNames();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        java.lang.String str12 = optionGroup0.toString();
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        java.util.Collection collection14 = optionGroup0.getOptions();
        java.lang.String str15 = optionGroup0.toString();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        java.lang.Class<?> wildcardClass18 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
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
        optionGroup0.setRequired(true);
        boolean boolean18 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.getSelected();
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.toString();
        boolean boolean14 = optionGroup0.isRequired();
        boolean boolean15 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        org.apache.commons.cli.Option option18 = null;
        optionGroup0.setSelected(option18);
        java.util.Collection collection20 = optionGroup0.getNames();
        java.util.Collection collection21 = optionGroup0.getOptions();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getNames();
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        optionGroup0.setRequired(true);
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.getSelected();
        java.util.Collection collection14 = optionGroup0.getOptions();
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str13 = optionGroup0.toString();
        java.util.Collection collection14 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        boolean boolean13 = optionGroup0.isRequired();
        java.util.Collection collection14 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
        java.util.Collection collection18 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass21 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
        java.lang.String str15 = optionGroup0.getSelected();
        java.lang.String str16 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.util.Collection collection19 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.util.Collection collection8 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        boolean boolean10 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean13 = optionGroup0.isRequired();
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getOptions();
        boolean boolean6 = optionGroup0.isRequired();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.String str10 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
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
        java.lang.Class<?> wildcardClass17 = optionGroup0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        java.lang.String str12 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        java.util.Collection collection19 = optionGroup0.getNames();
        java.util.Collection collection20 = optionGroup0.getOptions();
        boolean boolean21 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        java.lang.String str20 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        java.util.Collection collection11 = optionGroup0.getOptions();
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        boolean boolean16 = optionGroup0.isRequired();
        java.lang.String str17 = optionGroup0.getSelected();
        java.util.Collection collection18 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass19 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        java.lang.String str17 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.getSelected();
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        java.lang.String str16 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        optionGroup0.setSelected(option11);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        boolean boolean13 = optionGroup0.isRequired();
        java.util.Collection collection14 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.getSelected();
        java.util.Collection collection14 = optionGroup0.getOptions();
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
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
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        java.lang.String str11 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        java.util.Collection collection18 = optionGroup0.getOptions();
        boolean boolean19 = optionGroup0.isRequired();
        java.lang.String str20 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        java.util.Collection collection12 = optionGroup0.getOptions();
        java.lang.String str13 = optionGroup0.getSelected();
        java.util.Collection collection14 = optionGroup0.getOptions();
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        java.lang.String str16 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.lang.String str19 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.toString();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        java.lang.String str18 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.getSelected();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        optionGroup0.setRequired(true);
        java.util.Collection collection20 = optionGroup0.getNames();
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
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
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
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.getSelected();
        boolean boolean15 = optionGroup0.isRequired();
        java.util.Collection collection16 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.getSelected();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        java.util.Collection collection16 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection19 = optionGroup0.getNames();
        org.apache.commons.cli.Option option20 = null;
        optionGroup0.setSelected(option20);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        java.lang.String str19 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
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
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        java.lang.String str18 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        org.apache.commons.cli.Option option18 = null;
        optionGroup0.setSelected(option18);
        java.util.Collection collection20 = optionGroup0.getOptions();
        java.util.Collection collection21 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection collection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection collection10 = optionGroup0.getNames();
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
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
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
        java.lang.String str15 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
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
        optionGroup0.setRequired(true);
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        java.lang.String str15 = optionGroup0.getSelected();
        java.lang.String str16 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.lang.String str19 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option20 = null;
        optionGroup0.setSelected(option20);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
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
        java.util.Collection collection16 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
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
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        java.lang.String str13 = optionGroup0.getSelected();
        java.util.Collection collection14 = optionGroup0.getNames();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        boolean boolean17 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.toString();
        java.util.Collection collection14 = optionGroup0.getNames();
        java.util.Collection collection15 = optionGroup0.getNames();
        java.util.Collection collection16 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
        java.lang.String str12 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
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
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        boolean boolean13 = optionGroup0.isRequired();
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection collection12 = optionGroup0.getNames();
        java.util.Collection collection13 = optionGroup0.getNames();
        java.util.Collection collection14 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
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
        optionGroup0.setRequired(true);
        java.util.Collection collection19 = optionGroup0.getNames();
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
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getOptions();
        java.util.Collection collection10 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
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
        java.lang.String str16 = optionGroup0.getSelected();
        java.lang.String str17 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
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
        java.lang.String str12 = optionGroup0.toString();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.String str16 = optionGroup0.toString();
        java.lang.String str17 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        boolean boolean16 = optionGroup0.isRequired();
        java.util.Collection collection17 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass9 = collection8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
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
        boolean boolean13 = optionGroup0.isRequired();
        java.util.Collection collection14 = optionGroup0.getNames();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
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
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
        java.lang.String str13 = optionGroup0.toString();
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
        org.apache.commons.cli.Option option19 = null;
        optionGroup0.setSelected(option19);
        org.apache.commons.cli.Option option21 = null;
        optionGroup0.setSelected(option21);
        org.apache.commons.cli.Option option23 = null;
        optionGroup0.setSelected(option23);
        org.apache.commons.cli.Option option25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup26 = optionGroup0.addOption(option25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
        optionGroup0.setRequired(false);
        java.util.Collection collection16 = optionGroup0.getNames();
        java.util.Collection collection17 = optionGroup0.getOptions();
        java.lang.String str18 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
        optionGroup0.setRequired(false);
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        java.util.Collection collection14 = optionGroup0.getNames();
        java.lang.String str15 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean4 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isRequired();
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
        java.lang.String str14 = optionGroup0.getSelected();
        boolean boolean15 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection collection14 = optionGroup0.getNames();
        boolean boolean15 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.toString();
        java.util.Collection collection16 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        optionGroup0.setRequired(true);
        java.util.Collection collection15 = optionGroup0.getNames();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
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
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
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
        java.lang.String str12 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
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
        java.util.Collection collection22 = optionGroup0.getNames();
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
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
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
        boolean boolean12 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.lang.String str19 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass20 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
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
        boolean boolean10 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean13 = optionGroup0.isRequired();
        java.util.Collection collection14 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.util.Collection collection11 = optionGroup0.getOptions();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        org.apache.commons.cli.Option option18 = null;
        optionGroup0.setSelected(option18);
        boolean boolean20 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        java.lang.String str15 = optionGroup0.getSelected();
        java.util.Collection collection16 = optionGroup0.getNames();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.getSelected();
        boolean boolean12 = optionGroup0.isRequired();
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean13 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        boolean boolean16 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
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
        java.util.Collection collection15 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean18 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option19 = null;
        optionGroup0.setSelected(option19);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection collection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(true);
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection collection11 = optionGroup0.getNames();
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
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
        java.util.Collection collection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.toString();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
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
        java.lang.String str10 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection collection14 = optionGroup0.getOptions();
        boolean boolean15 = optionGroup0.isRequired();
        java.util.Collection collection16 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        java.util.Collection collection12 = optionGroup0.getOptions();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
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
        java.lang.String str22 = optionGroup0.getSelected();
        java.lang.String str23 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        java.util.Collection collection13 = optionGroup0.getNames();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.String str16 = optionGroup0.toString();
        java.util.Collection collection17 = optionGroup0.getOptions();
        java.lang.String str18 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
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
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        org.apache.commons.cli.Option option18 = null;
        optionGroup0.setSelected(option18);
        java.util.Collection collection20 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup22 = optionGroup0.addOption(option21);
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
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.toString();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        optionGroup0.setRequired(false);
        java.util.Collection collection18 = optionGroup0.getNames();
        java.lang.String str19 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option22 = null;
        optionGroup0.setSelected(option22);
        java.util.Collection collection24 = optionGroup0.getNames();
        java.util.Collection collection25 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        java.util.Collection collection14 = optionGroup0.getNames();
        java.util.Collection collection15 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
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
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        java.util.Collection collection18 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
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
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection collection5 = optionGroup0.getNames();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
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
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str16 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
        java.util.Collection collection16 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass17 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
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
        java.lang.String str12 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str15 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
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
        java.lang.String str11 = optionGroup0.toString();
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection collection13 = optionGroup0.getNames();
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
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
        java.lang.Class<?> wildcardClass14 = collection13.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
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
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        java.lang.String str19 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
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
        java.lang.String str14 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
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
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection collection8 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
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
        optionGroup0.setRequired(false);
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
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.util.Collection collection9 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
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
        optionGroup0.setRequired(true);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        java.lang.String str11 = optionGroup0.getSelected();
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
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
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
        java.lang.String str16 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str19 = optionGroup0.getSelected();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection collection4 = optionGroup0.getOptions();
        java.util.Collection collection5 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
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
        java.util.Collection collection17 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option18 = null;
        optionGroup0.setSelected(option18);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
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
        boolean boolean11 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
        java.util.Collection collection10 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        optionGroup0.setRequired(false);
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        java.util.Collection collection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection collection10 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.lang.String str13 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
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
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.getSelected();
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.toString();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection collection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option16 = null;
        optionGroup0.setSelected(option16);
        java.util.Collection collection18 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        boolean boolean12 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        org.apache.commons.cli.Option option19 = null;
        optionGroup0.setSelected(option19);
        java.lang.String str21 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.util.Collection collection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection collection7 = optionGroup0.getOptions();
        java.util.Collection collection8 = optionGroup0.getNames();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection collection13 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
        boolean boolean3 = optionGroup0.isRequired();
        java.util.Collection collection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection collection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
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
        java.lang.String str12 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection15 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.util.Collection collection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
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
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection collection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getOptions();
        java.util.Collection collection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.util.Collection collection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
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
        java.util.Collection collection16 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str21 = optionGroup0.toString();
        org.apache.commons.cli.Option option22 = null;
        optionGroup0.setSelected(option22);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        boolean boolean3 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection collection6 = optionGroup0.getOptions();
        java.util.Collection collection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection collection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection collection13 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.getSelected();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str12 = optionGroup0.toString();
        java.util.Collection collection13 = optionGroup0.getNames();
        java.lang.String str14 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection collection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        boolean boolean8 = optionGroup0.isRequired();
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection collection10 = optionGroup0.getOptions();
        java.util.Collection collection11 = optionGroup0.getNames();
        java.util.Collection collection12 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.toString();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection collection9 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
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
        java.lang.String str16 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.lang.String str19 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
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
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getOptions();
        java.util.Collection collection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
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
        java.util.Collection collection18 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str21 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
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
        java.util.Collection collection13 = optionGroup0.getNames();
        java.util.Collection collection14 = optionGroup0.getNames();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection collection1 = optionGroup0.getNames();
        java.util.Collection collection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection collection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection collection11 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
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
        java.lang.String str13 = optionGroup0.toString();
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
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
        optionGroup0.setRequired(true);
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
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
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
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
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
        java.lang.String str16 = optionGroup0.toString();
        java.lang.String str17 = optionGroup0.getSelected();
        boolean boolean18 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
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
        java.util.Collection collection11 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection collection14 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
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
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
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
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.toString();
        java.util.Collection collection15 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
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
        java.util.Collection collection12 = optionGroup0.getNames();
        java.util.Collection collection13 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection collection16 = optionGroup0.getOptions();
        java.lang.String str17 = optionGroup0.toString();
        java.lang.String str18 = optionGroup0.getSelected();
        java.util.Collection collection19 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(collection19);
    }
}

