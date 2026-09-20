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
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.String str15 = option4.getArgName();
        option4.setRequired(true);
        java.lang.String str18 = option4.getArgName();
        boolean boolean19 = option4.acceptsArg();
        option4.setDescription("[ option:    [ARG] ::  ]");
        boolean boolean22 = option4.hasValueSeparator();
        java.lang.String str24 = option4.getValue((-1));
        java.lang.Object obj25 = option4.getType();
        boolean boolean26 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        java.lang.Object obj13 = option4.clone();
        option4.setOptionalArg(true);
        option4.setDescription("[ option:   ::  ]");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.acceptsArg();
        java.lang.String str13 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", "[ option:   :: a ]", true, "[ option: a  [ARG] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  hi!  :: [ option: a  [ARG] :: a ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasArg();
        boolean boolean11 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.String str13 = option4.getValue((int) 'a');
        char char14 = option4.getValueSeparator();
        option4.setOptionalArg(false);
        boolean boolean17 = option4.hasArg();
        boolean boolean18 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  ::  ]", false, "[ option:    [ARG] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        int int12 = option4.getArgs();
        java.lang.String str13 = option4.getArgName();
        boolean boolean14 = option4.isRequired();
        option4.setDescription("[ option: a  [ARG] :: a ]");
        char char17 = option4.getValueSeparator();
        boolean boolean18 = option4.acceptsArg();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        java.lang.String str4 = option2.getValue("[ option:    [ARG] ::  ]");
        option2.clearValues();
        int int6 = option2.getArgs();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean12 = option11.hasLongOpt();
        java.lang.String str13 = option11.getKey();
        boolean boolean14 = option11.hasArg();
        option11.setValueSeparator('#');
        boolean boolean17 = option2.equals((java.lang.Object) option11);
        boolean boolean18 = option2.requiresArg();
        java.lang.String str19 = option2.getArgName();
        java.lang.String str20 = option2.getArgName();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str26 = option25.getValue();
        java.lang.String str27 = option25.getOpt();
        java.lang.String str28 = option25.getKey();
        java.util.List list29 = option25.getValuesList();
        option25.setRequired(false);
        boolean boolean32 = option2.equals((java.lang.Object) option25);
        java.lang.String str33 = option25.getOpt();
        java.lang.Object obj34 = option25.clone();
        java.lang.String str35 = option25.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        int int6 = option4.getArgs();
        java.lang.String str7 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        option2.clearValues();
        java.lang.String[] strArray4 = option2.getValues();
        java.lang.String[] strArray5 = option2.getValues();
        java.lang.String str6 = option2.toString();
        boolean boolean7 = option2.hasValueSeparator();
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]" + "'", str6, "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        option2.clearValues();
        java.lang.String[] strArray4 = option2.getValues();
        int int5 = option2.getArgs();
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getValue();
        boolean boolean5 = option3.hasArg();
        option3.clearValues();
        option3.clearValues();
        java.lang.String[] strArray8 = option3.getValues();
        java.lang.String str9 = option3.getKey();
        option3.setArgs((int) ' ');
        boolean boolean12 = option3.hasArg();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.Object obj14 = option4.getType();
        boolean boolean15 = option4.hasArgs();
        boolean boolean16 = option4.acceptsArg();
        option4.setArgs(100);
        int int19 = option4.getArgs();
        option4.setArgs(52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        java.lang.String str12 = option4.getKey();
        java.lang.String str14 = option4.getValue("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean15 = option4.isRequired();
        java.lang.Object obj16 = option4.clone();
        java.lang.String str17 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str14, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[ option:    ::  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setRequired(true);
        java.lang.Class class14 = null;
        option4.setType(class14);
        char char16 = option4.getValueSeparator();
        java.lang.String str17 = option4.getKey();
        boolean boolean18 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        option4.setValueSeparator('a');
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        option18.setRequired(false);
        boolean boolean22 = option18.requiresArg();
        boolean boolean23 = option4.equals((java.lang.Object) option18);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = option18.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str11 = option4.getValue(1);
        option4.addValueForProcessing("hi!");
        boolean boolean14 = option4.hasArgs();
        java.lang.String str15 = option4.getArgName();
        int int16 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   [ARG...] ::  ]", "[ option: a [ option:    [ARG] :: hi! ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   [ARG...] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getKey();
        boolean boolean12 = option4.hasArg();
        java.lang.String str13 = option4.getDescription();
        java.lang.String str14 = option4.getKey();
        java.lang.String str15 = option4.getValue();
        option4.setOptionalArg(true);
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean23 = option22.hasLongOpt();
        option22.setRequired(false);
        boolean boolean26 = option22.hasArg();
        boolean boolean27 = option22.acceptsArg();
        boolean boolean28 = option22.hasLongOpt();
        java.lang.String[] strArray29 = option22.getValues();
        boolean boolean30 = option22.requiresArg();
        boolean boolean31 = option22.isRequired();
        java.lang.Class<?> wildcardClass32 = option22.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder33 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass32);
        option4.setType((java.lang.Class) wildcardClass32);
        java.lang.String[] strArray35 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(optionBuilder33);
        org.junit.Assert.assertNull(strArray35);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        option4.setLongOpt("");
        java.lang.String str12 = option4.getValue();
        boolean boolean13 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        boolean boolean10 = option4.hasArgs();
        option4.setLongOpt("[ option: a a  ::  ]");
        option4.setLongOpt("[ option:    ::  :: class org.apache.commons.cli.Option ]");
        java.lang.String[] strArray15 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        option4.setValueSeparator('#');
        java.lang.Object obj15 = option4.clone();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("a", "hi!");
        option18.setRequired(false);
        boolean boolean21 = option4.equals((java.lang.Object) false);
        boolean boolean22 = option4.isRequired();
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.Class class11 = null;
        option4.setType(class11);
        boolean boolean13 = option4.hasArg();
        option4.setArgName("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        option4.addValueForProcessing("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        char char18 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        option4.setLongOpt("");
        boolean boolean15 = option4.hasArgName();
        option4.setArgs((int) ' ');
        java.lang.String str18 = option4.getKey();
        boolean boolean19 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        char char9 = option4.getValueSeparator();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean15 = option14.hasLongOpt();
        option14.setRequired(false);
        boolean boolean18 = option14.hasArg();
        boolean boolean19 = option14.acceptsArg();
        boolean boolean20 = option14.hasLongOpt();
        java.lang.String[] strArray21 = option14.getValues();
        boolean boolean22 = option14.requiresArg();
        java.lang.String[] strArray23 = option14.getValues();
        java.lang.String[] strArray24 = option14.getValues();
        option14.setArgs((-2));
        boolean boolean27 = option14.hasArg();
        java.lang.Object obj28 = option14.getType();
        boolean boolean29 = option14.hasArgs();
        option14.setValueSeparator(' ');
        boolean boolean32 = option4.equals((java.lang.Object) option14);
        java.util.List list33 = option14.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasArgName();
        java.lang.String str10 = option4.getValue((int) 'a');
        boolean boolean11 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option2.setType((java.lang.Class) wildcardClass14);
        java.lang.String str17 = option2.getValue();
        java.lang.String str19 = option2.getValue(0);
        option2.clearValues();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getKey();
        boolean boolean12 = option4.hasArg();
        java.lang.String str13 = option4.getDescription();
        java.lang.String str14 = option4.getKey();
        java.lang.String str15 = option4.getValue();
        option4.setOptionalArg(true);
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean23 = option22.hasLongOpt();
        option22.setRequired(false);
        boolean boolean26 = option22.hasArg();
        boolean boolean27 = option22.acceptsArg();
        boolean boolean28 = option22.hasLongOpt();
        java.lang.String[] strArray29 = option22.getValues();
        boolean boolean30 = option22.requiresArg();
        boolean boolean31 = option22.isRequired();
        java.lang.Class<?> wildcardClass32 = option22.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder33 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass32);
        option4.setType((java.lang.Class) wildcardClass32);
        java.lang.String str35 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(optionBuilder33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.getOpt();
        option4.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        boolean boolean9 = option4.acceptsArg();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        option4.setOptionalArg(false);
        java.lang.String str13 = option4.getLongOpt();
        java.lang.String str14 = option4.getArgName();
        boolean boolean15 = option4.acceptsArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = option4.addValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        option4.setDescription("");
        boolean boolean21 = option4.isRequired();
        boolean boolean22 = option4.requiresArg();
        java.lang.String str23 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str23, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("a", "[ option:   ::  ]", true, "a");
        java.util.List list9 = option8.getValuesList();
        java.lang.Class<?> wildcardClass10 = option8.getClass();
        option3.setType((java.lang.Class) wildcardClass10);
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class15 = null;
        option14.setType(class15);
        option14.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option14.clearValues();
        java.lang.String str20 = option14.getArgName();
        boolean boolean21 = option3.equals((java.lang.Object) option14);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String str14 = option4.getDescription();
        boolean boolean15 = option4.requiresArg();
        java.lang.String str16 = option4.getKey();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        boolean boolean23 = option21.isRequired();
        option21.setArgName("hi!");
        java.lang.Class<?> wildcardClass26 = option21.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder27 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass26);
        org.apache.commons.cli.OptionBuilder optionBuilder28 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass26);
        option4.setType((java.lang.Class) wildcardClass26);
        boolean boolean30 = option4.hasValueSeparator();
        org.apache.commons.cli.Option option35 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean36 = option35.hasLongOpt();
        java.lang.String str37 = option35.getKey();
        boolean boolean38 = option35.hasArgs();
        java.lang.Class class39 = null;
        option35.setType(class39);
        boolean boolean41 = option35.hasArgs();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean47 = option46.hasLongOpt();
        option46.setRequired(false);
        boolean boolean50 = option46.hasArg();
        boolean boolean51 = option46.acceptsArg();
        boolean boolean52 = option46.hasLongOpt();
        boolean boolean53 = option46.hasLongOpt();
        java.lang.Object obj54 = option46.getType();
        java.lang.String str56 = option46.getValue("a");
        org.apache.commons.cli.Option option61 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean62 = option61.hasLongOpt();
        option61.setRequired(false);
        boolean boolean65 = option61.hasArg();
        boolean boolean66 = option61.acceptsArg();
        boolean boolean67 = option61.hasLongOpt();
        java.lang.String[] strArray68 = option61.getValues();
        boolean boolean69 = option61.requiresArg();
        option61.setValueSeparator('4');
        boolean boolean72 = option61.hasArg();
        java.lang.String str73 = option61.getValue();
        java.lang.String str75 = option61.getValue("[ option:    [ARG] ::  ]");
        option61.setArgName("a");
        java.lang.String str78 = option61.getValue();
        org.apache.commons.cli.Option option83 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean84 = option83.hasLongOpt();
        boolean boolean85 = option83.isRequired();
        option83.setArgName("hi!");
        java.lang.Class<?> wildcardClass88 = option83.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder89 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass88);
        org.apache.commons.cli.OptionBuilder optionBuilder90 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass88);
        option61.setType((java.lang.Class) wildcardClass88);
        option46.setType((java.lang.Class) wildcardClass88);
        option35.setType((java.lang.Class) wildcardClass88);
        option4.setType((java.lang.Class) wildcardClass88);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(optionBuilder27);
        org.junit.Assert.assertNotNull(optionBuilder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "a" + "'", str56, "a");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str75, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(optionBuilder89);
        org.junit.Assert.assertNotNull(optionBuilder90);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str11 = option4.getValue(1);
        option4.addValueForProcessing("hi!");
        java.lang.Object obj14 = option4.clone();
        boolean boolean15 = option4.hasLongOpt();
        java.lang.String str17 = option4.getValue("[ option:    [ARG] :: [ option:   ::  ] ]");
        int int18 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.isRequired();
        boolean boolean11 = option4.hasArgs();
        java.lang.String str12 = option4.toString();
        option4.setLongOpt("[ option:   ::  ]");
        option4.setValueSeparator('\000');
        java.lang.String str17 = option4.getDescription();
        option4.setArgs((int) 'a');
        java.lang.Class<?> wildcardClass20 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str12, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        java.lang.String str6 = option4.getOpt();
        java.lang.Object obj7 = option4.clone();
        java.lang.String str9 = option4.getValue("hi!");
        boolean boolean10 = option4.hasArg();
        int int11 = option4.getArgs();
        java.lang.String str12 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:  [ option:   ::  ]  [ARG] ::  ]", false, "[ option: a  :: a :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option:   ::  ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        java.lang.String str4 = option2.getValue("[ option:    [ARG] ::  ]");
        option2.clearValues();
        int int6 = option2.getArgs();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean12 = option11.hasLongOpt();
        java.lang.String str13 = option11.getKey();
        boolean boolean14 = option11.hasArg();
        option11.setValueSeparator('#');
        boolean boolean17 = option2.equals((java.lang.Object) option11);
        java.lang.String str18 = option2.getArgName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        java.util.List list15 = option4.getValuesList();
        option4.setOptionalArg(false);
        java.lang.String str18 = option4.getKey();
        option4.setRequired(true);
        boolean boolean21 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        java.lang.String str9 = option4.getValue(0);
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        java.lang.String str12 = option4.getLongOpt();
        boolean boolean13 = option4.hasLongOpt();
        option4.setDescription("[ option:   ::  ]");
        boolean boolean16 = option4.hasArg();
        option4.setRequired(false);
        option4.setOptionalArg(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        java.lang.String str11 = option4.getOpt();
        java.lang.Object obj12 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getOpt();
        java.lang.String str6 = option2.toString();
        java.lang.String str8 = option2.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Object obj9 = option2.clone();
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean13 = option12.requiresArg();
        boolean boolean14 = option12.isRequired();
        java.lang.Class<?> wildcardClass15 = option12.getClass();
        option2.setType((java.lang.Class) wildcardClass15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   ::  ]" + "'", str6, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str8, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        option4.setArgs((-2));
        boolean boolean10 = option4.isRequired();
        option4.setDescription("[ option:    [ARG] :: [ option:   ::  ] ]");
        java.lang.String str13 = option4.getArgName();
        java.lang.Object obj14 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:   [ARG...] :: [ option:    [ARG] :: [ option:   ::  ] ] ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:   [ARG...] :: [ option:    [ARG] :: [ option:   ::  ] ] ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:   [ARG...] :: [ option:    [ARG] :: [ option:   ::  ] ] ]");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "hi!");
        option3.setOptionalArg(false);
        boolean boolean6 = option3.requiresArg();
        java.lang.String str7 = option3.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.toString();
        java.util.List list8 = option4.getValuesList();
        option4.setArgs((int) '\000');
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        java.lang.String str20 = option4.getValue((int) (byte) 1);
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean26 = option25.hasLongOpt();
        option25.setRequired(false);
        boolean boolean29 = option4.equals((java.lang.Object) option25);
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean35 = option34.hasLongOpt();
        boolean boolean36 = option34.isRequired();
        option34.setArgName("hi!");
        option34.setArgs((int) (byte) 0);
        boolean boolean41 = option34.hasOptionalArg();
        boolean boolean42 = option34.hasArg();
        boolean boolean43 = option34.hasArgs();
        boolean boolean44 = option25.equals((java.lang.Object) boolean43);
        char char45 = option25.getValueSeparator();
        option25.setArgs((int) (short) 1);
        option25.setDescription("[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\000' + "'", char45 == '\000');
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        int int9 = option4.getArgs();
        java.lang.String str11 = option4.getValue((int) ' ');
        option4.setLongOpt("[ option: a  :: null ]");
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasOptionalArg();
        java.lang.String str17 = option4.getValue(0);
        option4.setArgs((int) (byte) 100);
        boolean boolean20 = option4.hasArgName();
        option4.setDescription("[ option: a a  ::  ]");
        boolean boolean23 = option4.hasArgName();
        option4.setValueSeparator('#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        option2.setOptionalArg(true);
        int int12 = option2.getArgs();
        int int13 = option2.getArgs();
        boolean boolean14 = option2.hasLongOpt();
        java.lang.Class<?> wildcardClass15 = option2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(optionBuilder16);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        option2.setValueSeparator('\000');
        option2.setLongOpt("[ option:   ::  ]");
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean12 = option11.hasLongOpt();
        boolean boolean13 = option11.isRequired();
        option11.setArgName("hi!");
        option11.setArgs((int) (byte) 0);
        boolean boolean18 = option11.hasOptionalArg();
        boolean boolean19 = option11.hasArgs();
        boolean boolean20 = option11.isRequired();
        java.lang.String[] strArray21 = option11.getValues();
        java.lang.Class class22 = null;
        option11.setType(class22);
        option11.clearValues();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean30 = option29.hasLongOpt();
        option29.setRequired(false);
        boolean boolean33 = option29.hasArg();
        boolean boolean34 = option29.acceptsArg();
        boolean boolean35 = option29.hasLongOpt();
        java.lang.String[] strArray36 = option29.getValues();
        boolean boolean37 = option29.requiresArg();
        option29.setValueSeparator('4');
        java.lang.String str41 = option29.getValue((int) (short) 100);
        java.lang.String str42 = option29.getOpt();
        java.util.List list43 = option29.getValuesList();
        boolean boolean44 = option11.equals((java.lang.Object) list43);
        java.lang.Class<?> wildcardClass45 = list43.getClass();
        option2.setType((java.lang.Class) wildcardClass45);
        java.lang.String str47 = option2.getArgName();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.isRequired();
        option4.setValueSeparator('4');
        java.util.List list12 = option4.getValuesList();
        boolean boolean13 = option4.acceptsArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        boolean boolean17 = option4.acceptsArg();
        option4.setDescription("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean25 = option24.hasLongOpt();
        boolean boolean26 = option24.isRequired();
        java.lang.String str28 = option24.getValue("hi!");
        java.lang.String[] strArray29 = option24.getValues();
        option24.addValueForProcessing("hi!");
        boolean boolean32 = option24.acceptsArg();
        java.lang.Class<?> wildcardClass33 = option24.getClass();
        option4.setType((java.lang.Class) wildcardClass33);
        option4.setDescription("[ option:   :: hi! ]");
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.requiresArg();
        option4.setArgName("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        option4.setValueSeparator('\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        boolean boolean4 = option3.hasArg();
        boolean boolean5 = option3.hasArgName();
        java.lang.String[] strArray6 = option3.getValues();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getKey();
        java.util.List list8 = option4.getValuesList();
        java.lang.String str9 = option4.getKey();
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "hi!");
        option12.setDescription("");
        java.lang.String str15 = option12.getOpt();
        option12.setRequired(false);
        boolean boolean18 = option4.equals((java.lang.Object) option12);
        boolean boolean19 = option12.hasArg();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        boolean boolean12 = option4.hasArgName();
        boolean boolean13 = option4.isRequired();
        boolean boolean14 = option4.isRequired();
        option4.setArgs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        org.apache.commons.cli.Option option7 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str9 = option7.getValue(1);
        boolean boolean10 = option1.equals((java.lang.Object) option7);
        boolean boolean11 = option1.isRequired();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.hasOptionalArg();
        boolean boolean10 = option2.hasLongOpt();
        boolean boolean11 = option2.acceptsArg();
        option2.setArgName("[ option:    [ARG] :: a ]");
        boolean boolean14 = option2.hasArgs();
        java.lang.Class<?> wildcardClass15 = option2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:   ::  ]", true, "a");
        java.util.List list5 = option4.getValuesList();
        boolean boolean6 = option4.hasArg();
        boolean boolean7 = option4.hasOptionalArg();
        option4.clearValues();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean14 = option13.hasLongOpt();
        boolean boolean15 = option13.isRequired();
        java.lang.String str16 = option13.getOpt();
        option13.setLongOpt("hi!");
        option13.setValueSeparator('4');
        java.lang.String str21 = option13.getOpt();
        java.lang.Class<?> wildcardClass22 = option13.getClass();
        option4.setType((java.lang.Class) wildcardClass22);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        option4.addValueForProcessing("[ option:   ::  ]");
        java.lang.String str13 = option4.toString();
        boolean boolean14 = option4.hasArgName();
        boolean boolean15 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str13, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option: a  [ARG] :: a ]", false, "[ option:   :: a ]");
        java.lang.String str5 = option4.getValue();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.clearValues();
        boolean boolean11 = option1.acceptsArg();
        option1.setDescription("[ option:  [ option: a [ option:   ::  ]  :: a ]  ::  ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        boolean boolean13 = option4.hasArgName();
        java.lang.String str14 = option4.toString();
        java.lang.String str15 = option4.toString();
        option4.setLongOpt("[ option: a a  ::  ]");
        boolean boolean18 = option4.hasArg();
        boolean boolean19 = option4.hasArg();
        option4.setLongOpt("[ option: a  :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = option4.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: null ]", false, "[ option:   :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        boolean boolean10 = option4.hasArgs();
        boolean boolean11 = option4.hasValueSeparator();
        boolean boolean12 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str10 = option4.getKey();
        java.util.List list11 = option4.getValuesList();
        boolean boolean12 = option4.hasOptionalArg();
        java.lang.String str13 = option4.getLongOpt();
        char char14 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.hasArgName();
        java.lang.Object obj10 = option4.getType();
        java.lang.Object obj11 = option4.clone();
        java.lang.String str12 = option4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str12, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        option1.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        int int11 = option1.getArgs();
        java.lang.Object obj12 = option1.getType();
        char char13 = option1.getValueSeparator();
        option1.setLongOpt("4");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        boolean boolean13 = option4.hasArg();
        java.lang.String str14 = option4.getLongOpt();
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean20 = option19.hasLongOpt();
        boolean boolean21 = option19.isRequired();
        option19.setArgName("hi!");
        option19.setArgs((int) (byte) 0);
        boolean boolean26 = option19.hasOptionalArg();
        option19.setValueSeparator('a');
        org.apache.commons.cli.Option option33 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean34 = option33.hasLongOpt();
        option33.setRequired(false);
        boolean boolean37 = option33.requiresArg();
        boolean boolean38 = option19.equals((java.lang.Object) option33);
        java.lang.Class<?> wildcardClass39 = option19.getClass();
        option4.setType((java.lang.Class) wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean14 = option11.hasValueSeparator();
        java.lang.String str15 = option11.getValue();
        boolean boolean16 = option4.equals((java.lang.Object) option11);
        java.lang.String str17 = option11.getOpt();
        option11.setRequired(true);
        boolean boolean20 = option11.hasOptionalArg();
        option11.addValueForProcessing("[ option: a [ARG...] :: a ]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getOpt();
        java.lang.String str10 = option2.getValue((int) '#');
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean16 = option15.hasLongOpt();
        option15.setRequired(false);
        boolean boolean19 = option15.hasArg();
        boolean boolean20 = option15.acceptsArg();
        boolean boolean21 = option15.hasLongOpt();
        java.lang.String[] strArray22 = option15.getValues();
        boolean boolean23 = option15.requiresArg();
        java.lang.String[] strArray24 = option15.getValues();
        java.lang.String[] strArray25 = option15.getValues();
        option15.setArgs((-2));
        boolean boolean28 = option15.hasArg();
        java.lang.Object obj29 = option15.getType();
        boolean boolean30 = option15.hasArgs();
        org.apache.commons.cli.Option option35 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean36 = option35.hasLongOpt();
        option35.setRequired(false);
        boolean boolean39 = option35.hasArg();
        boolean boolean40 = option35.acceptsArg();
        boolean boolean41 = option35.hasLongOpt();
        java.lang.String[] strArray42 = option35.getValues();
        boolean boolean43 = option35.requiresArg();
        boolean boolean44 = option35.isRequired();
        option35.setOptionalArg(false);
        char char47 = option35.getValueSeparator();
        org.apache.commons.cli.Option option52 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean53 = option52.hasLongOpt();
        boolean boolean54 = option52.isRequired();
        option52.setArgName("hi!");
        java.lang.Class<?> wildcardClass57 = option52.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder58 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass57);
        org.apache.commons.cli.OptionBuilder optionBuilder59 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass57);
        org.apache.commons.cli.OptionBuilder optionBuilder60 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass57);
        org.apache.commons.cli.OptionBuilder optionBuilder61 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass57);
        option35.setType((java.lang.Class) wildcardClass57);
        option15.setType((java.lang.Class) wildcardClass57);
        boolean boolean64 = option2.equals((java.lang.Object) option15);
        option15.setValueSeparator(' ');
        java.lang.String str67 = option15.getKey();
        boolean boolean68 = option15.hasOptionalArg();
        int int69 = option15.getArgs();
        java.lang.Object obj70 = option15.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\000' + "'", char47 == '\000');
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(optionBuilder58);
        org.junit.Assert.assertNotNull(optionBuilder59);
        org.junit.Assert.assertNotNull(optionBuilder60);
        org.junit.Assert.assertNotNull(optionBuilder61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-2) + "'", int69 == (-2));
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "[ option:   [ARG...] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "[ option:   [ARG...] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "[ option:   [ARG...] ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.hasLongOpt();
        option4.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str16 = option4.getValue((-1));
        boolean boolean17 = option4.hasArgName();
        java.lang.Class<?> wildcardClass18 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        option4.addValueForProcessing("a");
        option4.setArgName("a");
        java.lang.String str16 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setDescription("a");
        java.lang.String str14 = option4.getKey();
        option4.clearValues();
        option4.setDescription("[ option:    ::  ]");
        boolean boolean18 = option4.hasArg();
        int int19 = option4.getArgs();
        java.lang.String str21 = option4.getValue("[ option:   [ARG...] ::  ]");
        boolean boolean22 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str21, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        java.lang.String str11 = option4.toString();
        java.lang.String str12 = option4.getOpt();
        boolean boolean13 = option4.hasOptionalArg();
        option4.setOptionalArg(false);
        java.lang.String str16 = option4.getKey();
        java.lang.String[] strArray17 = option4.getValues();
        java.lang.String[] strArray18 = option4.getValues();
        char char19 = option4.getValueSeparator();
        char char20 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.acceptsArg();
        option1.setValueSeparator('a');
        boolean boolean8 = option1.hasArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option: a  :: a ]");
        boolean boolean4 = option3.hasArgName();
        option3.setLongOpt("[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.isRequired();
        option4.setArgs((int) (byte) 1);
        java.lang.String[] strArray12 = option4.getValues();
        int int13 = option4.getArgs();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        option18.setRequired(false);
        java.lang.Class class22 = null;
        option18.setType(class22);
        java.lang.String str24 = option18.getLongOpt();
        boolean boolean25 = option18.requiresArg();
        boolean boolean26 = option18.hasOptionalArg();
        option18.setArgName("hi!");
        boolean boolean29 = option18.requiresArg();
        boolean boolean30 = option18.hasLongOpt();
        boolean boolean31 = option18.hasLongOpt();
        option18.setValueSeparator('\000');
        boolean boolean34 = option4.equals((java.lang.Object) option18);
        option4.addValueForProcessing("[ option:    [ARG] :: [ option: a [ option:   ::  ]  :: a ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean7 = option6.hasLongOpt();
        boolean boolean8 = option6.isRequired();
        option6.setArgName("hi!");
        option6.setArgs((int) (byte) 0);
        boolean boolean13 = option6.hasOptionalArg();
        boolean boolean14 = option6.hasArgs();
        boolean boolean15 = option6.isRequired();
        java.lang.String[] strArray16 = option6.getValues();
        java.lang.Class class17 = null;
        option6.setType(class17);
        boolean boolean19 = option1.equals((java.lang.Object) class17);
        boolean boolean20 = option1.hasArgName();
        java.lang.String str21 = option1.getArgName();
        java.lang.String str22 = option1.getLongOpt();
        option1.setLongOpt("[ option:   :: hi! ]");
        java.lang.String str26 = option1.getValue(97);
        option1.setArgName("[ option:   ::  ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.String str15 = option4.getArgName();
        option4.setRequired(true);
        java.lang.String str18 = option4.getArgName();
        boolean boolean19 = option4.acceptsArg();
        option4.setDescription("[ option:    [ARG] ::  ]");
        boolean boolean22 = option4.hasOptionalArg();
        java.lang.String str23 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        option4.setArgName("");
        option4.setValueSeparator('4');
        option4.setArgs((int) (short) -1);
        int int17 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.requiresArg();
        java.lang.String str12 = option4.toString();
        char char13 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str12, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.hasOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            option4.addValueForProcessing("[ option:   :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Cannot add value, list full.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        java.lang.String[] strArray9 = option4.getValues();
        java.lang.String str10 = option4.getLongOpt();
        java.lang.Object obj11 = option4.clone();
        option4.addValueForProcessing("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        boolean boolean14 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean14 = option11.hasValueSeparator();
        java.lang.String str15 = option11.getValue();
        boolean boolean16 = option4.equals((java.lang.Object) option11);
        java.lang.String str17 = option11.getOpt();
        option11.setRequired(true);
        java.lang.Object obj20 = option11.clone();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getArgName();
        boolean boolean13 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]", false, "[ option: a   :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String[] strArray4 = option1.getValues();
        boolean boolean5 = option1.hasArgs();
        java.lang.Class<?> wildcardClass6 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass6);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        boolean boolean19 = option4.requiresArg();
        boolean boolean20 = option4.hasArg();
        boolean boolean21 = option4.hasOptionalArg();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create('a');
        option23.setRequired(false);
        java.lang.Class<?> wildcardClass26 = option23.getClass();
        option4.setType((java.lang.Class) wildcardClass26);
        boolean boolean28 = option4.hasValueSeparator();
        boolean boolean29 = option4.hasValueSeparator();
        java.util.List list30 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "hi!", true, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        int int5 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        int int4 = option3.getArgs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.getType();
        java.lang.String[] strArray6 = option2.getValues();
        option2.setArgName("");
        int int9 = option2.getId();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str11 = option4.getValue(1);
        option4.addValueForProcessing("hi!");
        java.lang.Object obj14 = option4.clone();
        java.lang.Object obj15 = option4.getType();
        boolean boolean16 = option4.acceptsArg();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        java.lang.String str12 = option4.getLongOpt();
        option4.setArgs(0);
        java.lang.String str15 = option4.getKey();
        option4.setRequired(false);
        boolean boolean18 = option4.hasArg();
        org.apache.commons.cli.Option option23 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean24 = option23.hasLongOpt();
        option23.setRequired(false);
        boolean boolean27 = option23.hasArg();
        boolean boolean28 = option23.acceptsArg();
        boolean boolean29 = option23.hasLongOpt();
        boolean boolean30 = option23.hasLongOpt();
        java.lang.Object obj31 = option23.getType();
        option23.setArgName("[ option:   ::  ]");
        option23.setLongOpt("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        boolean boolean36 = option4.equals((java.lang.Object) "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        int int37 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        int int9 = option1.getId();
        option1.setArgs((int) (byte) -1);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.clone();
        option2.setRequired(true);
        boolean boolean8 = option2.isRequired();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str2 = option1.getKey();
        option1.setArgName("");
        boolean boolean5 = option1.hasValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.requiresArg();
        boolean boolean12 = option4.hasOptionalArg();
        option4.setArgName("hi!");
        boolean boolean15 = option4.requiresArg();
        boolean boolean16 = option4.hasLongOpt();
        boolean boolean17 = option4.hasLongOpt();
        boolean boolean18 = option4.hasArg();
        java.lang.String str19 = option4.getDescription();
        java.lang.String str20 = option4.getDescription();
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        java.lang.String str12 = option4.getKey();
        java.lang.String str14 = option4.getValue("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str15 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str14, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    ::  ]" + "'", str15, "[ option:    ::  ]");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]", "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]", false, "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean4 = option3.hasArg();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        java.lang.Object obj13 = option4.clone();
        option4.setOptionalArg(true);
        option4.setDescription("[ option:   ::  ]");
        boolean boolean18 = option4.acceptsArg();
        java.lang.String str19 = option4.getValue();
        org.apache.commons.cli.OptionBuilder optionBuilder21 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option:  [ option:   ::  ]  [ARG] ::  ]");
        boolean boolean22 = option4.equals((java.lang.Object) optionBuilder21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(optionBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a a  ::  ]", "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", false, "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        boolean boolean15 = option4.equals((java.lang.Object) '#');
        boolean boolean16 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String str19 = option4.toString();
        option4.setLongOpt("a");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setDescription("a");
        option1.setOptionalArg(false);
        java.lang.String str13 = option1.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Class class14 = null;
        option1.setType(class14);
        java.lang.Object obj16 = option1.clone();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:  [ option:   ::  ]  [ARG] ::  ]" + "'", str4, "[ option:  [ option:   ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str13, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[ option: a [ option:  [ option:   ::  ]  [ARG] ::  ] [ARG...] :: a ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[ option: a [ option:  [ option:   ::  ]  [ARG] ::  ] [ARG...] :: a ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[ option: a [ option:  [ option:   ::  ]  [ARG] ::  ] [ARG...] :: a ]");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setLongOpt("[ option: a   :: null ]");
        org.apache.commons.cli.Option option16 = org.apache.commons.cli.OptionBuilder.create('a');
        option16.setRequired(false);
        java.lang.String str19 = option16.getLongOpt();
        int int20 = option16.getArgs();
        java.lang.String str22 = option16.getValue((int) (short) 10);
        boolean boolean23 = option16.hasOptionalArg();
        boolean boolean24 = option16.isRequired();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str30 = option29.getValue();
        option29.setValueSeparator('#');
        java.lang.String str33 = option29.getDescription();
        boolean boolean34 = option16.equals((java.lang.Object) option29);
        boolean boolean35 = option29.hasValueSeparator();
        java.lang.String str36 = option29.getOpt();
        boolean boolean37 = option4.equals((java.lang.Object) str36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.Object obj14 = option4.getType();
        java.lang.Object obj15 = option4.clone();
        java.util.List list16 = option4.getValuesList();
        java.lang.String str17 = option4.getKey();
        boolean boolean18 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[ option:    ::  ]");
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setValueSeparator('\000');
        java.lang.String str14 = option4.getValue();
        java.lang.Object obj15 = option4.clone();
        java.lang.String str17 = option4.getValue("[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]" + "'", str17, "[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        option4.setArgName("a");
        java.lang.String str21 = option4.getValue();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean27 = option26.hasLongOpt();
        boolean boolean28 = option26.isRequired();
        java.lang.String str29 = option26.getOpt();
        java.lang.String str30 = option26.getOpt();
        boolean boolean31 = option26.hasArgName();
        java.lang.String str33 = option26.getValue((int) '#');
        boolean boolean34 = option26.hasOptionalArg();
        java.lang.String str35 = option26.getOpt();
        boolean boolean36 = option26.isRequired();
        java.lang.String str37 = option26.getOpt();
        boolean boolean38 = option4.equals((java.lang.Object) option26);
        boolean boolean39 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "hi!");
        option3.setArgs((int) (short) 0);
        java.lang.String str6 = option3.getLongOpt();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.hasLongOpt();
        option4.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str16 = option4.getValue((-1));
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "hi!");
        option19.setDescription("");
        java.lang.String str22 = option19.getDescription();
        java.lang.String str24 = option19.getValue((int) (byte) 100);
        char char25 = option19.getValueSeparator();
        boolean boolean26 = option19.hasValueSeparator();
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean32 = option31.hasLongOpt();
        boolean boolean33 = option31.isRequired();
        boolean boolean34 = option31.hasArgName();
        boolean boolean35 = option31.hasArgName();
        option31.setArgName("a");
        java.lang.Class<?> wildcardClass38 = option31.getClass();
        option19.setType((java.lang.Class) wildcardClass38);
        option4.setType((java.lang.Class) wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.Class class11 = null;
        option4.setType(class11);
        char char13 = option4.getValueSeparator();
        option4.setDescription("");
        java.lang.String str16 = option4.getDescription();
        boolean boolean17 = option4.hasOptionalArg();
        java.lang.String str18 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getDescription();
        java.lang.String str8 = option1.getOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = option1.addValue("[ option: a [ARG...] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('4');
        option1.setValueSeparator('\000');
        boolean boolean4 = option1.hasValueSeparator();
        boolean boolean5 = option1.hasOptionalArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("a");
        boolean boolean2 = option1.acceptsArg();
        boolean boolean3 = option1.requiresArg();
        option1.setLongOpt("");
        boolean boolean6 = option1.hasOptionalArg();
        java.lang.Object obj7 = option1.clone();
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean11 = option10.requiresArg();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean15 = option10.equals((java.lang.Object) option14);
        boolean boolean17 = option10.equals((java.lang.Object) 0.0f);
        boolean boolean18 = option10.hasArgName();
        java.lang.Class<?> wildcardClass19 = option10.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder20 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass19);
        option1.setType((java.lang.Class) wildcardClass19);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[ option: a   :: null ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[ option: a   :: null ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[ option: a   :: null ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(optionBuilder20);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.Class class11 = null;
        option4.setType(class11);
        boolean boolean13 = option4.hasArg();
        option4.setArgName("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        option4.addValueForProcessing("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str18 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str18, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        boolean boolean12 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.Class class15 = null;
        option4.setType(class15);
        java.lang.String str17 = option4.getLongOpt();
        boolean boolean18 = option4.hasOptionalArg();
        boolean boolean19 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        java.lang.String str11 = option4.toString();
        boolean boolean12 = option4.isRequired();
        java.lang.String str13 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean16 = option15.hasLongOpt();
        option15.setRequired(false);
        boolean boolean19 = option15.requiresArg();
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean25 = option24.hasLongOpt();
        option24.setRequired(false);
        boolean boolean28 = option24.hasArg();
        boolean boolean29 = option24.acceptsArg();
        boolean boolean30 = option24.hasLongOpt();
        java.lang.String[] strArray31 = option24.getValues();
        boolean boolean32 = option24.requiresArg();
        option24.setValueSeparator('4');
        boolean boolean35 = option24.hasArg();
        java.lang.String str36 = option24.getValue();
        java.lang.String str38 = option24.getValue("[ option:    [ARG] ::  ]");
        option24.setArgName("a");
        java.lang.String str41 = option24.getValue();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean47 = option46.hasLongOpt();
        boolean boolean48 = option46.isRequired();
        option46.setArgName("hi!");
        java.lang.Class<?> wildcardClass51 = option46.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder52 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass51);
        org.apache.commons.cli.OptionBuilder optionBuilder53 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass51);
        option24.setType((java.lang.Class) wildcardClass51);
        option15.setType((java.lang.Class) wildcardClass51);
        option4.setType((java.lang.Class) wildcardClass51);
        option4.setDescription("[ option:   :: a ]");
        boolean boolean59 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str38, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(optionBuilder52);
        org.junit.Assert.assertNotNull(optionBuilder53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        java.lang.String str6 = option4.getOpt();
        java.lang.Object obj7 = option4.clone();
        java.lang.String str9 = option4.getValue("hi!");
        boolean boolean10 = option4.hasArg();
        int int11 = option4.getArgs();
        java.lang.String str12 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        boolean boolean11 = option4.hasArg();
        java.lang.Object obj12 = option4.clone();
        java.lang.String str13 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]", "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        option2.setValueSeparator('\000');
        java.lang.String str5 = option2.getOpt();
        java.lang.Class<?> wildcardClass6 = option2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        option4.clearValues();
        java.lang.String str12 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setRequired(true);
        java.lang.Class class14 = null;
        option4.setType(class14);
        boolean boolean16 = option4.hasValueSeparator();
        option4.setOptionalArg(false);
        java.util.List list19 = option4.getValuesList();
        org.apache.commons.cli.Option option21 = org.apache.commons.cli.OptionBuilder.create('4');
        option21.setRequired(false);
        java.lang.String str25 = option21.getValue((int) ' ');
        java.lang.Object obj26 = option21.clone();
        java.lang.Object obj27 = option21.clone();
        java.lang.String str28 = option21.getOpt();
        boolean boolean29 = option4.equals((java.lang.Object) option21);
        java.util.List list30 = option21.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(option21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[ option: 4  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[ option: 4  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[ option: 4  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[ option: 4  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[ option: 4  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[ option: 4  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4" + "'", str28, "4");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        option1.setOptionalArg(false);
        boolean boolean7 = option1.isRequired();
        java.lang.Class class8 = null;
        option1.setType(class8);
        option1.setDescription("[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:  [ option:   ::  ]  [ARG] ::  ]", "[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]", true, "[ option:    [ARG] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option:   ::  ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]", true, "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.requiresArg();
        boolean boolean12 = option4.hasOptionalArg();
        option4.setArgName("hi!");
        boolean boolean15 = option4.requiresArg();
        boolean boolean16 = option4.hasLongOpt();
        boolean boolean17 = option4.hasArg();
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        option4.setArgName("[ option:    [ARG] ::  ]");
        boolean boolean14 = option4.requiresArg();
        java.lang.String[] strArray15 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        java.lang.String str4 = option2.getValue((int) (short) -1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "hi!", true, "[ option: a  [ARG] :: a ]");
        boolean boolean5 = option4.hasArgName();
        java.lang.String str6 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option: a  [ARG] :: a ]" + "'", str6, "[ option: a  [ARG] :: a ]");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.hasArgs();
        option2.setRequired(true);
        option2.clearValues();
        option2.setOptionalArg(false);
        option2.setValueSeparator(' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        java.util.List list15 = option4.getValuesList();
        option4.setOptionalArg(false);
        option4.setOptionalArg(false);
        boolean boolean20 = option4.hasOptionalArg();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean26 = option25.hasLongOpt();
        boolean boolean27 = option25.isRequired();
        option25.setArgName("hi!");
        java.lang.String str31 = option25.getValue((int) (short) -1);
        char char32 = option25.getValueSeparator();
        int int33 = option25.getArgs();
        org.apache.commons.cli.Option option37 = new org.apache.commons.cli.Option("a", false, "");
        option37.clearValues();
        boolean boolean39 = option37.hasValueSeparator();
        boolean boolean40 = option37.hasArg();
        boolean boolean41 = option25.equals((java.lang.Object) option37);
        option25.addValueForProcessing("[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]");
        boolean boolean44 = option4.equals((java.lang.Object) option25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    [ARG] :: [ option:   ::  ] ]", "\000", true, "[ option:    [ARG] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: [ option:   ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        option4.setRequired(false);
        boolean boolean8 = option4.hasLongOpt();
        java.lang.String str10 = option4.getValue(10);
        option4.setLongOpt("[ option:   ::  ]");
        java.lang.String str14 = option4.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str15 = option4.getValue();
        java.lang.String str17 = option4.getValue((int) (byte) 1);
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean23 = option22.hasLongOpt();
        option22.setRequired(false);
        boolean boolean26 = option22.hasArg();
        boolean boolean27 = option22.acceptsArg();
        boolean boolean28 = option22.hasLongOpt();
        java.lang.String[] strArray29 = option22.getValues();
        boolean boolean30 = option22.requiresArg();
        option22.setValueSeparator('4');
        boolean boolean33 = option22.hasArg();
        java.lang.String str34 = option22.getValue();
        java.lang.String str36 = option22.getValue("[ option:    [ARG] ::  ]");
        java.lang.String str38 = option22.getValue((int) (byte) 1);
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean44 = option43.hasLongOpt();
        option43.setRequired(false);
        boolean boolean47 = option22.equals((java.lang.Object) option43);
        org.apache.commons.cli.Option option52 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean53 = option52.hasLongOpt();
        boolean boolean54 = option52.isRequired();
        option52.setArgName("hi!");
        option52.setArgs((int) (byte) 0);
        boolean boolean59 = option52.hasOptionalArg();
        boolean boolean60 = option52.hasArg();
        boolean boolean61 = option52.hasArgs();
        boolean boolean62 = option43.equals((java.lang.Object) boolean61);
        char char63 = option43.getValueSeparator();
        java.lang.String str64 = option43.getArgName();
        boolean boolean65 = option43.hasLongOpt();
        boolean boolean66 = option43.hasArg();
        org.apache.commons.cli.Option option71 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean72 = option71.hasLongOpt();
        boolean boolean73 = option71.isRequired();
        option71.setArgName("hi!");
        boolean boolean76 = option71.requiresArg();
        option71.setLongOpt("");
        boolean boolean79 = option71.hasOptionalArg();
        java.lang.Class<?> wildcardClass80 = option71.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder81 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass80);
        boolean boolean82 = option43.equals((java.lang.Object) wildcardClass80);
        option4.setType((java.lang.Class) wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str14, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str36, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + char63 + "' != '" + '\000' + "'", char63 == '\000');
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(optionBuilder81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String str12 = option4.getValue();
        char char13 = option4.getValueSeparator();
        java.lang.Object obj14 = option4.getType();
        org.apache.commons.cli.Option option16 = org.apache.commons.cli.OptionBuilder.create('a');
        option16.setRequired(false);
        java.lang.String str19 = option16.getLongOpt();
        int int20 = option16.getArgs();
        java.lang.String str22 = option16.getValue((int) (short) 10);
        java.lang.String str23 = option16.getOpt();
        boolean boolean24 = option16.isRequired();
        boolean boolean25 = option16.hasArg();
        option16.setArgs((int) '#');
        boolean boolean28 = option4.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        java.util.List list10 = option4.getValuesList();
        option4.setOptionalArg(false);
        java.lang.String str13 = option4.getOpt();
        option4.setDescription("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        option4.setDescription("[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        option4.setOptionalArg(false);
        java.lang.Object obj12 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        char char8 = option2.getValueSeparator();
        boolean boolean9 = option2.hasValueSeparator();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean15 = option14.hasLongOpt();
        boolean boolean16 = option14.isRequired();
        boolean boolean17 = option14.hasArgName();
        boolean boolean18 = option14.hasArgName();
        option14.setArgName("a");
        java.lang.Class<?> wildcardClass21 = option14.getClass();
        option2.setType((java.lang.Class) wildcardClass21);
        option2.setLongOpt("[ option: a  [ARG] :: a ]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        int int12 = option4.getArgs();
        org.apache.commons.cli.Option option14 = org.apache.commons.cli.OptionBuilder.create('a');
        option14.setRequired(false);
        java.lang.String str17 = option14.getLongOpt();
        int int18 = option14.getArgs();
        java.util.List list19 = option14.getValuesList();
        java.util.List list20 = option14.getValuesList();
        java.util.List list21 = option14.getValuesList();
        boolean boolean22 = option4.equals((java.lang.Object) option14);
        java.lang.String str23 = option14.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(option14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        boolean boolean8 = option4.hasArg();
        char char9 = option4.getValueSeparator();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        option4.clearValues();
        option4.setLongOpt("hi!");
        java.lang.Object obj11 = option4.getType();
        boolean boolean12 = option4.hasArg();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "");
        option3.clearValues();
        boolean boolean5 = option3.hasValueSeparator();
        boolean boolean6 = option3.hasArgs();
        option3.setDescription("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        java.lang.String str10 = option4.getValue((int) (byte) -1);
        boolean boolean11 = option4.hasValueSeparator();
        boolean boolean12 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean14 = option11.hasValueSeparator();
        java.lang.String str15 = option11.getValue();
        boolean boolean16 = option4.equals((java.lang.Object) option11);
        java.lang.String str18 = option11.getValue((int) '\000');
        java.lang.String[] strArray19 = option11.getValues();
        java.lang.Class<?> wildcardClass20 = option11.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        boolean boolean6 = option2.hasLongOpt();
        java.lang.String str7 = option2.getArgName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class11 = null;
        option10.setType(class11);
        option10.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Class<?> wildcardClass15 = option10.getClass();
        option4.setType((java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = option4.getType();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class org.apache.commons.cli.Option");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        option2.clearValues();
        java.lang.String str5 = option2.getValue("[ option: a [ option:   ::  ]  :: a ]");
        option2.setLongOpt("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str8 = option2.getValue();
        boolean boolean9 = option2.hasArgs();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str5, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] :: a ]", "4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", true, "[ option:    [ARG] ::  ]");
        boolean boolean5 = option4.hasOptionalArg();
        option4.setOptionalArg(false);
        boolean boolean8 = option4.hasValueSeparator();
        java.lang.String str9 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  ::  ]", "[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]", false, "[ option:   [ARG...] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getLongOpt();
        option4.setOptionalArg(true);
        boolean boolean11 = option4.hasArgName();
        java.lang.String str12 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String str14 = option4.getDescription();
        boolean boolean15 = option4.requiresArg();
        java.lang.String str16 = option4.getKey();
        boolean boolean17 = option4.requiresArg();
        java.lang.String[] strArray18 = option4.getValues();
        java.lang.String str19 = option4.getLongOpt();
        option4.clearValues();
        java.lang.String[] strArray21 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.String str5 = option3.getValue("[ option:   ::  ]");
        boolean boolean6 = option3.acceptsArg();
        int int7 = option3.getArgs();
        option3.setLongOpt("\000");
        java.lang.String str11 = option3.getValue("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   ::  ]" + "'", str5, "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getValue();
        java.lang.String str5 = option3.getOpt();
        // The following exception was thrown during execution in test generation
        try {
            option3.addValueForProcessing("[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        int int12 = option4.getArgs();
        java.lang.Object obj13 = option4.clone();
        boolean boolean14 = option4.hasArgName();
        option4.setDescription("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        option4.setArgName("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean19 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        java.lang.String str11 = option4.toString();
        boolean boolean12 = option4.isRequired();
        char char13 = option4.getValueSeparator();
        int int14 = option4.getArgs();
        option4.setLongOpt("[ option: a a  ::  ]");
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        option21.setRequired(false);
        boolean boolean25 = option21.hasArg();
        boolean boolean26 = option21.acceptsArg();
        boolean boolean27 = option21.hasLongOpt();
        java.lang.String[] strArray28 = option21.getValues();
        boolean boolean29 = option21.requiresArg();
        option21.setValueSeparator('4');
        boolean boolean32 = option21.hasOptionalArg();
        org.apache.commons.cli.Option option37 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean38 = option37.hasLongOpt();
        java.lang.String str39 = option37.getKey();
        boolean boolean40 = option37.hasArgs();
        java.lang.Class class41 = null;
        option37.setType(class41);
        java.lang.String str44 = option37.getValue(1);
        java.lang.Class<?> wildcardClass45 = option37.getClass();
        option21.setType((java.lang.Class) wildcardClass45);
        option4.setType((java.lang.Class) wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasOptionalArg();
        java.lang.String str17 = option4.getValue(0);
        option4.setArgs((int) (byte) 100);
        boolean boolean20 = option4.hasArgs();
        java.lang.String str22 = option4.getValue("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
        option4.setArgName("[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]" + "'", str22, "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.lang.String str10 = option4.getArgName();
        option4.clearValues();
        java.util.List list12 = option4.getValuesList();
        java.lang.String str13 = option4.getLongOpt();
        java.lang.String str14 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.Class class11 = null;
        option4.setType(class11);
        boolean boolean13 = option4.hasArg();
        option4.setArgName("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean16 = option4.hasLongOpt();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        option21.setRequired(false);
        boolean boolean25 = option21.hasArg();
        boolean boolean26 = option21.acceptsArg();
        boolean boolean27 = option21.hasLongOpt();
        boolean boolean28 = option21.hasLongOpt();
        java.lang.String str30 = option21.getValue((int) 'a');
        char char31 = option21.getValueSeparator();
        option21.setOptionalArg(false);
        int int34 = option21.getArgs();
        java.lang.Class<?> wildcardClass35 = option21.getClass();
        boolean boolean36 = option4.equals((java.lang.Object) wildcardClass35);
        char char37 = option4.getValueSeparator();
        boolean boolean38 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\000' + "'", char37 == '\000');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        char char13 = option4.getValueSeparator();
        boolean boolean14 = option4.hasArgName();
        java.lang.Object obj15 = option4.getType();
        boolean boolean16 = option4.hasArgs();
        java.lang.String str17 = option4.getKey();
        java.lang.String str19 = option4.getValue("[ option: a a  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str19, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        option2.setOptionalArg(true);
        java.lang.String str13 = option2.getValue(10);
        java.lang.String str14 = option2.getKey();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        option4.setLongOpt("a");
        option4.setDescription("[ option: a  [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str11 = option4.getValue((int) '#');
        boolean boolean12 = option4.hasOptionalArg();
        java.lang.String str13 = option4.getOpt();
        option4.clearValues();
        java.lang.Object obj15 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setDescription("a");
        java.util.List list14 = option4.getValuesList();
        java.lang.String str15 = option4.getOpt();
        boolean boolean16 = option4.hasArgs();
        option4.setValueSeparator(' ');
        option4.setRequired(true);
        java.lang.String str21 = option4.getKey();
        java.lang.String str22 = option4.toString();
        option4.clearValues();
        option4.setArgs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ option:    [ARG] :: a ]" + "'", str22, "[ option:    [ARG] :: a ]");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option:  [ option: a [ option:   ::  ]  :: a ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option: a [ option:   ::  ]  :: a ]  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getDescription();
        boolean boolean8 = option1.hasArgName();
        java.lang.Object obj9 = option1.getType();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        boolean boolean10 = option4.hasArg();
        java.lang.String str12 = option4.getValue("");
        option4.setDescription("[ option:   [ARG...] ::  ]");
        java.lang.String str15 = option4.getArgName();
        java.lang.String str16 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str16, "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        java.lang.String str8 = option4.getLongOpt();
        boolean boolean9 = option4.hasArg();
        java.lang.String str10 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        option4.clearValues();
        java.lang.String str12 = option4.getOpt();
        boolean boolean13 = option4.hasValueSeparator();
        java.lang.String str15 = option4.getValue("[ option:    [ARG] ::  ]");
        boolean boolean16 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        java.lang.String str11 = option4.toString();
        java.lang.String str12 = option4.getOpt();
        boolean boolean13 = option4.hasLongOpt();
        java.lang.String str14 = option4.getOpt();
        java.lang.String str15 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("4");
        org.junit.Assert.assertNotNull(option1);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.hasValueSeparator();
        char char3 = option1.getValueSeparator();
        java.lang.String str4 = option1.toString();
        boolean boolean5 = option1.hasValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option: a  :: null ]" + "'", str4, "[ option: a  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        option1.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = option1.addValue("[ option: a  [ARG] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.isRequired();
        option2.clearValues();
        option2.setDescription("");
        java.util.List list13 = option2.getValuesList();
        boolean boolean14 = option2.hasArg();
        option2.setDescription("[ option:  [ARG...] :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.Class class15 = null;
        option4.setType(class15);
        java.lang.Object obj17 = option4.getType();
        java.lang.String str18 = option4.getValue();
        int int19 = option4.getArgs();
        boolean boolean20 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        java.lang.String str19 = option4.getOpt();
        boolean boolean20 = option4.hasArgName();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean26 = option25.hasLongOpt();
        boolean boolean27 = option25.isRequired();
        boolean boolean28 = option25.hasArgName();
        java.lang.String str30 = option25.getValue("");
        option25.setLongOpt("[ option:    [ARG] ::  ]");
        java.lang.String str33 = option25.getArgName();
        org.apache.commons.cli.Option option35 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.Class<?> wildcardClass36 = option35.getClass();
        option25.setType((java.lang.Class) wildcardClass36);
        option4.setType((java.lang.Class) wildcardClass36);
        option4.addValueForProcessing("a");
        option4.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(option35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.toString();
        boolean boolean17 = option4.acceptsArg();
        java.lang.String str18 = option4.getKey();
        java.lang.String str20 = option4.getValue(35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str16, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getKey();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean18 = option17.hasLongOpt();
        option17.setRequired(false);
        boolean boolean21 = option17.hasArg();
        boolean boolean22 = option17.acceptsArg();
        boolean boolean23 = option17.hasLongOpt();
        java.lang.String[] strArray24 = option17.getValues();
        option17.setDescription("a");
        java.lang.String[] strArray27 = option17.getValues();
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class31 = null;
        option30.setType(class31);
        option30.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Class<?> wildcardClass35 = option30.getClass();
        option17.setType((java.lang.Class) wildcardClass35);
        option4.setType((java.lang.Class) wildcardClass35);
        java.lang.String str38 = option4.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = option4.addValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("hi!", "[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]", false, "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getOpt();
        java.lang.String str10 = option2.getValue((int) '#');
        option2.setOptionalArg(false);
        boolean boolean13 = option2.hasArgs();
        boolean boolean14 = option2.requiresArg();
        java.lang.String str15 = option2.getOpt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  ::  ]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String[] strArray4 = option1.getValues();
        java.lang.String str5 = option1.getArgName();
        java.lang.Object obj6 = option1.clone();
        boolean boolean7 = option1.hasLongOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[ option: a  :: null ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[ option: a  :: null ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[ option: a  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        option2.setOptionalArg(true);
        int int12 = option2.getArgs();
        java.util.List list13 = option2.getValuesList();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        boolean boolean4 = option1.acceptsArg();
        java.lang.String str6 = option1.getValue("hi!");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean10 = option9.requiresArg();
        java.lang.Object obj11 = option9.getType();
        boolean boolean12 = option1.equals((java.lang.Object) option9);
        boolean boolean13 = option9.hasArgs();
        java.lang.String str14 = option9.getLongOpt();
        option9.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean16 = option15.hasLongOpt();
        option15.setRequired(false);
        boolean boolean19 = option15.requiresArg();
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean25 = option24.hasLongOpt();
        option24.setRequired(false);
        boolean boolean28 = option24.hasArg();
        boolean boolean29 = option24.acceptsArg();
        boolean boolean30 = option24.hasLongOpt();
        java.lang.String[] strArray31 = option24.getValues();
        boolean boolean32 = option24.requiresArg();
        option24.setValueSeparator('4');
        boolean boolean35 = option24.hasArg();
        java.lang.String str36 = option24.getValue();
        java.lang.String str38 = option24.getValue("[ option:    [ARG] ::  ]");
        option24.setArgName("a");
        java.lang.String str41 = option24.getValue();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean47 = option46.hasLongOpt();
        boolean boolean48 = option46.isRequired();
        option46.setArgName("hi!");
        java.lang.Class<?> wildcardClass51 = option46.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder52 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass51);
        org.apache.commons.cli.OptionBuilder optionBuilder53 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass51);
        option24.setType((java.lang.Class) wildcardClass51);
        option15.setType((java.lang.Class) wildcardClass51);
        option4.setType((java.lang.Class) wildcardClass51);
        boolean boolean57 = option4.requiresArg();
        int int58 = option4.getArgs();
        org.apache.commons.cli.Option option63 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean64 = option63.hasLongOpt();
        option63.setRequired(false);
        java.lang.String str67 = option63.getDescription();
        option63.setValueSeparator('a');
        boolean boolean70 = option63.hasValueSeparator();
        char char71 = option63.getValueSeparator();
        java.lang.String str73 = option63.getValue("hi!");
        boolean boolean74 = option63.hasArg();
        java.lang.String str75 = option63.getKey();
        boolean boolean76 = option4.equals((java.lang.Object) str75);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str38, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(optionBuilder52);
        org.junit.Assert.assertNotNull(optionBuilder53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + char71 + "' != '" + 'a' + "'", char71 == 'a');
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setValueSeparator('\000');
        java.lang.String str14 = option4.getValue();
        option4.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        java.lang.String str7 = option4.getArgName();
        char char8 = option4.getValueSeparator();
        java.lang.String str9 = option4.getDescription();
        java.util.List list10 = option4.getValuesList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = option4.addValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.clearValues();
        java.lang.String str13 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str13, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.requiresArg();
        boolean boolean12 = option4.hasOptionalArg();
        java.lang.String str13 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "a");
        boolean boolean3 = option2.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        boolean boolean9 = option1.isRequired();
        boolean boolean10 = option1.acceptsArg();
        java.lang.Object obj11 = option1.getType();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class org.apache.commons.cli.Option");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        option4.setDescription("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        boolean boolean17 = option4.hasArg();
        char char18 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        java.lang.Object obj13 = option4.clone();
        option4.setOptionalArg(true);
        option4.setDescription("[ option:   ::  ]");
        java.lang.String str19 = option4.getValue("[ option:   ::  ]");
        java.lang.String str20 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:   ::  ]" + "'", str19, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getLongOpt();
        boolean boolean8 = option1.hasLongOpt();
        java.lang.String str9 = option1.getDescription();
        option1.setLongOpt("[ option:    ::  ]");
        option1.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.setRequired(false);
        char char11 = option4.getValueSeparator();
        boolean boolean12 = option4.hasOptionalArg();
        boolean boolean13 = option4.acceptsArg();
        java.lang.Object obj14 = option4.getType();
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "[ option:   ::  ]", false, "[ option:   ::  ]");
        option19.setOptionalArg(false);
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean27 = option26.hasLongOpt();
        option26.setRequired(false);
        boolean boolean30 = option26.hasArg();
        boolean boolean31 = option26.acceptsArg();
        boolean boolean32 = option26.hasLongOpt();
        option26.setOptionalArg(true);
        java.lang.Object obj35 = option26.clone();
        option26.setOptionalArg(true);
        org.apache.commons.cli.Option option42 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean43 = option42.hasLongOpt();
        option42.setRequired(false);
        boolean boolean46 = option42.hasArg();
        boolean boolean47 = option42.acceptsArg();
        boolean boolean48 = option42.hasLongOpt();
        java.lang.String[] strArray49 = option42.getValues();
        option42.setDescription("a");
        java.lang.String[] strArray52 = option42.getValues();
        org.apache.commons.cli.Option option55 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class56 = null;
        option55.setType(class56);
        option55.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Class<?> wildcardClass60 = option55.getClass();
        option42.setType((java.lang.Class) wildcardClass60);
        option26.setType((java.lang.Class) wildcardClass60);
        option19.setType((java.lang.Class) wildcardClass60);
        option4.setType((java.lang.Class) wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        option4.setDescription("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option4.setArgName("[ option: a  :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.clone();
        option4.setRequired(true);
        boolean boolean15 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        option4.clearValues();
        java.lang.String str12 = option4.getValue("[ option: a  :: a ]");
        boolean boolean13 = option4.hasArg();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "hi!");
        option16.setDescription("");
        java.lang.String str19 = option16.getDescription();
        java.lang.String str21 = option16.getValue((int) (byte) 100);
        char char22 = option16.getValueSeparator();
        boolean boolean23 = option16.hasValueSeparator();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean29 = option28.hasLongOpt();
        boolean boolean30 = option28.isRequired();
        boolean boolean31 = option28.hasArgName();
        boolean boolean32 = option28.hasArgName();
        option28.setArgName("a");
        java.lang.Class<?> wildcardClass35 = option28.getClass();
        option16.setType((java.lang.Class) wildcardClass35);
        option4.setType((java.lang.Class) wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option: a  :: a ]" + "'", str12, "[ option: a  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str11 = option4.getValue((int) '#');
        boolean boolean12 = option4.hasOptionalArg();
        option4.addValueForProcessing("");
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean18 = option17.requiresArg();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean22 = option17.equals((java.lang.Object) option21);
        boolean boolean24 = option17.equals((java.lang.Object) 0.0f);
        boolean boolean25 = option17.hasArgName();
        boolean boolean26 = option4.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        option1.setLongOpt("");
        option1.setOptionalArg(false);
        option1.setArgName("4");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getOpt();
        java.lang.String str10 = option2.getValue((int) '#');
        option2.setOptionalArg(false);
        boolean boolean13 = option2.hasArgs();
        int int14 = option2.getArgs();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        java.lang.Object obj4 = option2.getType();
        boolean boolean5 = option2.hasArgs();
        option2.clearValues();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        boolean boolean13 = option4.isRequired();
        option4.setOptionalArg(false);
        char char16 = option4.getValueSeparator();
        java.lang.String str17 = option4.toString();
        boolean boolean18 = option4.hasOptionalArg();
        java.lang.String str19 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str17, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   ::  ]", "[ option:    [ARG] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.requiresArg();
        option4.setRequired(true);
        java.lang.String str12 = option4.getArgName();
        option4.setRequired(true);
        java.lang.String str15 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.setArgName("");
        option4.addValueForProcessing("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str17 = option4.getKey();
        java.lang.Object obj18 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        option4.setValueSeparator('a');
        java.lang.String str16 = option4.getValue();
        boolean boolean17 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.isRequired();
        boolean boolean10 = option2.hasArgName();
        option2.setLongOpt("[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.setArgName("");
        java.lang.String str15 = option4.getOpt();
        java.lang.String str17 = option4.getValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        option4.setValueSeparator('a');
        java.lang.String str20 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str17, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str20, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "[ option: a  :: null ]");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        boolean boolean9 = option4.hasArgName();
        java.lang.Object obj10 = option4.clone();
        java.lang.String str11 = option4.toString();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "hi!");
        option14.setDescription("");
        java.lang.String str17 = option14.getDescription();
        java.lang.String str19 = option14.getValue((int) (byte) 100);
        boolean boolean20 = option14.acceptsArg();
        boolean boolean21 = option14.hasLongOpt();
        boolean boolean22 = option14.acceptsArg();
        boolean boolean23 = option4.equals((java.lang.Object) boolean22);
        java.lang.String str24 = option4.getDescription();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean30 = option29.hasLongOpt();
        boolean boolean31 = option29.isRequired();
        option29.setArgName("hi!");
        boolean boolean34 = option29.hasArg();
        option29.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str37 = option29.getValue();
        boolean boolean38 = option29.hasArgName();
        java.lang.String str39 = option29.toString();
        java.lang.String str41 = option29.getValue((int) '\000');
        int int42 = option29.getArgs();
        org.apache.commons.cli.Option option47 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean48 = option47.hasLongOpt();
        boolean boolean49 = option47.isRequired();
        option47.setArgName("hi!");
        boolean boolean52 = option47.hasArg();
        option47.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str55 = option47.getKey();
        org.apache.commons.cli.Option option60 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean61 = option60.hasLongOpt();
        option60.setRequired(false);
        boolean boolean64 = option60.hasArg();
        boolean boolean65 = option60.acceptsArg();
        boolean boolean66 = option60.hasLongOpt();
        java.lang.String[] strArray67 = option60.getValues();
        option60.setDescription("a");
        java.lang.String[] strArray70 = option60.getValues();
        org.apache.commons.cli.Option option73 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class74 = null;
        option73.setType(class74);
        option73.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Class<?> wildcardClass78 = option73.getClass();
        option60.setType((java.lang.Class) wildcardClass78);
        option47.setType((java.lang.Class) wildcardClass78);
        option29.setType((java.lang.Class) wildcardClass78);
        option29.setArgName("hi!");
        boolean boolean84 = option4.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str37, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str39, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str41, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(strArray67);
        org.junit.Assert.assertNull(strArray70);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str11 = option4.getValue(1);
        option4.addValueForProcessing("hi!");
        java.lang.Object obj14 = option4.clone();
        java.lang.String str15 = option4.getOpt();
        option4.setRequired(false);
        java.lang.String str19 = option4.getValue("[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        option4.setValueSeparator('#');
        boolean boolean14 = option4.acceptsArg();
        org.apache.commons.cli.Option option16 = org.apache.commons.cli.OptionBuilder.create('\000');
        boolean boolean17 = option16.hasValueSeparator();
        boolean boolean18 = option16.hasArgs();
        boolean boolean19 = option4.equals((java.lang.Object) boolean18);
        boolean boolean20 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str11 = option4.getValue((int) '#');
        boolean boolean12 = option4.hasOptionalArg();
        boolean boolean13 = option4.requiresArg();
        option4.setRequired(true);
        option4.setArgName("4");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String str14 = option4.getDescription();
        boolean boolean15 = option4.requiresArg();
        java.lang.String str16 = option4.getKey();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        boolean boolean23 = option21.isRequired();
        option21.setArgName("hi!");
        java.lang.Class<?> wildcardClass26 = option21.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder27 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass26);
        org.apache.commons.cli.OptionBuilder optionBuilder28 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass26);
        option4.setType((java.lang.Class) wildcardClass26);
        java.lang.String str30 = option4.getArgName();
        java.lang.String str32 = option4.getValue((-2));
        char char33 = option4.getValueSeparator();
        int int34 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(optionBuilder27);
        org.junit.Assert.assertNotNull(optionBuilder28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]", "[ option: a   :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        option4.setOptionalArg(false);
        java.lang.String str13 = option4.getLongOpt();
        java.lang.String str14 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        option4.setArgs((-2));
        boolean boolean17 = option4.hasArg();
        java.lang.String str19 = option4.getValue((int) '4');
        option4.setArgName("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.setRequired(false);
        java.lang.String str11 = option4.getValue();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean17 = option16.hasLongOpt();
        boolean boolean18 = option16.isRequired();
        option16.setArgName("hi!");
        java.lang.Class<?> wildcardClass21 = option16.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder22 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass21);
        org.apache.commons.cli.OptionBuilder optionBuilder23 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass21);
        option4.setType((java.lang.Class) wildcardClass21);
        boolean boolean25 = option4.hasLongOpt();
        option4.setDescription("a");
        java.lang.Object obj28 = option4.getType();
        option4.clearValues();
        boolean boolean30 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        java.lang.String str9 = option4.getValue(0);
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        java.lang.String[] strArray12 = option4.getValues();
        java.lang.String str14 = option4.getValue("[ option: a  [ARG] :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = option4.addValue("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "[ option:    [ARG] ::  ]" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   ::  ]", false, "[ option:   ::  ]");
        option4.setOptionalArg(false);
        java.lang.String str7 = option4.getArgName();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        boolean boolean10 = option4.requiresArg();
        boolean boolean11 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        boolean boolean11 = option4.hasArgName();
        option4.setValueSeparator('#');
        java.lang.String str14 = option4.getDescription();
        java.lang.String str15 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   ::  ]", "[ option: a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        java.lang.String str4 = option2.getValue("[ option:    [ARG] ::  ]");
        boolean boolean5 = option2.hasArgs();
        option2.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.Object obj8 = option2.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[ option:  [ option: a [ option:   ::  ]  :: a ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[ option:  [ option: a [ option:   ::  ]  :: a ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[ option:  [ option: a [ option:   ::  ]  :: a ]  :: hi! ]");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        option4.addValueForProcessing("[ option:   :: a ]");
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.hasValueSeparator();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        boolean boolean20 = option18.isRequired();
        java.lang.String str21 = option18.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder22 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean23 = option18.equals((java.lang.Object) optionBuilder22);
        boolean boolean24 = option18.hasArg();
        char char25 = option18.getValueSeparator();
        boolean boolean26 = option4.equals((java.lang.Object) char25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str21, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        java.lang.String str10 = option4.getOpt();
        option4.setDescription("[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.util.List list5 = option2.getValuesList();
        java.lang.Object obj6 = option2.getType();
        option2.setOptionalArg(false);
        java.lang.String str9 = option2.getLongOpt();
        option2.setValueSeparator('a');
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.setArgs((int) (byte) -1);
        java.lang.String str12 = option1.getKey();
        option1.setRequired(false);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  :: class org.apache.commons.cli.Option ]", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option:    [ARG] ::  ]  [ARG] ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        boolean boolean11 = option4.hasValueSeparator();
        char char12 = option4.getValueSeparator();
        boolean boolean13 = option4.hasValueSeparator();
        java.lang.String str15 = option4.getValue((int) (byte) -1);
        java.lang.String[] strArray16 = option4.getValues();
        java.lang.String[] strArray17 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'a' + "'", char12 == 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        option4.setArgName("a");
        boolean boolean21 = option4.hasArgName();
        java.lang.String[] strArray22 = option4.getValues();
        option4.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String str14 = option4.getDescription();
        option4.setValueSeparator('a');
        java.lang.String str17 = option4.getArgName();
        boolean boolean18 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str5 = option4.getOpt();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        option4.setLongOpt("");
        boolean boolean15 = option4.hasArgName();
        option4.setArgs((int) ' ');
        java.lang.String str18 = option4.getKey();
        java.lang.String str19 = option4.getValue();
        boolean boolean20 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String str9 = option4.getLongOpt();
        boolean boolean10 = option4.isRequired();
        option4.setArgName("[ option:    [ARG] :: a ]");
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        char char8 = option4.getValueSeparator();
        boolean boolean9 = option4.hasValueSeparator();
        option4.setArgs((int) (byte) 1);
        java.lang.Object obj12 = option4.clone();
        option4.setValueSeparator('4');
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        boolean boolean11 = option4.hasArgName();
        java.lang.String str12 = option4.getValue();
        java.lang.Object obj13 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String str14 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.clearValues();
        java.lang.String str19 = option4.getValue((-1));
        boolean boolean20 = option4.isRequired();
        option4.setArgName("[ option:    [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str11 = option4.getValue("a");
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean17 = option16.hasLongOpt();
        boolean boolean18 = option16.isRequired();
        boolean boolean19 = option16.hasArgName();
        java.lang.String str20 = option16.getArgName();
        boolean boolean21 = option16.hasArgName();
        java.lang.Object obj22 = option16.getType();
        org.apache.commons.cli.Option option27 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean28 = option27.hasLongOpt();
        boolean boolean29 = option27.isRequired();
        option27.setArgName("hi!");
        boolean boolean32 = option27.requiresArg();
        option27.setLongOpt("");
        boolean boolean35 = option27.hasOptionalArg();
        java.lang.Class<?> wildcardClass36 = option27.getClass();
        option16.setType((java.lang.Class) wildcardClass36);
        option4.setType((java.lang.Class) wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        boolean boolean4 = option2.acceptsArg();
        java.lang.String str5 = option2.getValue();
        option2.setRequired(false);
        boolean boolean8 = option2.acceptsArg();
        boolean boolean9 = option2.isRequired();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        char char15 = option4.getValueSeparator();
        java.lang.String str16 = option4.getLongOpt();
        int int17 = option4.getArgs();
        boolean boolean18 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setArgName("hi!");
        java.lang.String str13 = option4.getKey();
        boolean boolean14 = option4.hasArgName();
        java.util.List list15 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        java.lang.Object obj13 = option4.clone();
        option4.setOptionalArg(true);
        option4.setDescription("[ option:   ::  ]");
        java.lang.String str19 = option4.getValue("[ option:   ::  ]");
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("a", "[ option:   ::  ]", true, "a");
        boolean boolean25 = option24.acceptsArg();
        option24.setRequired(true);
        boolean boolean28 = option4.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:   ::  ]" + "'", str19, "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.hasOptionalArg();
        boolean boolean7 = option4.hasValueSeparator();
        option4.setLongOpt("[ option:    [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getLongOpt();
        java.lang.String str8 = option1.getLongOpt();
        option1.setLongOpt("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        boolean boolean11 = option1.acceptsArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: null ]", true, "[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        boolean boolean9 = option1.isRequired();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str15 = option14.getValue();
        option14.setValueSeparator('#');
        java.lang.String str18 = option14.getDescription();
        boolean boolean19 = option1.equals((java.lang.Object) option14);
        boolean boolean20 = option14.hasValueSeparator();
        java.lang.String str21 = option14.getOpt();
        java.lang.String str23 = option14.getValue((int) '\000');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.util.List list6 = option1.getValuesList();
        java.lang.String str8 = option1.getValue((int) (short) 10);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        java.util.List list15 = option4.getValuesList();
        option4.setOptionalArg(false);
        boolean boolean18 = option4.hasLongOpt();
        char char19 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        java.lang.String str4 = option2.getValue("[ option:    [ARG] ::  ]");
        boolean boolean5 = option2.hasArgs();
        option2.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean13 = option12.hasLongOpt();
        boolean boolean14 = option12.isRequired();
        java.lang.String str15 = option12.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean17 = option12.equals((java.lang.Object) optionBuilder16);
        java.lang.String str18 = option12.getArgName();
        java.lang.String str19 = option12.toString();
        java.lang.String str20 = option12.getOpt();
        boolean boolean21 = option12.hasOptionalArg();
        option12.setOptionalArg(false);
        java.lang.String str24 = option12.getKey();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean30 = option29.hasLongOpt();
        boolean boolean31 = option29.isRequired();
        option29.setArgName("hi!");
        option29.setArgs((int) (byte) 0);
        boolean boolean36 = option29.hasOptionalArg();
        boolean boolean37 = option29.hasArg();
        java.util.List list38 = option29.getValuesList();
        option29.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option45 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean46 = option45.hasLongOpt();
        java.lang.Class class47 = null;
        option45.setType(class47);
        boolean boolean49 = option45.hasValueSeparator();
        java.lang.String str51 = option45.getValue((int) (byte) -1);
        option45.setValueSeparator(' ');
        java.lang.String str54 = option45.getOpt();
        java.lang.Class<?> wildcardClass55 = option45.getClass();
        option29.setType((java.lang.Class) wildcardClass55);
        option12.setType((java.lang.Class) wildcardClass55);
        option2.setType((java.lang.Class) wildcardClass55);
        boolean boolean59 = option2.requiresArg();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setDescription("[ option:   ::  ]");
        option4.setLongOpt("[ option:   ::  ]");
        java.lang.String[] strArray16 = option4.getValues();
        java.lang.String str17 = option4.getKey();
        java.lang.String str19 = option4.getValue("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        java.lang.String str20 = option4.getArgName();
        java.lang.String str21 = option4.getLongOpt();
        java.lang.String str22 = option4.getArgName();
        option4.setArgs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]" + "'", str19, "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ option:   ::  ]" + "'", str21, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        int int8 = option4.getArgs();
        option4.addValueForProcessing("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean11 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.clone();
        java.util.List list6 = option2.getValuesList();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getKey();
        int int5 = option1.getArgs();
        boolean boolean6 = option1.hasOptionalArg();
        option1.setLongOpt("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean9 = option1.hasArg();
        java.lang.String str11 = option1.getValue(0);
        java.lang.Object obj12 = option1.getType();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.hasOptionalArg();
        boolean boolean10 = option2.hasLongOpt();
        boolean boolean11 = option2.isRequired();
        boolean boolean12 = option2.hasArg();
        int int13 = option2.getArgs();
        java.lang.Class<?> wildcardClass14 = option2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getKey();
        java.util.List list8 = option4.getValuesList();
        java.lang.String str9 = option4.getKey();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean15 = option14.hasLongOpt();
        option14.setRequired(false);
        boolean boolean18 = option14.hasArg();
        boolean boolean19 = option14.acceptsArg();
        boolean boolean20 = option14.hasLongOpt();
        java.lang.String[] strArray21 = option14.getValues();
        boolean boolean22 = option14.requiresArg();
        java.lang.String[] strArray23 = option14.getValues();
        java.lang.String[] strArray24 = option14.getValues();
        java.lang.String str25 = option14.getArgName();
        char char26 = option14.getValueSeparator();
        boolean boolean27 = option14.hasArgName();
        boolean boolean28 = option4.equals((java.lang.Object) option14);
        option14.setDescription("[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option: a  :: null ]", false, "[ option: a   :: null ]");
        java.lang.Object obj5 = option4.getType();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.setArgs((int) (byte) -1);
        java.util.List list12 = option1.getValuesList();
        java.lang.String str13 = option1.getValue();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.requiresArg();
        boolean boolean12 = option4.hasOptionalArg();
        option4.setArgName("hi!");
        org.apache.commons.cli.Option option16 = org.apache.commons.cli.OptionBuilder.create('a');
        option16.setRequired(false);
        java.lang.String str19 = option16.getLongOpt();
        int int20 = option16.getArgs();
        java.lang.String str22 = option16.getValue((int) (short) 10);
        boolean boolean23 = option16.hasOptionalArg();
        option16.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        int int26 = option16.getArgs();
        boolean boolean27 = option4.equals((java.lang.Object) option16);
        option4.setArgs((int) (byte) 10);
        option4.setArgName("[ option: a  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        option4.setArgName("[ option:    [ARG] ::  ]");
        boolean boolean14 = option4.requiresArg();
        boolean boolean15 = option4.hasLongOpt();
        boolean boolean16 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option: a  :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setRequired(true);
        java.lang.Class class14 = null;
        option4.setType(class14);
        boolean boolean16 = option4.hasValueSeparator();
        option4.setRequired(true);
        boolean boolean19 = option4.acceptsArg();
        java.lang.String str20 = option4.getKey();
        option4.setValueSeparator('\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('4');
        option1.setOptionalArg(true);
        option1.setLongOpt("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        boolean boolean6 = option1.acceptsArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.getLongOpt();
        java.util.List list11 = option4.getValuesList();
        java.lang.String str12 = option4.toString();
        java.lang.String[] strArray13 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str12, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.isRequired();
        boolean boolean11 = option4.isRequired();
        boolean boolean12 = option4.hasOptionalArg();
        boolean boolean13 = option4.requiresArg();
        java.lang.String str14 = option4.toString();
        java.lang.String str15 = option4.getLongOpt();
        option4.setDescription("[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        boolean boolean12 = option4.hasArgName();
        boolean boolean13 = option4.hasValueSeparator();
        java.lang.Object obj14 = option4.clone();
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:  hi!  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:  hi!  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:  hi!  [ARG] ::  ]");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   ::  ]", true, "a");
        option4.clearValues();
        java.lang.Object obj6 = option4.getType();
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.clearValues();
        option1.setOptionalArg(true);
        java.lang.String str13 = option1.getKey();
        java.lang.String str14 = option1.getArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
// flaky "1) test3776(org.apache.commons.cli.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", false, "");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option4.setType((java.lang.Class) wildcardClass14);
        java.lang.String[] strArray18 = option4.getValues();
        char char19 = option4.getValueSeparator();
        java.lang.String str20 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNotNull(optionBuilder16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", true, "[ option:    [ARG] ::  ]");
        boolean boolean5 = option4.hasOptionalArg();
        java.lang.String str6 = option4.getLongOpt();
        boolean boolean7 = option4.hasOptionalArg();
        boolean boolean8 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str6, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getOpt();
        option4.setDescription("[ option: a a  ::  ]");
        boolean boolean10 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", false, "");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option4.setType((java.lang.Class) wildcardClass14);
        java.lang.String[] strArray18 = option4.getValues();
        boolean boolean19 = option4.isRequired();
        option4.setArgs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNotNull(optionBuilder16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        option4.setRequired(false);
        option4.setArgName("[ option:    [ARG] ::  ]");
        option4.clearValues();
        java.lang.Object obj14 = option4.getType();
        boolean boolean15 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:  [ option:   ::  ]  [ARG] ::  ]", "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option:   ::  ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setRequired(true);
        java.lang.String str14 = option4.getOpt();
        boolean boolean15 = option4.hasLongOpt();
        boolean boolean16 = option4.hasArgName();
        boolean boolean17 = option4.hasOptionalArg();
        java.util.List list18 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        java.lang.String str12 = option4.getLongOpt();
        java.lang.String str13 = option4.getOpt();
        option4.addValueForProcessing("[ option:   :: a ]");
        boolean boolean16 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", "", false, "[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   :: hi! ]", false, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("4", "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.toString();
        java.lang.String str10 = option4.getValue("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean11 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str8, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str10, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        boolean boolean6 = option2.hasLongOpt();
        boolean boolean7 = option2.isRequired();
        boolean boolean8 = option2.requiresArg();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('a');
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean16 = option15.hasLongOpt();
        boolean boolean17 = option15.isRequired();
        option15.setArgName("hi!");
        option15.setArgs((int) (byte) 0);
        boolean boolean22 = option15.hasOptionalArg();
        boolean boolean23 = option15.hasArgs();
        boolean boolean24 = option15.isRequired();
        java.lang.String[] strArray25 = option15.getValues();
        java.lang.Class class26 = null;
        option15.setType(class26);
        boolean boolean28 = option10.equals((java.lang.Object) class26);
        boolean boolean29 = option10.hasArgName();
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean35 = option34.hasLongOpt();
        option34.setRequired(false);
        boolean boolean38 = option34.hasArg();
        boolean boolean39 = option34.acceptsArg();
        boolean boolean40 = option34.isRequired();
        java.lang.Class<?> wildcardClass41 = option34.getClass();
        option10.setType((java.lang.Class) wildcardClass41);
        option2.setType((java.lang.Class) wildcardClass41);
        org.apache.commons.cli.OptionBuilder optionBuilder44 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass41);
        org.apache.commons.cli.OptionBuilder optionBuilder45 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass41);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(optionBuilder44);
        org.junit.Assert.assertNotNull(optionBuilder45);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        int int12 = option4.getArgs();
        java.lang.Object obj13 = option4.clone();
        option4.setOptionalArg(false);
        java.lang.String str16 = option4.getArgName();
        option4.clearValues();
        option4.setOptionalArg(false);
        java.lang.String str20 = option4.getOpt();
        boolean boolean21 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    ::  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        option4.setLongOpt("");
        java.lang.String[] strArray15 = option4.getValues();
        option4.setOptionalArg(false);
        java.lang.String str18 = option4.toString();
        java.lang.Object obj19 = option4.clone();
        java.lang.Object obj20 = null;
        boolean boolean21 = option4.equals(obj20);
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean27 = option26.hasLongOpt();
        option26.setRequired(false);
        java.lang.String str30 = option26.getDescription();
        option26.setValueSeparator('a');
        option26.setValueSeparator(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder36 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        boolean boolean37 = option26.equals((java.lang.Object) '#');
        boolean boolean38 = option26.isRequired();
        option26.setRequired(true);
        boolean boolean41 = option26.hasValueSeparator();
        boolean boolean42 = option26.hasValueSeparator();
        boolean boolean43 = option4.equals((java.lang.Object) option26);
        boolean boolean44 = option26.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(optionBuilder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getArgName();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean12 = option11.hasLongOpt();
        option11.setRequired(false);
        boolean boolean15 = option11.hasArg();
        boolean boolean16 = option11.acceptsArg();
        boolean boolean17 = option11.hasLongOpt();
        java.lang.String[] strArray18 = option11.getValues();
        boolean boolean19 = option11.requiresArg();
        option11.setValueSeparator('4');
        java.lang.String str23 = option11.getValue((int) (short) 100);
        java.lang.String str24 = option11.getOpt();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean30 = option29.hasLongOpt();
        option29.setRequired(false);
        boolean boolean33 = option29.hasArg();
        boolean boolean34 = option29.acceptsArg();
        boolean boolean35 = option29.hasLongOpt();
        option29.setOptionalArg(true);
        java.lang.Class<?> wildcardClass38 = option29.getClass();
        option11.setType((java.lang.Class) wildcardClass38);
        option4.setType((java.lang.Class) wildcardClass38);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.String str5 = option3.getValue("[ option:   ::  ]");
        option3.setLongOpt("[ option:   :: a ]");
        java.lang.String str8 = option3.getKey();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   ::  ]" + "'", str5, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.String str15 = option4.getArgName();
        option4.setRequired(true);
        java.util.List list18 = option4.getValuesList();
        java.util.List list19 = option4.getValuesList();
        boolean boolean20 = option4.hasLongOpt();
        java.lang.Object obj21 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.requiresArg();
        boolean boolean12 = option4.hasOptionalArg();
        java.lang.String str13 = option4.getOpt();
        option4.setValueSeparator('4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        option2.setOptionalArg(true);
        java.lang.String str12 = option2.getValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        char char5 = option2.getValueSeparator();
        java.lang.String[] strArray6 = option2.getValues();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean12 = option11.hasLongOpt();
        option11.setRequired(false);
        boolean boolean15 = option11.hasArg();
        boolean boolean16 = option11.acceptsArg();
        boolean boolean17 = option11.hasLongOpt();
        java.lang.String[] strArray18 = option11.getValues();
        boolean boolean19 = option11.requiresArg();
        java.lang.String[] strArray20 = option11.getValues();
        java.lang.String[] strArray21 = option11.getValues();
        java.lang.String str22 = option11.getArgName();
        option11.setRequired(true);
        java.lang.String str25 = option11.getArgName();
        java.lang.Class<?> wildcardClass26 = option11.getClass();
        option2.setType((java.lang.Class) wildcardClass26);
        option2.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        java.lang.String str8 = option4.getLongOpt();
        java.lang.String str10 = option4.getValue("");
        java.lang.Class<?> wildcardClass11 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setRequired(true);
        java.lang.Class class14 = null;
        option4.setType(class14);
        boolean boolean16 = option4.hasValueSeparator();
        option4.setRequired(true);
        boolean boolean19 = option4.acceptsArg();
        java.lang.String[] strArray20 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        boolean boolean10 = option4.hasArg();
        java.lang.String str12 = option4.getValue("");
        option4.setDescription("[ option:   [ARG...] ::  ]");
        java.lang.String str15 = option4.getArgName();
        java.lang.String str16 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        char char15 = option4.getValueSeparator();
        option4.clearValues();
        option4.setDescription("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", false, "");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option4.setType((java.lang.Class) wildcardClass14);
        java.lang.String[] strArray18 = option4.getValues();
        option4.setOptionalArg(false);
        java.lang.String str21 = option4.getArgName();
        java.util.List list22 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNotNull(optionBuilder16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        java.util.List list10 = option4.getValuesList();
        option4.setOptionalArg(false);
        java.lang.String str13 = option4.getOpt();
        option4.setDescription("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        java.lang.String str17 = option4.getValue("[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]" + "'", str17, "[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        option2.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str7 = option2.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = option2.addValue("[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        boolean boolean11 = option4.hasValueSeparator();
        char char12 = option4.getValueSeparator();
        java.lang.String str14 = option4.getValue("hi!");
        java.lang.Object obj15 = option4.clone();
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'a' + "'", char12 == 'a');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] :: [ option:  [ARG...] :: hi! ] ]", "[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: [ option:  [ARG...] :: hi! ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        java.lang.String str13 = option4.getValue(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.Class class15 = null;
        option4.setType(class15);
        java.lang.String str17 = option4.getLongOpt();
        java.lang.String str18 = option4.getOpt();
        org.apache.commons.cli.Option option23 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean24 = option23.hasLongOpt();
        boolean boolean25 = option23.isRequired();
        option23.setArgName("hi!");
        option23.setArgs((int) (byte) 0);
        boolean boolean30 = option23.hasOptionalArg();
        boolean boolean31 = option23.hasArgs();
        boolean boolean32 = option23.isRequired();
        java.lang.Object obj33 = option23.getType();
        boolean boolean34 = option23.hasArgs();
        boolean boolean35 = option23.acceptsArg();
        org.apache.commons.cli.Option option40 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        java.lang.Class<?> wildcardClass41 = option40.getClass();
        option23.setType((java.lang.Class) wildcardClass41);
        option4.setType((java.lang.Class) wildcardClass41);
        org.apache.commons.cli.OptionBuilder optionBuilder44 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(optionBuilder44);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        java.lang.String str6 = option4.getValue();
        int int7 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.util.List list6 = option1.getValuesList();
        java.util.List list7 = option1.getValuesList();
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str13 = option12.getValue();
        java.lang.String str14 = option12.getOpt();
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        option19.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean22 = option19.hasValueSeparator();
        java.lang.String str23 = option19.getValue();
        boolean boolean24 = option12.equals((java.lang.Object) option19);
        java.lang.String str25 = option19.getOpt();
        option19.setRequired(true);
        boolean boolean28 = option19.hasOptionalArg();
        boolean boolean29 = option1.equals((java.lang.Object) boolean28);
        java.lang.String str30 = option1.getKey();
        java.lang.String str31 = option1.getArgName();
        char char32 = option1.getValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "a" + "'", str30, "a");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getOpt();
        java.lang.String str6 = option2.toString();
        java.lang.String str8 = option2.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str9 = option2.getValue();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean15 = option14.hasLongOpt();
        boolean boolean16 = option14.isRequired();
        java.lang.String str17 = option14.toString();
        option14.setRequired(true);
        java.lang.String str20 = option14.getArgName();
        option14.clearValues();
        boolean boolean22 = option14.acceptsArg();
        option14.setOptionalArg(true);
        boolean boolean25 = option2.equals((java.lang.Object) true);
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean31 = option30.hasLongOpt();
        java.lang.String str32 = option30.getKey();
        boolean boolean33 = option30.hasArgs();
        java.lang.Class class34 = null;
        option30.setType(class34);
        boolean boolean36 = option30.hasArgName();
        option30.clearValues();
        boolean boolean38 = option2.equals((java.lang.Object) option30);
        boolean boolean39 = option30.hasValueSeparator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   ::  ]" + "'", str6, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str8, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str17, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        java.util.List list15 = option4.getValuesList();
        option4.setOptionalArg(false);
        java.lang.String str18 = option4.getValue();
        option4.setLongOpt("");
        org.apache.commons.cli.Option option22 = org.apache.commons.cli.OptionBuilder.create('a');
        option22.setRequired(false);
        java.lang.String[] strArray25 = option22.getValues();
        boolean boolean26 = option22.hasArgs();
        java.lang.Class<?> wildcardClass27 = option22.getClass();
        option4.setType((java.lang.Class) wildcardClass27);
        java.lang.String str29 = option4.toString();
        boolean boolean30 = option4.hasArgName();
        int int31 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(option22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ option:    ::  :: class org.apache.commons.cli.Option ]" + "'", str29, "[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("hi!", "[ option:    [ARG] :: [ option: a [ option:   ::  ]  :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.util.List list5 = option2.getValuesList();
        java.lang.Object obj6 = option2.getType();
        boolean boolean7 = option2.requiresArg();
        boolean boolean8 = option2.hasArgName();
        option2.setArgName("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        java.lang.String str6 = option4.getValue();
        boolean boolean7 = option4.acceptsArg();
        java.lang.String str8 = option4.getKey();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        boolean boolean14 = option4.isRequired();
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean20 = option19.hasLongOpt();
        boolean boolean21 = option19.isRequired();
        option19.setArgName("hi!");
        option19.setArgs((int) (byte) 0);
        java.lang.String str26 = option19.getOpt();
        boolean boolean27 = option19.hasLongOpt();
        boolean boolean28 = option19.hasArgName();
        java.lang.String str29 = option19.toString();
        boolean boolean30 = option4.equals((java.lang.Object) str29);
        java.lang.String str31 = option4.getValue();
        java.lang.String str33 = option4.getValue("a");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ option:    ::  ]" + "'", str29, "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "a" + "'", str33, "a");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.hasLongOpt();
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        java.lang.String str12 = option4.getLongOpt();
        java.lang.String str13 = option4.getOpt();
        option4.addValueForProcessing("[ option:   :: a ]");
        java.lang.Object obj16 = option4.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[ option:  hi!  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[ option:  hi!  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[ option:  hi!  [ARG] ::  ]");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        java.lang.String str12 = option4.getDescription();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean18 = option17.hasLongOpt();
        boolean boolean19 = option17.isRequired();
        option17.setOptionalArg(false);
        java.lang.String[] strArray22 = option17.getValues();
        boolean boolean23 = option17.hasArg();
        java.lang.String str25 = option17.getValue("a");
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean31 = option30.hasLongOpt();
        option30.setRequired(false);
        boolean boolean34 = option30.requiresArg();
        org.apache.commons.cli.Option option39 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean40 = option39.hasLongOpt();
        option39.setRequired(false);
        boolean boolean43 = option39.hasArg();
        boolean boolean44 = option39.acceptsArg();
        boolean boolean45 = option39.hasLongOpt();
        java.lang.String[] strArray46 = option39.getValues();
        boolean boolean47 = option39.requiresArg();
        option39.setValueSeparator('4');
        boolean boolean50 = option39.hasArg();
        java.lang.String str51 = option39.getValue();
        java.lang.String str53 = option39.getValue("[ option:    [ARG] ::  ]");
        option39.setArgName("a");
        java.lang.String str56 = option39.getValue();
        org.apache.commons.cli.Option option61 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean62 = option61.hasLongOpt();
        boolean boolean63 = option61.isRequired();
        option61.setArgName("hi!");
        java.lang.Class<?> wildcardClass66 = option61.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder67 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass66);
        org.apache.commons.cli.OptionBuilder optionBuilder68 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass66);
        option39.setType((java.lang.Class) wildcardClass66);
        option30.setType((java.lang.Class) wildcardClass66);
        option17.setType((java.lang.Class) wildcardClass66);
        boolean boolean72 = option4.equals((java.lang.Object) option17);
        boolean boolean73 = option17.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "a" + "'", str25, "a");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str53, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(optionBuilder67);
        org.junit.Assert.assertNotNull(optionBuilder68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        option4.setDescription("");
        boolean boolean21 = option4.isRequired();
        option4.setArgName("[ option: a a  ::  ]");
        java.lang.String str24 = option4.getKey();
        java.lang.String str25 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        option4.setDescription("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        boolean boolean17 = option4.acceptsArg();
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean23 = option22.hasLongOpt();
        boolean boolean24 = option22.isRequired();
        option22.setArgName("hi!");
        option22.setArgs((int) (byte) 0);
        boolean boolean29 = option22.hasOptionalArg();
        boolean boolean30 = option22.hasArgs();
        boolean boolean31 = option22.isRequired();
        java.lang.Object obj32 = option22.getType();
        boolean boolean33 = option22.hasArgs();
        boolean boolean34 = option22.acceptsArg();
        org.apache.commons.cli.Option option39 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        java.lang.Class<?> wildcardClass40 = option39.getClass();
        option22.setType((java.lang.Class) wildcardClass40);
        org.apache.commons.cli.OptionBuilder optionBuilder42 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass40);
        option4.setType((java.lang.Class) wildcardClass40);
        java.lang.String[] strArray44 = option4.getValues();
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(optionBuilder42);
        org.junit.Assert.assertNull(strArray44);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", true, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: null :: class org.apache.commons.cli.Option ]", true, "[ option:   [ARG...] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getOpt();
        java.lang.String str6 = option2.toString();
        java.lang.String str8 = option2.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str9 = option2.getValue();
        char char10 = option2.getValueSeparator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   ::  ]" + "'", str6, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str8, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        boolean boolean13 = option4.hasArgs();
        boolean boolean14 = option4.hasOptionalArg();
        boolean boolean15 = option4.hasArg();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        java.lang.String str22 = option20.getKey();
        boolean boolean23 = option20.hasArgs();
        option20.clearValues();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean30 = option29.hasLongOpt();
        option29.setRequired(false);
        boolean boolean33 = option29.hasArg();
        boolean boolean34 = option29.acceptsArg();
        boolean boolean35 = option29.hasLongOpt();
        java.lang.String[] strArray36 = option29.getValues();
        boolean boolean37 = option29.requiresArg();
        option29.setValueSeparator('4');
        java.lang.String str40 = option29.getArgName();
        org.apache.commons.cli.Option option45 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean46 = option45.hasLongOpt();
        boolean boolean47 = option45.isRequired();
        option45.setArgName("hi!");
        java.lang.Class<?> wildcardClass50 = option45.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder51 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass50);
        option29.setType((java.lang.Class) wildcardClass50);
        option20.setType((java.lang.Class) wildcardClass50);
        option4.setType((java.lang.Class) wildcardClass50);
        java.lang.String str55 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(optionBuilder51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.clearValues();
        option4.setValueSeparator('#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.String str15 = option4.getArgName();
        option4.setRequired(true);
        java.lang.String str18 = option4.getArgName();
        boolean boolean19 = option4.acceptsArg();
        option4.setDescription("[ option:    [ARG] ::  ]");
        boolean boolean22 = option4.hasOptionalArg();
        option4.addValueForProcessing("[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean3 = option2.hasArgs();
        java.lang.String str5 = option2.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option2.setLongOpt("[ option:   :: a ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str5, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]");
        boolean boolean3 = option2.isRequired();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean9 = option8.hasLongOpt();
        option8.setRequired(false);
        boolean boolean12 = option8.hasArg();
        boolean boolean13 = option8.acceptsArg();
        boolean boolean14 = option8.hasLongOpt();
        java.lang.String[] strArray15 = option8.getValues();
        boolean boolean16 = option8.requiresArg();
        option8.setValueSeparator('4');
        java.lang.String str19 = option8.getArgName();
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean25 = option24.hasLongOpt();
        boolean boolean26 = option24.isRequired();
        option24.setArgName("hi!");
        java.lang.Class<?> wildcardClass29 = option24.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder30 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass29);
        option8.setType((java.lang.Class) wildcardClass29);
        java.lang.String str33 = option8.getValue((int) (short) 100);
        java.lang.Object obj34 = option8.clone();
        option8.setOptionalArg(false);
        boolean boolean37 = option2.equals((java.lang.Object) false);
        option2.setArgName("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        java.lang.Object obj40 = option2.getType();
        boolean boolean41 = option2.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(optionBuilder30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        int int9 = option1.getId();
        option1.setDescription("[ option: a  :: hi! ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", true, "[ option:    [ARG] ::  ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = option4.addValue("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "hi!");
        option3.setOptionalArg(false);
        boolean boolean6 = option3.requiresArg();
        java.lang.String str8 = option3.getValue((-1));
        int int9 = option3.getArgs();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        boolean boolean3 = option2.hasArgs();
        option2.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean6 = option2.hasLongOpt();
        boolean boolean7 = option2.hasValueSeparator();
        java.lang.String str8 = option2.getOpt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "a");
        java.lang.String str5 = option3.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        int int6 = option3.getArgs();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str5, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.setArgs((int) (byte) -1);
        java.util.List list12 = option1.getValuesList();
        java.lang.String str13 = option1.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.String str15 = option4.getArgName();
        option4.setRequired(true);
        boolean boolean18 = option4.acceptsArg();
        java.lang.Object obj19 = option4.getType();
        int int20 = option4.getArgs();
        java.lang.String str22 = option4.getValue("[ option: a  ::  ]");
        boolean boolean23 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ option: a  ::  ]" + "'", str22, "[ option: a  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        java.lang.String str8 = option4.getLongOpt();
        java.util.List list9 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        boolean boolean5 = option4.hasValueSeparator();
        java.lang.Object obj6 = option4.getType();
        java.lang.String str7 = option4.getOpt();
        boolean boolean8 = option4.hasValueSeparator();
        boolean boolean9 = option4.hasArgs();
        java.lang.Class<?> wildcardClass10 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "\000");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        boolean boolean15 = option4.equals((java.lang.Object) '#');
        boolean boolean16 = option4.hasArgName();
        option4.setArgs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean7 = option6.hasLongOpt();
        boolean boolean8 = option6.isRequired();
        option6.setArgName("hi!");
        option6.setArgs((int) (byte) 0);
        boolean boolean13 = option6.hasOptionalArg();
        boolean boolean14 = option6.hasArgs();
        boolean boolean15 = option6.isRequired();
        java.lang.String[] strArray16 = option6.getValues();
        java.lang.Class class17 = null;
        option6.setType(class17);
        boolean boolean19 = option1.equals((java.lang.Object) class17);
        boolean boolean20 = option1.hasArgName();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean26 = option25.hasLongOpt();
        option25.setRequired(false);
        boolean boolean29 = option25.hasArg();
        boolean boolean30 = option25.acceptsArg();
        boolean boolean31 = option25.isRequired();
        java.lang.Class<?> wildcardClass32 = option25.getClass();
        option1.setType((java.lang.Class) wildcardClass32);
        char char34 = option1.getValueSeparator();
        java.lang.String str35 = option1.getLongOpt();
        option1.setValueSeparator('\000');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\000' + "'", char34 == '\000');
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        java.lang.String str11 = option4.toString();
        java.lang.String str12 = option4.getOpt();
        boolean boolean13 = option4.hasOptionalArg();
        option4.setOptionalArg(false);
        option4.setValueSeparator('4');
        java.lang.String[] strArray18 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option3.setDescription("a");
        option3.clearValues();
        java.lang.String str7 = option3.toString();
        java.lang.Object obj8 = option3.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:   :: a ]" + "'", str7, "[ option:   :: a ]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        boolean boolean13 = option4.hasArg();
        int int14 = option4.getArgs();
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        option4.setRequired(false);
        option4.setArgName("[ option:    [ARG] ::  ]");
        option4.clearValues();
        boolean boolean14 = option4.hasLongOpt();
        java.lang.String[] strArray15 = option4.getValues();
        option4.setRequired(false);
        boolean boolean18 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.setArgName("");
        java.lang.String str15 = option4.getOpt();
        java.lang.Object obj16 = option4.getType();
        java.lang.Object obj17 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]", false, "[ option:    ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        boolean boolean19 = option4.requiresArg();
        boolean boolean20 = option4.hasArg();
        boolean boolean21 = option4.hasOptionalArg();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create('a');
        option23.setRequired(false);
        java.lang.Class<?> wildcardClass26 = option23.getClass();
        option4.setType((java.lang.Class) wildcardClass26);
        boolean boolean28 = option4.hasValueSeparator();
        java.lang.Object obj29 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "class org.apache.commons.cli.Option");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.requiresArg();
        java.lang.String str12 = option4.toString();
        boolean boolean13 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str12, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.hasOptionalArg();
        boolean boolean10 = option2.hasLongOpt();
        boolean boolean11 = option2.isRequired();
        java.lang.String str12 = option2.getValue();
        boolean boolean13 = option2.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        option1.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        int int11 = option1.getArgs();
        java.lang.Object obj12 = option1.getType();
        option1.clearValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option2.setType((java.lang.Class) wildcardClass14);
        java.lang.String str17 = option2.getValue();
        boolean boolean18 = option2.requiresArg();
        java.lang.String str19 = option2.getArgName();
        option2.clearValues();
        boolean boolean21 = option2.hasArgs();
        java.lang.String str22 = option2.getOpt();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]", "[ option:  [ option:   ::  ]  [ARG] ::  ]", true, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        option1.setValueSeparator('a');
        boolean boolean6 = option1.requiresArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        option4.clearValues();
        option4.setLongOpt("hi!");
        java.lang.String[] strArray11 = option4.getValues();
        option4.clearValues();
        boolean boolean13 = option4.hasOptionalArg();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.hasArgs();
        boolean boolean10 = option2.hasOptionalArg();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", "hi!");
        option13.setDescription("");
        java.lang.String str16 = option13.getDescription();
        java.lang.String str18 = option13.getValue((int) (byte) 100);
        char char19 = option13.getValueSeparator();
        boolean boolean20 = option13.hasValueSeparator();
        org.apache.commons.cli.OptionBuilder optionBuilder22 = org.apache.commons.cli.OptionBuilder.hasArgs(1);
        boolean boolean23 = option13.equals((java.lang.Object) 1);
        boolean boolean24 = option13.hasLongOpt();
        boolean boolean25 = option2.equals((java.lang.Object) option13);
        java.lang.String str26 = option13.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ option:   ::  ]" + "'", str26, "[ option:   ::  ]");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        option2.setValueSeparator('\000');
        option2.setLongOpt("[ option:   ::  ]");
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean12 = option11.hasLongOpt();
        boolean boolean13 = option11.isRequired();
        boolean boolean14 = option11.hasArgName();
        java.lang.String str15 = option11.getArgName();
        java.lang.Object obj16 = option11.clone();
        java.lang.String str17 = option11.toString();
        option11.setRequired(true);
        option11.clearValues();
        boolean boolean21 = option2.equals((java.lang.Object) option11);
        char char22 = option2.getValueSeparator();
        boolean boolean23 = option2.isRequired();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str17, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        boolean boolean4 = option1.acceptsArg();
        java.lang.String str6 = option1.getValue("hi!");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean10 = option9.requiresArg();
        java.lang.Object obj11 = option9.getType();
        boolean boolean12 = option1.equals((java.lang.Object) option9);
        boolean boolean13 = option9.hasArgs();
        boolean boolean14 = option9.hasArgs();
        boolean boolean15 = option9.hasArgName();
        boolean boolean16 = option9.acceptsArg();
        boolean boolean17 = option9.acceptsArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:  [ option: a [ option:   ::  ]  :: a ]  ::  ]", "[ option: a [ option:   ::  ]  :: a ]", false, "[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option: a [ option:   ::  ]  :: a ]  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        boolean boolean5 = option4.hasLongOpt();
        char char6 = option4.getValueSeparator();
        java.lang.String str8 = option4.getValue("[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:    ::  ]" + "'", str8, "[ option:    ::  ]");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        option4.clearValues();
        option4.setLongOpt("hi!");
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.hasArgName();
        option4.setValueSeparator(' ');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean12 = option11.hasLongOpt();
        java.lang.String str13 = option11.getKey();
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        option11.setRequired(false);
        java.lang.String str18 = option11.getValue();
        org.apache.commons.cli.Option option23 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean24 = option23.hasLongOpt();
        boolean boolean25 = option23.isRequired();
        option23.setArgName("hi!");
        java.lang.Class<?> wildcardClass28 = option23.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder29 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass28);
        org.apache.commons.cli.OptionBuilder optionBuilder30 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass28);
        option11.setType((java.lang.Class) wildcardClass28);
        boolean boolean32 = option11.hasLongOpt();
        option11.setDescription("a");
        boolean boolean35 = option4.equals((java.lang.Object) option11);
        option11.setRequired(true);
        option11.setArgs((int) (short) 1);
        boolean boolean40 = option11.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(optionBuilder29);
        org.junit.Assert.assertNotNull(optionBuilder30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.clearValues();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        option4.setValueSeparator('a');
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        option18.setRequired(false);
        boolean boolean22 = option18.requiresArg();
        boolean boolean23 = option4.equals((java.lang.Object) option18);
        boolean boolean24 = option18.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        option4.setLongOpt("");
        option4.setArgName("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option4.setLongOpt("");
        int int16 = option4.getArgs();
        option4.setOptionalArg(false);
        option4.setLongOpt("[ option:    [ARG] :: [ option:  [ARG...] :: hi! ] ]");
        boolean boolean21 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.Class class15 = null;
        option4.setType(class15);
        java.lang.String str17 = option4.getLongOpt();
        java.lang.String str18 = option4.toString();
        boolean boolean19 = option4.hasOptionalArg();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    ::  ]" + "'", str18, "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        boolean boolean10 = option4.hasArgs();
        boolean boolean11 = option4.hasValueSeparator();
        boolean boolean12 = option4.hasArgName();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean18 = option17.hasLongOpt();
        boolean boolean19 = option17.isRequired();
        java.lang.String str20 = option17.getOpt();
        java.lang.String str21 = option17.getKey();
        java.lang.String str22 = option17.getLongOpt();
        boolean boolean23 = option17.hasValueSeparator();
        boolean boolean24 = option4.equals((java.lang.Object) option17);
        option4.setLongOpt("[ option:    [ARG] :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        boolean boolean5 = option4.hasLongOpt();
        char char6 = option4.getValueSeparator();
        java.lang.String str8 = option4.getValue("[ option: a [ option:   ::  ]  :: a ]");
        java.util.List list9 = option4.getValuesList();
        // The following exception was thrown during execution in test generation
        try {
            option4.addValueForProcessing("[ option:   ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str8, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        java.util.List list10 = option4.getValuesList();
        option4.setOptionalArg(false);
        java.lang.String str13 = option4.getArgName();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        option18.setRequired(false);
        boolean boolean22 = option18.hasArg();
        boolean boolean23 = option18.acceptsArg();
        boolean boolean24 = option18.hasLongOpt();
        boolean boolean25 = option18.hasLongOpt();
        option18.setArgName("[ option:    [ARG] ::  ]");
        option18.addValueForProcessing("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        option18.setValueSeparator('\000');
        java.lang.Object obj32 = option18.clone();
        boolean boolean33 = option4.equals((java.lang.Object) option18);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str11 = option4.getValue((int) '#');
        boolean boolean12 = option4.hasOptionalArg();
        option4.setOptionalArg(true);
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean20 = option19.hasLongOpt();
        java.lang.String str21 = option19.getKey();
        boolean boolean22 = option19.hasArgs();
        java.lang.Class class23 = null;
        option19.setType(class23);
        java.lang.String str25 = option19.getValue();
        option19.addValueForProcessing("[ option:   ::  ]");
        java.lang.String str28 = option19.toString();
        org.apache.commons.cli.Option option33 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean34 = option33.hasLongOpt();
        boolean boolean35 = option33.isRequired();
        option33.setArgName("hi!");
        option33.setArgs((int) (byte) 0);
        boolean boolean40 = option33.hasOptionalArg();
        boolean boolean41 = option33.hasArgs();
        boolean boolean42 = option33.isRequired();
        java.lang.String str43 = option33.getDescription();
        option33.setRequired(true);
        java.util.List list46 = option33.getValuesList();
        int int47 = option33.getArgs();
        boolean boolean48 = option19.equals((java.lang.Object) option33);
        boolean boolean49 = option4.equals((java.lang.Object) option33);
        boolean boolean50 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str28, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.hasArgName();
        boolean boolean10 = option4.acceptsArg();
        boolean boolean11 = option4.hasArgName();
        java.lang.String str12 = option4.getArgName();
        java.util.List list13 = option4.getValuesList();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        java.lang.String str8 = option1.getOpt();
        option1.clearValues();
        boolean boolean10 = option1.hasLongOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a [ARG...] :: a ]", "[ option:  [ option:   ::  ]  [ARG] ::  ]", true, "[ option:   :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ARG...] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]", "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", false, "[ option:    ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setDescription("a");
        java.lang.String str14 = option4.getKey();
        option4.setOptionalArg(false);
        boolean boolean17 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        option4.setArgs((-2));
        boolean boolean17 = option4.hasArg();
        java.lang.Object obj18 = option4.getType();
        boolean boolean19 = option4.hasArgs();
        option4.setValueSeparator(' ');
        java.lang.Object obj22 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.hasArgName();
        boolean boolean10 = option4.acceptsArg();
        option4.setRequired(true);
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean18 = option17.hasLongOpt();
        boolean boolean19 = option17.isRequired();
        option17.setArgName("hi!");
        java.util.List list22 = option17.getValuesList();
        java.lang.Class<?> wildcardClass23 = list22.getClass();
        option4.setType((java.lang.Class) wildcardClass23);
        option4.clearValues();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        java.lang.String[] strArray12 = option4.getValues();
        java.lang.String str13 = option4.getKey();
        boolean boolean14 = option4.hasArgs();
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option: a  ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String str14 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.clearValues();
        boolean boolean18 = option4.isRequired();
        java.lang.Object obj19 = option4.clone();
        option4.clearValues();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasOptionalArg();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        java.lang.String str22 = option20.getKey();
        boolean boolean23 = option20.hasArgs();
        java.lang.Class class24 = null;
        option20.setType(class24);
        java.lang.String str27 = option20.getValue(1);
        java.lang.Class<?> wildcardClass28 = option20.getClass();
        option4.setType((java.lang.Class) wildcardClass28);
        option4.setArgs((int) (byte) -1);
        java.lang.String str32 = option4.getOpt();
        boolean boolean33 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String str14 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.clearValues();
        java.lang.String str18 = option4.toString();
        boolean boolean19 = option4.hasOptionalArg();
        java.lang.String str20 = option4.getArgName();
        boolean boolean21 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getOpt();
        java.lang.String str10 = option2.getValue((int) '#');
        option2.setOptionalArg(false);
        boolean boolean13 = option2.hasArgs();
        option2.setArgName("[ option: a a  ::  ]");
        option2.setValueSeparator('a');
        java.lang.Class<?> wildcardClass18 = option2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        option4.setValueSeparator('a');
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue((int) (byte) 1);
        java.lang.Object obj19 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[ option:    ::  ]");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        java.lang.String str10 = option4.toString();
        option4.setLongOpt("[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean13 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        boolean boolean15 = option4.isRequired();
        int int16 = option4.getArgs();
        java.lang.String str17 = option4.toString();
        java.lang.String str19 = option4.getValue("[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    ::  ]" + "'", str17, "[ option:    ::  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str19, "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.Object obj8 = null;
        boolean boolean9 = option4.equals(obj8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.String str11 = option9.getValue("[ option:   ::  ]");
        boolean boolean12 = option9.acceptsArg();
        boolean boolean13 = option9.hasArgs();
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        option2.setType((java.lang.Class) wildcardClass14);
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:   ::  ]" + "'", str11, "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder16);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "a");
        java.lang.String str5 = option3.getValue("");
        option3.setDescription("[ option: a  :: null ]");
        option3.setValueSeparator('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        boolean boolean8 = option4.hasArg();
        java.lang.String str9 = option4.getLongOpt();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.Object obj14 = option4.getType();
        boolean boolean15 = option4.hasArgs();
        boolean boolean16 = option4.isRequired();
        boolean boolean17 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.String str15 = option4.getArgName();
        char char16 = option4.getValueSeparator();
        option4.clearValues();
        java.lang.String str18 = option4.getValue();
        java.util.List list19 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.toString();
        boolean boolean11 = option4.isRequired();
        option4.setArgs(0);
        java.lang.String str14 = option4.getOpt();
        boolean boolean15 = option4.hasArgs();
        boolean boolean16 = option4.requiresArg();
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        boolean boolean13 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]");
        boolean boolean3 = option2.isRequired();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean9 = option8.hasLongOpt();
        option8.setRequired(false);
        boolean boolean12 = option8.hasArg();
        boolean boolean13 = option8.acceptsArg();
        boolean boolean14 = option8.hasLongOpt();
        java.lang.String[] strArray15 = option8.getValues();
        boolean boolean16 = option8.requiresArg();
        option8.setValueSeparator('4');
        java.lang.String str19 = option8.getArgName();
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean25 = option24.hasLongOpt();
        boolean boolean26 = option24.isRequired();
        option24.setArgName("hi!");
        java.lang.Class<?> wildcardClass29 = option24.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder30 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass29);
        option8.setType((java.lang.Class) wildcardClass29);
        java.lang.String str33 = option8.getValue((int) (short) 100);
        java.lang.Object obj34 = option8.clone();
        option8.setOptionalArg(false);
        boolean boolean37 = option2.equals((java.lang.Object) false);
        option2.setArgName("[ option: a a  ::  ]");
        char char40 = option2.getValueSeparator();
        java.lang.String[] strArray41 = option2.getValues();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(optionBuilder30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\000' + "'", char40 == '\000');
        org.junit.Assert.assertNull(strArray41);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.setArgName("");
        char char15 = option4.getValueSeparator();
        option4.setOptionalArg(true);
        option4.setValueSeparator(' ');
        java.lang.String str20 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.clone();
        option2.setLongOpt("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option: a  :: hi! ]");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   ::  ]", false, "[ option:   ::  ]");
        option4.setOptionalArg(false);
        java.lang.String str7 = option4.getLongOpt();
        boolean boolean8 = option4.hasArg();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:   ::  ]" + "'", str7, "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        java.lang.String str11 = option4.toString();
        java.lang.String str12 = option4.getOpt();
        char char13 = option4.getValueSeparator();
        java.lang.String str14 = option4.getDescription();
        boolean boolean15 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        option4.clearValues();
        java.lang.String str12 = option4.getOpt();
        boolean boolean13 = option4.hasValueSeparator();
        java.lang.String str15 = option4.getValue("[ option:    [ARG] ::  ]");
        option4.addValueForProcessing("[ option:   :: a ]");
        char char18 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String str14 = option4.getDescription();
        option4.setRequired(true);
        option4.setOptionalArg(true);
        java.lang.String str19 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.clearValues();
        option1.setOptionalArg(true);
        option1.setOptionalArg(true);
        java.util.List list15 = option1.getValuesList();
        option1.setDescription("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        boolean boolean4 = option2.acceptsArg();
        java.lang.String str5 = option2.getValue();
        java.lang.Object obj6 = option2.getType();
        option2.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]", true, "[ option:  [ option: a [ option:   ::  ]  :: a ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        boolean boolean4 = option2.acceptsArg();
        java.lang.String str5 = option2.getValue();
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean11 = option10.hasLongOpt();
        boolean boolean12 = option10.isRequired();
        option10.setArgName("hi!");
        option10.setArgs((int) (byte) 0);
        java.lang.String[] strArray17 = option10.getValues();
        int int18 = option10.getArgs();
        java.lang.String str19 = option10.getArgName();
        java.lang.String str20 = option10.getKey();
        boolean boolean21 = option2.equals((java.lang.Object) option10);
        java.lang.String str22 = option10.getKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.isRequired();
        java.lang.String str12 = option4.getValue("[ option:    [ARG] :: [ option:   ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:    [ARG] :: [ option:   ::  ] ]" + "'", str12, "[ option:    [ARG] :: [ option:   ::  ] ]");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        java.lang.String str11 = option4.getValue("[ option: a [ option:   ::  ]  :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = option4.addValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str11, "[ option: a [ option:   ::  ]  :: a ]");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        boolean boolean6 = option2.hasLongOpt();
        boolean boolean7 = option2.isRequired();
        boolean boolean8 = option2.requiresArg();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = option2.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        boolean boolean12 = option4.hasArgName();
        boolean boolean13 = option4.hasLongOpt();
        java.lang.Class class14 = null;
        option4.setType(class14);
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        option20.setRequired(false);
        boolean boolean24 = option20.hasArg();
        boolean boolean25 = option20.acceptsArg();
        boolean boolean26 = option20.hasLongOpt();
        java.lang.String[] strArray27 = option20.getValues();
        option20.setDescription("a");
        java.lang.String[] strArray30 = option20.getValues();
        org.apache.commons.cli.Option option33 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class34 = null;
        option33.setType(class34);
        option33.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Class<?> wildcardClass38 = option33.getClass();
        option20.setType((java.lang.Class) wildcardClass38);
        option4.setType((java.lang.Class) wildcardClass38);
        char char41 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        java.lang.String str10 = option4.getValue();
        java.lang.String str11 = option4.getArgName();
        boolean boolean12 = option4.isRequired();
        char char13 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String str14 = option4.getDescription();
        boolean boolean15 = option4.requiresArg();
        java.lang.String str16 = option4.getKey();
        option4.setValueSeparator('\000');
        java.lang.String[] strArray19 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setDescription("a");
        java.lang.String[] strArray14 = option4.getValues();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class18 = null;
        option17.setType(class18);
        option17.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Class<?> wildcardClass22 = option17.getClass();
        option4.setType((java.lang.Class) wildcardClass22);
        boolean boolean24 = option4.hasValueSeparator();
        java.lang.String str26 = option4.getValue("[ option: a  [ARG] :: a ]");
        boolean boolean27 = option4.hasValueSeparator();
        option4.setValueSeparator('\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ option: a  [ARG] :: a ]" + "'", str26, "[ option: a  [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  ::  ]", "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        option4.setDescription("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option4.setArgName("");
        option4.setLongOpt("");
        option4.setArgName("[ option: a  :: null ]");
        char char23 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setArgName("hi!");
        option4.setDescription("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str16 = option4.getLongOpt();
        boolean boolean17 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasOptionalArg();
        boolean boolean16 = option4.hasArgs();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.toString();
        option4.setRequired(true);
        option4.clearValues();
        option4.setDescription("");
        java.lang.String str16 = option4.toString();
        java.lang.Class<?> wildcardClass17 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder18 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str16, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(optionBuilder18);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        java.lang.String[] strArray12 = option4.getValues();
        java.lang.String str13 = option4.getKey();
        boolean boolean14 = option4.hasArgs();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option:    [ARG] :: [ option:  [ARG...] :: hi! ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        java.lang.String str11 = option4.toString();
        java.lang.String str12 = option4.getOpt();
        boolean boolean13 = option4.hasValueSeparator();
        option4.clearValues();
        java.lang.String str15 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        option1.clearValues();
        option1.setOptionalArg(true);
        option1.setRequired(true);
        java.lang.String str9 = option1.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        boolean boolean12 = option4.acceptsArg();
        boolean boolean13 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setDescription("a");
        java.lang.String str10 = option1.toString();
        option1.setRequired(false);
        java.lang.String str13 = option1.getArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a  :: a ]" + "'", str10, "[ option: a  :: a ]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.lang.String str10 = option4.toString();
        java.lang.Object obj11 = option4.getType();
        boolean boolean12 = option4.hasValueSeparator();
        boolean boolean13 = option4.hasArgName();
        option4.setLongOpt("4");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.util.List list10 = option4.getValuesList();
        option4.setArgs((int) '\000');
        option4.setArgName("[ option: a  :: a ]");
        boolean boolean15 = option4.hasLongOpt();
        java.lang.String str16 = option4.getDescription();
        java.lang.String str17 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option: a  :: a ]" + "'", str17, "[ option: a  :: a ]");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String str14 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.clearValues();
        java.lang.String str18 = option4.toString();
        boolean boolean19 = option4.hasOptionalArg();
        java.lang.String str20 = option4.getKey();
        java.util.List list21 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasArg();
        java.lang.String str11 = option4.getKey();
        boolean boolean12 = option4.hasArg();
        option4.setArgName("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean15 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   ::  ]", true, "a");
        char char5 = option4.getValueSeparator();
        java.lang.String str6 = option4.getLongOpt();
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   ::  ]" + "'", str6, "[ option:   ::  ]");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.Class class11 = null;
        option4.setType(class11);
        boolean boolean13 = option4.hasArg();
        option4.setArgName("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean16 = option4.hasValueSeparator();
        org.apache.commons.cli.Option option18 = org.apache.commons.cli.OptionBuilder.create('a');
        option18.setRequired(false);
        java.lang.String str21 = option18.getLongOpt();
        int int22 = option18.getArgs();
        java.util.List list23 = option18.getValuesList();
        int int24 = option18.getId();
        option18.setOptionalArg(true);
        java.lang.Class<?> wildcardClass27 = option18.getClass();
        option4.setType((java.lang.Class) wildcardClass27);
        option4.setOptionalArg(false);
        java.lang.String str31 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(option18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]" + "'", str31, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String[] strArray12 = option4.getValues();
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean15 = option4.hasArgs();
        boolean boolean16 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.setRequired(false);
        char char11 = option4.getValueSeparator();
        boolean boolean12 = option4.hasOptionalArg();
        boolean boolean13 = option4.acceptsArg();
        java.lang.Object obj14 = option4.getType();
        java.lang.String str15 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        option2.setOptionalArg(true);
        int int12 = option2.getArgs();
        boolean boolean13 = option2.hasArgs();
        java.util.List list14 = option2.getValuesList();
        java.lang.Class<?> wildcardClass15 = option2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        option4.addValueForProcessing("[ option:   :: a ]");
        boolean boolean11 = option4.hasOptionalArg();
        java.util.List list12 = option4.getValuesList();
        java.lang.Object obj13 = option4.clone();
        java.lang.String str14 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getKey();
        option2.setValueSeparator(' ');
        java.util.List list11 = option2.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        java.lang.String str19 = option4.getOpt();
        option4.setLongOpt("a");
        char char22 = option4.getValueSeparator();
        java.lang.String str23 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ option:  a  [ARG] ::  ]" + "'", str23, "[ option:  a  [ARG] ::  ]");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setDescription("a");
        java.lang.String str14 = option4.getLongOpt();
        java.lang.String[] strArray15 = option4.getValues();
        java.lang.String str16 = option4.getValue();
        java.lang.String str17 = option4.getKey();
        int int18 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.requiresArg();
        option4.setLongOpt("a");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = option4.addValue("[ option:   :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.String str12 = option4.getLongOpt();
        java.lang.String str13 = option4.getValue();
        boolean boolean14 = option4.hasOptionalArg();
        boolean boolean15 = option4.hasArgName();
        option4.setOptionalArg(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = option4.addValue("[ option:  [ option:   ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        int int9 = option4.getArgs();
        option4.setLongOpt("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean12 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        boolean boolean11 = option4.hasArgName();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str13 = option4.getLongOpt();
        java.lang.Object obj14 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        java.lang.String[] strArray12 = option4.getValues();
        java.lang.String str13 = option4.getKey();
        boolean boolean14 = option4.hasArgs();
        java.lang.String[] strArray15 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        java.lang.String str10 = option4.getValue((int) (byte) -1);
        boolean boolean11 = option4.hasValueSeparator();
        java.lang.String str13 = option4.getValue((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", true, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean4 = option3.acceptsArg();
        boolean boolean5 = option3.requiresArg();
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean11 = option10.hasLongOpt();
        option10.setRequired(false);
        boolean boolean14 = option10.requiresArg();
        int int15 = option10.getArgs();
        option10.setOptionalArg(false);
        boolean boolean18 = option10.hasArgName();
        java.lang.String str20 = option10.getValue("[ option: a  :: a ]");
        option10.setOptionalArg(true);
        option10.setLongOpt("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str30 = option29.getValue();
        java.lang.Object obj31 = option29.getType();
        boolean boolean32 = option29.hasArgName();
        java.lang.String str33 = option29.getDescription();
        option29.addValueForProcessing("[ option: a  [ARG] :: a ]");
        option29.setRequired(false);
        org.apache.commons.cli.Option option42 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean43 = option42.hasLongOpt();
        java.lang.String str44 = option42.getKey();
        boolean boolean45 = option42.hasArgs();
        java.lang.Class class46 = null;
        option42.setType(class46);
        boolean boolean48 = option42.hasArgName();
        java.lang.Class<?> wildcardClass49 = option42.getClass();
        option29.setType((java.lang.Class) wildcardClass49);
        option10.setType((java.lang.Class) wildcardClass49);
        boolean boolean52 = option3.equals((java.lang.Object) wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ option: a  :: a ]" + "'", str20, "[ option: a  :: a ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean13 = option12.hasLongOpt();
        option12.setRequired(false);
        boolean boolean16 = option12.hasArg();
        boolean boolean17 = option12.acceptsArg();
        java.lang.String str18 = option12.toString();
        java.lang.String str19 = option12.getKey();
        boolean boolean20 = option12.hasArg();
        java.lang.String str21 = option12.getDescription();
        int int22 = option12.getArgs();
        org.apache.commons.cli.Option option27 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean28 = option27.hasLongOpt();
        java.lang.String str29 = option27.getKey();
        option27.setLongOpt("[ option:    [ARG] ::  ]");
        option27.setRequired(false);
        java.lang.String str34 = option27.getValue();
        org.apache.commons.cli.Option option39 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean40 = option39.hasLongOpt();
        boolean boolean41 = option39.isRequired();
        option39.setArgName("hi!");
        java.lang.Class<?> wildcardClass44 = option39.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder45 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass44);
        org.apache.commons.cli.OptionBuilder optionBuilder46 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass44);
        option27.setType((java.lang.Class) wildcardClass44);
        option12.setType((java.lang.Class) wildcardClass44);
        option2.setType((java.lang.Class) wildcardClass44);
        boolean boolean50 = option2.hasArgName();
        java.lang.String str51 = option2.getLongOpt();
        java.lang.Object obj52 = option2.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(optionBuilder45);
        org.junit.Assert.assertNotNull(optionBuilder46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class org.apache.commons.cli.Option");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.util.List list9 = option4.getValuesList();
        java.lang.Object obj10 = option4.getType();
        java.util.List list11 = option4.getValuesList();
        java.lang.Object obj12 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getKey();
        boolean boolean12 = option4.hasArg();
        java.lang.String str13 = option4.getDescription();
        int int14 = option4.getArgs();
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean20 = option19.hasLongOpt();
        java.lang.String str21 = option19.getKey();
        option19.setLongOpt("[ option:    [ARG] ::  ]");
        option19.setRequired(false);
        java.lang.String str26 = option19.getValue();
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean32 = option31.hasLongOpt();
        boolean boolean33 = option31.isRequired();
        option31.setArgName("hi!");
        java.lang.Class<?> wildcardClass36 = option31.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder37 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass36);
        org.apache.commons.cli.OptionBuilder optionBuilder38 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass36);
        option19.setType((java.lang.Class) wildcardClass36);
        option4.setType((java.lang.Class) wildcardClass36);
        option4.setLongOpt("[ option:   :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(optionBuilder37);
        org.junit.Assert.assertNotNull(optionBuilder38);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.hasOptionalArg();
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.acceptsArg();
        java.lang.String str14 = option4.getValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        option4.clearValues();
        java.lang.Object obj16 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        java.lang.Object obj13 = option4.clone();
        boolean boolean14 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        java.lang.Object obj12 = option4.clone();
        option4.setValueSeparator('\000');
        boolean boolean15 = option4.hasArgs();
        java.lang.String str16 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.String str15 = option4.getArgName();
        option4.setRequired(true);
        boolean boolean18 = option4.isRequired();
        option4.setArgName("\000");
        java.lang.String[] strArray21 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        option4.setLongOpt("");
        boolean boolean15 = option4.hasArgName();
        boolean boolean16 = option4.hasArgs();
        java.lang.Class<?> wildcardClass17 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        char char11 = option4.getValueSeparator();
        option4.setArgName("[ option: a  [ARG] :: a ]");
        boolean boolean14 = option4.hasArgName();
        java.lang.String str15 = option4.getLongOpt();
        java.lang.String str16 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.acceptsArg();
        java.lang.String str14 = option4.getValue("[ option:   :: a ]");
        option4.setLongOpt("[ option:  a  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((-1));
        boolean boolean10 = option6.equals((java.lang.Object) optionBuilder9);
        boolean boolean11 = option6.hasArg();
        java.lang.String str12 = option6.getArgName();
        java.lang.String str13 = option6.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        option4.setValueSeparator(' ');
        java.lang.Object obj7 = option4.clone();
        java.lang.String str8 = option4.getValue();
        option4.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean11 = option4.requiresArg();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        java.util.List list15 = option4.getValuesList();
        option4.setOptionalArg(false);
        java.lang.String str18 = option4.getOpt();
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option:    [ARG] :: [ option: a [ option:   ::  ]  :: a ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        boolean boolean10 = option4.hasOptionalArg();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        boolean boolean13 = option4.hasArg();
        char char14 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ' ' + "'", char14 == ' ');
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str11 = option4.getValue(1);
        option4.setLongOpt("[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        option4.clearValues();
        java.lang.String str9 = option4.getLongOpt();
        boolean boolean10 = option4.requiresArg();
        java.lang.String str11 = option4.getOpt();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.hasLongOpt();
        option4.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        option4.setArgName("");
        option4.setArgName("[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.setRequired(false);
        java.lang.String str11 = option4.getValue();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean17 = option16.hasLongOpt();
        boolean boolean18 = option16.isRequired();
        option16.setArgName("hi!");
        java.lang.Class<?> wildcardClass21 = option16.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder22 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass21);
        org.apache.commons.cli.OptionBuilder optionBuilder23 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass21);
        option4.setType((java.lang.Class) wildcardClass21);
        boolean boolean25 = option4.hasLongOpt();
        option4.setDescription("a");
        java.lang.Object obj28 = option4.getType();
        option4.setValueSeparator('4');
        java.lang.Object obj31 = option4.clone();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[ option:  [ option:    [ARG] ::  ]  [ARG] :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "[ option:  [ option:    [ARG] ::  ]  [ARG] :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[ option:  [ option:    [ARG] ::  ]  [ARG] :: a :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str16 = option4.getValue();
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        java.lang.String str20 = option4.getValue((int) (byte) 1);
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean26 = option25.hasLongOpt();
        option25.setRequired(false);
        boolean boolean29 = option4.equals((java.lang.Object) option25);
        java.lang.String str30 = option4.toString();
        option4.setArgs(100);
        boolean boolean33 = option4.hasOptionalArg();
        option4.setArgName("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean36 = option4.acceptsArg();
        java.lang.String str38 = option4.getValue("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean44 = option43.hasLongOpt();
        option43.setRequired(false);
        boolean boolean47 = option43.requiresArg();
        int int48 = option43.getArgs();
        option43.setOptionalArg(false);
        org.apache.commons.cli.Option option55 = new org.apache.commons.cli.Option("a", "[ option:   ::  ]", true, "a");
        java.util.List list56 = option55.getValuesList();
        boolean boolean57 = option55.hasValueSeparator();
        java.lang.Class<?> wildcardClass58 = option55.getClass();
        boolean boolean59 = option43.equals((java.lang.Object) wildcardClass58);
        option4.setType((java.lang.Class) wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str30, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str38, "[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.String str15 = option4.getArgName();
        option4.setRequired(true);
        java.util.List list18 = option4.getValuesList();
        java.lang.String str19 = option4.getLongOpt();
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        java.lang.String str16 = option4.getValue((int) (short) 100);
        java.lang.String str17 = option4.getOpt();
        java.lang.String[] strArray18 = option4.getValues();
        option4.addValueForProcessing("[ option: a [ option:   ::  ]  :: a ]");
        option4.setArgs(35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        java.lang.String str16 = option4.getValue((int) (short) 100);
        java.lang.String str17 = option4.getOpt();
        java.util.List list18 = option4.getValuesList();
        java.util.List list19 = option4.getValuesList();
        java.lang.String str20 = option4.getKey();
        option4.setLongOpt("[ option:   :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        boolean boolean15 = option4.equals((java.lang.Object) '#');
        boolean boolean16 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String str19 = option4.toString();
        boolean boolean20 = option4.hasLongOpt();
        option4.setDescription("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        option4.setLongOpt("");
        java.lang.String[] strArray15 = option4.getValues();
        option4.setOptionalArg(false);
        char char18 = option4.getValueSeparator();
        java.lang.String str20 = option4.getValue((int) (byte) -1);
        java.lang.String str21 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        char char9 = option4.getValueSeparator();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String str12 = option4.getValue((int) '\000');
        boolean boolean13 = option4.isRequired();
        java.lang.String str14 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        org.apache.commons.cli.Option option14 = org.apache.commons.cli.OptionBuilder.create('a');
        option14.setRequired(false);
        java.lang.String str17 = option14.getLongOpt();
        int int18 = option14.getArgs();
        java.lang.String str20 = option14.getValue((int) (short) 10);
        option14.setOptionalArg(false);
        boolean boolean23 = option4.equals((java.lang.Object) false);
        java.lang.Object obj24 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(option14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] :: [ option: a [ option:   ::  ]  :: a ] ]" + "'", str17, "[ option:    [ARG] :: [ option: a [ option:   ::  ]  :: a ] ]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[ option:    ::  ]");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.lang.String str10 = option4.toString();
        java.lang.Object obj11 = option4.getType();
        option4.clearValues();
        java.util.List list13 = option4.getValuesList();
        java.lang.String str14 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   [ARG...] ::  ]", false, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean5 = option4.requiresArg();
        java.lang.String str6 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str6, "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.isRequired();
        option4.setArgs((int) (byte) 1);
        java.lang.String[] strArray12 = option4.getValues();
        int int13 = option4.getArgs();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        option18.setRequired(false);
        java.lang.Class class22 = null;
        option18.setType(class22);
        java.lang.String str24 = option18.getLongOpt();
        boolean boolean25 = option18.requiresArg();
        boolean boolean26 = option18.hasOptionalArg();
        option18.setArgName("hi!");
        boolean boolean29 = option18.requiresArg();
        boolean boolean30 = option18.hasLongOpt();
        boolean boolean31 = option18.hasLongOpt();
        option18.setValueSeparator('\000');
        boolean boolean34 = option4.equals((java.lang.Object) option18);
        boolean boolean35 = option18.hasArgs();
        boolean boolean36 = option18.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.addValueForProcessing("[ option:    [ARG] :: [ option:   ::  ] ]");
        option4.clearValues();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        boolean boolean15 = option4.hasArg();
        java.lang.String str17 = option4.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        char char18 = option4.getValueSeparator();
        boolean boolean19 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str17, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '4' + "'", char18 == '4');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option:  [ option:   ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        boolean boolean8 = option4.hasValueSeparator();
        boolean boolean9 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.Class class11 = null;
        option4.setType(class11);
        boolean boolean13 = option4.hasArg();
        option4.setArgName("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean16 = option4.hasLongOpt();
        boolean boolean17 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.setRequired(false);
        char char11 = option4.getValueSeparator();
        boolean boolean12 = option4.hasOptionalArg();
        boolean boolean13 = option4.acceptsArg();
        int int14 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        option4.setDescription("[ option:    [ARG] ::  ]");
        java.lang.Object obj14 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setDescription("a");
        java.lang.String str14 = option4.getLongOpt();
        java.lang.String[] strArray15 = option4.getValues();
        java.lang.String str16 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String str9 = option4.getKey();
        boolean boolean10 = option4.acceptsArg();
        java.lang.Class<?> wildcardClass11 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.util.List list10 = option4.getValuesList();
        option4.setArgs((int) '\000');
        option4.setArgName("[ option: a  :: a ]");
        boolean boolean15 = option4.hasLongOpt();
        java.util.List list16 = option4.getValuesList();
        boolean boolean17 = option4.hasLongOpt();
        java.lang.Object obj18 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[ option:    ::  ]");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   [ARG...] ::  ]", true, "[ option:   [ARG...] ::  ]");
        int int5 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        boolean boolean8 = option4.isRequired();
        option4.setArgName("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean11 = option4.hasValueSeparator();
        java.lang.String str12 = option4.getArgName();
        option4.setRequired(true);
        boolean boolean15 = option4.hasOptionalArg();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]" + "'", str12, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("hi!", "[ option:    [ARG] :: hi! ]", false, "[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        boolean boolean4 = option3.hasLongOpt();
        java.lang.String str6 = option3.getValue((int) 'a');
        java.lang.String str7 = option3.getKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str7 = option4.getValue("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean13 = option12.hasLongOpt();
        option12.setRequired(false);
        java.lang.String str16 = option12.getDescription();
        option12.setValueSeparator('a');
        boolean boolean19 = option12.hasValueSeparator();
        char char20 = option12.getValueSeparator();
        java.lang.String str22 = option12.getValue("hi!");
        java.util.List list23 = option12.getValuesList();
        boolean boolean24 = option4.equals((java.lang.Object) list23);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option: a  ::  :: class org.apache.commons.cli.Option ]" + "'", str7, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'a' + "'", char20 == 'a');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        java.lang.String str11 = option4.toString();
        boolean boolean12 = option4.isRequired();
        boolean boolean13 = option4.acceptsArg();
        char char14 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.hasValueSeparator();
        java.util.List list6 = option1.getValuesList();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]" + "'", str4, "[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        org.apache.commons.cli.Option option7 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str9 = option7.getValue(1);
        boolean boolean10 = option1.equals((java.lang.Object) option7);
        java.lang.String[] strArray11 = option7.getValues();
        char char12 = option7.getValueSeparator();
        java.lang.String str14 = option7.getValue("");
        boolean boolean15 = option7.hasArgs();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        option20.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean23 = option20.hasValueSeparator();
        java.lang.String str24 = option20.getValue();
        boolean boolean25 = option20.hasOptionalArg();
        java.util.List list26 = option20.getValuesList();
        option20.setOptionalArg(true);
        java.lang.Class<?> wildcardClass29 = option20.getClass();
        option7.setType((java.lang.Class) wildcardClass29);
        boolean boolean31 = option7.isRequired();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.Class class15 = null;
        option4.setType(class15);
        boolean boolean17 = option4.requiresArg();
        boolean boolean18 = option4.hasOptionalArg();
        java.lang.String str19 = option4.getOpt();
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean25 = option24.hasLongOpt();
        boolean boolean26 = option24.isRequired();
        option24.setArgName("hi!");
        option24.setArgs((int) (byte) 0);
        boolean boolean31 = option24.hasOptionalArg();
        boolean boolean32 = option24.hasArgs();
        boolean boolean33 = option24.isRequired();
        java.lang.String[] strArray34 = option24.getValues();
        java.lang.Class class35 = null;
        option24.setType(class35);
        java.lang.Object obj37 = option24.getType();
        java.lang.String str38 = option24.getOpt();
        option24.setOptionalArg(true);
        boolean boolean41 = option4.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }
}
