package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: a :: class org.apache.commons.cli.Option ]", "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getKey();
        int int5 = option1.getArgs();
        boolean boolean6 = option1.hasOptionalArg();
        option1.setLongOpt("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean9 = option1.acceptsArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.hasLongOpt();
        option4.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean15 = option4.hasArgName();
        option4.setRequired(true);
        java.lang.String str19 = option4.getValue("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]" + "'", str19, "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        char char15 = option4.getValueSeparator();
        boolean boolean16 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        boolean boolean11 = option4.hasValueSeparator();
        char char12 = option4.getValueSeparator();
        boolean boolean13 = option4.hasValueSeparator();
        java.lang.String str15 = option4.getValue((int) (byte) -1);
        boolean boolean16 = option4.isRequired();
        boolean boolean17 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'a' + "'", char12 == 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        boolean boolean18 = option4.acceptsArg();
        boolean boolean19 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        int int8 = option4.getArgs();
        char char9 = option4.getValueSeparator();
        option4.setDescription("[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        option1.clearValues();
        option1.setOptionalArg(true);
        java.lang.String str7 = option1.toString();
        option1.setRequired(true);
        java.util.List list10 = option1.getValuesList();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option: a  :: null ]" + "'", str7, "[ option: a  :: null ]");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        option4.setRequired(true);
        option4.setLongOpt("");
        java.lang.String str24 = option4.getValue("[ option: a a  ::  ]");
        java.lang.Object obj25 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ option: a a  ::  ]" + "'", str24, "[ option: a a  ::  ]");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.util.List list5 = option2.getValuesList();
        java.lang.Object obj6 = option2.getType();
        boolean boolean7 = option2.requiresArg();
        java.lang.String str8 = option2.getValue();
        option2.setValueSeparator('#');
        boolean boolean11 = option2.hasLongOpt();
        char char12 = option2.getValueSeparator();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '#' + "'", char12 == '#');
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getArgName();
        java.lang.String str6 = option2.getDescription();
        boolean boolean7 = option2.hasOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = option2.addValue("[ option:    ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(35);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.clearValues();
        option4.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:   :: a ]", "[ option:   [ARG...] ::  ]", false, "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getArgName();
        option4.setArgName("[ option:   ::  ]");
        boolean boolean11 = option4.requiresArg();
        java.lang.String str12 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        java.lang.String str35 = option1.toString();
        boolean boolean36 = option1.hasArgName();
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
// flaky "1) test1517(org.apache.commons.cli.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str35, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "hi!");
        option18.setDescription("");
        java.util.List list21 = option18.getValuesList();
        java.lang.Object obj22 = option18.getType();
        boolean boolean23 = option18.hasArgName();
        boolean boolean24 = option4.equals((java.lang.Object) option18);
        java.lang.Object obj25 = option18.getType();
        java.lang.String str26 = option18.getKey();
        java.lang.String str27 = option18.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        boolean boolean34 = option4.hasOptionalArg();
        java.lang.String str35 = option4.getDescription();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  ::  :: class org.apache.commons.cli.Option ]", false, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String[] strArray4 = option1.getValues();
        boolean boolean5 = option1.hasArgs();
        java.util.List list6 = option1.getValuesList();
        int int7 = option1.getId();
        java.lang.String[] strArray8 = option1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = strArray8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        boolean boolean19 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]", "[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", true, "[ option:    ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("\000");
        boolean boolean2 = option1.hasOptionalArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        boolean boolean10 = option4.hasArg();
        char char11 = option4.getValueSeparator();
        java.lang.String str12 = option4.getDescription();
        boolean boolean13 = option4.isRequired();
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getValue();
        java.lang.String str8 = option4.getLongOpt();
        boolean boolean9 = option4.isRequired();
        java.lang.String str10 = option4.getKey();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option:   ::  ]");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        java.util.List list9 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        option4.setValueSeparator(' ');
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
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        boolean boolean19 = option4.hasArg();
        java.lang.String str21 = option4.getValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str21, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        char char8 = option2.getValueSeparator();
        java.lang.String str10 = option2.getValue("[ option: a  :: null ]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a  :: null ]" + "'", str10, "[ option: a  :: null ]");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.lang.String str34 = option4.getOpt();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        java.lang.String str12 = option4.getDescription();
        java.util.List list13 = option4.getValuesList();
        option4.addValueForProcessing("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getOpt();
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        java.lang.String str7 = option4.getArgName();
        char char8 = option4.getValueSeparator();
        java.lang.String str9 = option4.getDescription();
        java.lang.Object obj10 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        boolean boolean15 = option4.equals((java.lang.Object) '#');
        boolean boolean16 = option4.isRequired();
        java.lang.String str18 = option4.getValue("[ option: a [ option:   ::  ]  :: a ]");
        char char19 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str18, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + ' ' + "'", char19 == ' ');
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.setArgName("");
        option4.setOptionalArg(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = option4.addValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        int int20 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNotNull(optionBuilder16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.String str13 = option4.getValue((int) 'a');
        char char14 = option4.getValueSeparator();
        boolean boolean15 = option4.acceptsArg();
        boolean boolean16 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        option4.addValueForProcessing("[ option:   :: a ]");
        boolean boolean11 = option4.acceptsArg();
        boolean boolean12 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getDescription();
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        option4.setArgName("[ option: a  :: a ]");
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
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        java.lang.String str11 = option4.getOpt();
        option4.setDescription("hi!");
        option4.setDescription("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str17 = option4.getValue("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        java.lang.String str22 = option14.getArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        boolean boolean10 = option4.hasArg();
        java.lang.String str12 = option4.getValue("a");
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean18 = option17.hasLongOpt();
        option17.setRequired(false);
        boolean boolean21 = option17.requiresArg();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean27 = option26.hasLongOpt();
        option26.setRequired(false);
        boolean boolean30 = option26.hasArg();
        boolean boolean31 = option26.acceptsArg();
        boolean boolean32 = option26.hasLongOpt();
        java.lang.String[] strArray33 = option26.getValues();
        boolean boolean34 = option26.requiresArg();
        option26.setValueSeparator('4');
        boolean boolean37 = option26.hasArg();
        java.lang.String str38 = option26.getValue();
        java.lang.String str40 = option26.getValue("[ option:    [ARG] ::  ]");
        option26.setArgName("a");
        java.lang.String str43 = option26.getValue();
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean49 = option48.hasLongOpt();
        boolean boolean50 = option48.isRequired();
        option48.setArgName("hi!");
        java.lang.Class<?> wildcardClass53 = option48.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder54 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass53);
        org.apache.commons.cli.OptionBuilder optionBuilder55 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass53);
        option26.setType((java.lang.Class) wildcardClass53);
        option17.setType((java.lang.Class) wildcardClass53);
        option4.setType((java.lang.Class) wildcardClass53);
        boolean boolean59 = option4.acceptsArg();
        option4.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
        java.util.List list62 = option4.getValuesList();
        org.apache.commons.cli.Option option67 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean68 = option67.hasLongOpt();
        option67.setRequired(false);
        java.lang.String str71 = option67.getDescription();
        option67.setValueSeparator('a');
        option67.setValueSeparator(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder77 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        boolean boolean78 = option67.equals((java.lang.Object) '#');
        boolean boolean79 = option67.hasArgName();
        boolean boolean80 = option4.equals((java.lang.Object) boolean79);
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str40, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(optionBuilder54);
        org.junit.Assert.assertNotNull(optionBuilder55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(optionBuilder77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String[] strArray4 = option1.getValues();
        boolean boolean5 = option1.requiresArg();
        boolean boolean6 = option1.requiresArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        int int17 = option4.getArgs();
        boolean boolean18 = option4.hasArgs();
        java.lang.String str19 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        boolean boolean13 = option4.isRequired();
        option4.setRequired(true);
        java.util.List list16 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        boolean boolean9 = option4.acceptsArg();
        option4.setDescription("[ option: a  [ARG] :: a ]");
        boolean boolean12 = option4.hasArg();
        java.util.List list13 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        option4.setArgs((int) (byte) 0);
        java.lang.Object obj17 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[ option:    ::  ]");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean25 = option24.hasLongOpt();
        boolean boolean26 = option24.isRequired();
        boolean boolean27 = option24.hasArgName();
        java.lang.String str28 = option24.getValue();
        java.lang.Class<?> wildcardClass29 = option24.getClass();
        option4.setType((java.lang.Class) wildcardClass29);
        java.lang.String str32 = option4.getValue("[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[ option:   ::  ]" + "'", str32, "[ option:   ::  ]");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   :: hi! ]", false, "[ option:   [ARG...] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a [ option:   ::  ]  :: a ]", "[ option: a   :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ option:   ::  ]  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.String str12 = option4.getDescription();
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", "[ option:   [ARG...] ::  ]", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  hi!  :: [ option: a  [ARG] :: a ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        option2.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option2.setLongOpt("a");
        java.lang.String str9 = option2.getKey();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "a");
        option2.clearValues();
        java.lang.String[] strArray4 = option2.getValues();
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option: a a  ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        java.lang.Class<?> wildcardClass6 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        option4.setOptionalArg(true);
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
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "a");
        java.lang.Object obj4 = option3.getType();
        option3.setDescription("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        char char15 = option4.getValueSeparator();
        option4.setArgs((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = option4.addValue("a");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        option4.setValueSeparator('4');
        java.lang.Object obj18 = null;
        boolean boolean19 = option4.equals(obj18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getKey();
        boolean boolean8 = option4.requiresArg();
        boolean boolean9 = option4.hasLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        boolean boolean13 = option4.hasArgs();
        boolean boolean14 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str10 = option4.getDescription();
        int int11 = option4.getArgs();
        boolean boolean12 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        boolean boolean10 = option4.hasArg();
        java.lang.String str12 = option4.getValue("");
        option4.setDescription("hi!");
        boolean boolean15 = option4.isRequired();
        java.lang.Object obj16 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String[] strArray14 = option4.getValues();
        boolean boolean15 = option4.hasValueSeparator();
        boolean boolean16 = option4.hasArgs();
        boolean boolean17 = option4.isRequired();
        option4.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getKey();
        java.util.List list8 = option4.getValuesList();
        java.lang.String str9 = option4.getValue();
        java.lang.String str10 = option4.getDescription();
        java.lang.String str11 = option4.getLongOpt();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        java.lang.Class<?> wildcardClass17 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder18 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(optionBuilder18);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:    [ARG] ::  ]", false, "\000");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        boolean boolean25 = option4.hasArgName();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        boolean boolean22 = option4.hasArgName();
        option4.setDescription("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        option4.clearValues();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = option4.addValue("[ option:    [ARG] :: [ option:   ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        java.lang.String str10 = option4.getValue();
        java.lang.String str11 = option4.getArgName();
        option4.setLongOpt("\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        boolean boolean9 = option2.equals((java.lang.Object) 0.0f);
        boolean boolean10 = option2.hasArgName();
        boolean boolean11 = option2.acceptsArg();
        boolean boolean12 = option2.isRequired();
        java.lang.String str13 = option2.getValue();
        java.lang.Class<?> wildcardClass14 = option2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "a");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        java.lang.String str17 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.setArgs((int) (byte) -1);
        java.lang.Object obj12 = option1.getType();
        org.junit.Assert.assertNotNull(option1);
// flaky "2) test1579(org.apache.commons.cli.RegressionTest3)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class org.apache.commons.cli.Option");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", false, "[ option: a  [ARG] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        option4.addValueForProcessing("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        java.lang.Object obj21 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        option2.setArgName("[ option:    [ARG] ::  ]");
        option2.setOptionalArg(true);
        java.lang.String str9 = option2.getOpt();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        java.lang.String str16 = option4.getArgName();
        java.lang.String str17 = option4.getValue();
        java.lang.Object obj18 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "a");
        java.util.List list3 = option2.getValuesList();
        java.lang.String str4 = option2.getKey();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
            boolean boolean25 = option4.addValue("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.acceptsArg();
        java.lang.Class<?> wildcardClass13 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(optionBuilder14);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        option1.clearValues();
        option1.setOptionalArg(true);
        java.lang.String str7 = option1.toString();
        option1.setRequired(true);
        java.lang.String str10 = option1.getOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str7, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        boolean boolean13 = option4.hasArgName();
        boolean boolean14 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        java.lang.String str11 = option4.toString();
        boolean boolean12 = option4.isRequired();
        java.lang.Object obj13 = null;
        boolean boolean14 = option4.equals(obj13);
        option4.setDescription("[ option:   :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        boolean boolean15 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        boolean boolean10 = option4.hasArgs();
        option4.setLongOpt("[ option: a a  ::  ]");
        option4.setLongOpt("[ option: a   :: null ]");
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        boolean boolean11 = option4.hasValueSeparator();
        char char12 = option4.getValueSeparator();
        boolean boolean13 = option4.hasValueSeparator();
        boolean boolean14 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'a' + "'", char12 == 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.util.List list10 = option4.getValuesList();
        option4.setArgs((int) '\000');
        java.lang.String str13 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        java.lang.String str7 = option4.getArgName();
        char char8 = option4.getValueSeparator();
        java.lang.String str9 = option4.getDescription();
        java.util.List list10 = option4.getValuesList();
        char char11 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   [ARG...] ::  ]", false, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean5 = option4.isRequired();
        java.lang.String str6 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str6, "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        java.lang.Object obj14 = option4.getType();
        boolean boolean15 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: a :: class org.apache.commons.cli.Option ]", "[ option: a  ::  :: class org.apache.commons.cli.Option ]", true, "[ option:    ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.isRequired();
        boolean boolean10 = option4.hasArg();
        option4.setArgName("");
        java.lang.String str14 = option4.getValue("[ option: a  :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option: a  :: a :: class org.apache.commons.cli.Option ]" + "'", str14, "[ option: a  :: a :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        java.lang.String str8 = option4.getDescription();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean14 = option13.hasLongOpt();
        boolean boolean15 = option13.isRequired();
        java.lang.String str16 = option13.getOpt();
        option13.setLongOpt("hi!");
        java.lang.Class<?> wildcardClass19 = option13.getClass();
        option4.setType((java.lang.Class) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = option4.addValue("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getOpt();
        java.lang.String str11 = option4.getLongOpt();
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", true, "hi!");
        option4.clearValues();
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean25 = option24.hasLongOpt();
        option24.setRequired(false);
        boolean boolean28 = option24.hasArg();
        boolean boolean29 = option24.acceptsArg();
        boolean boolean30 = option24.hasLongOpt();
        java.lang.String[] strArray31 = option24.getValues();
        boolean boolean32 = option24.requiresArg();
        boolean boolean33 = option24.isRequired();
        option24.setOptionalArg(false);
        char char36 = option24.getValueSeparator();
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean42 = option41.hasLongOpt();
        boolean boolean43 = option41.isRequired();
        option41.setArgName("hi!");
        java.lang.Class<?> wildcardClass46 = option41.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder47 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass46);
        org.apache.commons.cli.OptionBuilder optionBuilder48 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass46);
        org.apache.commons.cli.OptionBuilder optionBuilder49 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass46);
        org.apache.commons.cli.OptionBuilder optionBuilder50 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass46);
        option24.setType((java.lang.Class) wildcardClass46);
        option4.setType((java.lang.Class) wildcardClass46);
        boolean boolean53 = option4.hasArg();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(optionBuilder47);
        org.junit.Assert.assertNotNull(optionBuilder48);
        org.junit.Assert.assertNotNull(optionBuilder49);
        org.junit.Assert.assertNotNull(optionBuilder50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        option4.setValueSeparator(' ');
        boolean boolean7 = option4.hasArgs();
        java.lang.String str9 = option4.getValue("");
        java.lang.String str11 = option4.getValue((int) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        option1.setArgs((int) '\000');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class org.apache.commons.cli.Option");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        char char8 = option4.getValueSeparator();
        boolean boolean9 = option4.requiresArg();
        java.lang.String[] strArray10 = option4.getValues();
        option4.setDescription("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        java.lang.String[] strArray13 = option4.getValues();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        java.lang.Class<?> wildcardClass4 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass4);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.lang.String str19 = option4.getKey();
        java.lang.String str20 = option4.getDescription();
        option4.setDescription("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str23 = option4.getDescription();
        java.lang.Class<?> wildcardClass24 = option4.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str23, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        option4.setLongOpt("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str10, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        java.lang.String str22 = option4.getValue("[ option: a  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ option: a  :: a ]" + "'", str22, "[ option: a  :: a ]");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  ]", "[ option:   :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option3.setDescription("a");
        // The following exception was thrown during execution in test generation
        try {
            option3.addValueForProcessing("[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option2.setType((java.lang.Class) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = option2.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str5 = option4.getKey();
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create('a');
        option7.setRequired(false);
        java.lang.String str10 = option7.getLongOpt();
        int int11 = option7.getArgs();
        java.util.List list12 = option7.getValuesList();
        boolean boolean13 = option4.equals((java.lang.Object) list12);
        option4.setValueSeparator('a');
        java.lang.String str17 = option4.getValue("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "hi!");
        option18.setDescription("");
        java.util.List list21 = option18.getValuesList();
        java.lang.Object obj22 = option18.getType();
        boolean boolean23 = option18.hasArgName();
        boolean boolean24 = option4.equals((java.lang.Object) option18);
        java.lang.Object obj25 = option18.getType();
        java.lang.String str26 = option18.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.util.List list10 = option4.getValuesList();
        java.lang.Object obj11 = option4.getType();
        boolean boolean12 = option4.hasValueSeparator();
        option4.setValueSeparator('\000');
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        option2.setArgName("[ option:    [ARG] ::  ]");
        boolean boolean7 = option2.hasArgs();
        java.lang.String str8 = option2.getArgName();
        boolean boolean9 = option2.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str8, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "[ option: a [ option:   ::  ]  :: a ]");
        int int3 = option2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        int int33 = option4.getArgs();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: null :: class org.apache.commons.cli.Option ]", "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", false, "[ option:    ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option:   ::  ]");
        java.lang.String str3 = option2.getValue();
        java.lang.Class<?> wildcardClass4 = option2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        java.lang.String str9 = option4.getValue(0);
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        java.lang.String str12 = option4.getLongOpt();
        boolean boolean13 = option4.hasLongOpt();
        option4.setDescription("[ option:   ::  ]");
        boolean boolean16 = option4.requiresArg();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.util.List list6 = option1.getValuesList();
        int int7 = option1.getId();
        boolean boolean8 = option1.isRequired();
        java.lang.String str9 = option1.toString();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: a  :: null ]" + "'", str9, "[ option: a  :: null ]");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "");
        option3.clearValues();
        option3.setLongOpt("a");
        option3.setOptionalArg(true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setArgName("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        boolean boolean9 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        boolean boolean4 = option1.acceptsArg();
        java.lang.String str6 = option1.getValue("hi!");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean10 = option9.requiresArg();
        java.lang.Object obj11 = option9.getType();
        boolean boolean12 = option1.equals((java.lang.Object) option9);
        boolean boolean13 = option9.hasArgs();
        java.lang.String[] strArray14 = option9.getValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        option4.setValueSeparator('#');
        java.lang.String str15 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        java.lang.Object obj12 = option4.clone();
        option4.setValueSeparator('\000');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = option4.addValue("[ option:    ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        org.apache.commons.cli.Option option7 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str9 = option7.getValue(1);
        boolean boolean10 = option1.equals((java.lang.Object) option7);
        java.lang.String[] strArray11 = option7.getValues();
        option7.clearValues();
        option7.setOptionalArg(false);
        boolean boolean15 = option7.acceptsArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        java.lang.Object obj4 = option3.clone();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[ option:   :: [ option:    [ARG] ::  :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[ option:   :: [ option:    [ARG] ::  :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[ option:   :: [ option:    [ARG] ::  :: class org.apache.commons.cli.Option ] ]");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option:   ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.getType();
        java.lang.String str7 = option2.getValue((int) (byte) 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getValue();
        java.lang.Class<?> wildcardClass13 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(optionBuilder14);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  ]", "[ option: a  ::  :: class org.apache.commons.cli.Option ]", true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        java.lang.Object obj6 = option2.clone();
        java.lang.Class<?> wildcardClass7 = option2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[ option:   ::  ]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        boolean boolean16 = option1.isRequired();
        java.lang.String str17 = option1.getDescription();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str13, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "a" + "'", str17, "a");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = option4.addValue("[ option:   :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String str14 = option4.getDescription();
        org.apache.commons.cli.Option option16 = org.apache.commons.cli.OptionBuilder.create('a');
        option16.setRequired(false);
        java.lang.String str19 = option16.getLongOpt();
        int int20 = option16.getArgs();
        java.lang.String str22 = option16.getValue((int) (short) 10);
        option16.setDescription("a");
        boolean boolean25 = option4.equals((java.lang.Object) "a");
        option4.setValueSeparator('a');
        java.lang.String str28 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.addValueForProcessing("\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:   ::  ]", true, "a");
        java.util.List list5 = option4.getValuesList();
        java.lang.Class<?> wildcardClass6 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass6);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: null ]", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option: a  :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option:   ::  ]");
        boolean boolean3 = option2.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        option4.setDescription("\000");
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
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        boolean boolean11 = option4.hasValueSeparator();
        char char12 = option4.getValueSeparator();
        boolean boolean13 = option4.hasValueSeparator();
        boolean boolean14 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'a' + "'", char12 == 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.getType();
        java.lang.String[] strArray6 = option2.getValues();
        java.lang.String str8 = option2.getValue("[ option: a a  ::  ]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option: a a  ::  ]" + "'", str8, "[ option: a a  ::  ]");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.clearValues();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = option1.addValue("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
// flaky "3) test1646(org.apache.commons.cli.RegressionTest3)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.hasOptionalArg();
        boolean boolean10 = option4.isRequired();
        option4.setValueSeparator('a');
        int int13 = option4.getArgs();
        boolean boolean14 = option4.hasArgName();
        option4.setValueSeparator('a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getOpt();
        java.lang.String str6 = option2.toString();
        java.lang.String str8 = option2.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean14 = option13.hasLongOpt();
        option13.setRequired(false);
        boolean boolean17 = option13.hasArg();
        boolean boolean18 = option13.acceptsArg();
        boolean boolean19 = option13.hasLongOpt();
        java.lang.String[] strArray20 = option13.getValues();
        boolean boolean21 = option13.requiresArg();
        option13.setValueSeparator('4');
        java.lang.String str25 = option13.getValue((int) (short) 100);
        java.lang.String str26 = option13.getOpt();
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean32 = option31.hasLongOpt();
        option31.setRequired(false);
        boolean boolean35 = option31.hasArg();
        boolean boolean36 = option31.acceptsArg();
        boolean boolean37 = option31.hasLongOpt();
        option31.setOptionalArg(true);
        java.lang.Class<?> wildcardClass40 = option31.getClass();
        option13.setType((java.lang.Class) wildcardClass40);
        option2.setType((java.lang.Class) wildcardClass40);
        option2.setRequired(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   ::  ]" + "'", str6, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str8, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setDescription("a");
        java.lang.String str10 = option1.toString();
        java.lang.String str12 = option1.getValue("[ option:   ::  ]");
        boolean boolean13 = option1.hasArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a  :: a ]" + "'", str10, "[ option: a  :: a ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:   ::  ]" + "'", str12, "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        option2.setOptionalArg(true);
        java.lang.Class<?> wildcardClass12 = option2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", true, "[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        option4.setRequired(false);
        option4.setArgName("[ option:    [ARG] ::  ]");
        option4.clearValues();
        boolean boolean14 = option4.requiresArg();
        option4.setRequired(false);
        java.lang.String str17 = option4.getValue();
        boolean boolean18 = option4.acceptsArg();
        java.lang.String str19 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        java.lang.Object obj35 = option1.clone();
        java.lang.String str37 = option1.getValue((int) (short) 1);
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
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.clearValues();
        boolean boolean14 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("\000");
        boolean boolean2 = option1.hasArgs();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = option1.addValue("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        boolean boolean37 = option4.isRequired();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        boolean boolean10 = option4.hasOptionalArg();
        java.lang.Object obj11 = option4.clone();
        boolean boolean12 = option4.hasValueSeparator();
        option4.setDescription("[ option: a a  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[ option:  hi!  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[ option:  hi!  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[ option:  hi!  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String str14 = option4.getDescription();
        option4.setDescription("[ option:   ::  ]");
        boolean boolean17 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        option4.setValueSeparator(' ');
        java.lang.Object obj7 = option4.clone();
        java.lang.String str8 = option4.getValue();
        option4.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean11 = option4.hasOptionalArg();
        java.lang.String str13 = option4.getValue(97);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option: a  ::  :: class org.apache.commons.cli.Option ]", true, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option4.setArgName("");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str11 = option4.getValue(1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        int int12 = option4.getArgs();
        java.lang.Object obj13 = option4.clone();
        boolean boolean14 = option4.hasValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        option4.clearValues();
        option4.setDescription("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    ::  :: class org.apache.commons.cli.Option ]", "[ option: a [ option:   ::  ]  :: a ]", false, "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        option4.clearValues();
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
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.String str18 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        java.lang.String str7 = option4.getArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.String str9 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        option4.setRequired(true);
        java.lang.Object obj20 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[ option:  [ option:   ::  ]  [ARG] :: [ option:   ::  ] ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[ option:  [ option:   ::  ]  [ARG] :: [ option:   ::  ] ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[ option:  [ option:   ::  ]  [ARG] :: [ option:   ::  ] ]");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        option4.setValueSeparator(' ');
        java.lang.Object obj7 = option4.clone();
        java.lang.String str8 = option4.getValue();
        option4.setArgName("[ option:    [ARG] ::  ]");
        java.lang.String[] strArray11 = option4.getValues();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("a", "[ option:   ::  ]", true, "a");
        java.util.List list17 = option16.getValuesList();
        java.lang.Class<?> wildcardClass18 = option16.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder19 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass18);
        org.apache.commons.cli.OptionBuilder optionBuilder20 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass18);
        option4.setType((java.lang.Class) wildcardClass18);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(optionBuilder19);
        org.junit.Assert.assertNotNull(optionBuilder20);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.lang.String str10 = option4.toString();
        java.lang.Object obj11 = option4.getType();
        java.lang.String str13 = option4.getValue("[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:   ::  ]" + "'", str13, "[ option:   ::  ]");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        option4.addValueForProcessing("[ option: a  [ARG] :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = option4.getValue((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String str14 = option4.getDescription();
        java.lang.String str15 = option4.getValue();
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean18 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        java.lang.String str6 = option4.getOpt();
        java.lang.Object obj7 = option4.clone();
        option4.addValueForProcessing("[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    ::  ]", "[ option:   :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean3 = option2.hasArgName();
        option2.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        java.lang.Object obj9 = option4.clone();
        boolean boolean10 = option4.requiresArg();
        java.lang.Object obj11 = option4.getType();
        option4.setArgs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        java.lang.Object obj11 = option4.getType();
        option4.setArgName("");
        boolean boolean14 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.setRequired(false);
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        boolean boolean73 = option4.hasLongOpt();
        option4.setRequired(true);
        char char76 = option4.getValueSeparator();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + char76 + "' != '" + '\000' + "'", char76 == '\000');
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        option1.setValueSeparator(' ');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "4) test1680(org.apache.commons.cli.RegressionTest3)":         org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setDescription("[ option:   ::  ]");
        option4.setLongOpt("[ option:   ::  ]");
        boolean boolean16 = option4.hasLongOpt();
        option4.setRequired(false);
        java.util.List list19 = option4.getValuesList();
        java.lang.String str20 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String[] strArray14 = option4.getValues();
        boolean boolean15 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: null :: class org.apache.commons.cli.Option ]", false, "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        org.apache.commons.cli.Option option7 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str9 = option7.getValue(1);
        boolean boolean10 = option1.equals((java.lang.Object) option7);
        java.lang.String[] strArray11 = option7.getValues();
        option7.clearValues();
        option7.setLongOpt("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        boolean boolean7 = option2.hasValueSeparator();
        int int8 = option2.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String str12 = option4.getDescription();
        option4.setArgName("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        char char15 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        option3.setLongOpt("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.Object obj6 = option3.getType();
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        boolean boolean6 = option2.hasLongOpt();
        boolean boolean7 = option2.isRequired();
        option2.clearValues();
        option2.setArgs((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        boolean boolean9 = option4.hasArgName();
        java.lang.Object obj10 = option4.getType();
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean16 = option15.hasLongOpt();
        boolean boolean17 = option15.isRequired();
        option15.setArgName("hi!");
        boolean boolean20 = option15.requiresArg();
        option15.setLongOpt("");
        boolean boolean23 = option15.hasOptionalArg();
        java.lang.Class<?> wildcardClass24 = option15.getClass();
        option4.setType((java.lang.Class) wildcardClass24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = option4.addValue("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        java.lang.Class<?> wildcardClass21 = option4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str11 = option4.getValue((int) '#');
        boolean boolean12 = option4.hasOptionalArg();
        boolean boolean13 = option4.requiresArg();
        boolean boolean14 = option4.hasOptionalArg();
        java.lang.String str15 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "a");
        boolean boolean4 = option3.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        int int8 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        char char13 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", "[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", true, "[ option: a  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = option1.addValue("[ option:   :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.requiresArg();
        boolean boolean10 = option4.hasValueSeparator();
        boolean boolean11 = option4.requiresArg();
        java.lang.String str12 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        int int17 = option4.getArgs();
        int int18 = option4.getArgs();
        org.apache.commons.cli.Option option23 = new org.apache.commons.cli.Option("", "", true, "");
        option23.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean26 = option23.hasValueSeparator();
        java.lang.String str27 = option23.getValue();
        boolean boolean28 = option23.hasOptionalArg();
        java.util.List list29 = option23.getValuesList();
        option23.setOptionalArg(true);
        java.lang.Class<?> wildcardClass32 = option23.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder33 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass32);
        org.apache.commons.cli.OptionBuilder optionBuilder34 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass32);
        option4.setType((java.lang.Class) wildcardClass32);
        org.apache.commons.cli.OptionBuilder optionBuilder36 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(optionBuilder33);
        org.junit.Assert.assertNotNull(optionBuilder34);
        org.junit.Assert.assertNotNull(optionBuilder36);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        option4.setLongOpt("a");
        option4.setArgs(10);
        boolean boolean16 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        int int12 = option4.getArgs();
        option4.setValueSeparator('#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        boolean boolean17 = option4.hasArg();
        java.lang.String str18 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        option4.clearValues();
        java.lang.String str12 = option4.getOpt();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        option17.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean20 = option17.hasValueSeparator();
        java.lang.String str21 = option17.getValue();
        option17.setRequired(false);
        option17.setArgName("[ option:    [ARG] ::  ]");
        java.lang.String str26 = option17.getDescription();
        option17.setDescription("a");
        java.lang.Class<?> wildcardClass29 = option17.getClass();
        option4.setType((java.lang.Class) wildcardClass29);
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.util.List list6 = option1.getValuesList();
        int int7 = option1.getId();
        java.lang.Object obj8 = option1.clone();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        option4.addValueForProcessing("[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        java.lang.String str20 = option14.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.requiresArg();
        option4.setLongOpt("a");
        java.lang.String str15 = option4.getDescription();
        java.lang.Class<?> wildcardClass16 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder17 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(optionBuilder17);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.requiresArg();
        boolean boolean10 = option4.hasValueSeparator();
        boolean boolean11 = option4.requiresArg();
        boolean boolean12 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        char char10 = option4.getValueSeparator();
        char char11 = option4.getValueSeparator();
        boolean boolean12 = option4.acceptsArg();
        java.lang.String str13 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        java.lang.String str16 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.setDescription("[ option: a  :: a ]");
        option1.setArgs(0);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        option1.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        option1.setValueSeparator(' ');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        option4.clearValues();
        java.lang.Object obj25 = option4.getType();
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
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        boolean boolean4 = option2.acceptsArg();
        java.lang.String str5 = option2.getValue();
        java.lang.String str6 = option2.getKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        option4.clearValues();
        java.lang.String str11 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.Object obj11 = null;
        boolean boolean12 = option4.equals(obj11);
        option4.setArgName("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        option4.setLongOpt("a");
        option4.setArgs(10);
        boolean boolean16 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a   :: null ]", false, "[ option:    ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a   :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        boolean boolean13 = option4.hasArgs();
        boolean boolean14 = option4.hasOptionalArg();
        boolean boolean15 = option4.hasArgs();
        boolean boolean16 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]", false, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        option1.setLongOpt("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean6 = option1.hasLongOpt();
        int int7 = option1.getId();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        java.util.List list22 = option4.getValuesList();
        option4.setRequired(true);
        java.lang.String str25 = option4.getValue();
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
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        option4.setArgName("[ option:   :: a ]");
        boolean boolean19 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.getType();
        option4.clearValues();
        java.lang.String str15 = option4.getValue("[ option:   [ARG...] ::  ]");
        java.lang.String str17 = option4.getValue((int) (short) 10);
        java.lang.Object obj18 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str15, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        option4.setRequired(false);
        boolean boolean8 = option4.hasLongOpt();
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        boolean boolean22 = option4.hasArgs();
        boolean boolean23 = option4.requiresArg();
        boolean boolean24 = option4.hasArgs();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "[ option: a  [ARG] :: a ]");
        option3.setArgName("\000");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        int int17 = option4.getArgs();
        java.lang.String str18 = option4.getKey();
        java.lang.String str20 = option4.getValue("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.Class<?> wildcardClass21 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str20, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.lang.Object obj14 = option2.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        boolean boolean8 = option2.acceptsArg();
        boolean boolean9 = option2.hasLongOpt();
        boolean boolean10 = option2.acceptsArg();
        java.lang.String str11 = option2.getValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        boolean boolean17 = option4.hasArgName();
        boolean boolean18 = option4.hasValueSeparator();
        java.lang.String str20 = option4.getValue(10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        option4.setOptionalArg(false);
        java.lang.String str11 = option4.getKey();
        java.lang.String[] strArray12 = option4.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        option4.setArgName("");
        java.lang.String str24 = option4.getOpt();
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
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getOpt();
        java.lang.String str10 = option2.getValue((int) '#');
        option2.setOptionalArg(false);
        boolean boolean13 = option2.hasArgs();
        boolean boolean14 = option2.requiresArg();
        option2.setLongOpt("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String str9 = option4.getLongOpt();
        java.lang.String str10 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.hasArgs();
        option2.setRequired(true);
        boolean boolean12 = option2.hasOptionalArg();
        option2.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        boolean boolean13 = option4.hasArg();
        java.lang.String str14 = option4.getLongOpt();
        boolean boolean15 = option4.isRequired();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "hi!");
        option18.setDescription("");
        java.lang.String str21 = option18.getDescription();
        java.lang.String str23 = option18.getValue((int) (byte) 100);
        java.util.List list24 = option18.getValuesList();
        boolean boolean25 = option18.hasLongOpt();
        option18.setOptionalArg(true);
        int int28 = option18.getArgs();
        int int29 = option18.getArgs();
        boolean boolean30 = option18.hasLongOpt();
        boolean boolean31 = option4.equals((java.lang.Object) option18);
        java.lang.String str32 = option18.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        java.lang.String str39 = option26.getKey();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]", "[ option:   :: hi! ]", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        java.lang.String str16 = option4.getArgName();
        java.util.List list17 = option4.getValuesList();
        java.lang.String str18 = option4.getOpt();
        option4.setArgName("\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean14 = option11.hasValueSeparator();
        java.lang.String str15 = option11.getValue();
        boolean boolean16 = option4.equals((java.lang.Object) option11);
        java.lang.String str18 = option11.getValue((int) '\000');
        option11.setRequired(false);
        option11.setDescription("[ option: a  :: null ]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        option4.setValueSeparator(' ');
        boolean boolean7 = option4.hasArgs();
        java.lang.String str9 = option4.getValue("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        option4.setLongOpt("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str12 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str9, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]" + "'", str12, "[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        boolean boolean17 = option4.hasArg();
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
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        boolean boolean20 = option4.hasOptionalArg();
        java.lang.String str21 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNotNull(optionBuilder16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String[] strArray2 = option1.getValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  ]", "[ option:    ::  :: class org.apache.commons.cli.Option ]", true, "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        option2.setArgName("[ option:    [ARG] ::  ]");
        boolean boolean7 = option2.hasArgs();
        java.lang.Object obj8 = option2.getType();
        java.lang.String str9 = option2.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        java.lang.String str10 = option4.toString();
        java.lang.Object obj11 = option4.clone();
        boolean boolean12 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        java.lang.String str15 = option4.getValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean16 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str15, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.hasLongOpt();
        int int11 = option4.getArgs();
        java.lang.String str13 = option4.getValue("[ option:   :: hi! ]");
        java.lang.String[] strArray14 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:   :: hi! ]" + "'", str13, "[ option:   :: hi! ]");
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        option4.setArgName("[ option:    [ARG] ::  ]");
        option4.addValueForProcessing("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str16 = option4.getValue();
        option4.setDescription("[ option: a  :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str16, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: a :: class org.apache.commons.cli.Option ]", "[ option:   :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        java.lang.Object obj13 = option4.clone();
        org.apache.commons.cli.Option option15 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.Class<?> wildcardClass16 = option15.getClass();
        option4.setType((java.lang.Class) wildcardClass16);
        boolean boolean18 = option4.acceptsArg();
        option4.setDescription("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean21 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(option15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        option4.setLongOpt("");
        option4.setLongOpt("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean14 = option4.isRequired();
        boolean boolean15 = option4.hasOptionalArg();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        option20.setRequired(false);
        java.lang.String str24 = option20.getDescription();
        option20.setValueSeparator('a');
        boolean boolean27 = option20.hasValueSeparator();
        char char28 = option20.getValueSeparator();
        boolean boolean29 = option20.hasValueSeparator();
        java.lang.Class<?> wildcardClass30 = option20.getClass();
        option4.setType((java.lang.Class) wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'a' + "'", char28 == 'a');
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.toString();
        java.lang.String str10 = option4.getValue("[ option: a [ option:   ::  ]  :: a ]");
        java.util.List list11 = option4.getValuesList();
        java.lang.String[] strArray12 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str8, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str10, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        option1.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        int int11 = option1.getArgs();
        boolean boolean12 = option1.hasArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        option4.setDescription("[ option:    [ARG] ::  ]");
        java.lang.String str14 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   :: a ]", "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        boolean boolean13 = option4.hasArgName();
        java.lang.String str14 = option4.toString();
        java.lang.String str16 = option4.getValue((int) '\000');
        int int17 = option4.getArgs();
        java.lang.String str18 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str16, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "hi!");
        option3.setOptionalArg(true);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        boolean boolean20 = option18.isRequired();
        option18.setArgName("hi!");
        option18.setArgs((int) (byte) 0);
        boolean boolean25 = option18.hasOptionalArg();
        option18.setValueSeparator('a');
        org.apache.commons.cli.Option option32 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean33 = option32.hasLongOpt();
        option32.setRequired(false);
        boolean boolean36 = option32.requiresArg();
        boolean boolean37 = option18.equals((java.lang.Object) option32);
        java.lang.Class<?> wildcardClass38 = option18.getClass();
        option4.setType((java.lang.Class) wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: a ]", "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]", false, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        java.lang.String str65 = option2.getDescription();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  hi!  :: [ option: a  [ARG] :: a ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        java.util.List list5 = option1.getValuesList();
        java.lang.String str6 = option1.getLongOpt();
        option1.clearValues();
        java.util.List list8 = option1.getValuesList();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.hasOptionalArg();
        java.lang.String str13 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        boolean boolean16 = option4.hasArgName();
        java.lang.String str17 = option4.getArgName();
        java.lang.String str18 = option4.getOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = option4.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        option1.setArgs(0);
        boolean boolean9 = option1.acceptsArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        int int12 = option4.getArgs();
        java.lang.String str13 = option4.getArgName();
        option4.setRequired(false);
        java.lang.String str16 = option4.toString();
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str20 = option4.getValue((int) (byte) 1);
        java.lang.String str22 = option4.getValue("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:    ::  ]" + "'", str16, "[ option:    ::  ]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]" + "'", str22, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str5 = option3.getValue("[ option: a  :: null ]");
        boolean boolean6 = option3.hasArg();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option: a  :: null ]" + "'", str5, "[ option: a  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        char char16 = option4.getValueSeparator();
        java.lang.String[] strArray17 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '4' + "'", char16 == '4');
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.String str13 = option4.getValue("");
        boolean boolean14 = option4.hasOptionalArg();
        java.lang.String str15 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str10 = option9.getValue();
        java.lang.String str11 = option9.getOpt();
        java.lang.String str12 = option9.getKey();
        java.util.List list13 = option9.getValuesList();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        option18.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean21 = option18.hasValueSeparator();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean27 = option26.hasLongOpt();
        boolean boolean28 = option26.isRequired();
        option26.setArgName("hi!");
        option26.setArgs((int) (byte) 0);
        java.lang.String str33 = option26.getOpt();
        boolean boolean34 = option26.hasLongOpt();
        java.lang.String str36 = option26.getValue("");
        char char37 = option26.getValueSeparator();
        java.lang.Class<?> wildcardClass38 = option26.getClass();
        option18.setType((java.lang.Class) wildcardClass38);
        option9.setType((java.lang.Class) wildcardClass38);
        boolean boolean41 = option9.hasLongOpt();
        java.util.List list42 = option9.getValuesList();
        java.util.List list43 = option9.getValuesList();
        boolean boolean44 = option4.equals((java.lang.Object) option9);
        java.lang.String str45 = option4.getDescription();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\000' + "'", char37 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]", false, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        option4.setLongOpt("[ option:   [ARG...] ::  ]");
        boolean boolean13 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        boolean boolean8 = option2.acceptsArg();
        boolean boolean9 = option2.hasLongOpt();
        option2.setValueSeparator(' ');
        java.lang.String str12 = option2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:   ::  ]" + "'", str12, "[ option:   ::  ]");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option:    [ARG] :: [ option:   ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: [ option:   ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        char char19 = option4.getValueSeparator();
        java.lang.String str20 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        option4.setArgName("");
        java.lang.String str23 = option4.getOpt();
        int int24 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        boolean boolean9 = option4.hasArgName();
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class13 = null;
        option12.setType(class13);
        boolean boolean15 = option12.hasArg();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        option20.setRequired(false);
        boolean boolean24 = option20.hasArg();
        boolean boolean25 = option20.acceptsArg();
        java.lang.String str26 = option20.toString();
        java.lang.String str27 = option20.getKey();
        boolean boolean28 = option20.hasArg();
        java.lang.String str29 = option20.getDescription();
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean35 = option34.hasLongOpt();
        option34.setRequired(false);
        boolean boolean38 = option34.hasArg();
        boolean boolean39 = option34.acceptsArg();
        java.lang.String str40 = option34.toString();
        java.lang.String str41 = option34.getKey();
        boolean boolean42 = option34.hasArg();
        java.lang.String str43 = option34.getDescription();
        java.lang.String str44 = option34.getKey();
        java.lang.Class<?> wildcardClass45 = option34.getClass();
        option20.setType((java.lang.Class) wildcardClass45);
        option12.setType((java.lang.Class) wildcardClass45);
        option4.setType((java.lang.Class) wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str26, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str40, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.getType();
        option4.clearValues();
        java.lang.String str15 = option4.getValue("[ option:   [ARG...] ::  ]");
        java.lang.String str17 = option4.getValue((int) (short) 10);
        option4.setArgs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str15, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        option2.setArgName("[ option:    [ARG] ::  ]");
        boolean boolean7 = option2.hasArgs();
        java.lang.Object obj8 = option2.getType();
        java.lang.Object obj9 = null;
        boolean boolean10 = option2.equals(obj9);
        option2.setArgs((int) '4');
        option2.clearValues();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        java.util.List list15 = option4.getValuesList();
        java.lang.String str17 = option4.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str17, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        java.lang.String str11 = option4.getValue(1);
        option4.addValueForProcessing("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        boolean boolean6 = option2.hasLongOpt();
        boolean boolean7 = option2.isRequired();
        option2.setOptionalArg(false);
        java.lang.Class class10 = null;
        option2.setType(class10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        java.lang.String str7 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        option4.setValueSeparator('4');
        boolean boolean12 = option4.hasArgs();
        option4.setLongOpt("");
        java.lang.String[] strArray15 = option4.getValues();
        char char16 = option4.getValueSeparator();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '4' + "'", char16 == '4');
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        option4.setArgs(10);
        option4.setRequired(false);
        java.lang.String[] strArray23 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option:   :: a ]");
        option3.setArgName("[ option:    ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: a ]", false, "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        java.lang.String str10 = option4.getValue((int) (byte) 0);
        option4.setArgName("");
        char char13 = option4.getValueSeparator();
        java.lang.String str15 = option4.getValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.Class<?> wildcardClass16 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str15, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a   :: null ]", "[ option: a   :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a   :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.setArgs((int) (byte) -1);
        boolean boolean12 = option1.acceptsArg();
        java.lang.String str13 = option1.getOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        boolean boolean10 = option4.hasArg();
        java.lang.String str12 = option4.getValue("a");
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean18 = option17.hasLongOpt();
        option17.setRequired(false);
        boolean boolean21 = option17.requiresArg();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean27 = option26.hasLongOpt();
        option26.setRequired(false);
        boolean boolean30 = option26.hasArg();
        boolean boolean31 = option26.acceptsArg();
        boolean boolean32 = option26.hasLongOpt();
        java.lang.String[] strArray33 = option26.getValues();
        boolean boolean34 = option26.requiresArg();
        option26.setValueSeparator('4');
        boolean boolean37 = option26.hasArg();
        java.lang.String str38 = option26.getValue();
        java.lang.String str40 = option26.getValue("[ option:    [ARG] ::  ]");
        option26.setArgName("a");
        java.lang.String str43 = option26.getValue();
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean49 = option48.hasLongOpt();
        boolean boolean50 = option48.isRequired();
        option48.setArgName("hi!");
        java.lang.Class<?> wildcardClass53 = option48.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder54 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass53);
        org.apache.commons.cli.OptionBuilder optionBuilder55 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass53);
        option26.setType((java.lang.Class) wildcardClass53);
        option17.setType((java.lang.Class) wildcardClass53);
        option4.setType((java.lang.Class) wildcardClass53);
        boolean boolean59 = option4.acceptsArg();
        java.lang.Class<?> wildcardClass60 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder61 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str40, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(optionBuilder54);
        org.junit.Assert.assertNotNull(optionBuilder55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(optionBuilder61);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        org.apache.commons.cli.Option option7 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str9 = option7.getValue(1);
        boolean boolean10 = option1.equals((java.lang.Object) option7);
        // The following exception was thrown during execution in test generation
        try {
            option1.addValueForProcessing("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        boolean boolean17 = option4.hasArgs();
        boolean boolean18 = option4.isRequired();
        java.lang.Object obj19 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.util.List list9 = option4.getValuesList();
        java.lang.String str10 = option4.getValue();
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean16 = option15.hasLongOpt();
        option15.setRequired(false);
        boolean boolean19 = option15.hasArg();
        boolean boolean20 = option15.acceptsArg();
        boolean boolean21 = option15.hasLongOpt();
        boolean boolean22 = option15.hasLongOpt();
        java.lang.String str24 = option15.getValue((int) 'a');
        java.lang.String str25 = option15.getKey();
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean31 = option30.hasLongOpt();
        option30.setRequired(false);
        java.lang.String str34 = option30.getDescription();
        option30.setValueSeparator('a');
        option30.setValueSeparator(' ');
        java.lang.String[] strArray39 = option30.getValues();
        boolean boolean40 = option30.hasLongOpt();
        java.lang.Class<?> wildcardClass41 = option30.getClass();
        option15.setType((java.lang.Class) wildcardClass41);
        org.apache.commons.cli.OptionBuilder optionBuilder43 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass41);
        option4.setType((java.lang.Class) wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(optionBuilder43);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getValue();
        java.lang.Object obj13 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: a ]", "[ option: a  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean14 = option11.hasValueSeparator();
        java.lang.String str15 = option11.getValue();
        boolean boolean16 = option4.equals((java.lang.Object) option11);
        java.lang.String str18 = option11.getValue((int) '\000');
        option11.setRequired(false);
        java.lang.String str22 = option11.getValue(97);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        java.lang.String str35 = option1.toString();
        boolean boolean36 = option1.hasValueSeparator();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str35, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: a ]", "[ option:   :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        option4.setRequired(false);
        boolean boolean8 = option4.hasLongOpt();
        java.lang.String str10 = option4.getValue(10);
        boolean boolean11 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: null ]", "[ option: a   :: null ]", true, "[ option:    ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        option4.setArgs(100);
        boolean boolean12 = option4.hasArg();
        option4.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        java.lang.String str15 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        option25.setArgName("");
        boolean boolean50 = option25.hasLongOpt();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        java.lang.String str9 = option1.toString();
        java.lang.String str10 = option1.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "5) test1808(org.apache.commons.cli.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str9, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getOpt();
        java.lang.String[] strArray9 = option2.getValues();
        java.lang.String str10 = option2.getArgName();
        char char11 = option2.getValueSeparator();
        option2.clearValues();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        boolean boolean8 = option4.hasValueSeparator();
        java.lang.String str10 = option4.getValue("[ option:    [ARG] :: [ option:   ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] :: [ option:   ::  ] ]" + "'", str10, "[ option:    [ARG] :: [ option:   ::  ] ]");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.lang.String str10 = option4.toString();
        java.lang.Object obj11 = option4.getType();
        java.lang.String str12 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  ::  :: class org.apache.commons.cli.Option ]", "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.isRequired();
        java.lang.String str11 = option4.getArgName();
        boolean boolean12 = option4.acceptsArg();
        option4.setArgs(10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "");
        option3.clearValues();
        boolean boolean5 = option3.hasValueSeparator();
        java.lang.Object obj6 = option3.getType();
        boolean boolean7 = option3.hasArgName();
        option3.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String str12 = option4.getValue();
        option4.setArgs(0);
        java.lang.String str15 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", false, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        java.lang.Object obj18 = option2.getType();
        char char19 = option2.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        option1.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        option1.setArgName("hi!");
        boolean boolean13 = option1.hasArgs();
        boolean boolean14 = option1.hasValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.setArgs((int) (byte) -1);
        boolean boolean12 = option1.acceptsArg();
        int int13 = option1.getId();
        java.lang.Class<?> wildcardClass14 = option1.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        int int18 = option4.getArgs();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str17, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        option4.setArgs(100);
        boolean boolean12 = option4.hasArg();
        option4.setArgs(0);
        option4.setArgName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        boolean boolean4 = option1.acceptsArg();
        java.lang.String str6 = option1.getValue("hi!");
        boolean boolean7 = option1.hasArgName();
        boolean boolean8 = option1.hasLongOpt();
        option1.setArgs((-1));
        option1.setOptionalArg(false);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        java.lang.String str19 = option4.toString();
        option4.setArgName("[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str17, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '4' + "'", char18 == '4');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   :: a ]", false, "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getValue();
        boolean boolean5 = option3.hasArg();
        option3.clearValues();
        option3.clearValues();
        java.lang.String[] strArray8 = option3.getValues();
        java.lang.String str9 = option3.getKey();
        boolean boolean10 = option3.hasValueSeparator();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArg();
        java.util.List list13 = option4.getValuesList();
        option4.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        int int16 = option4.getArgs();
        java.lang.Object obj17 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: a ]", "[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", true, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean14 = option11.hasValueSeparator();
        java.lang.String str15 = option11.getValue();
        boolean boolean16 = option4.equals((java.lang.Object) option11);
        java.lang.String str17 = option11.getOpt();
        java.lang.String str18 = option11.getKey();
        int int19 = option11.getArgs();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        option4.setLongOpt("a");
        char char14 = option4.getValueSeparator();
        option4.clearValues();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]", "[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.Class class11 = null;
        option4.setType(class11);
        boolean boolean13 = option4.hasArg();
        boolean boolean14 = option4.isRequired();
        boolean boolean15 = option4.requiresArg();
        option4.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        boolean boolean25 = option4.hasArgs();
        option4.clearValues();
        option4.setDescription("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getValue();
        int int5 = option3.getArgs();
        option3.setArgName("[ option:    ::  ]");
        java.lang.Object obj8 = option3.getType();
        int int9 = option3.getArgs();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        option4.setRequired(false);
        boolean boolean8 = option4.hasLongOpt();
        java.lang.String str10 = option4.getValue(10);
        option4.setLongOpt("[ option:   ::  ]");
        java.lang.String str14 = option4.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option4.setArgName("[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str14, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        java.lang.String str15 = option4.getArgName();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        boolean boolean22 = option20.isRequired();
        option20.setArgName("hi!");
        java.lang.Class<?> wildcardClass25 = option20.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder26 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass25);
        option4.setType((java.lang.Class) wildcardClass25);
        option4.setValueSeparator('\000');
        java.lang.String[] strArray30 = option4.getValues();
        java.lang.String[] strArray31 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(optionBuilder26);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(strArray31);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.acceptsArg();
        java.lang.String str13 = option4.getLongOpt();
        option4.setArgs(0);
        java.lang.String str16 = option4.getLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            option4.addValueForProcessing("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Cannot add value, list full.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option2.setType((java.lang.Class) wildcardClass14);
        boolean boolean17 = option2.hasOptionalArg();
        java.util.List list18 = option2.getValuesList();
        boolean boolean19 = option2.requiresArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = option2.addValue("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        option9.setLongOpt("[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getValue();
        java.lang.String str5 = option3.getOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = option3.addValue("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        java.lang.String str67 = option15.getOpt();
        java.lang.String str68 = option15.getLongOpt();
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setArgName("hi!");
        java.lang.String str13 = option4.getKey();
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a   :: null ]", "[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a   :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        java.lang.Class<?> wildcardClass17 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String str12 = option4.getValue();
        option4.setArgs(0);
        java.lang.String str15 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        boolean boolean73 = option4.hasLongOpt();
        java.lang.String str74 = option4.getArgName();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str6 = option2.getArgName();
        java.lang.Object obj7 = option2.getType();
        java.lang.String str8 = option2.getOpt();
        java.lang.Class<?> wildcardClass9 = option2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.util.List list6 = option1.getValuesList();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", false, "");
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean17 = option16.hasLongOpt();
        boolean boolean18 = option16.isRequired();
        option16.setArgName("hi!");
        java.lang.Class<?> wildcardClass21 = option16.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder22 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass21);
        org.apache.commons.cli.OptionBuilder optionBuilder23 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass21);
        option11.setType((java.lang.Class) wildcardClass21);
        java.lang.String str25 = option11.getKey();
        java.lang.String[] strArray26 = option11.getValues();
        java.lang.String str27 = option11.getOpt();
        boolean boolean28 = option1.equals((java.lang.Object) str27);
        boolean boolean29 = option1.hasValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        boolean boolean16 = option4.hasValueSeparator();
        option4.setArgName("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getValue();
        java.lang.String str13 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        boolean boolean4 = option2.isRequired();
        java.lang.String str6 = option2.getValue("[ option:   [ARG...] ::  ]");
        boolean boolean7 = option2.isRequired();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('a');
        option9.setRequired(false);
        java.lang.String str12 = option9.getKey();
        int int13 = option9.getArgs();
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        option2.setType((java.lang.Class) wildcardClass14);
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str6, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder16);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "hi!", true, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.apache.commons.cli.Option option7 = new org.apache.commons.cli.Option("", "hi!");
        option7.setDescription("");
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean15 = option14.hasLongOpt();
        boolean boolean16 = option14.isRequired();
        option14.setArgName("hi!");
        java.lang.Class<?> wildcardClass19 = option14.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder20 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass19);
        option7.setType((java.lang.Class) wildcardClass19);
        org.apache.commons.cli.OptionBuilder optionBuilder22 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass19);
        option4.setType((java.lang.Class) wildcardClass19);
        option4.addValueForProcessing("[ option:    [ARG] :: [ option:   ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(optionBuilder20);
        org.junit.Assert.assertNotNull(optionBuilder22);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        option4.setLongOpt("");
        java.lang.String str12 = option4.getOpt();
        option4.addValueForProcessing("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        option4.setValueSeparator('4');
        boolean boolean17 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.getLongOpt();
        option4.setRequired(false);
        java.lang.String str14 = option4.getValue("[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]" + "'", str14, "[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        java.util.List list15 = option4.getValuesList();
        option4.setArgName("[ option: a  [ARG] :: a ]");
        option4.setArgName("[ option: a  :: a ]");
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]", "hi!", true, "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        java.lang.Object obj19 = option4.clone();
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[ option:    ::  ]");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        option4.setRequired(false);
        option4.setArgName("[ option:    [ARG] ::  ]");
        option4.clearValues();
        boolean boolean14 = option4.hasOptionalArg();
        boolean boolean15 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.String str5 = option3.getValue("[ option:   ::  ]");
        option3.setLongOpt("[ option:   :: a ]");
        java.lang.String str8 = option3.getDescription();
        option3.setArgs((int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   ::  ]" + "'", str5, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        char char13 = option4.getValueSeparator();
        boolean boolean14 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        java.lang.String str12 = option4.getLongOpt();
        option4.addValueForProcessing("");
        char char15 = option4.getValueSeparator();
        boolean boolean16 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '4' + "'", char15 == '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        option4.setRequired(false);
        java.lang.String str19 = option4.getValue((int) 'a');
        boolean boolean20 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        boolean boolean30 = option4.hasLongOpt();
        org.apache.commons.cli.Option option33 = new org.apache.commons.cli.Option("", "hi!");
        option33.setDescription("");
        java.lang.String str36 = option33.getOpt();
        java.lang.String str37 = option33.toString();
        java.lang.String str39 = option33.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean45 = option44.hasLongOpt();
        option44.setRequired(false);
        boolean boolean48 = option44.hasArg();
        boolean boolean49 = option44.acceptsArg();
        boolean boolean50 = option44.hasLongOpt();
        java.lang.String[] strArray51 = option44.getValues();
        boolean boolean52 = option44.requiresArg();
        option44.setValueSeparator('4');
        java.lang.String str56 = option44.getValue((int) (short) 100);
        java.lang.String str57 = option44.getOpt();
        org.apache.commons.cli.Option option62 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean63 = option62.hasLongOpt();
        option62.setRequired(false);
        boolean boolean66 = option62.hasArg();
        boolean boolean67 = option62.acceptsArg();
        boolean boolean68 = option62.hasLongOpt();
        option62.setOptionalArg(true);
        java.lang.Class<?> wildcardClass71 = option62.getClass();
        option44.setType((java.lang.Class) wildcardClass71);
        option33.setType((java.lang.Class) wildcardClass71);
        boolean boolean74 = option4.equals((java.lang.Object) wildcardClass71);
        org.apache.commons.cli.OptionBuilder optionBuilder75 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass71);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[ option:   ::  ]" + "'", str37, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str39, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(optionBuilder75);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        java.lang.String str8 = option1.getOpt();
        boolean boolean9 = option1.isRequired();
        java.lang.String str10 = option1.getValue();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "");
        org.apache.commons.cli.Option option7 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean8 = option7.hasLongOpt();
        option7.setRequired(false);
        boolean boolean11 = option7.hasArg();
        boolean boolean12 = option7.acceptsArg();
        boolean boolean13 = option7.hasLongOpt();
        java.lang.String[] strArray14 = option7.getValues();
        boolean boolean15 = option7.requiresArg();
        option7.setValueSeparator('4');
        boolean boolean18 = option7.hasArg();
        option7.clearValues();
        boolean boolean20 = option2.equals((java.lang.Object) option7);
        java.lang.String str21 = option7.getKey();
        option7.setLongOpt("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str13 = option4.getLongOpt();
        option4.setDescription("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        char char16 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        org.apache.commons.cli.Option option32 = new org.apache.commons.cli.Option("a", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.apache.commons.cli.Option option37 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean38 = option37.hasLongOpt();
        boolean boolean39 = option37.isRequired();
        java.lang.String str40 = option37.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder41 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean42 = option37.equals((java.lang.Object) optionBuilder41);
        java.lang.String str43 = option37.getArgName();
        java.lang.String str44 = option37.toString();
        boolean boolean45 = option37.isRequired();
        java.lang.Class<?> wildcardClass46 = option37.getClass();
        option32.setType((java.lang.Class) wildcardClass46);
        option25.setType((java.lang.Class) wildcardClass46);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str40, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str44, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.isRequired();
        option2.clearValues();
        option2.setValueSeparator('a');
        java.lang.Object obj13 = option2.clone();
        boolean boolean14 = option2.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.String str5 = option3.getValue("[ option:   ::  ]");
        option3.setLongOpt("[ option:   :: a ]");
        java.lang.String str8 = option3.getDescription();
        java.util.List list9 = option3.getValuesList();
        option3.setOptionalArg(true);
        boolean boolean12 = option3.hasOptionalArg();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   ::  ]" + "'", str5, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: a ]", "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        option4.setArgs(100);
        boolean boolean12 = option4.hasArg();
        boolean boolean13 = option4.isRequired();
        option4.setValueSeparator(' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str10 = option4.getKey();
        java.util.List list11 = option4.getValuesList();
        java.lang.String str12 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        option4.addValueForProcessing("[ option:   ::  ]");
        option4.setArgs((-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        boolean boolean8 = option2.acceptsArg();
        option2.setValueSeparator(' ');
        java.lang.String str12 = option2.getValue(0);
        option2.clearValues();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option:    [ARG] :: [ option:   ::  ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:   ::  ]", "\000", true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        boolean boolean12 = option4.hasArgName();
        boolean boolean13 = option4.hasValueSeparator();
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str2 = option1.getKey();
        option1.setArgName("");
        boolean boolean5 = option1.acceptsArg();
        option1.setValueSeparator('4');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "6) test1880(org.apache.commons.cli.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getOpt();
        option4.setLongOpt("a");
        java.lang.String str14 = option4.getValue("a");
        boolean boolean15 = option4.hasLongOpt();
        boolean boolean16 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        java.lang.String str13 = option2.getValue((int) (byte) -1);
        java.lang.String str15 = option2.getValue("[ option: a a  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option: a a  ::  ]" + "'", str15, "[ option: a a  ::  ]");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        java.util.List list10 = option4.getValuesList();
        option4.setOptionalArg(true);
        boolean boolean13 = option4.requiresArg();
        java.lang.Object obj14 = option4.clone();
        option4.setArgs((int) (byte) 1);
        option4.addValueForProcessing("\000");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str22 = option21.getValue();
        java.lang.String str23 = option21.getOpt();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", "", true, "");
        option28.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean31 = option28.hasValueSeparator();
        java.lang.String str32 = option28.getValue();
        boolean boolean33 = option21.equals((java.lang.Object) option28);
        boolean boolean34 = option28.hasArg();
        boolean boolean35 = option4.equals((java.lang.Object) option28);
        java.lang.String str36 = option4.getValue();
        java.lang.String str38 = option4.getValue("[ option: a  [ARG] :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = option4.addValue("\000");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str16, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[ option: a  [ARG] :: a ]" + "'", str38, "[ option: a  [ARG] :: a ]");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        java.lang.String str14 = option4.getValue("[ option:   :: a ]");
        java.lang.String str16 = option4.getValue((int) (byte) 100);
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        boolean boolean23 = option21.isRequired();
        java.lang.String str24 = option21.getOpt();
        option21.setLongOpt("hi!");
        option21.setValueSeparator('4');
        boolean boolean29 = option21.hasArgName();
        option21.setValueSeparator('4');
        java.lang.Class<?> wildcardClass32 = option21.getClass();
        option4.setType((java.lang.Class) wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:   :: a ]" + "'", str14, "[ option:   :: a ]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.isRequired();
        boolean boolean10 = option2.hasArgName();
        java.lang.String str12 = option2.getValue((int) '4');
        java.util.List list13 = option2.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        boolean boolean3 = option2.hasArgs();
        option2.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
        char char6 = option2.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        option4.addValueForProcessing("a");
        option4.setArgName("a");
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        option20.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean23 = option20.hasValueSeparator();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean29 = option28.hasLongOpt();
        boolean boolean30 = option28.isRequired();
        option28.setArgName("hi!");
        option28.setArgs((int) (byte) 0);
        java.lang.String str35 = option28.getOpt();
        boolean boolean36 = option28.hasLongOpt();
        java.lang.String str38 = option28.getValue("");
        char char39 = option28.getValueSeparator();
        java.lang.Class<?> wildcardClass40 = option28.getClass();
        option20.setType((java.lang.Class) wildcardClass40);
        org.apache.commons.cli.OptionBuilder optionBuilder42 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass40);
        option4.setType((java.lang.Class) wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\000' + "'", char39 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(optionBuilder42);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        boolean boolean25 = option4.requiresArg();
        java.util.List list26 = option4.getValuesList();
        boolean boolean27 = option4.hasArgName();
        java.util.List list28 = option4.getValuesList();
        boolean boolean29 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        option2.clearValues();
        boolean boolean4 = option2.hasArg();
        java.lang.String str5 = option2.getDescription();
        java.lang.Class<?> wildcardClass6 = option2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str5, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        java.lang.String str9 = option4.getValue("[ option: a  [ARG] :: a ]");
        boolean boolean10 = option4.isRequired();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: a  [ARG] :: a ]" + "'", str9, "[ option: a  [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        option4.setArgName("a");
        java.lang.String str14 = option4.getValue((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        java.lang.String str10 = option4.getValue((int) (byte) -1);
        option4.setValueSeparator(' ');
        java.lang.String str13 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   [ARG...] ::  ]", "\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   [ARG...] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.util.List list5 = option2.getValuesList();
        java.lang.Object obj6 = option2.getType();
        boolean boolean7 = option2.requiresArg();
        java.lang.String str8 = option2.getValue();
        option2.setValueSeparator('#');
        java.lang.String str12 = option2.getValue((int) '4');
        int int13 = option2.getArgs();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.hasArgName();
        option2.setArgs((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = option2.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.String str16 = option4.getValue("");
        option4.setArgName("[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        char char9 = option4.getValueSeparator();
        char char10 = option4.getValueSeparator();
        option4.setLongOpt("a");
        boolean boolean13 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        java.lang.String str16 = option4.getOpt();
        java.lang.String str17 = option4.getValue();
        option4.addValueForProcessing("[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        java.lang.String str22 = option4.getDescription();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a [ option:   ::  ]  :: a ]", "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ option:   ::  ]  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        boolean boolean10 = option4.hasArg();
        java.util.List list11 = option4.getValuesList();
        boolean boolean12 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        java.lang.Object obj4 = option2.getType();
        option2.setLongOpt("[ option: a  [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getLongOpt();
        int int7 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        boolean boolean19 = option4.hasValueSeparator();
        boolean boolean20 = option4.acceptsArg();
        java.lang.String str21 = option4.getKey();
        boolean boolean22 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.toString();
        option4.setRequired(true);
        option4.clearValues();
        org.apache.commons.cli.Option option15 = org.apache.commons.cli.OptionBuilder.create('a');
        option15.setRequired(false);
        java.lang.String str18 = option15.getLongOpt();
        int int19 = option15.getArgs();
        java.lang.String str21 = option15.getValue((int) (short) 10);
        option15.setOptionalArg(false);
        option15.setArgs((int) (byte) -1);
        boolean boolean26 = option4.equals((java.lang.Object) option15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = option4.addValue("[ option: a  :: a :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(option15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.getType();
        option2.setDescription("[ option:    [ARG] :: [ option:   ::  ] ]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "hi!");
        option19.setDescription("");
        java.lang.String str22 = option19.getDescription();
        java.lang.String str24 = option19.getValue((int) (byte) 100);
        java.util.List list25 = option19.getValuesList();
        boolean boolean26 = option19.hasLongOpt();
        option19.setOptionalArg(true);
        boolean boolean29 = option4.equals((java.lang.Object) true);
        boolean boolean30 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str16, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('\000');
        option1.setArgs((int) (short) 10);
        org.junit.Assert.assertNotNull(option1);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        boolean boolean22 = option1.acceptsArg();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str22 = option21.getValue();
        java.lang.String str23 = option21.getOpt();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", "", true, "");
        option28.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean31 = option28.hasValueSeparator();
        java.lang.String str32 = option28.getValue();
        boolean boolean33 = option21.equals((java.lang.Object) option28);
        boolean boolean34 = option28.hasArg();
        boolean boolean35 = option4.equals((java.lang.Object) option28);
        option28.setDescription("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        boolean boolean38 = option28.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str16, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        boolean boolean13 = option4.hasArgs();
        boolean boolean14 = option4.hasValueSeparator();
        boolean boolean15 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.util.List list9 = option4.getValuesList();
        java.lang.String str10 = option4.toString();
        boolean boolean11 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        option4.setValueSeparator(' ');
        boolean boolean7 = option4.hasArgs();
        option4.setDescription("[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "");
        option3.clearValues();
        boolean boolean5 = option3.hasValueSeparator();
        boolean boolean6 = option3.hasArgs();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean12 = option11.hasLongOpt();
        option11.setRequired(false);
        boolean boolean15 = option11.hasArg();
        boolean boolean16 = option11.acceptsArg();
        boolean boolean17 = option11.hasLongOpt();
        java.lang.String[] strArray18 = option11.getValues();
        boolean boolean19 = option11.requiresArg();
        option11.setValueSeparator('4');
        boolean boolean22 = option11.hasArg();
        java.lang.String str23 = option11.getValue();
        java.lang.String str25 = option11.getValue("[ option:    [ARG] ::  ]");
        java.lang.String str27 = option11.getValue((int) (byte) 1);
        org.apache.commons.cli.Option option32 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean33 = option32.hasLongOpt();
        option32.setRequired(false);
        boolean boolean36 = option11.equals((java.lang.Object) option32);
        java.lang.Class<?> wildcardClass37 = option11.getClass();
        option3.setType((java.lang.Class) wildcardClass37);
        option3.setArgName("[ option: a  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str25, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", "[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        option4.addValueForProcessing("[ option:    ::  ]");
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        boolean boolean16 = option4.hasArgName();
        java.lang.String str17 = option4.getArgName();
        boolean boolean18 = option4.requiresArg();
        boolean boolean19 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        java.lang.String str46 = option25.getDescription();
        boolean boolean47 = option25.acceptsArg();
        boolean boolean48 = option25.hasLongOpt();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        option4.setValueSeparator('#');
        boolean boolean14 = option4.acceptsArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = option4.addValue("[ option:   :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        boolean boolean19 = option4.hasOptionalArg();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        int int12 = option4.getArgs();
        java.lang.Object obj13 = option4.clone();
        java.lang.Class class14 = null;
        option4.setType(class14);
        java.lang.String[] strArray16 = option4.getValues();
        option4.addValueForProcessing("[ option:    [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("", "hi!");
        option6.setDescription("");
        java.lang.String str9 = option6.getDescription();
        java.lang.String str11 = option6.getValue((int) (byte) 100);
        boolean boolean12 = option6.acceptsArg();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean18 = option17.hasLongOpt();
        option17.setRequired(false);
        boolean boolean21 = option17.hasArg();
        boolean boolean22 = option17.acceptsArg();
        java.lang.String str23 = option17.toString();
        java.lang.String str24 = option17.getLongOpt();
        int int25 = option17.getArgs();
        java.lang.Object obj26 = option17.clone();
        boolean boolean27 = option6.equals((java.lang.Object) option17);
        java.lang.String str28 = option17.toString();
        boolean boolean29 = option17.isRequired();
        boolean boolean30 = option3.equals((java.lang.Object) boolean29);
        java.lang.String str31 = option3.getLongOpt();
        boolean boolean32 = option3.hasArg();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str23, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str28, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: a :: class org.apache.commons.cli.Option ]", false, "[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        java.lang.String str10 = option4.getValue((int) (byte) 0);
        option4.setArgName("");
        char char13 = option4.getValueSeparator();
        boolean boolean14 = option4.hasValueSeparator();
        boolean boolean15 = option4.hasOptionalArg();
        java.lang.Class<?> wildcardClass16 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        boolean boolean5 = option2.hasArgName();
        java.lang.String str6 = option2.getArgName();
        option2.setValueSeparator('a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        boolean boolean10 = option4.hasArgName();
        boolean boolean11 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getArgName();
        java.lang.String str13 = option4.getDescription();
        java.lang.String str15 = option4.getValue("[ option:   ::  ]");
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:   ::  ]" + "'", str15, "[ option:   ::  ]");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = option4.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        boolean boolean5 = option4.hasValueSeparator();
        java.lang.Object obj6 = option4.getType();
        java.lang.String str8 = option4.getValue(97);
        boolean boolean9 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        java.lang.String str12 = option4.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str13 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        boolean boolean4 = option2.isRequired();
        java.lang.String str6 = option2.getValue("[ option:   [ARG...] ::  ]");
        boolean boolean7 = option2.hasOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = option2.addValue("[ option:   ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str6, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   :: a ]", false, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", "[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option2.setType((java.lang.Class) wildcardClass14);
        boolean boolean17 = option2.hasOptionalArg();
        java.util.List list18 = option2.getValuesList();
        boolean boolean19 = option2.requiresArg();
        java.lang.String str20 = option2.getValue();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        option4.clearValues();
        java.lang.String str12 = option4.getValue("[ option: a  :: a ]");
        java.util.List list13 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option: a  :: a ]" + "'", str12, "[ option: a  :: a ]");
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        boolean boolean16 = option4.hasValueSeparator();
        boolean boolean17 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        // The following exception was thrown during execution in test generation
        try {
            int int58 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.String str5 = option3.getValue("[ option:   ::  ]");
        option3.setLongOpt("[ option:   :: a ]");
        java.lang.String str8 = option3.getDescription();
        java.util.List list9 = option3.getValuesList();
        java.lang.String str10 = option3.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   ::  ]" + "'", str5, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        option4.setValueSeparator('#');
        java.lang.Object obj15 = option4.clone();
        boolean boolean16 = option4.hasArgs();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        boolean boolean23 = option21.isRequired();
        java.lang.String str24 = option21.toString();
        option21.setRequired(true);
        java.lang.String str27 = option21.getArgName();
        option21.clearValues();
        boolean boolean29 = option21.acceptsArg();
        option21.setOptionalArg(true);
        boolean boolean32 = option4.equals((java.lang.Object) true);
        java.lang.String str33 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str24, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        java.lang.String str15 = option4.getValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.Object obj16 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str15, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("hi!", false, "[ option:   ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        boolean boolean15 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        boolean boolean8 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]", false, "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean23 = option22.hasLongOpt();
        boolean boolean24 = option22.isRequired();
        option22.setArgName("hi!");
        boolean boolean27 = option22.hasArg();
        java.lang.String str29 = option22.getValue(1);
        boolean boolean30 = option4.equals((java.lang.Object) option22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.setRequired(false);
        java.lang.String str11 = option4.getValue();
        char char12 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        boolean boolean17 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        java.lang.Object obj55 = option4.clone();
        java.lang.String str56 = option4.getValue();
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
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  hi!  :: [ option: a  [ARG] :: a ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.addValueForProcessing("a");
        java.lang.String str15 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        java.lang.String str9 = option4.getValue(0);
        int int10 = option4.getArgs();
        java.lang.String str12 = option4.getValue((int) ' ');
        boolean boolean13 = option4.hasOptionalArg();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        char char8 = option2.getValueSeparator();
        boolean boolean9 = option2.hasValueSeparator();
        java.lang.String str10 = option2.getDescription();
        java.lang.String str12 = option2.getValue((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.getType();
        option4.clearValues();
        option4.setArgName("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        option4.setValueSeparator('4');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        option4.setDescription("[ option:   :: a ]");
        char char30 = option4.getValueSeparator();
        java.lang.String str31 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        option4.clearValues();
        java.lang.String str19 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:   ::  ]", true, "a");
        java.util.List list5 = option4.getValuesList();
        boolean boolean6 = option4.hasOptionalArg();
        java.lang.Object obj7 = option4.getType();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.getType();
        option4.clearValues();
        java.lang.String str15 = option4.getValue("[ option:   [ARG...] ::  ]");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str15, "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]");
        boolean boolean3 = option2.isRequired();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean9 = option8.hasLongOpt();
        java.lang.String str10 = option8.getKey();
        boolean boolean11 = option8.hasArg();
        option8.setValueSeparator('#');
        boolean boolean14 = option2.equals((java.lang.Object) option8);
        java.lang.String[] strArray15 = option8.getValues();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        option4.setLongOpt("");
        boolean boolean15 = option4.hasOptionalArg();
        java.lang.String str16 = option4.getDescription();
        java.lang.Object obj17 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        java.lang.String str12 = option4.getOpt();
        java.lang.String str13 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        option4.setRequired(true);
        java.lang.String str20 = option4.getValue("[ option:    ::  ]");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ option:    ::  ]" + "'", str20, "[ option:    ::  ]");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        java.lang.String str14 = option4.getDescription();
        org.apache.commons.cli.Option option16 = org.apache.commons.cli.OptionBuilder.create('a');
        option16.setRequired(false);
        java.lang.String str19 = option16.getLongOpt();
        int int20 = option16.getArgs();
        java.lang.String str22 = option16.getValue((int) (short) 10);
        option16.setDescription("a");
        boolean boolean25 = option4.equals((java.lang.Object) "a");
        option4.setDescription("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        java.util.List list4 = option1.getValuesList();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", false, "");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option4.setType((java.lang.Class) wildcardClass14);
        java.lang.String str18 = option4.getKey();
        java.lang.String[] strArray19 = option4.getValues();
        boolean boolean20 = option4.hasArgs();
        java.lang.Object obj21 = option4.clone();
        java.lang.String str22 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNotNull(optionBuilder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ option:    ::  :: class org.apache.commons.cli.Option ]" + "'", str22, "[ option:    ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.isRequired();
        option4.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        option4.setArgName("");
        java.lang.String[] strArray17 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        boolean boolean17 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str12, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.hasOptionalArg();
        boolean boolean10 = option4.isRequired();
        option4.setValueSeparator('a');
        java.lang.Object obj13 = option4.getType();
        java.lang.Object obj14 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        int int9 = option4.getArgs();
        boolean boolean10 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        char char9 = option4.getValueSeparator();
        char char10 = option4.getValueSeparator();
        option4.setLongOpt("a");
        boolean boolean13 = option4.requiresArg();
        java.lang.Object obj14 = option4.getType();
        java.lang.Object obj15 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    ::  ]", "", true, "[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setArgName("hi!");
        option4.setLongOpt("a");
        boolean boolean15 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str11 = option4.getValue((int) '#');
        boolean boolean12 = option4.hasOptionalArg();
        boolean boolean13 = option4.requiresArg();
        boolean boolean14 = option4.hasOptionalArg();
        boolean boolean15 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    ::  ]", "[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", false, "[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        java.lang.String str10 = option4.getValue((int) (byte) 0);
        boolean boolean11 = option4.isRequired();
        java.lang.String str12 = option4.getDescription();
        java.lang.String[] strArray13 = option4.getValues();
        char char14 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        java.lang.String[] strArray13 = option4.getValues();
        boolean boolean14 = option4.hasLongOpt();
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        char char17 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + ' ' + "'", char17 == ' ');
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str11 = option4.getValue(1);
        option4.addValueForProcessing("hi!");
        java.lang.Object obj14 = option4.clone();
        boolean boolean15 = option4.hasArg();
        option4.setValueSeparator('\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        int int19 = option2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            option2.addValueForProcessing("[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        option4.setArgs((int) 'a');
        boolean boolean19 = option4.hasArgs();
        java.util.List list20 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        option4.setDescription("[ option:   :: a ]");
        char char30 = option4.getValueSeparator();
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        java.util.List list10 = option4.getValuesList();
        option4.setOptionalArg(false);
        java.lang.String str13 = option4.getOpt();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getValue();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        boolean boolean10 = option4.hasArg();
        char char11 = option4.getValueSeparator();
        java.lang.String str12 = option4.getDescription();
        option4.setArgName("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getArgName();
        option4.setArgName("[ option:   ::  ]");
        java.lang.String str12 = option4.getValue((int) ' ');
        option4.setValueSeparator('a');
        boolean boolean15 = option4.hasOptionalArg();
        boolean boolean16 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        boolean boolean12 = option4.hasArgName();
        boolean boolean13 = option4.isRequired();
        java.util.List list14 = option4.getValuesList();
        boolean boolean15 = option4.hasArgs();
        java.lang.String str16 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.clone();
        option2.setLongOpt("a");
        option2.setArgs((int) '4');
        option2.setOptionalArg(false);
        option2.setLongOpt("");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option: a  :: hi! ]");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        option4.setRequired(false);
        boolean boolean8 = option4.hasLongOpt();
        java.lang.String str10 = option4.getValue(10);
        java.lang.String str11 = option4.getLongOpt();
        java.lang.String str13 = option4.getValue("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]" + "'", str13, "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        option4.setLongOpt("");
        boolean boolean12 = option4.hasOptionalArg();
        java.lang.String str13 = option4.getDescription();
        java.lang.String str15 = option4.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        boolean boolean16 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str15, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: a ]", "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        java.lang.String str8 = option4.getLongOpt();
        java.lang.String str10 = option4.getValue("");
        java.lang.String str11 = option4.getKey();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean17 = option16.hasLongOpt();
        option16.setRequired(false);
        java.lang.String str20 = option16.getDescription();
        option16.setValueSeparator('a');
        boolean boolean23 = option16.hasValueSeparator();
        char char24 = option16.getValueSeparator();
        java.lang.String str26 = option16.getValue("hi!");
        java.lang.Object obj27 = option16.clone();
        boolean boolean28 = option4.equals((java.lang.Object) option16);
        option4.setDescription("[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + 'a' + "'", char24 == 'a');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((-1));
        boolean boolean10 = option6.equals((java.lang.Object) optionBuilder9);
        boolean boolean11 = option6.hasLongOpt();
        option6.clearValues();
        boolean boolean13 = option6.isRequired();
        java.lang.String str15 = option6.getValue((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("hi!", "", false, "[ option: a  :: a :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
