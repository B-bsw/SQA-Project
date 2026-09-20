package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setRequired(true);
        java.lang.String str14 = option4.getOpt();
        java.lang.Object obj15 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        boolean boolean15 = option4.equals((java.lang.Object) '#');
        boolean boolean16 = option4.isRequired();
        option4.setRequired(true);
        java.lang.String str19 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean12 = option4.hasArgName();
        java.lang.String str13 = option4.getArgName();
        boolean boolean14 = option4.hasOptionalArg();
        java.lang.String str15 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        boolean boolean30 = option4.hasArgName();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  hi!  :: [ option: a  [ARG] :: a ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = option2.addValue("[ option: a  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(52);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        option4.setRequired(false);
        boolean boolean8 = option4.hasLongOpt();
        java.lang.String str10 = option4.getValue((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        java.util.List list5 = option1.getValuesList();
        java.lang.Class<?> wildcardClass6 = option1.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   [ARG...] ::  ]", true, "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   [ARG...] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        java.lang.String str4 = option2.getValue("[ option:    [ARG] ::  ]");
        boolean boolean5 = option2.hasArgs();
        boolean boolean6 = option2.hasLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            option2.addValueForProcessing("[ option:   [ARG...] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: a ]", "[ option: a a  ::  ]", false, "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String[] strArray4 = option1.getValues();
        java.lang.String str5 = option1.getArgName();
        java.lang.String str6 = option1.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        option4.clearValues();
        java.lang.String str9 = option4.getLongOpt();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "", true, "");
        option14.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean17 = option14.hasValueSeparator();
        java.lang.String str18 = option14.getValue();
        java.lang.String[] strArray19 = option14.getValues();
        java.lang.String str20 = option14.getLongOpt();
        boolean boolean21 = option4.equals((java.lang.Object) str20);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str20, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean12 = option11.requiresArg();
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean16 = option11.equals((java.lang.Object) option15);
        java.lang.String str17 = option11.getKey();
        boolean boolean18 = option4.equals((java.lang.Object) str17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.toString();
        java.lang.String str10 = option4.getValue("[ option: a [ option:   ::  ]  :: a ]");
        java.util.List list11 = option4.getValuesList();
        option4.setValueSeparator('4');
        boolean boolean14 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str8, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str10, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = option2.addValue("[ option: a  [ARG] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        option2.setArgName("[ option:    [ARG] ::  ]");
        boolean boolean7 = option2.hasArgs();
        boolean boolean8 = option2.hasOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = option2.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        option4.setValueSeparator('4');
        boolean boolean12 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        java.lang.String str6 = option4.getOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = option4.addValue("[ option: a  [ARG] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   ::  ]", false, "[ option:   ::  ]");
        option4.setOptionalArg(false);
        java.lang.String str8 = option4.getValue(97);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.clearValues();
        boolean boolean13 = option4.hasArg();
        boolean boolean14 = option4.hasValueSeparator();
        option4.addValueForProcessing("hi!");
        boolean boolean17 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   ::  ]", false, "[ option:   ::  ]");
        java.lang.String str5 = option4.getArgName();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        char char13 = option4.getValueSeparator();
        boolean boolean14 = option4.hasArgName();
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean20 = option19.hasLongOpt();
        option19.setRequired(false);
        boolean boolean23 = option19.hasArg();
        boolean boolean24 = option19.acceptsArg();
        boolean boolean25 = option19.hasLongOpt();
        option19.setOptionalArg(true);
        java.lang.Class<?> wildcardClass28 = option19.getClass();
        option4.setType((java.lang.Class) wildcardClass28);
        option4.setLongOpt("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        boolean boolean14 = option4.isRequired();
        boolean boolean15 = option4.requiresArg();
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        int int34 = option1.getArgs();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        java.lang.Object obj13 = option4.clone();
        java.lang.String str14 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        option2.setValueSeparator('#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        java.lang.String str10 = option4.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = option4.addValue("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        java.lang.String[] strArray9 = option4.getValues();
        java.lang.String str10 = option4.getLongOpt();
        option4.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        java.util.List list5 = option1.getValuesList();
        java.lang.String str6 = option1.getLongOpt();
        option1.clearValues();
        // The following exception was thrown during execution in test generation
        try {
            option1.addValueForProcessing("[ option:   [ARG...] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = option4.addValue("a");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", false, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.hasLongOpt();
        option4.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str15 = option4.getValue();
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
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        java.lang.String[] strArray9 = option4.getValues();
        boolean boolean10 = option4.hasArgs();
        java.lang.Class<?> wildcardClass11 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        boolean boolean17 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        java.lang.String str18 = option4.getValue("[ option:    [ARG] ::  ]");
        boolean boolean19 = option4.hasArg();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        option2.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getValue();
        int int5 = option3.getArgs();
        option3.setArgName("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        boolean boolean13 = option4.hasArgName();
        java.lang.String str14 = option4.toString();
        boolean boolean15 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        option4.addValueForProcessing("[ option:   ::  ]");
        boolean boolean13 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        java.lang.String str12 = option4.getKey();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option: a  :: null ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str11 = option4.getValue(1);
        java.lang.String str12 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String[] strArray4 = option1.getValues();
        boolean boolean5 = option1.hasArgs();
        java.util.List list6 = option1.getValuesList();
        int int7 = option1.getId();
        option1.setArgs((int) ' ');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.clone();
        java.lang.String str7 = option2.getValue("");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean11 = option10.hasLongOpt();
        option10.setRequired(false);
        boolean boolean14 = option10.hasArg();
        boolean boolean15 = option10.acceptsArg();
        boolean boolean16 = option10.hasLongOpt();
        option10.setOptionalArg(true);
        java.lang.Object obj19 = option10.clone();
        org.apache.commons.cli.Option option21 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.Class<?> wildcardClass22 = option21.getClass();
        option10.setType((java.lang.Class) wildcardClass22);
        option1.setType((java.lang.Class) wildcardClass22);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(option21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: a ]", "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("hi!", "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", false, "[ option:   [ARG...] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   [ARG...] ::  ]", "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   [ARG...] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        boolean boolean16 = option4.isRequired();
        boolean boolean17 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.clone();
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: null ]", "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setRequired(true);
        java.lang.Class class14 = null;
        option4.setType(class14);
        java.lang.String str16 = option4.toString();
        java.lang.Object obj17 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:    ::  ]" + "'", str16, "[ option:    ::  ]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: a ]", "[ option:    [ARG] ::  ]", true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.Object obj4 = option3.clone();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[ option:   [ARG] :: a ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[ option:   [ARG] :: a ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[ option:   [ARG] :: a ]");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArg();
        option4.setValueSeparator('#');
        boolean boolean10 = option4.hasArgs();
        option4.addValueForProcessing("[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("a");
        java.lang.String str2 = option1.getOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getValue();
        boolean boolean8 = option4.hasLongOpt();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasOptionalArg();
        char char8 = option4.getValueSeparator();
        java.lang.Class<?> wildcardClass9 = option4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        boolean boolean18 = option4.hasArgs();
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        java.lang.String str13 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(97);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  ]", "[ option: a a  ::  ]", false, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        option4.setOptionalArg(false);
        java.lang.String str13 = option4.getLongOpt();
        java.lang.Object obj14 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        int int34 = option1.getId();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        // The following exception was thrown during execution in test generation
        try {
            option4.addValueForProcessing("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Cannot add value, list full.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        java.lang.String[] strArray13 = option4.getValues();
        boolean boolean14 = option4.hasLongOpt();
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean17 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option:   ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getDescription();
        option1.setValueSeparator('\000');
        option1.setDescription("");
        java.lang.String str12 = option1.toString();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option: a  ::  :: class org.apache.commons.cli.Option ]" + "'", str12, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: a ]", true, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        option4.setArgName("");
        java.lang.String str13 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.isRequired();
        boolean boolean11 = option4.hasArgs();
        boolean boolean12 = option4.hasArg();
        boolean boolean13 = option4.hasArgName();
        boolean boolean14 = option4.hasOptionalArg();
        java.lang.String str15 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  ]", "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        java.lang.String str9 = option4.getValue(0);
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        java.lang.String str12 = option4.getLongOpt();
        option4.setArgs(0);
        int int15 = option4.getArgs();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("a");
        boolean boolean2 = option1.acceptsArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = option1.addValue("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    ::  ]", "[ option: a  :: null :: class org.apache.commons.cli.Option ]", false, "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.toString();
        option4.setRequired(true);
        option4.setArgs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  hi!  :: [ option: a  [ARG] :: a ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        option2.setOptionalArg(false);
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
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getValue();
        java.lang.String str13 = option4.getKey();
        option4.setLongOpt("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        boolean boolean4 = option2.acceptsArg();
        java.lang.String[] strArray5 = option2.getValues();
        option2.setDescription("[ option:   :: a ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        option4.setValueSeparator('a');
        option4.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = option4.addValue("[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option: a  :: a ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        option4.setArgs((-1));
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
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.toString();
        option4.setRequired(true);
        option4.setArgs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getOpt();
        boolean boolean6 = option2.hasArgName();
        boolean boolean7 = option2.hasOptionalArg();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        java.lang.String str11 = option4.getValue(1);
        boolean boolean12 = option4.hasArg();
        java.lang.String str13 = option4.getArgName();
        char char14 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        char char20 = option4.getValueSeparator();
        boolean boolean21 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  ]", true, "[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.util.List list9 = option4.getValuesList();
        option4.setDescription("[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  ]", "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.util.List list5 = option2.getValuesList();
        boolean boolean6 = option2.hasArgs();
        option2.setArgs((int) 'a');
        option2.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        option2.setArgName("[ option: a a  ::  ]");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getKey();
        boolean boolean5 = option1.isRequired();
        boolean boolean6 = option1.hasArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   [ARG...] ::  ]", false, "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   [ARG...] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: a ]", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        option2.setValueSeparator('\000');
        option2.setLongOpt("[ option:   ::  ]");
        boolean boolean7 = option2.hasArg();
        // The following exception was thrown during execution in test generation
        try {
            option2.addValueForProcessing("[ option:    ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.isRequired();
        option4.setArgs((int) (byte) 1);
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option:    ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String str15 = option4.getValue("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]" + "'", str15, "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        boolean boolean14 = option4.isRequired();
        // The following exception was thrown during execution in test generation
        try {
            option4.addValueForProcessing("[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Cannot add value, list full.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        boolean boolean8 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        char char16 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '4' + "'", char16 == '4');
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getKey();
        java.util.List list8 = option4.getValuesList();
        java.lang.String str10 = option4.getValue((int) ' ');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.Object obj6 = option4.getType();
        boolean boolean7 = option4.hasArgName();
        option4.setDescription("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("hi!", true, "[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   [ARG...] ::  ]", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   [ARG...] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:   :: a ]", "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", true, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        option4.addValueForProcessing("[ option:   :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = option4.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: a ]", false, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        java.lang.String[] strArray9 = option4.getValues();
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getKey();
        boolean boolean12 = option4.hasArg();
        java.lang.String str14 = option4.getValue("a");
        java.lang.String str16 = option4.getValue("[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str16, "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        option4.setValueSeparator(' ');
        boolean boolean11 = option4.requiresArg();
        java.lang.String[] strArray12 = option4.getValues();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = option4.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", "", false, "[ option:    ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setLongOpt("[ option: a  [ARG] :: a ]");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        org.apache.commons.cli.Option option21 = org.apache.commons.cli.OptionBuilder.create('a');
        option21.setRequired(false);
        java.lang.String str24 = option21.getLongOpt();
        boolean boolean25 = option21.isRequired();
        java.lang.Class<?> wildcardClass26 = option21.getClass();
        option4.setType((java.lang.Class) wildcardClass26);
        boolean boolean28 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(option21);
// flaky "1) test0622(org.apache.commons.cli.RegressionTest1)":         org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String[] strArray12 = option4.getValues();
        java.util.List list13 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        option2.setArgName("[ option:   :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = option2.addValue("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.util.List list6 = option1.getValuesList();
        int int7 = option1.getId();
        boolean boolean8 = option1.hasArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        boolean boolean4 = option2.acceptsArg();
        java.lang.String[] strArray5 = option2.getValues();
        boolean boolean6 = option2.isRequired();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = option4.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        java.lang.String str8 = option4.getLongOpt();
        java.lang.String str10 = option4.getValue("");
        boolean boolean11 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", "hi!", true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  hi!  :: [ option: a  [ARG] :: a ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getOpt();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  ::  :: class org.apache.commons.cli.Option ]", "[ option:   [ARG...] ::  ]", false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  hi!  :: [ option: a  [ARG] :: a ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        java.lang.String[] strArray9 = option4.getValues();
        boolean boolean10 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = option2.addValue("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        boolean boolean20 = option4.acceptsArg();
        option4.setDescription("[ option:    ::  ]");
        java.lang.String str23 = option4.getKey();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = option4.getId();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:   ::  ]" + "'", str19, "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        java.lang.String str7 = option4.getArgName();
        option4.setOptionalArg(true);
        boolean boolean10 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:    ::  ]", true, "[ option: a  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        option4.addValueForProcessing("[ option:   ::  ]");
        java.lang.String str13 = option4.toString();
        java.lang.String str14 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str13, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:   ::  ]" + "'", str14, "[ option:   ::  ]");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        option2.setLongOpt("[ option:    ::  ]");
        java.lang.String str10 = option2.getKey();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        char char11 = option4.getValueSeparator();
        option4.setArgName("[ option: a  [ARG] :: a ]");
        option4.setArgName("[ option:   :: a ]");
        java.lang.String str17 = option4.getValue("[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str17, "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option4.setLongOpt("[ option:   :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = option4.addValue("[ option: a  :: null ]");
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
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        java.lang.String str7 = option4.getArgName();
        option4.setDescription("[ option: a  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.Class class11 = null;
        option4.setType(class11);
        char char13 = option4.getValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = option4.addValue("[ option:   [ARG...] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        int int7 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        java.lang.String str11 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean13 = option12.hasLongOpt();
        boolean boolean14 = option12.isRequired();
        option12.setArgName("hi!");
        option12.setArgs((int) (byte) 0);
        java.lang.String str19 = option12.getOpt();
        boolean boolean20 = option12.hasLongOpt();
        java.lang.String str22 = option12.getValue("");
        char char23 = option12.getValueSeparator();
        java.lang.Class<?> wildcardClass24 = option12.getClass();
        option4.setType((java.lang.Class) wildcardClass24);
        org.apache.commons.cli.OptionBuilder optionBuilder26 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass24);
        org.apache.commons.cli.OptionBuilder optionBuilder27 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(optionBuilder26);
        org.junit.Assert.assertNotNull(optionBuilder27);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.lang.String str29 = option4.getValue(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getDescription();
        int int8 = option1.getId();
        boolean boolean9 = option1.hasValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.lang.String str9 = option2.getValue((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   [ARG...] ::  ]", true, "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   [ARG...] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getOpt();
        boolean boolean6 = option2.hasArgName();
        java.util.List list7 = option2.getValuesList();
        boolean boolean8 = option2.hasArg();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean14 = option11.hasValueSeparator();
        java.lang.String str15 = option11.getValue();
        boolean boolean16 = option4.equals((java.lang.Object) option11);
        boolean boolean17 = option11.hasArg();
        java.lang.String str19 = option11.getValue((int) '#');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        char char9 = option4.getValueSeparator();
        char char10 = option4.getValueSeparator();
        option4.setLongOpt("a");
        boolean boolean13 = option4.requiresArg();
        java.lang.Object obj14 = option4.getType();
        boolean boolean15 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        java.lang.String str18 = option4.getArgName();
        java.lang.String str19 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = option4.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", "[ option: a  :: null ]", true, "[ option:   :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        boolean boolean20 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        boolean boolean23 = option4.isRequired();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        option4.setArgName("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
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
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        char char38 = option4.getValueSeparator();
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
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\000' + "'", char38 == '\000');
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        java.lang.String str18 = option4.getArgName();
        java.lang.Object obj19 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        option4.setDescription("[ option:    [ARG] ::  ]");
        boolean boolean19 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        boolean boolean3 = option2.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        option4.setValueSeparator('4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        char char15 = option4.getValueSeparator();
        java.lang.Class<?> wildcardClass16 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder17 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass16);
        org.apache.commons.cli.OptionBuilder optionBuilder18 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(optionBuilder17);
        org.junit.Assert.assertNotNull(optionBuilder18);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArg();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String str14 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", true, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.hasOptionalArg();
        boolean boolean10 = option4.isRequired();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        option4.setArgs(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   ::  ]", true, "[ option: a  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        option4.clearValues();
        java.lang.String str12 = option4.getOpt();
        java.lang.String str13 = option4.getValue();
        java.lang.String str15 = option4.getValue("[ option:   :: a ]");
        boolean boolean16 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:   :: a ]" + "'", str15, "[ option:   :: a ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        char char5 = option2.getValueSeparator();
        java.lang.String[] strArray6 = option2.getValues();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", false, "");
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean17 = option16.hasLongOpt();
        boolean boolean18 = option16.isRequired();
        option16.setArgName("hi!");
        java.lang.Class<?> wildcardClass21 = option16.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder22 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass21);
        org.apache.commons.cli.OptionBuilder optionBuilder23 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass21);
        option11.setType((java.lang.Class) wildcardClass21);
        option2.setType((java.lang.Class) wildcardClass21);
        option2.setDescription("");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(optionBuilder23);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", true, "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        option4.clearValues();
        java.lang.String[] strArray11 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        option4.setLongOpt("");
        java.lang.String str12 = option4.getOpt();
        boolean boolean13 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a a  ::  ]", true, "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", false, "");
        option4.clearValues();
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(52);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        boolean boolean11 = option4.hasArgName();
        option4.setValueSeparator('#');
        java.lang.String str14 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        boolean boolean16 = option4.hasOptionalArg();
        boolean boolean17 = option4.requiresArg();
        boolean boolean18 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        char char13 = option4.getValueSeparator();
        option4.setRequired(false);
        boolean boolean16 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        boolean boolean9 = option2.equals((java.lang.Object) 0.0f);
        boolean boolean10 = option2.hasArgName();
        boolean boolean11 = option2.acceptsArg();
        java.lang.Object obj12 = option2.clone();
        boolean boolean13 = option2.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:   :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:   :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:   :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        option4.setArgName("[ option:    [ARG] ::  ]");
        java.lang.String str14 = option4.getValue();
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        char char8 = option4.getValueSeparator();
        boolean boolean9 = option4.requiresArg();
        java.lang.String[] strArray10 = option4.getValues();
        java.lang.Object obj11 = option4.clone();
        option4.setLongOpt("");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.util.List list6 = option1.getValuesList();
        java.lang.Class<?> wildcardClass7 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
// flaky "2) test0690(org.apache.commons.cli.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        boolean boolean10 = option4.hasArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = option4.addValue("[ option:   [ARG...] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.Object obj7 = option4.getType();
        option4.setDescription("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        boolean boolean4 = option2.isRequired();
        java.lang.String str6 = option2.getValue("[ option:   [ARG...] ::  ]");
        boolean boolean7 = option2.isRequired();
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean13 = option12.hasLongOpt();
        boolean boolean14 = option12.isRequired();
        option12.setArgName("hi!");
        java.lang.Class<?> wildcardClass17 = option12.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder18 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass17);
        org.apache.commons.cli.OptionBuilder optionBuilder19 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass17);
        option2.setType((java.lang.Class) wildcardClass17);
        boolean boolean21 = option2.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str6, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(optionBuilder18);
        org.junit.Assert.assertNotNull(optionBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        java.lang.String str12 = option4.getArgName();
        org.apache.commons.cli.Option option14 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.Class<?> wildcardClass15 = option14.getClass();
        option4.setType((java.lang.Class) wildcardClass15);
        boolean boolean17 = option4.isRequired();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(option14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        boolean boolean3 = option2.hasArgs();
        java.lang.String str5 = option2.getValue("[ option: a a  ::  ]");
        java.lang.Class<?> wildcardClass6 = option2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option: a a  ::  ]" + "'", str5, "[ option: a a  ::  ]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        boolean boolean9 = option2.equals((java.lang.Object) 0.0f);
        boolean boolean10 = option2.hasArgName();
        boolean boolean11 = option2.acceptsArg();
        boolean boolean12 = option2.requiresArg();
        boolean boolean13 = option2.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        boolean boolean12 = option4.hasArgName();
        boolean boolean13 = option4.hasLongOpt();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "a");
        boolean boolean4 = option3.isRequired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", true, "[ option:    [ARG] ::  ]");
        boolean boolean5 = option4.isRequired();
        java.lang.Object obj6 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[ option:  [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]  [ARG] :: [ option:    [ARG] ::  ] ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[ option:  [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]  [ARG] :: [ option:    [ARG] ::  ] ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[ option:  [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]  [ARG] :: [ option:    [ARG] ::  ] ]");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        option4.clearValues();
        boolean boolean18 = option4.hasValueSeparator();
        boolean boolean19 = option4.requiresArg();
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "hi!");
        option22.setDescription("");
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean30 = option29.hasLongOpt();
        boolean boolean31 = option29.isRequired();
        option29.setArgName("hi!");
        java.lang.Class<?> wildcardClass34 = option29.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder35 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass34);
        option22.setType((java.lang.Class) wildcardClass34);
        option4.setType((java.lang.Class) wildcardClass34);
        java.lang.Class<?> wildcardClass38 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(optionBuilder35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getKey();
        boolean boolean8 = option4.requiresArg();
        java.lang.String str9 = option4.getValue();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        option4.setLongOpt("");
        java.lang.String[] strArray15 = option4.getValues();
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
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.lang.String str29 = option4.getValue((int) (short) 100);
        java.lang.Object obj30 = option4.clone();
        option4.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.toString();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str6, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        char char9 = option4.getValueSeparator();
        java.lang.String str10 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   [ARG...] ::  ]", false, "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   [ARG...] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        option4.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option4.addValueForProcessing("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a a  ::  ]", "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = option4.addValue("a");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getValue();
        boolean boolean5 = option3.hasArg();
        option3.clearValues();
        option3.clearValues();
        java.lang.String[] strArray8 = option3.getValues();
        java.util.List list9 = option3.getValuesList();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        java.lang.String str11 = option4.getOpt();
        option4.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = option4.addValue("[ option:   ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.isRequired();
        java.lang.String str9 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getKey();
        java.util.List list8 = option4.getValuesList();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", "", true, "");
        option13.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean16 = option13.hasValueSeparator();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        boolean boolean23 = option21.isRequired();
        option21.setArgName("hi!");
        option21.setArgs((int) (byte) 0);
        java.lang.String str28 = option21.getOpt();
        boolean boolean29 = option21.hasLongOpt();
        java.lang.String str31 = option21.getValue("");
        char char32 = option21.getValueSeparator();
        java.lang.Class<?> wildcardClass33 = option21.getClass();
        option13.setType((java.lang.Class) wildcardClass33);
        option4.setType((java.lang.Class) wildcardClass33);
        boolean boolean36 = option4.hasLongOpt();
        java.util.List list37 = option4.getValuesList();
        int int38 = option4.getArgs();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a [ option:   ::  ]  :: a ]", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ option:   ::  ]  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        org.apache.commons.cli.OptionBuilder optionBuilder23 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass21);
        org.apache.commons.cli.OptionBuilder optionBuilder24 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass21);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertNotNull(optionBuilder24);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        char char9 = option4.getValueSeparator();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String str12 = option4.getValue((int) '\000');
        boolean boolean13 = option4.isRequired();
        int int14 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        boolean boolean13 = option4.hasArgName();
        java.lang.String str14 = option4.toString();
        java.lang.String str16 = option4.getValue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    ::  ]" + "'", str14, "[ option:    ::  ]");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.toString();
        option4.setRequired(true);
        option4.clearValues();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        java.lang.String str20 = option18.getKey();
        option18.setLongOpt("[ option:    [ARG] ::  ]");
        option18.setRequired(false);
        java.lang.String str25 = option18.getValue();
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean31 = option30.hasLongOpt();
        boolean boolean32 = option30.isRequired();
        option30.setArgName("hi!");
        java.lang.Class<?> wildcardClass35 = option30.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder36 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass35);
        org.apache.commons.cli.OptionBuilder optionBuilder37 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass35);
        option18.setType((java.lang.Class) wildcardClass35);
        option4.setType((java.lang.Class) wildcardClass35);
        org.apache.commons.cli.OptionBuilder optionBuilder40 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(optionBuilder36);
        org.junit.Assert.assertNotNull(optionBuilder37);
        org.junit.Assert.assertNotNull(optionBuilder40);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  ]", false, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        option4.setLongOpt("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = option4.addValue("[ option:   [ARG...] ::  ]");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        java.lang.String str4 = option2.getValue("[ option:    [ARG] ::  ]");
        boolean boolean5 = option2.hasArgs();
        boolean boolean6 = option2.hasLongOpt();
        java.lang.String str7 = option2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:   :: hi! ]" + "'", str7, "[ option:   :: hi! ]");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option: a  :: null ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: a ]", false, "[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        boolean boolean16 = option4.hasOptionalArg();
        boolean boolean17 = option4.requiresArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = option4.addValue("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("hi!", false, "[ option: a  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        option4.setDescription("[ option:    [ARG] ::  ]");
        boolean boolean19 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:   ::  ]", true, "a");
        java.util.List list5 = option4.getValuesList();
        boolean boolean6 = option4.hasValueSeparator();
        char char7 = option4.getValueSeparator();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = option4.addValue("a");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        java.lang.String str17 = option4.getValue();
        option4.setRequired(true);
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("\000");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "hi!");
        option19.setDescription("");
        java.lang.String str22 = option19.getOpt();
        boolean boolean23 = option19.hasArg();
        boolean boolean24 = option19.hasArg();
        boolean boolean25 = option4.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        option4.setArgName("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:   :: a ]", "[ option: a  ::  :: class org.apache.commons.cli.Option ]", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str11 = option4.getValue((int) '#');
        boolean boolean12 = option4.hasOptionalArg();
        option4.addValueForProcessing("");
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        option4.setLongOpt("");
        boolean boolean12 = option4.hasOptionalArg();
        java.lang.String str13 = option4.getKey();
        boolean boolean14 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a [ option:   ::  ]  :: a ]", "[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ option:   ::  ]  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        char char9 = option4.getValueSeparator();
        char char10 = option4.getValueSeparator();
        option4.setLongOpt("a");
        int int13 = option4.getArgs();
        java.util.List list14 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.lang.String str20 = option4.getValue();
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
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        option4.addValueForProcessing("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 1);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        boolean boolean12 = option4.hasArgName();
        boolean boolean13 = option4.hasLongOpt();
        java.lang.String str14 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        boolean boolean8 = option4.hasArgName();
        option4.setArgName("a");
        int int11 = option4.getArgs();
        boolean boolean12 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getValue();
        int int5 = option3.getArgs();
        option3.setOptionalArg(true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        int int4 = option2.getArgs();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        java.lang.String str20 = option1.getArgName();
        org.junit.Assert.assertNotNull(option1);
// flaky "3) test0749(org.apache.commons.cli.RegressionTest1)":         org.junit.Assert.assertNull(str4);
// flaky "1) test0749(org.apache.commons.cli.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.String str5 = option3.getValue("[ option:   ::  ]");
        boolean boolean6 = option3.acceptsArg();
        boolean boolean7 = option3.hasArgs();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = option3.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   ::  ]" + "'", str5, "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   [ARG...] ::  ]", true, "[ option:   [ARG...] ::  ]");
        java.lang.String str6 = option4.getValue((int) '#');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getDescription();
        int int8 = option1.getId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = option1.addValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option: a  :: null ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", "[ option:   :: hi! ]", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   ::  ]", false, "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "a");
        boolean boolean4 = option3.hasOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = option3.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a a  ::  ]", "[ option:    ::  ]", true, "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        java.lang.String str18 = option11.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasArgName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = option4.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:   :: a ]", "[ option: a  ::  :: class org.apache.commons.cli.Option ]", false, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        option2.setOptionalArg(true);
        int int12 = option2.getArgs();
        boolean boolean13 = option2.acceptsArg();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        boolean boolean21 = option4.requiresArg();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        java.lang.String str4 = option2.getValue("[ option:    [ARG] ::  ]");
        boolean boolean5 = option2.isRequired();
        java.lang.Object obj6 = option2.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[ option:   :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[ option:   :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[ option:   :: hi! ]");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        char char5 = option2.getValueSeparator();
        java.lang.String[] strArray6 = option2.getValues();
        java.lang.String str8 = option2.getValue((-1));
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        org.apache.commons.cli.Option option23 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class24 = null;
        option23.setType(class24);
        boolean boolean26 = option23.hasArg();
        boolean boolean27 = option23.acceptsArg();
        java.lang.String str28 = option23.getLongOpt();
        boolean boolean29 = option23.hasLongOpt();
        boolean boolean30 = option23.hasOptionalArg();
        java.lang.String[] strArray31 = option23.getValues();
        boolean boolean32 = option4.equals((java.lang.Object) option23);
        boolean boolean33 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        boolean boolean21 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.util.List list5 = option2.getValuesList();
        boolean boolean6 = option2.hasArgs();
        option2.setArgs((int) 'a');
        option2.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str11 = option2.getLongOpt();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", true, "hi!");
        boolean boolean5 = option4.hasOptionalArg();
        int int6 = option4.getArgs();
        option4.addValueForProcessing("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        option4.setOptionalArg(false);
        option4.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(option16);
// flaky "4) test0771(org.apache.commons.cli.RegressionTest1)":         org.junit.Assert.assertNull(str19);
// flaky "2) test0771(org.apache.commons.cli.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
// flaky "1) test0771(org.apache.commons.cli.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "1) test0771(org.apache.commons.cli.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getArgName();
        java.lang.String str13 = option4.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str17 = option4.getValue();
        boolean boolean18 = option4.requiresArg();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "hi!");
        option21.setDescription("");
        java.lang.String str24 = option21.getOpt();
        java.lang.String str25 = option21.toString();
        java.lang.String str27 = option21.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Object obj28 = option21.clone();
        boolean boolean29 = option21.acceptsArg();
        boolean boolean30 = option4.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str17, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ option:   ::  ]" + "'", str25, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str27, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        option4.clearValues();
        java.lang.String str12 = option4.getOpt();
        java.lang.String str13 = option4.getValue();
        java.lang.String str15 = option4.getValue("[ option:   :: a ]");
        java.lang.String str16 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:   :: a ]" + "'", str15, "[ option:   :: a ]");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        option2.setValueSeparator('\000');
        java.lang.String str5 = option2.getOpt();
        option2.setLongOpt("[ option:   ::  ]");
        option2.setLongOpt("[ option: a a  ::  ]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.clone();
        option4.setRequired(true);
        java.lang.String str15 = option4.getDescription();
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
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        boolean boolean8 = option2.acceptsArg();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean14 = option13.hasLongOpt();
        option13.setRequired(false);
        boolean boolean17 = option13.hasArg();
        boolean boolean18 = option13.acceptsArg();
        java.lang.String str19 = option13.toString();
        java.lang.String str20 = option13.getLongOpt();
        int int21 = option13.getArgs();
        java.lang.Object obj22 = option13.clone();
        boolean boolean23 = option2.equals((java.lang.Object) option13);
        option2.setValueSeparator('\000');
        option2.setArgs(10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.String str3 = option1.getValue("[ option:   [ARG...] ::  ]");
        option1.setValueSeparator('\000');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str3, "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.clone();
        option4.setRequired(true);
        java.lang.String str15 = option4.getDescription();
        java.lang.Class<?> wildcardClass16 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        option4.setValueSeparator('\000');
        option4.setLongOpt("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.util.List list21 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        boolean boolean8 = option2.acceptsArg();
        option2.setValueSeparator(' ');
        java.lang.String str12 = option2.getValue(0);
        // The following exception was thrown during execution in test generation
        try {
            option2.addValueForProcessing("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        boolean boolean20 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        java.lang.String[] strArray19 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.requiresArg();
        option4.setLongOpt("a");
        option4.setOptionalArg(true);
        boolean boolean17 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:   :: hi! ]", "[ option:    [ARG] ::  ]", false, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        boolean boolean73 = option17.hasValueSeparator();
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   ::  ]", "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = option2.addValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean14 = option11.hasValueSeparator();
        java.lang.String str15 = option11.getValue();
        boolean boolean16 = option4.equals((java.lang.Object) option11);
        java.lang.String str17 = option11.getOpt();
        boolean boolean18 = option11.hasArg();
        boolean boolean19 = option11.hasArgs();
        char char20 = option11.getValueSeparator();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("\000", "\000");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        option4.setValueSeparator('4');
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
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:    ::  ]" + "'", str16, "[ option:    ::  ]");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        int int13 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setDescription("[ option:    ::  ]");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        char char11 = option4.getValueSeparator();
        option4.setArgName("[ option: a  [ARG] :: a ]");
        option4.setDescription("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        int int16 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        option4.clearValues();
        java.lang.String str9 = option4.getLongOpt();
        boolean boolean10 = option4.requiresArg();
        java.lang.String str11 = option4.getDescription();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", false, "[ option:   :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option:   ::  ]");
        java.lang.String str3 = option2.getValue();
        boolean boolean4 = option2.hasValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            option2.addValueForProcessing("[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        int int8 = option4.getArgs();
        java.lang.String str9 = option4.getValue();
        java.lang.Object obj10 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        java.lang.String str10 = option4.getValue();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setLongOpt("hi!");
        boolean boolean14 = option4.hasArgs();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "a");
        java.lang.String str4 = option3.toString();
        boolean boolean5 = option3.hasArg();
        option3.setArgName("[ option: a  :: a ]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:   :: a ]" + "'", str4, "[ option:   :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        option4.setLongOpt("");
        boolean boolean12 = option4.hasOptionalArg();
        java.lang.String str13 = option4.getDescription();
        java.lang.String str15 = option4.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String[] strArray16 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str15, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        option4.setValueSeparator(' ');
        java.lang.Object obj7 = option4.clone();
        java.lang.String str8 = option4.getValue();
        option4.setArgName("[ option:    [ARG] ::  ]");
        java.lang.String str11 = option4.getValue();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        boolean boolean16 = option4.hasOptionalArg();
        boolean boolean17 = option4.requiresArg();
        boolean boolean18 = option4.acceptsArg();
        java.lang.String str20 = option4.getValue("a");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a" + "'", str20, "a");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   :: hi! ]", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.String str5 = option3.getValue("[ option:   ::  ]");
        boolean boolean6 = option3.acceptsArg();
        java.lang.Object obj7 = option3.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   ::  ]" + "'", str5, "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[ option:   [ARG] :: a ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[ option:   [ARG] :: a ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[ option:   [ARG] :: a ]");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", false, "");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option4.setType((java.lang.Class) wildcardClass14);
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean23 = option22.hasLongOpt();
        option22.setRequired(false);
        boolean boolean26 = option22.hasArg();
        boolean boolean27 = option22.acceptsArg();
        boolean boolean28 = option22.hasLongOpt();
        option22.setOptionalArg(true);
        java.lang.Object obj31 = option22.clone();
        org.apache.commons.cli.Option option33 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.Class<?> wildcardClass34 = option33.getClass();
        option22.setType((java.lang.Class) wildcardClass34);
        option4.setType((java.lang.Class) wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNotNull(optionBuilder16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(option33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.toString();
        boolean boolean11 = option4.isRequired();
        option4.setArgName("[ option:   [ARG...] ::  ]");
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
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getArgName();
        java.lang.String str13 = option4.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = option4.addValue("[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        java.lang.String[] strArray9 = option4.getValues();
        java.lang.String str10 = option4.getLongOpt();
        java.lang.Object obj11 = option4.clone();
        option4.setOptionalArg(false);
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
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        java.lang.String str7 = option4.getArgName();
        option4.setOptionalArg(true);
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", true, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.getType();
        java.lang.Object obj13 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String str9 = option4.getLongOpt();
        boolean boolean10 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setRequired(true);
        java.lang.Class class14 = null;
        option4.setType(class14);
        java.lang.String str16 = option4.toString();
        java.lang.Class<?> wildcardClass17 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:    ::  ]" + "'", str16, "[ option:    ::  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a [ option:   ::  ]  :: a ]", "[ option: a  :: null :: class org.apache.commons.cli.Option ]", true, "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ option:   ::  ]  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getArgName();
        java.lang.String str6 = option2.getDescription();
        boolean boolean7 = option2.hasOptionalArg();
        java.lang.String str8 = option2.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:   ::  ]" + "'", str8, "[ option:   ::  ]");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str10 = option4.getArgName();
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setValueSeparator('\000');
        option4.clearValues();
        java.lang.String str15 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   ::  ]", true, "a");
        char char5 = option4.getValueSeparator();
        java.lang.Object obj6 = option4.getType();
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        java.lang.String str29 = option4.getValue((int) (short) 100);
        java.lang.String[] strArray30 = option4.getValues();
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strArray30);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        option2.setValueSeparator(' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("hi!", false, "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        option4.addValueForProcessing("[ option:   ::  ]");
        java.lang.String str15 = option4.getDescription();
        java.lang.Object obj16 = option4.clone();
        java.lang.String str17 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        boolean boolean59 = option4.requiresArg();
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.hasValueSeparator();
        option1.setValueSeparator('\000');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean3 = option2.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option: a  [ARG] :: a ]", false, "[ option:    [ARG] ::  ]");
        java.lang.String str6 = option4.getValue(10);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean14 = option11.hasValueSeparator();
        java.lang.String str15 = option11.getValue();
        boolean boolean16 = option4.equals((java.lang.Object) option11);
        java.lang.String str17 = option11.getOpt();
        boolean boolean18 = option11.hasArg();
        boolean boolean19 = option11.hasArgs();
        boolean boolean20 = option11.hasArgs();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   :: hi! ]", "[ option:   :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        boolean boolean10 = option4.hasArg();
        char char11 = option4.getValueSeparator();
        java.lang.String str12 = option4.getDescription();
        option4.setArgs((int) (short) 10);
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        java.lang.String str10 = option4.getValue((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:   :: a ]", "[ option:   :: hi! ]", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("\000");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setArgName("hi!");
        option4.setLongOpt("a");
        boolean boolean15 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        int int41 = option4.getArgs();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option:   :: a ]", false, "[ option:   [ARG...] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: null ]", "[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: a ]", false, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getKey();
        boolean boolean9 = option2.hasOptionalArg();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean15 = option14.hasLongOpt();
        option14.setRequired(false);
        boolean boolean18 = option14.hasArg();
        boolean boolean19 = option14.acceptsArg();
        boolean boolean20 = option14.hasLongOpt();
        java.lang.String[] strArray21 = option14.getValues();
        boolean boolean22 = option14.requiresArg();
        option14.setValueSeparator('4');
        java.lang.String str26 = option14.getValue((int) (short) 100);
        java.lang.String str27 = option14.getOpt();
        org.apache.commons.cli.Option option32 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean33 = option32.hasLongOpt();
        option32.setRequired(false);
        boolean boolean36 = option32.hasArg();
        boolean boolean37 = option32.acceptsArg();
        boolean boolean38 = option32.hasLongOpt();
        option32.setOptionalArg(true);
        java.lang.Class<?> wildcardClass41 = option32.getClass();
        option14.setType((java.lang.Class) wildcardClass41);
        option2.setType((java.lang.Class) wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.hasOptionalArg();
        boolean boolean10 = option2.hasLongOpt();
        java.lang.Class<?> wildcardClass11 = option2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(optionBuilder12);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.lang.String str18 = option4.getOpt();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = option4.getId();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: a ]", false, "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("hi!", true, "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setValueSeparator('\000');
        option4.addValueForProcessing("[ option: a  [ARG] :: a ]");
        boolean boolean16 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getOpt();
        java.lang.String str6 = option2.toString();
        java.lang.String str8 = option2.getValue((int) (short) 0);
        boolean boolean9 = option2.hasOptionalArg();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   ::  ]" + "'", str6, "[ option:   ::  ]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        boolean boolean12 = option4.hasArgName();
        java.lang.String str14 = option4.getValue((int) ' ');
        option4.setArgs(1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        java.lang.String str10 = option4.getValue((int) (byte) -1);
        option4.setValueSeparator(' ');
        java.lang.String str13 = option4.getOpt();
        java.lang.Class<?> wildcardClass14 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        int int12 = option4.getArgs();
        java.lang.String str13 = option4.getArgName();
        java.lang.String str14 = option4.getKey();
        boolean boolean15 = option4.isRequired();
        java.lang.String str17 = option4.getValue((-1));
        java.lang.String str18 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", true, "[ option:    [ARG] ::  ]");
        boolean boolean5 = option4.hasOptionalArg();
        java.lang.Class<?> wildcardClass6 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        char char11 = option4.getValueSeparator();
        option4.setArgName("[ option: a  [ARG] :: a ]");
        option4.setArgName("[ option:   :: a ]");
        char char16 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.lang.String str21 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: null :: class org.apache.commons.cli.Option ]", "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean16 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getLongOpt();
        java.lang.String str8 = option1.getLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            option1.addValueForProcessing("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.getType();
        option4.clearValues();
        option4.setLongOpt("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "hi!", false, "");
        boolean boolean5 = option4.hasArgs();
        // The following exception was thrown during execution in test generation
        try {
            option4.addValueForProcessing("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        boolean boolean12 = option4.hasArgName();
        java.lang.String str14 = option4.getValue((int) ' ');
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean18 = option17.requiresArg();
        boolean boolean19 = option17.isRequired();
        java.lang.String str21 = option17.getValue("[ option:   [ARG...] ::  ]");
        boolean boolean22 = option4.equals((java.lang.Object) str21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str21, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str17 = option4.getValue();
        boolean boolean18 = option4.requiresArg();
        boolean boolean19 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str17, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        option1.setLongOpt("");
        boolean boolean8 = option1.isRequired();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.lang.String str20 = option4.getValue("[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str20, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        java.lang.String str17 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        java.lang.String str21 = option7.getValue();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        boolean boolean30 = option1.requiresArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        boolean boolean19 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        boolean boolean16 = option4.hasOptionalArg();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        java.lang.String str23 = option21.getKey();
        boolean boolean24 = option21.hasArgs();
        java.lang.Class class25 = null;
        option21.setType(class25);
        java.lang.String str27 = option21.getValue();
        java.lang.String str28 = option21.getOpt();
        boolean boolean29 = option21.hasArgName();
        java.lang.Object obj30 = option21.clone();
        java.lang.Class<?> wildcardClass31 = option21.getClass();
        option4.setType((java.lang.Class) wildcardClass31);
        boolean boolean33 = option4.hasArgName();
        // The following exception was thrown during execution in test generation
        try {
            option4.addValueForProcessing("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Cannot add value, list full.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getOpt();
        java.lang.String str10 = option2.getValue((int) '#');
        option2.setOptionalArg(false);
        java.lang.String str13 = option2.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: null ]", "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String[] strArray12 = option4.getValues();
        java.lang.String str13 = option4.getOpt();
        java.lang.String str15 = option4.getValue("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]" + "'", str15, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str11 = option4.getValue((int) '#');
        java.lang.String str12 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setArgName("hi!");
        option4.setArgs(100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.lang.Class<?> wildcardClass34 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder35 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass34);
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
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(optionBuilder35);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        option4.setDescription("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean38 = option4.hasValueSeparator();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   [ARG...] ::  ]", "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   [ARG...] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  ::  :: class org.apache.commons.cli.Option ]", "[ option:   :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.String[] strArray12 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        char char8 = option4.getValueSeparator();
        boolean boolean9 = option4.requiresArg();
        java.lang.String[] strArray10 = option4.getValues();
        boolean boolean11 = option4.hasArg();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        org.apache.commons.cli.Option option21 = org.apache.commons.cli.OptionBuilder.create('a');
        option21.setRequired(false);
        java.lang.String str24 = option21.getLongOpt();
        int int25 = option21.getArgs();
        java.lang.String str27 = option21.getValue((int) (short) 10);
        option21.setOptionalArg(false);
        java.lang.String str31 = option21.getValue((int) (short) 0);
        boolean boolean32 = option1.equals((java.lang.Object) option21);
        java.lang.Object obj33 = option21.getType();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(option21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        option4.setArgs(35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((-1));
        boolean boolean10 = option6.equals((java.lang.Object) optionBuilder9);
        boolean boolean11 = option6.hasLongOpt();
        boolean boolean12 = option6.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        option4.setArgName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        int int12 = option4.getArgs();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("a", false, "");
        option16.clearValues();
        boolean boolean18 = option16.hasValueSeparator();
        boolean boolean19 = option16.hasArg();
        boolean boolean20 = option4.equals((java.lang.Object) option16);
        java.util.List list21 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   ::  ]", false, "[ option:   :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean3 = option2.hasArgName();
        boolean boolean4 = option2.isRequired();
        java.lang.Object obj5 = option2.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option: a  :: hi! ]");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        java.lang.String str11 = option4.getValue(1);
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        option2.setOptionalArg(true);
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
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str11 = option4.getValue(1);
        option4.addValueForProcessing("hi!");
        java.lang.Object obj14 = option4.clone();
        char char15 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.hasArgName();
        java.lang.Object obj10 = option4.getType();
        option4.setDescription("[ option: a  :: null ]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        java.lang.String str19 = option4.getDescription();
        java.util.List list20 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        char char11 = option4.getValueSeparator();
        option4.setArgName("[ option: a  [ARG] :: a ]");
        boolean boolean14 = option4.hasArgName();
        option4.setArgs(52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        java.lang.Object obj16 = option4.getType();
        option4.setArgs(1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        boolean boolean12 = option4.hasValueSeparator();
        option4.setRequired(false);
        boolean boolean15 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        java.lang.String[] strArray12 = option4.getValues();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = option4.addValue("[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.lang.Object obj31 = option4.clone();
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
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[ option:    ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        int int12 = option4.getArgs();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("a", false, "");
        option16.clearValues();
        boolean boolean18 = option16.hasValueSeparator();
        boolean boolean19 = option16.hasArg();
        boolean boolean20 = option4.equals((java.lang.Object) option16);
        java.lang.Class<?> wildcardClass21 = option16.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        option2.setValueSeparator('\000');
        java.lang.String str5 = option2.getOpt();
        option2.setLongOpt("[ option:   ::  ]");
        option2.setArgs((int) '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getOpt();
        java.lang.String str10 = option2.getValue((int) '#');
        option2.setOptionalArg(false);
        boolean boolean13 = option2.hasArgs();
        java.lang.String[] strArray14 = option2.getValues();
        java.lang.String str15 = option2.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", true, "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   :: a ]", true, "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", false, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        java.lang.String str27 = option13.getValue((-2));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = option13.addValue("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        boolean boolean21 = option4.hasLongOpt();
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
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = option2.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.hasValueSeparator();
        java.util.List list3 = option1.getValuesList();
        boolean boolean4 = option1.hasArgs();
        java.lang.String str6 = option1.getValue("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        option1.addValueForProcessing("[ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str6, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        char char9 = option4.getValueSeparator();
        char char10 = option4.getValueSeparator();
        option4.setLongOpt("a");
        java.lang.Object obj13 = option4.getType();
        boolean boolean14 = option4.hasArgs();
        java.lang.Class<?> wildcardClass15 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getArgName();
        java.lang.String str13 = option4.getDescription();
        int int14 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        boolean boolean13 = option4.hasArg();
        boolean boolean14 = option4.acceptsArg();
        java.lang.String[] strArray15 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.util.List list9 = option4.getValuesList();
        java.lang.String str10 = option4.toString();
        boolean boolean11 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a [ option:   ::  ]  :: a ]", "[ option:   ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ option:   ::  ]  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        java.util.List list15 = option4.getValuesList();
        java.lang.String str16 = option4.getDescription();
        option4.setLongOpt("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  hi!  :: [ option: a  [ARG] :: a ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setRequired(true);
        java.lang.String str14 = option4.getOpt();
        boolean boolean15 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        boolean boolean8 = option2.acceptsArg();
        option2.setValueSeparator(' ');
        java.lang.String str11 = option2.getValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        java.lang.String str10 = option4.getValue((int) (byte) 0);
        boolean boolean11 = option4.isRequired();
        boolean boolean12 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        boolean boolean10 = option4.hasArg();
        java.lang.String str12 = option4.getValue("");
        java.util.List list13 = option4.getValuesList();
        option4.setValueSeparator(' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getKey();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj18 = option17.clone();
        java.lang.String str19 = option17.getOpt();
        java.lang.String str20 = option17.toString();
        boolean boolean21 = option4.equals((java.lang.Object) str20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str20, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArg();
        java.util.List list13 = option4.getValuesList();
        option4.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean16 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.lang.Object obj18 = option11.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        option4.setDescription("[ option:    [ARG] ::  ]");
        java.lang.String str19 = option4.getLongOpt();
        char char20 = option4.getValueSeparator();
        boolean boolean21 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setDescription("[ option:   ::  ]");
        option4.setLongOpt("[ option:   ::  ]");
        option4.setLongOpt("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        option1.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean11 = option1.hasArgs();
        boolean boolean12 = option1.hasArgName();
        org.junit.Assert.assertNotNull(option1);
// flaky "5) test0929(org.apache.commons.cli.RegressionTest1)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.lang.String str18 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", false, "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        int int12 = option4.getArgs();
        java.lang.String str13 = option4.getArgName();
        boolean boolean14 = option4.isRequired();
        boolean boolean15 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  ::  :: class org.apache.commons.cli.Option ]", true, "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: null ]", false, "\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        java.lang.String[] strArray26 = option4.getValues();
        java.lang.String[] strArray27 = option4.getValues();
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
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(strArray27);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        option4.setValueSeparator(' ');
        java.lang.Object obj7 = option4.clone();
        java.lang.String str8 = option4.getValue();
        java.lang.String[] strArray9 = option4.getValues();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[ option: a [ option:    [ARG] ::  ]  :: hi! ]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean23 = option22.hasLongOpt();
        option22.setRequired(false);
        boolean boolean26 = option22.hasArg();
        boolean boolean27 = option22.acceptsArg();
        boolean boolean28 = option22.hasLongOpt();
        option22.setOptionalArg(true);
        java.lang.Class<?> wildcardClass31 = option22.getClass();
        option4.setType((java.lang.Class) wildcardClass31);
        org.apache.commons.cli.OptionBuilder optionBuilder33 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(optionBuilder33);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("\000");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getValue();
        java.lang.String str8 = option4.getLongOpt();
        boolean boolean9 = option4.isRequired();
        java.lang.String str10 = option4.getDescription();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   :: a ]", false, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        boolean boolean5 = option2.hasArg();
        boolean boolean6 = option2.acceptsArg();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.hasLongOpt();
        boolean boolean9 = option2.hasOptionalArg();
        boolean boolean10 = option2.hasLongOpt();
        java.lang.String str11 = option2.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String[] strArray12 = option4.getValues();
        java.lang.String str13 = option4.getOpt();
        option4.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean16 = option4.requiresArg();
        boolean boolean17 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option: a  :: a ]", false, "[ option:   [ARG...] ::  ]");
        char char5 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        option4.setArgName("[ option:   ::  ]");
        java.lang.String str19 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getKey();
        option2.setValueSeparator(' ');
        boolean boolean11 = option2.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", true, "[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        option2.setOptionalArg(true);
        char char5 = option2.getValueSeparator();
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        option4.setRequired(false);
        option4.setArgName("[ option:    [ARG] ::  ]");
        java.lang.String str13 = option4.getDescription();
        option4.setDescription("a");
        option4.clearValues();
        java.lang.Object obj17 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: a ]", "[ option: a  [ARG] :: a ]", false, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        java.lang.String str7 = option4.getArgName();
        char char8 = option4.getValueSeparator();
        java.lang.String str9 = option4.getDescription();
        option4.setArgName("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        int int17 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.toString();
        boolean boolean11 = option4.isRequired();
        option4.addValueForProcessing("a");
        option4.setOptionalArg(false);
        option4.setDescription("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str18 = option4.getArgName();
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.String str12 = option4.getLongOpt();
        java.lang.String str13 = option4.getValue();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        boolean boolean8 = option4.hasArgName();
        java.lang.String str10 = option4.getValue((int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.requiresArg();
        option4.setValueSeparator('4');
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str17 = option4.getArgName();
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean23 = option22.hasLongOpt();
        boolean boolean24 = option22.isRequired();
        option22.setArgName("hi!");
        option22.setArgs((int) (byte) 0);
        java.lang.String[] strArray29 = option22.getValues();
        int int30 = option22.getArgs();
        java.lang.Object obj31 = option22.clone();
        boolean boolean32 = option4.equals(obj31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = option2.addValue("[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        option2.clearValues();
        java.lang.String str5 = option2.getValue("[ option: a [ option:   ::  ]  :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = option2.addValue("a");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str5, "[ option: a [ option:   ::  ]  :: a ]");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setDescription("a");
        java.lang.String str14 = option4.getLongOpt();
        java.lang.String str15 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        boolean boolean13 = option4.hasArgName();
        java.lang.Object obj14 = option4.clone();
        boolean boolean15 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        boolean boolean8 = option4.hasArgName();
        option4.setArgName("a");
        option4.setDescription("[ option: a  :: a ]");
        java.lang.Object obj13 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        boolean boolean13 = option4.hasArgName();
        java.lang.String str14 = option4.getKey();
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   :: a ]", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option:   :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.util.List list5 = option2.getValuesList();
        java.lang.Object obj6 = option2.getType();
        boolean boolean7 = option2.hasArgName();
        java.lang.Object obj8 = option2.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[ option:   ::  ]");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        java.lang.String str18 = option4.getValue((int) '#');
        boolean boolean19 = option4.hasOptionalArg();
        java.lang.Object obj20 = option4.clone();
        java.lang.Class<?> wildcardClass21 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[ option:    ::  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasArgName();
        java.util.List list13 = option4.getValuesList();
        java.lang.Object obj14 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        option1.setValueSeparator('a');
        boolean boolean6 = option1.acceptsArg();
        boolean boolean7 = option1.acceptsArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        option4.setLongOpt("a");
        option4.setArgs(10);
        java.lang.String str17 = option4.getValue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getKey();
        int int5 = option1.getArgs();
        boolean boolean6 = option1.hasValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String[] strArray4 = option1.getValues();
        boolean boolean5 = option1.hasArgs();
        java.util.List list6 = option1.getValuesList();
        boolean boolean7 = option1.hasArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        char char9 = option4.getValueSeparator();
        java.lang.Object obj10 = option4.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("hi!", true, "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        java.lang.String[] strArray12 = option4.getValues();
        option4.setOptionalArg(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = option4.addValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        char char5 = option2.getValueSeparator();
        java.lang.String[] strArray6 = option2.getValues();
        java.lang.String str7 = option2.getLongOpt();
        boolean boolean8 = option2.isRequired();
        boolean boolean9 = option2.acceptsArg();
        java.lang.String str11 = option2.getValue("[ option: a  [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option: a  [ARG] :: a ]" + "'", str11, "[ option: a  [ARG] :: a ]");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = option4.addValue("[ option: a  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        option4.setDescription("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        boolean boolean18 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.String str3 = option1.getValue("[ option:   [ARG...] ::  ]");
        java.lang.Object obj4 = option1.getType();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str3, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.String str3 = option1.getValue("[ option:   [ARG...] ::  ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = option1.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str3, "[ option:   [ARG...] ::  ]");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(35);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        option2.setOptionalArg(false);
        option2.setArgName("[ option: a a  ::  ]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.toString();
        boolean boolean11 = option4.isRequired();
        option4.addValueForProcessing("a");
        java.lang.Object obj14 = option4.clone();
        java.lang.String str15 = option4.getOpt();
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
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getValue();
        java.lang.String str13 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        boolean boolean18 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", "[ option:   :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        option4.setArgName("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(option22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        int int6 = option1.getId();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        option4.setRequired(false);
        boolean boolean12 = option4.hasLongOpt();
        boolean boolean13 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", true, "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        java.lang.String str30 = option4.getOpt();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        boolean boolean4 = option1.hasLongOpt();
        boolean boolean5 = option1.hasArgs();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArg();
        java.util.List list13 = option4.getValuesList();
        option4.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        boolean boolean16 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getKey();
        java.util.List list8 = option4.getValuesList();
        option4.setRequired(false);
        option4.setDescription("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean13 = option4.hasArgs();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        java.lang.Class<?> wildcardClass14 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        boolean boolean13 = option4.hasArgName();
        boolean boolean14 = option4.isRequired();
        java.lang.String str15 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean12 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }
}
