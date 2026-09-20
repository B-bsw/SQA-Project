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
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        boolean boolean9 = option4.acceptsArg();
        option4.setDescription("[ option: a  [ARG] :: a ]");
        boolean boolean12 = option4.hasArg();
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getKey();
        boolean boolean12 = option4.hasArg();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        option4.setRequired(false);
        option4.setArgName("[ option:    [ARG] ::  ]");
        option4.setDescription("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean20 = option19.hasLongOpt();
        java.lang.Class class21 = null;
        option19.setType(class21);
        boolean boolean23 = option19.hasValueSeparator();
        option19.setOptionalArg(false);
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("a", false, "");
        option29.clearValues();
        boolean boolean31 = option29.hasValueSeparator();
        boolean boolean32 = option29.hasArgs();
        org.apache.commons.cli.Option option37 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean38 = option37.hasLongOpt();
        option37.setRequired(false);
        boolean boolean41 = option37.hasArg();
        boolean boolean42 = option37.acceptsArg();
        boolean boolean43 = option37.hasLongOpt();
        java.lang.String[] strArray44 = option37.getValues();
        boolean boolean45 = option37.requiresArg();
        option37.setValueSeparator('4');
        boolean boolean48 = option37.hasArg();
        java.lang.String str49 = option37.getValue();
        java.lang.String str51 = option37.getValue("[ option:    [ARG] ::  ]");
        java.lang.String str53 = option37.getValue((int) (byte) 1);
        org.apache.commons.cli.Option option58 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean59 = option58.hasLongOpt();
        option58.setRequired(false);
        boolean boolean62 = option37.equals((java.lang.Object) option58);
        java.lang.Class<?> wildcardClass63 = option37.getClass();
        option29.setType((java.lang.Class) wildcardClass63);
        org.apache.commons.cli.OptionBuilder optionBuilder65 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass63);
        option19.setType((java.lang.Class) wildcardClass63);
        option4.setType((java.lang.Class) wildcardClass63);
        java.lang.String str69 = option4.getValue((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str51, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(optionBuilder65);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        boolean boolean16 = option4.requiresArg();
        java.lang.String[] strArray17 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        boolean boolean6 = option2.hasLongOpt();
        boolean boolean7 = option2.isRequired();
        option2.clearValues();
        boolean boolean9 = option2.isRequired();
        java.lang.String str10 = option2.getOpt();
        option2.setDescription("");
        boolean boolean13 = option2.hasOptionalArg();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: a ]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str11 = option4.getValue(1);
        option4.addValueForProcessing("hi!");
        boolean boolean14 = option4.hasValueSeparator();
        java.lang.String str15 = option4.getDescription();
        option4.setArgName("[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        java.lang.String str10 = option4.getValue();
        option4.setValueSeparator(' ');
        java.lang.String str13 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        org.apache.commons.cli.OptionBuilder optionBuilder47 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass45);
        org.apache.commons.cli.OptionBuilder optionBuilder48 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass45);
        org.apache.commons.cli.OptionBuilder optionBuilder49 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass45);
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
        org.junit.Assert.assertNotNull(optionBuilder47);
        org.junit.Assert.assertNotNull(optionBuilder48);
        org.junit.Assert.assertNotNull(optionBuilder49);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        boolean boolean10 = option4.hasArgs();
        option4.setLongOpt("[ option: a a  ::  ]");
        java.lang.String str13 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option: a a  ::  ]" + "'", str13, "[ option: a a  ::  ]");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        boolean boolean19 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str18, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        java.lang.String str9 = option4.getValue(0);
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        java.lang.String str13 = option4.getValue(0);
        boolean boolean14 = option4.isRequired();
        java.lang.String str15 = option4.getKey();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str13, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "a");
        boolean boolean4 = option3.hasArgName();
        java.lang.Object obj5 = option3.getType();
        java.lang.String str6 = option3.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getOpt();
        java.lang.String str6 = option2.toString();
        java.lang.String str8 = option2.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str9 = option2.getValue();
        boolean boolean10 = option2.hasOptionalArg();
        java.lang.String str11 = option2.getKey();
        java.lang.Class<?> wildcardClass12 = option2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   ::  ]" + "'", str6, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str8, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        option2.setValueSeparator('\000');
        option2.setLongOpt("[ option:   ::  ]");
        boolean boolean7 = option2.hasLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = option2.addValue("[ option: a   :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.setRequired(false);
        java.lang.String[] strArray11 = option4.getValues();
        option4.setLongOpt("[ option:   ::  ]");
        boolean boolean14 = option4.hasValueSeparator();
        java.lang.Object obj15 = option4.getType();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        boolean boolean22 = option20.isRequired();
        option20.setArgName("hi!");
        option20.setArgs((int) (byte) 0);
        boolean boolean27 = option20.hasOptionalArg();
        boolean boolean28 = option20.hasArgs();
        option20.setValueSeparator('#');
        boolean boolean31 = option20.hasArgs();
        org.apache.commons.cli.Option option36 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean37 = option36.hasLongOpt();
        option36.setRequired(false);
        boolean boolean40 = option36.hasArg();
        boolean boolean41 = option36.acceptsArg();
        boolean boolean42 = option36.hasLongOpt();
        java.lang.String[] strArray43 = option36.getValues();
        boolean boolean44 = option36.requiresArg();
        boolean boolean45 = option36.isRequired();
        option36.setOptionalArg(false);
        char char48 = option36.getValueSeparator();
        org.apache.commons.cli.Option option53 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean54 = option53.hasLongOpt();
        boolean boolean55 = option53.isRequired();
        option53.setArgName("hi!");
        java.lang.Class<?> wildcardClass58 = option53.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder59 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass58);
        org.apache.commons.cli.OptionBuilder optionBuilder60 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass58);
        org.apache.commons.cli.OptionBuilder optionBuilder61 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass58);
        org.apache.commons.cli.OptionBuilder optionBuilder62 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass58);
        option36.setType((java.lang.Class) wildcardClass58);
        org.apache.commons.cli.OptionBuilder optionBuilder64 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass58);
        org.apache.commons.cli.OptionBuilder optionBuilder65 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass58);
        option20.setType((java.lang.Class) wildcardClass58);
        option4.setType((java.lang.Class) wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '\000' + "'", char48 == '\000');
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(optionBuilder59);
        org.junit.Assert.assertNotNull(optionBuilder60);
        org.junit.Assert.assertNotNull(optionBuilder61);
        org.junit.Assert.assertNotNull(optionBuilder62);
        org.junit.Assert.assertNotNull(optionBuilder64);
        org.junit.Assert.assertNotNull(optionBuilder65);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.requiresArg();
        boolean boolean12 = option4.hasOptionalArg();
        option4.setArgName("hi!");
        option4.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean17 = option4.hasLongOpt();
        boolean boolean18 = option4.requiresArg();
        boolean boolean19 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean14 = option13.hasLongOpt();
        option13.setRequired(false);
        boolean boolean17 = option13.hasArg();
        boolean boolean18 = option13.acceptsArg();
        boolean boolean19 = option13.hasLongOpt();
        java.lang.String[] strArray20 = option13.getValues();
        boolean boolean21 = option13.requiresArg();
        option13.setValueSeparator('4');
        boolean boolean24 = option13.hasArg();
        java.lang.String str25 = option13.getValue();
        java.lang.String str27 = option13.getValue("[ option:    [ARG] ::  ]");
        option13.setArgName("a");
        java.lang.String str30 = option13.getValue();
        org.apache.commons.cli.Option option35 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean36 = option35.hasLongOpt();
        boolean boolean37 = option35.isRequired();
        option35.setArgName("hi!");
        java.lang.Class<?> wildcardClass40 = option35.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder41 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass40);
        org.apache.commons.cli.OptionBuilder optionBuilder42 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass40);
        option13.setType((java.lang.Class) wildcardClass40);
        option4.setType((java.lang.Class) wildcardClass40);
        boolean boolean45 = option4.hasLongOpt();
        boolean boolean46 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str27, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(optionBuilder41);
        org.junit.Assert.assertNotNull(optionBuilder42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        option4.setLongOpt("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        boolean boolean23 = option4.hasLongOpt();
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
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str5 = option3.getValue("[ option: a  :: null ]");
        boolean boolean6 = option3.hasLongOpt();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option: a  :: null ]" + "'", str5, "[ option: a  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        java.lang.String str18 = option4.getLongOpt();
        java.lang.String str20 = option4.getValue("[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        boolean boolean8 = option2.acceptsArg();
        option2.setValueSeparator(' ');
        java.lang.String str12 = option2.getValue(0);
        boolean boolean13 = option2.hasLongOpt();
        option2.setValueSeparator(' ');
        java.lang.String str17 = option2.getValue(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.lang.String str10 = option4.toString();
        java.lang.Object obj11 = option4.getType();
        option4.clearValues();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean18 = option17.hasLongOpt();
        boolean boolean19 = option17.isRequired();
        boolean boolean20 = option17.hasArgName();
        java.lang.String str21 = option17.getArgName();
        java.lang.Object obj22 = option17.clone();
        java.lang.String str23 = option17.toString();
        option17.setRequired(true);
        option17.clearValues();
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean32 = option31.hasLongOpt();
        java.lang.String str33 = option31.getKey();
        option31.setLongOpt("[ option:    [ARG] ::  ]");
        option31.setRequired(false);
        java.lang.String str38 = option31.getValue();
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean44 = option43.hasLongOpt();
        boolean boolean45 = option43.isRequired();
        option43.setArgName("hi!");
        java.lang.Class<?> wildcardClass48 = option43.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder49 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass48);
        org.apache.commons.cli.OptionBuilder optionBuilder50 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass48);
        option31.setType((java.lang.Class) wildcardClass48);
        option17.setType((java.lang.Class) wildcardClass48);
        option4.setType((java.lang.Class) wildcardClass48);
        java.lang.String str54 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str23, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(optionBuilder49);
        org.junit.Assert.assertNotNull(optionBuilder50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]" + "'", str54, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.String str3 = option1.getValue("[ option:   [ARG...] ::  ]");
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean9 = option8.hasLongOpt();
        boolean boolean10 = option8.isRequired();
        boolean boolean11 = option8.hasArgName();
        java.lang.String str13 = option8.getValue("");
        option8.setLongOpt("[ option:    [ARG] ::  ]");
        java.lang.String str16 = option8.getDescription();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        boolean boolean23 = option21.isRequired();
        option21.setOptionalArg(false);
        java.lang.String[] strArray26 = option21.getValues();
        boolean boolean27 = option21.hasArg();
        java.lang.String str29 = option21.getValue("a");
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean35 = option34.hasLongOpt();
        option34.setRequired(false);
        boolean boolean38 = option34.requiresArg();
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean44 = option43.hasLongOpt();
        option43.setRequired(false);
        boolean boolean47 = option43.hasArg();
        boolean boolean48 = option43.acceptsArg();
        boolean boolean49 = option43.hasLongOpt();
        java.lang.String[] strArray50 = option43.getValues();
        boolean boolean51 = option43.requiresArg();
        option43.setValueSeparator('4');
        boolean boolean54 = option43.hasArg();
        java.lang.String str55 = option43.getValue();
        java.lang.String str57 = option43.getValue("[ option:    [ARG] ::  ]");
        option43.setArgName("a");
        java.lang.String str60 = option43.getValue();
        org.apache.commons.cli.Option option65 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean66 = option65.hasLongOpt();
        boolean boolean67 = option65.isRequired();
        option65.setArgName("hi!");
        java.lang.Class<?> wildcardClass70 = option65.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder71 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass70);
        org.apache.commons.cli.OptionBuilder optionBuilder72 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass70);
        option43.setType((java.lang.Class) wildcardClass70);
        option34.setType((java.lang.Class) wildcardClass70);
        option21.setType((java.lang.Class) wildcardClass70);
        boolean boolean76 = option8.equals((java.lang.Object) option21);
        boolean boolean77 = option1.equals((java.lang.Object) option21);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = option21.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str3, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "a" + "'", str29, "a");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str57, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(optionBuilder71);
        org.junit.Assert.assertNotNull(optionBuilder72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getValue();
        boolean boolean5 = option3.hasArg();
        option3.clearValues();
        option3.clearValues();
        java.lang.String[] strArray8 = option3.getValues();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('a');
        option10.setRequired(false);
        java.lang.String[] strArray13 = option10.getValues();
        boolean boolean14 = option10.hasArgs();
        java.lang.Class<?> wildcardClass15 = option10.getClass();
        option3.setType((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = option3.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setDescription("a");
        java.lang.String str14 = option4.getLongOpt();
        option4.setValueSeparator(' ');
        boolean boolean17 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str16 = option4.getValue(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        option4.addValueForProcessing("\000");
        option4.setRequired(false);
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
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   ::  ]", false, "[ option:   ::  ]");
        option4.setOptionalArg(false);
        option4.setOptionalArg(false);
        java.lang.String[] strArray9 = option4.getValues();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean15 = option14.hasLongOpt();
        boolean boolean16 = option14.isRequired();
        java.lang.String str17 = option14.toString();
        option14.setRequired(true);
        java.lang.String str20 = option14.getArgName();
        option14.clearValues();
        java.util.List list22 = option14.getValuesList();
        java.lang.String str23 = option14.getDescription();
        option14.clearValues();
        boolean boolean25 = option4.equals((java.lang.Object) option14);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str17, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        option4.setArgName("");
        boolean boolean20 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str17, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.requiresArg();
        option4.setRequired(true);
        java.lang.String str12 = option4.getArgName();
        boolean boolean13 = option4.hasArgs();
        boolean boolean14 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setDescription("[ option:   ::  ]");
        java.lang.String str14 = option4.getValue();
        java.lang.String str16 = option4.getValue((int) (short) 1);
        java.lang.String str17 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str10 = option4.getArgName();
        boolean boolean11 = option4.hasArgs();
        boolean boolean12 = option4.acceptsArg();
        boolean boolean13 = option4.hasArgs();
        boolean boolean14 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        option2.setArgName("[ option:    [ARG] ::  ]");
        boolean boolean7 = option2.hasArgs();
        boolean boolean8 = option2.hasOptionalArg();
        boolean boolean9 = option2.requiresArg();
        java.lang.Class<?> wildcardClass10 = option2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    ::  ]", "[ option: a  :: a ]", true, "[ option: a [ option:   ::  ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getValue();
        java.lang.String str13 = option4.getKey();
        option4.setValueSeparator(' ');
        boolean boolean16 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = option4.addValue("[ option:   ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        // The following exception was thrown during execution in test generation
        try {
            option4.addValueForProcessing("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Cannot add value, list full.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.getType();
        java.lang.String str14 = option4.getValue("[ option:    [ARG] ::  ]");
        option4.setOptionalArg(false);
        java.lang.String str17 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str17, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        boolean boolean11 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        boolean boolean2 = option1.hasArgs();
        option1.setValueSeparator(' ');
        option1.setLongOpt("\000");
        int int7 = option1.getArgs();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        java.lang.String str18 = option4.getValue("hi!");
        org.apache.commons.cli.Option option23 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean24 = option23.hasLongOpt();
        boolean boolean25 = option23.isRequired();
        option23.setArgName("hi!");
        option23.setArgs((int) (byte) 0);
        boolean boolean30 = option23.hasOptionalArg();
        boolean boolean31 = option23.hasArgs();
        boolean boolean32 = option23.isRequired();
        java.lang.String[] strArray33 = option23.getValues();
        java.lang.Class class34 = null;
        option23.setType(class34);
        java.lang.Class<?> wildcardClass36 = option23.getClass();
        option4.setType((java.lang.Class) wildcardClass36);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.getType();
        java.lang.String str14 = option4.getValue("[ option:    [ARG] ::  ]");
        option4.setOptionalArg(false);
        option4.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        java.lang.String str19 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        boolean boolean24 = option13.hasArg();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        java.lang.String[] strArray13 = option4.getValues();
        boolean boolean14 = option4.hasLongOpt();
        boolean boolean15 = option4.requiresArg();
        java.lang.String str16 = option4.toString();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        boolean boolean23 = option21.isRequired();
        java.lang.String str24 = option21.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder25 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean26 = option21.equals((java.lang.Object) optionBuilder25);
        java.lang.String str27 = option21.getArgName();
        java.lang.String str28 = option21.toString();
        boolean boolean29 = option21.isRequired();
        char char30 = option21.getValueSeparator();
        java.lang.Object obj31 = option21.clone();
        org.apache.commons.cli.Option option36 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean37 = option36.hasLongOpt();
        boolean boolean38 = option36.isRequired();
        option36.setArgName("hi!");
        java.lang.Class<?> wildcardClass41 = option36.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder42 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass41);
        option21.setType((java.lang.Class) wildcardClass41);
        option4.setType((java.lang.Class) wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str16, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str24, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str28, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(optionBuilder42);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:  [ARG...] :: hi! ]", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ARG...] :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        char char9 = option4.getValueSeparator();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String str12 = option4.getValue((int) '\000');
        boolean boolean13 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option:    [ARG] :: hi! ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        java.lang.String str21 = option4.getArgName();
        boolean boolean22 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str18, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        boolean boolean13 = option4.hasArg();
        java.lang.Object obj14 = option4.getType();
        boolean boolean15 = option4.hasValueSeparator();
        option4.setLongOpt("[ option: a  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        java.lang.String[] strArray13 = option4.getValues();
        boolean boolean14 = option4.hasLongOpt();
        boolean boolean15 = option4.requiresArg();
        boolean boolean16 = option4.hasArg();
        option4.addValueForProcessing("\000");
        boolean boolean19 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        java.lang.String[] strArray15 = option4.getValues();
        java.lang.String str17 = option4.getValue((int) (byte) -1);
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
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        boolean boolean16 = option4.hasLongOpt();
        char char17 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        boolean boolean3 = option2.hasArgs();
        option2.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean6 = option2.hasLongOpt();
        option2.setRequired(false);
        option2.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
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
        java.lang.String str19 = option7.toString();
        boolean boolean20 = option7.acceptsArg();
        java.lang.String str21 = option7.getKey();
        boolean boolean22 = option2.equals((java.lang.Object) option7);
        boolean boolean23 = option7.hasArgName();
        java.lang.String str24 = option7.getArgName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        boolean boolean10 = option4.hasOptionalArg();
        option4.setArgs((int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("hi!", "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        java.lang.String str10 = option2.getOpt();
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(0);
        boolean boolean13 = option2.equals((java.lang.Object) 0);
        java.lang.String[] strArray14 = option2.getValues();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        option4.setValueSeparator('#');
        boolean boolean15 = option4.hasArgs();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        option20.setRequired(false);
        boolean boolean24 = option20.hasArg();
        boolean boolean25 = option20.acceptsArg();
        boolean boolean26 = option20.hasLongOpt();
        java.lang.String[] strArray27 = option20.getValues();
        boolean boolean28 = option20.requiresArg();
        boolean boolean29 = option20.isRequired();
        option20.setOptionalArg(false);
        char char32 = option20.getValueSeparator();
        org.apache.commons.cli.Option option37 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean38 = option37.hasLongOpt();
        boolean boolean39 = option37.isRequired();
        option37.setArgName("hi!");
        java.lang.Class<?> wildcardClass42 = option37.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder43 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        org.apache.commons.cli.OptionBuilder optionBuilder44 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        org.apache.commons.cli.OptionBuilder optionBuilder45 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        org.apache.commons.cli.OptionBuilder optionBuilder46 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        option20.setType((java.lang.Class) wildcardClass42);
        org.apache.commons.cli.OptionBuilder optionBuilder48 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        org.apache.commons.cli.OptionBuilder optionBuilder49 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        option4.setType((java.lang.Class) wildcardClass42);
        java.lang.String str52 = option4.getValue((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(optionBuilder43);
        org.junit.Assert.assertNotNull(optionBuilder44);
        org.junit.Assert.assertNotNull(optionBuilder45);
        org.junit.Assert.assertNotNull(optionBuilder46);
        org.junit.Assert.assertNotNull(optionBuilder48);
        org.junit.Assert.assertNotNull(optionBuilder49);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.Object obj12 = option4.getType();
        java.lang.String str14 = option4.getValue("[ option:    [ARG] ::  ]");
        option4.setOptionalArg(false);
        boolean boolean17 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setArgName("hi!");
        option4.setArgName("");
        option4.setLongOpt("[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        option4.clearValues();
        java.lang.String str9 = option4.getLongOpt();
        boolean boolean10 = option4.requiresArg();
        int int11 = option4.getArgs();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        java.lang.String str10 = option4.getValue();
        boolean boolean11 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String[] strArray4 = option1.getValues();
        java.lang.String str5 = option1.getArgName();
        java.lang.String str6 = option1.getArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        java.lang.String[] strArray34 = option4.getValues();
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
        org.junit.Assert.assertNull(strArray34);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        option4.addValueForProcessing("[ option:   :: a ]");
        option4.setArgName("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option45 = new org.apache.commons.cli.Option("a", "[ option:   ::  ]", true, "a");
        java.util.List list46 = option45.getValuesList();
        boolean boolean47 = option45.hasArg();
        java.util.List list48 = option45.getValuesList();
        boolean boolean49 = option4.equals((java.lang.Object) list48);
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
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        char char20 = option2.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        java.lang.String str10 = option4.getValue((int) (byte) 0);
        boolean boolean11 = option4.isRequired();
        java.lang.String str12 = option4.getDescription();
        java.lang.String[] strArray13 = option4.getValues();
        java.lang.String str14 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        java.lang.Object obj20 = option4.getType();
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
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getKey();
        option4.setOptionalArg(false);
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean16 = option15.hasLongOpt();
        boolean boolean17 = option15.isRequired();
        option15.setArgName("hi!");
        option15.setArgs((int) (byte) 0);
        boolean boolean22 = option15.hasOptionalArg();
        boolean boolean23 = option15.hasArg();
        java.util.List list24 = option15.getValuesList();
        option15.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean32 = option31.hasLongOpt();
        java.lang.Class class33 = null;
        option31.setType(class33);
        boolean boolean35 = option31.hasValueSeparator();
        java.lang.String str37 = option31.getValue((int) (byte) -1);
        option31.setValueSeparator(' ');
        java.lang.String str40 = option31.getOpt();
        java.lang.Class<?> wildcardClass41 = option31.getClass();
        option15.setType((java.lang.Class) wildcardClass41);
        option4.setType((java.lang.Class) wildcardClass41);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = option4.addValue("[ option:    [ARG] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        boolean boolean19 = option4.hasValueSeparator();
        option4.setArgName("[ option: a a  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        char char9 = option4.getValueSeparator();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String str12 = option4.getValue((int) '\000');
        option4.setArgs((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        java.lang.String str10 = option4.toString();
        option4.setLongOpt("[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = option4.addValue("");
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
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        boolean boolean20 = option4.hasArg();
        java.lang.String str22 = option4.getValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", "hi!");
        option25.setDescription("");
        java.lang.String str28 = option25.getDescription();
        java.lang.String str30 = option25.getValue((int) (byte) 100);
        org.apache.commons.cli.Option option35 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean36 = option35.hasLongOpt();
        option35.setRequired(false);
        boolean boolean39 = option35.hasArg();
        boolean boolean40 = option35.acceptsArg();
        java.lang.String str41 = option35.toString();
        java.lang.String str42 = option35.getKey();
        boolean boolean43 = option35.hasArg();
        java.lang.String str44 = option35.getDescription();
        int int45 = option35.getArgs();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean51 = option50.hasLongOpt();
        java.lang.String str52 = option50.getKey();
        option50.setLongOpt("[ option:    [ARG] ::  ]");
        option50.setRequired(false);
        java.lang.String str57 = option50.getValue();
        org.apache.commons.cli.Option option62 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean63 = option62.hasLongOpt();
        boolean boolean64 = option62.isRequired();
        option62.setArgName("hi!");
        java.lang.Class<?> wildcardClass67 = option62.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder68 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass67);
        org.apache.commons.cli.OptionBuilder optionBuilder69 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass67);
        option50.setType((java.lang.Class) wildcardClass67);
        option35.setType((java.lang.Class) wildcardClass67);
        option25.setType((java.lang.Class) wildcardClass67);
        org.apache.commons.cli.OptionBuilder optionBuilder73 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass67);
        option4.setType((java.lang.Class) wildcardClass67);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str22, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str41, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(optionBuilder68);
        org.junit.Assert.assertNotNull(optionBuilder69);
        org.junit.Assert.assertNotNull(optionBuilder73);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   :: hi! ]", "[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        int int9 = option4.getArgs();
        option4.setOptionalArg(false);
        java.lang.String str12 = option4.getValue();
        boolean boolean13 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean22 = option21.hasLongOpt();
        boolean boolean23 = option21.isRequired();
        option21.setArgName("hi!");
        option21.setArgs((int) (byte) 0);
        boolean boolean28 = option21.hasOptionalArg();
        boolean boolean29 = option21.hasArg();
        java.util.List list30 = option21.getValuesList();
        option21.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option37 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean38 = option37.hasLongOpt();
        java.lang.Class class39 = null;
        option37.setType(class39);
        boolean boolean41 = option37.hasValueSeparator();
        java.lang.String str43 = option37.getValue((int) (byte) -1);
        option37.setValueSeparator(' ');
        java.lang.String str46 = option37.getOpt();
        java.lang.Class<?> wildcardClass47 = option37.getClass();
        option21.setType((java.lang.Class) wildcardClass47);
        option4.setType((java.lang.Class) wildcardClass47);
        boolean boolean50 = option4.hasValueSeparator();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", true, "hi!");
        boolean boolean5 = option4.hasOptionalArg();
        int int6 = option4.getArgs();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str12 = option11.getValue();
        java.lang.String str13 = option11.getOpt();
        java.lang.String str14 = option11.getValue();
        java.lang.String str15 = option11.getLongOpt();
        boolean boolean16 = option4.equals((java.lang.Object) str15);
        option4.clearValues();
        int int18 = option4.getId();
        boolean boolean19 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]", true, "[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.String str13 = option4.getValue((int) 'a');
        java.lang.String str14 = option4.toString();
        boolean boolean15 = option4.requiresArg();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.clearValues();
        java.lang.String str14 = option4.getValue("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        java.lang.String str15 = option4.getOpt();
        option4.addValueForProcessing("[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]" + "'", str14, "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        java.lang.Class<?> wildcardClass19 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder20 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(optionBuilder20);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        option4.clearValues();
        java.lang.String str12 = option4.getOpt();
        java.lang.String str13 = option4.getValue();
        java.lang.String[] strArray14 = option4.getValues();
        boolean boolean15 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        char char17 = option4.getValueSeparator();
        java.lang.String str19 = option4.getValue("\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '4' + "'", char17 == '4');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000" + "'", str19, "\000");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        option4.setArgs((int) (byte) -1);
        java.lang.String str20 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        boolean boolean19 = option4.requiresArg();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str13 = option4.toString();
        boolean boolean14 = option4.hasValueSeparator();
        java.lang.String str15 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:    ::  ]" + "'", str13, "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        char char5 = option2.getValueSeparator();
        java.lang.String str7 = option2.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        boolean boolean8 = option2.hasOptionalArg();
        option2.setDescription("[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str7, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        java.lang.String str21 = option4.getValue("[ option:   [ARG...] ::  ]");
        java.lang.Object obj22 = option4.getType();
        boolean boolean23 = option4.hasArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str21, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        boolean boolean4 = option1.acceptsArg();
        java.lang.String str6 = option1.getValue("hi!");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean10 = option9.requiresArg();
        java.lang.Object obj11 = option9.getType();
        boolean boolean12 = option1.equals((java.lang.Object) option9);
        java.lang.String str13 = option9.toString();
        java.lang.String str14 = option9.getOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:   :: hi! ]" + "'", str13, "[ option:   :: hi! ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = option4.getId();
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
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.Object obj5 = option2.getType();
        java.lang.Object obj6 = option2.clone();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[ option: a  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[ option: a  :: hi! ]");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.setRequired(false);
        java.lang.String[] strArray11 = option4.getValues();
        option4.setLongOpt("[ option:   ::  ]");
        java.lang.String str14 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:  [ option:   ::  ]  [ARG] ::  ]" + "'", str14, "[ option:  [ option:   ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        boolean boolean10 = option1.hasOptionalArg();
        char char11 = option1.getValueSeparator();
        java.lang.String[] strArray12 = option1.getValues();
        option1.setOptionalArg(false);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setDescription("a");
        java.lang.String str10 = option1.toString();
        java.lang.String str12 = option1.getValue("[ option:   ::  ]");
        java.lang.String str13 = option1.getValue();
        boolean boolean14 = option1.hasArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a  :: a ]" + "'", str10, "[ option: a  :: a ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:   ::  ]" + "'", str12, "[ option:   ::  ]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        int int20 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: a ]", "[ option: a [ option:    [ARG] :: hi! ]  :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        char char8 = option6.getValueSeparator();
        java.lang.String str9 = option6.getKey();
        java.lang.String str10 = option6.getLongOpt();
        boolean boolean11 = option6.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        option4.setArgs((-2));
        org.apache.commons.cli.Option option11 = org.apache.commons.cli.OptionBuilder.create('a');
        option11.setRequired(false);
        java.lang.String[] strArray14 = option11.getValues();
        boolean boolean15 = option11.hasArgs();
        java.lang.Class<?> wildcardClass16 = option11.getClass();
        option4.setType((java.lang.Class) wildcardClass16);
        char char18 = option4.getValueSeparator();
        java.lang.Object obj19 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class org.apache.commons.cli.Option");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        option4.setDescription("[ option:   [ARG...] ::  ]");
        java.lang.String str24 = option4.getValue("[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNotNull(optionBuilder16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]" + "'", str24, "[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]", false, "[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        boolean boolean19 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        option2.setOptionalArg(true);
        int int12 = option2.getArgs();
        boolean boolean13 = option2.hasArgs();
        boolean boolean14 = option2.hasArg();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "[ option:    ::  :: class org.apache.commons.cli.Option ]");
        int int4 = option3.getArgs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        boolean boolean11 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        char char9 = option4.getValueSeparator();
        int int10 = option4.getArgs();
        boolean boolean11 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        char char8 = option4.getValueSeparator();
        boolean boolean9 = option4.hasValueSeparator();
        option4.setArgs((int) (byte) 1);
        java.lang.Object obj12 = option4.clone();
        java.lang.String[] strArray13 = option4.getValues();
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
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "a");
        java.lang.String str4 = option3.toString();
        boolean boolean5 = option3.hasArg();
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean11 = option10.hasLongOpt();
        boolean boolean12 = option10.isRequired();
        option10.setArgName("hi!");
        option10.setArgs((int) (byte) 0);
        java.lang.String str17 = option10.getOpt();
        boolean boolean18 = option10.hasLongOpt();
        java.lang.String str20 = option10.getValue("");
        char char21 = option10.getValueSeparator();
        option10.setDescription("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        boolean boolean24 = option3.equals((java.lang.Object) "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        // The following exception was thrown during execution in test generation
        try {
            int int25 = option3.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:   :: a ]" + "'", str4, "[ option:   :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        java.lang.String str16 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        int int12 = option4.getArgs();
        java.lang.String str13 = option4.getArgName();
        boolean boolean14 = option4.isRequired();
        boolean boolean15 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        boolean boolean31 = option4.hasOptionalArg();
        java.lang.String str32 = option4.getOpt();
        java.lang.String str33 = option4.toString();
        java.lang.Object obj34 = option4.getType();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]" + "'", str33, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class org.apache.commons.cli.Option");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setValueSeparator('\000');
        option4.clearValues();
        option4.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String str12 = option4.getValue((int) (short) -1);
        java.lang.String str13 = option4.getKey();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.requiresArg();
        option4.setLongOpt("a");
        option4.setOptionalArg(true);
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((-1));
        boolean boolean10 = option6.equals((java.lang.Object) optionBuilder9);
        boolean boolean11 = option6.hasArgName();
        int int12 = option6.getArgs();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        java.lang.String str20 = option4.getValue((int) (byte) 100);
        boolean boolean21 = option4.isRequired();
        boolean boolean22 = option4.hasArgs();
        option4.setArgs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        boolean boolean18 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str16, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
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
        java.lang.String str19 = option7.toString();
        boolean boolean20 = option7.acceptsArg();
        java.lang.String str21 = option7.getKey();
        boolean boolean22 = option2.equals((java.lang.Object) option7);
        option2.clearValues();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        option2.clearValues();
        java.lang.String[] strArray4 = option2.getValues();
        java.lang.String[] strArray5 = option2.getValues();
        java.lang.String str6 = option2.getValue();
        java.lang.String str7 = option2.toString();
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]" + "'", str7, "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]", "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        option4.setLongOpt("[ option: a a  ::  ]");
        java.lang.Class<?> wildcardClass10 = option4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        java.lang.String str6 = option4.getValue();
        option4.setLongOpt("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean14 = option13.hasLongOpt();
        option13.setRequired(false);
        boolean boolean17 = option13.hasArg();
        boolean boolean18 = option13.acceptsArg();
        boolean boolean19 = option13.hasLongOpt();
        java.lang.String[] strArray20 = option13.getValues();
        boolean boolean21 = option13.requiresArg();
        java.lang.String[] strArray22 = option13.getValues();
        java.lang.String[] strArray23 = option13.getValues();
        option13.setDescription("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option13.setArgName("");
        boolean boolean28 = option13.hasValueSeparator();
        java.lang.String str29 = option13.getLongOpt();
        java.lang.String str31 = option13.getValue("");
        option13.setOptionalArg(false);
        boolean boolean34 = option4.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", true, "[ option:    [ARG] ::  ]");
        boolean boolean5 = option4.hasOptionalArg();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasOptionalArg();
        option4.setOptionalArg(false);
        option4.addValueForProcessing("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.addValueForProcessing("a");
        option4.setArgName("[ option: a  [ARG] :: a ]");
        java.lang.Object obj17 = option4.clone();
        option4.setDescription("[ option:    [ARG] ::  ]");
        option4.setDescription("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        boolean boolean22 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.setArgName("");
        java.lang.String str15 = option4.getOpt();
        boolean boolean16 = option4.requiresArg();
        java.lang.String str17 = option4.toString();
        char char18 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str17, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String[] strArray12 = option4.getValues();
        boolean boolean13 = option4.hasValueSeparator();
        java.lang.String str15 = option4.getValue("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        char char5 = option2.getValueSeparator();
        java.lang.String[] strArray6 = option2.getValues();
        java.lang.String str7 = option2.getLongOpt();
        java.util.List list8 = option2.getValuesList();
        java.lang.String str9 = option2.getLongOpt();
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a a  ::  ]", true, "[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArg();
        option4.setValueSeparator('#');
        boolean boolean10 = option4.hasArgs();
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean16 = option15.hasLongOpt();
        option15.setRequired(false);
        boolean boolean19 = option15.hasArg();
        boolean boolean20 = option15.acceptsArg();
        boolean boolean21 = option15.hasLongOpt();
        java.lang.String[] strArray22 = option15.getValues();
        boolean boolean23 = option15.requiresArg();
        java.lang.String[] strArray24 = option15.getValues();
        java.lang.String str25 = option15.getDescription();
        option15.setValueSeparator('a');
        boolean boolean28 = option15.hasArg();
        boolean boolean29 = option15.hasArgs();
        boolean boolean30 = option4.equals((java.lang.Object) option15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        option1.setLongOpt("");
        option1.setOptionalArg(false);
        java.lang.String[] strArray10 = option1.getValues();
        boolean boolean11 = option1.acceptsArg();
        java.lang.String str12 = option1.getValue();
        option1.setArgName("[ option: a  :: a ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray10);
// flaky "1) test2639(org.apache.commons.cli.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setDescription("");
        option1.setValueSeparator('a');
        java.lang.String str6 = option1.toString();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option: a  ::  ]" + "'", str6, "[ option: a  ::  ]");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean9 = option4.equals((java.lang.Object) optionBuilder8);
        java.lang.String str10 = option4.getArgName();
        java.lang.String str11 = option4.toString();
        boolean boolean12 = option4.requiresArg();
        java.lang.String str14 = option4.getValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str15 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str14, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        option11.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean14 = option11.hasValueSeparator();
        java.lang.String str15 = option11.getValue();
        boolean boolean16 = option4.equals((java.lang.Object) option11);
        java.lang.String str17 = option4.toString();
        option4.setValueSeparator('a');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str17, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getOpt();
        java.lang.String str6 = option2.toString();
        java.lang.String str8 = option2.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Object obj9 = option2.clone();
        boolean boolean10 = option2.acceptsArg();
        java.util.List list11 = option2.getValuesList();
        char char12 = option2.getValueSeparator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:   ::  ]" + "'", str6, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str8, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:   ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.Class<?> wildcardClass4 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass4);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "");
        option3.clearValues();
        boolean boolean5 = option3.hasValueSeparator();
        java.lang.Object obj6 = option3.getType();
        java.lang.String str7 = option3.getArgName();
        boolean boolean8 = option3.isRequired();
        java.lang.String str9 = option3.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str5 = option4.getKey();
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create('a');
        option7.setRequired(false);
        java.lang.String str10 = option7.getLongOpt();
        int int11 = option7.getArgs();
        java.util.List list12 = option7.getValuesList();
        boolean boolean13 = option4.equals((java.lang.Object) list12);
        java.lang.Object obj14 = option4.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        java.lang.String str8 = option1.getOpt();
        option1.clearValues();
        java.lang.String str10 = option1.getLongOpt();
        option1.setLongOpt("[ option:    [ARG] ::  ]");
        java.lang.String str13 = option1.getValue();
        java.lang.String str14 = option1.getLongOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.lang.String str10 = option4.getArgName();
        option4.clearValues();
        boolean boolean12 = option4.acceptsArg();
        option4.setOptionalArg(true);
        java.lang.String str15 = option4.toString();
        java.lang.String str16 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option: a  :: null :: class org.apache.commons.cli.Option ]", false, "[ option:  [ option:   ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        option4.setArgName("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        char char20 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        boolean boolean32 = option1.isRequired();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "a" + "'", str30, "a");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        int int5 = option4.getArgs();
        option4.setValueSeparator('a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        boolean boolean30 = option4.hasArgs();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setRequired(true);
        char char14 = option4.getValueSeparator();
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean20 = option19.hasLongOpt();
        java.lang.String str21 = option19.getKey();
        boolean boolean22 = option19.hasArgs();
        java.lang.Class class23 = null;
        option19.setType(class23);
        java.lang.String str26 = option19.getValue(1);
        option19.addValueForProcessing("hi!");
        boolean boolean29 = option19.hasArgs();
        java.lang.String str30 = option19.getArgName();
        boolean boolean31 = option4.equals((java.lang.Object) str30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        option4.addValueForProcessing("[ option:   :: a ]");
        boolean boolean11 = option4.hasOptionalArg();
        java.util.List list12 = option4.getValuesList();
        java.lang.Object obj13 = option4.clone();
        java.lang.Object obj14 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getOpt();
        java.lang.String str11 = option4.getLongOpt();
        java.lang.String str12 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.String str3 = option1.getValue("[ option:   [ARG...] ::  ]");
        java.lang.String[] strArray4 = option1.getValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str3, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        java.lang.String str10 = option4.toString();
        boolean boolean11 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option: a a  ::  ]");
        boolean boolean4 = option3.isRequired();
        option3.setLongOpt("[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.clearValues();
        java.lang.String str14 = option4.getValue("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        java.lang.String str16 = option4.getValue("[ option: a   :: null ]");
        java.lang.String str17 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]" + "'", str14, "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: a   :: null ]" + "'", str16, "[ option: a   :: null ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]", "[ option:    [ARG] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setArgName("hi!");
        java.lang.String str13 = option4.toString();
        option4.clearValues();
        boolean boolean15 = option4.isRequired();
        char char16 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str13, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.isRequired();
        option4.setValueSeparator('4');
        option4.setLongOpt("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str14 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        boolean boolean37 = option4.requiresArg();
        java.lang.Object obj38 = option4.getType();
        java.lang.Object obj39 = option4.getType();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        option4.setDescription("a");
        boolean boolean20 = option4.hasValueSeparator();
        option4.setArgs((int) (byte) 100);
        option4.setArgName("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setArgName("hi!");
        java.lang.String str13 = option4.getKey();
        boolean boolean14 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        option4.setArgName("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        option4.setOptionalArg(true);
        java.lang.Object obj23 = option4.getType();
        boolean boolean24 = option4.acceptsArg();
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
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.setRequired(false);
        java.lang.String[] strArray11 = option4.getValues();
        option4.setLongOpt("[ option:   ::  ]");
        boolean boolean14 = option4.hasValueSeparator();
        java.lang.Object obj15 = option4.getType();
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        option1.setDescription("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        option1.setArgName("hi!");
        boolean boolean13 = option1.hasArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        option4.setRequired(false);
        boolean boolean8 = option4.hasLongOpt();
        java.lang.String str10 = option4.getValue(10);
        java.lang.String str12 = option4.getValue("[ option: a  [ARG] :: a ]");
        java.lang.String str13 = option4.getKey();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        option18.setRequired(false);
        boolean boolean22 = option18.hasArg();
        boolean boolean23 = option18.acceptsArg();
        boolean boolean24 = option18.hasLongOpt();
        java.lang.String[] strArray25 = option18.getValues();
        boolean boolean26 = option18.requiresArg();
        java.lang.String[] strArray27 = option18.getValues();
        java.lang.String[] strArray28 = option18.getValues();
        option18.setArgs((-2));
        boolean boolean31 = option18.hasArg();
        java.lang.Object obj32 = option18.getType();
        boolean boolean33 = option18.hasArgs();
        org.apache.commons.cli.Option option38 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean39 = option38.hasLongOpt();
        option38.setRequired(false);
        boolean boolean42 = option38.hasArg();
        boolean boolean43 = option38.acceptsArg();
        boolean boolean44 = option38.hasLongOpt();
        java.lang.String[] strArray45 = option38.getValues();
        boolean boolean46 = option38.requiresArg();
        boolean boolean47 = option38.isRequired();
        option38.setOptionalArg(false);
        char char50 = option38.getValueSeparator();
        org.apache.commons.cli.Option option55 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean56 = option55.hasLongOpt();
        boolean boolean57 = option55.isRequired();
        option55.setArgName("hi!");
        java.lang.Class<?> wildcardClass60 = option55.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder61 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass60);
        org.apache.commons.cli.OptionBuilder optionBuilder62 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass60);
        org.apache.commons.cli.OptionBuilder optionBuilder63 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass60);
        org.apache.commons.cli.OptionBuilder optionBuilder64 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass60);
        option38.setType((java.lang.Class) wildcardClass60);
        option18.setType((java.lang.Class) wildcardClass60);
        option4.setType((java.lang.Class) wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option: a  [ARG] :: a ]" + "'", str12, "[ option: a  [ARG] :: a ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + '\000' + "'", char50 == '\000');
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(optionBuilder61);
        org.junit.Assert.assertNotNull(optionBuilder62);
        org.junit.Assert.assertNotNull(optionBuilder63);
        org.junit.Assert.assertNotNull(optionBuilder64);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        boolean boolean30 = option4.hasValueSeparator();
        boolean boolean31 = option4.hasLongOpt();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasArg();
        java.lang.String str11 = option4.getKey();
        boolean boolean12 = option4.hasOptionalArg();
        java.util.List list13 = option4.getValuesList();
        char char14 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        boolean boolean17 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        java.lang.String str8 = option2.getKey();
        option2.setValueSeparator(' ');
        option2.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String[] strArray6 = option2.getValues();
        java.lang.String str8 = option2.getValue("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        boolean boolean9 = option2.hasLongOpt();
        java.lang.String str10 = option2.getKey();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]" + "'", str8, "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getValue();
        boolean boolean11 = option4.hasArgName();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str13 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        char char13 = option4.getValueSeparator();
        boolean boolean14 = option4.requiresArg();
        option4.setDescription("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getLongOpt();
        java.lang.String str7 = option4.getArgName();
        option4.setLongOpt("[ option: a  :: a :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        java.lang.Object obj19 = option4.clone();
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.setArgName("");
        java.lang.String str15 = option4.getOpt();
        boolean boolean16 = option4.requiresArg();
        java.lang.String str17 = option4.toString();
        int int18 = option4.getArgs();
        java.lang.String str19 = option4.getKey();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = option4.addValue("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str17, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        boolean boolean8 = option4.isRequired();
        option4.setArgName("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        java.lang.String str11 = option4.getArgName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]" + "'", str11, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getLongOpt();
        java.lang.String str9 = option4.getArgName();
        boolean boolean10 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        java.lang.String str12 = option4.getOpt();
        java.lang.Class<?> wildcardClass13 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(optionBuilder14);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        boolean boolean17 = option4.hasArgName();
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean23 = option22.hasLongOpt();
        boolean boolean24 = option22.isRequired();
        option22.setArgName("hi!");
        option22.setArgs((int) (byte) 0);
        java.lang.String str29 = option22.getOpt();
        boolean boolean30 = option22.hasLongOpt();
        java.lang.String str32 = option22.getValue("");
        char char33 = option22.getValueSeparator();
        java.lang.Class<?> wildcardClass34 = option22.getClass();
        option4.setType((java.lang.Class) wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getDescription();
        int int8 = option1.getId();
        java.lang.String str9 = option1.getArgName();
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
        option1.setType((java.lang.Class) wildcardClass41);
        java.lang.String str44 = option1.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "a" + "'", str44, "a");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        java.lang.String str4 = option2.getValue("[ option:    [ARG] ::  ]");
        boolean boolean5 = option2.hasArgs();
        boolean boolean6 = option2.hasLongOpt();
        option2.setArgs(0);
        option2.setArgs(1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        java.lang.String str21 = option4.getValue("[ option:   [ARG...] ::  ]");
        java.lang.Object obj22 = option4.getType();
        java.lang.String str24 = option4.getValue("[ option: a [ option:    [ARG] :: hi! ]  :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str21, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ option: a [ option:    [ARG] :: hi! ]  :: a ]" + "'", str24, "[ option: a [ option:    [ARG] :: hi! ]  :: a ]");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.addValueForProcessing("a");
        option4.setArgName("[ option: a  [ARG] :: a ]");
        java.lang.Object obj17 = option4.clone();
        option4.setDescription("[ option:    [ARG] ::  ]");
        option4.setDescription("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str22 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setDescription("a");
        java.lang.String str10 = option1.toString();
        option1.setRequired(false);
        option1.setRequired(false);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a [ARG...] :: a ]" + "'", str10, "[ option: a [ARG...] :: a ]");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        java.lang.String str13 = option4.getValue();
        java.lang.String str14 = option4.getDescription();
        java.lang.Object obj15 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String[] strArray12 = option4.getValues();
        java.lang.String str13 = option4.getOpt();
        option4.setArgName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setOptionalArg(false);
        option1.setArgs((int) (byte) -1);
        boolean boolean12 = option1.acceptsArg();
        java.lang.String str13 = option1.toString();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option: a  :: null ]" + "'", str13, "[ option: a  :: null ]");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.lang.String str10 = option4.getArgName();
        option4.clearValues();
        boolean boolean12 = option4.acceptsArg();
        option4.setOptionalArg(true);
        java.lang.String str15 = option4.toString();
        java.lang.String str16 = option4.getOpt();
        int int17 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getKey();
        java.util.List list8 = option4.getValuesList();
        java.lang.String str9 = option4.getArgName();
        java.lang.String str11 = option4.getValue(0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getKey();
        java.lang.String str9 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        // The following exception was thrown during execution in test generation
        try {
            option2.addValueForProcessing("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
        java.lang.String str16 = option1.getArgName();
        boolean boolean17 = option1.hasArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str13, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:   :: hi! ]", true, "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option:  [ARG...] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ARG...] :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        java.lang.String str17 = option4.getValue();
        option4.setValueSeparator('#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        java.lang.String[] strArray13 = option4.getValues();
        boolean boolean14 = option4.hasLongOpt();
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        option4.setArgs((int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a   :: null ]", true, "\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a   :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        boolean boolean4 = option1.acceptsArg();
        option1.setDescription("[ option:    [ARG] ::  ]");
        java.lang.Class<?> wildcardClass7 = option1.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasLongOpt();
        option2.setOptionalArg(true);
        java.lang.String str13 = option2.getValue((int) (short) 1);
        java.lang.String str14 = option2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:   ::  ]" + "'", str14, "[ option:   ::  ]");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        option4.setLongOpt("");
        boolean boolean15 = option4.hasArgName();
        java.lang.String str17 = option4.getValue((int) '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        boolean boolean14 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        option4.setValueSeparator('#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        java.lang.String str5 = option3.getValue("[ option:   :: hi! ]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   :: hi! ]" + "'", str5, "[ option:   :: hi! ]");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        boolean boolean38 = option4.hasOptionalArg();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    [ARG] :: hi! ]", "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]", false, "[ option:   :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", true, "hi!");
        boolean boolean5 = option4.hasOptionalArg();
        int int6 = option4.getArgs();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str12 = option11.getValue();
        java.lang.String str13 = option11.getOpt();
        java.lang.String str14 = option11.getValue();
        java.lang.String str15 = option11.getLongOpt();
        boolean boolean16 = option4.equals((java.lang.Object) str15);
        option4.clearValues();
        option4.addValueForProcessing("hi!");
        java.lang.String str21 = option4.getValue((int) '\000');
        java.lang.Object obj22 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[ option: a [ option:    [ARG] ::  ]  [ARG] :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[ option: a [ option:    [ARG] ::  ]  [ARG] :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[ option: a [ option:    [ARG] ::  ]  [ARG] :: hi! ]");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArg();
        boolean boolean13 = option4.requiresArg();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        boolean boolean20 = option18.isRequired();
        option18.setArgName("hi!");
        java.lang.String str24 = option18.getValue((int) (short) -1);
        char char25 = option18.getValueSeparator();
        option18.setDescription("[ option:   ::  ]");
        option18.setLongOpt("[ option:   ::  ]");
        boolean boolean30 = option18.hasLongOpt();
        org.apache.commons.cli.Option option35 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean36 = option35.hasLongOpt();
        boolean boolean37 = option35.isRequired();
        java.lang.String str38 = option35.toString();
        org.apache.commons.cli.OptionBuilder optionBuilder39 = org.apache.commons.cli.OptionBuilder.hasArg();
        boolean boolean40 = option35.equals((java.lang.Object) optionBuilder39);
        java.lang.String str41 = option35.getArgName();
        java.lang.String str42 = option35.toString();
        java.lang.String str43 = option35.getOpt();
        boolean boolean44 = option35.hasOptionalArg();
        option35.setOptionalArg(false);
        java.lang.String str47 = option35.getKey();
        org.apache.commons.cli.Option option52 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean53 = option52.hasLongOpt();
        boolean boolean54 = option52.isRequired();
        option52.setArgName("hi!");
        option52.setArgs((int) (byte) 0);
        boolean boolean59 = option52.hasOptionalArg();
        boolean boolean60 = option52.hasArg();
        java.util.List list61 = option52.getValuesList();
        option52.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option option68 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean69 = option68.hasLongOpt();
        java.lang.Class class70 = null;
        option68.setType(class70);
        boolean boolean72 = option68.hasValueSeparator();
        java.lang.String str74 = option68.getValue((int) (byte) -1);
        option68.setValueSeparator(' ');
        java.lang.String str77 = option68.getOpt();
        java.lang.Class<?> wildcardClass78 = option68.getClass();
        option52.setType((java.lang.Class) wildcardClass78);
        option35.setType((java.lang.Class) wildcardClass78);
        option18.setType((java.lang.Class) wildcardClass78);
        option4.setType((java.lang.Class) wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str38, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str42, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setDescription("a");
        java.lang.String str10 = option1.toString();
        java.lang.String str11 = option1.getDescription();
        boolean boolean12 = option1.hasArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a  [ARG] :: a ]" + "'", str10, "[ option: a  [ARG] :: a ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        java.lang.Object obj14 = option4.clone();
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean20 = option19.hasLongOpt();
        boolean boolean21 = option19.isRequired();
        option19.setArgName("hi!");
        java.lang.Class<?> wildcardClass24 = option19.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder25 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass24);
        option4.setType((java.lang.Class) wildcardClass24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = option4.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(optionBuilder25);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        java.lang.String str8 = option4.getLongOpt();
        boolean boolean9 = option4.hasArg();
        option4.setDescription("[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", "[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]", true, "[ option:    [ARG] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", true, "hi!");
        boolean boolean5 = option4.hasOptionalArg();
        int int6 = option4.getArgs();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str12 = option11.getValue();
        java.lang.String str13 = option11.getOpt();
        java.lang.String str14 = option11.getValue();
        java.lang.String str15 = option11.getLongOpt();
        boolean boolean16 = option4.equals((java.lang.Object) str15);
        java.lang.String str18 = option4.getValue("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        java.lang.Object obj19 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str18, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[ option: a [ option:    [ARG] ::  ]  [ARG] :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[ option: a [ option:    [ARG] ::  ]  [ARG] :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[ option: a [ option:    [ARG] ::  ]  [ARG] :: hi! ]");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        boolean boolean2 = option1.hasArgs();
        java.lang.Object obj3 = option1.clone();
        boolean boolean4 = option1.hasValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[ option:   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[ option:   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[ option:   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.addValueForProcessing("a");
        option4.setArgName("[ option: a  [ARG] :: a ]");
        java.lang.String str18 = option4.getValue("[ option: a  [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "a" + "'", str18, "a");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        option4.setValueSeparator('a');
        boolean boolean14 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        option11.clearValues();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        java.lang.Object obj19 = option4.clone();
        boolean boolean20 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.hasLongOpt();
        option4.setDescription("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str16 = option4.getValue("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        org.apache.commons.cli.Option option23 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean24 = option23.hasLongOpt();
        boolean boolean25 = option23.isRequired();
        option23.setArgName("hi!");
        boolean boolean28 = option23.hasArg();
        option23.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str31 = option23.getValue();
        char char32 = option23.getValueSeparator();
        boolean boolean33 = option23.hasArgName();
        org.apache.commons.cli.Option option38 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean39 = option38.hasLongOpt();
        option38.setRequired(false);
        boolean boolean42 = option38.hasArg();
        boolean boolean43 = option38.acceptsArg();
        boolean boolean44 = option38.hasLongOpt();
        option38.setOptionalArg(true);
        java.lang.Class<?> wildcardClass47 = option38.getClass();
        option23.setType((java.lang.Class) wildcardClass47);
        org.apache.commons.cli.OptionBuilder optionBuilder49 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass47);
        org.apache.commons.cli.OptionBuilder optionBuilder50 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass47);
        option4.setType((java.lang.Class) wildcardClass47);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str31, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(optionBuilder49);
        org.junit.Assert.assertNotNull(optionBuilder50);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getKey();
        boolean boolean12 = option4.hasArg();
        java.lang.String str13 = option4.getDescription();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean19 = option18.hasLongOpt();
        option18.setRequired(false);
        boolean boolean22 = option18.hasArg();
        boolean boolean23 = option18.acceptsArg();
        java.lang.String str24 = option18.toString();
        java.lang.String str25 = option18.getKey();
        boolean boolean26 = option18.hasArg();
        java.lang.String str27 = option18.getDescription();
        java.lang.String str28 = option18.getKey();
        java.lang.Class<?> wildcardClass29 = option18.getClass();
        option4.setType((java.lang.Class) wildcardClass29);
        java.util.List list31 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str24, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        java.lang.String str18 = option4.getLongOpt();
        java.lang.String str19 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]", "[ option:    ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:   [ARG...] ::  ]", "", true, "[ option:    [ARG] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   [ARG...] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        java.lang.String str11 = option4.toString();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean17 = option16.hasLongOpt();
        option16.setRequired(false);
        boolean boolean20 = option16.hasArg();
        boolean boolean21 = option16.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder23 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean24 = option16.equals((java.lang.Object) "");
        boolean boolean25 = option16.hasArg();
        java.lang.String str26 = option16.getLongOpt();
        boolean boolean27 = option16.isRequired();
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", "hi!");
        option30.setDescription("");
        java.lang.String str33 = option30.getDescription();
        java.lang.String str35 = option30.getValue((int) (byte) 100);
        java.util.List list36 = option30.getValuesList();
        boolean boolean37 = option30.hasLongOpt();
        option30.setOptionalArg(true);
        int int40 = option30.getArgs();
        int int41 = option30.getArgs();
        boolean boolean42 = option30.hasLongOpt();
        boolean boolean43 = option16.equals((java.lang.Object) option30);
        boolean boolean44 = option16.requiresArg();
        boolean boolean45 = option4.equals((java.lang.Object) option16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        java.lang.String str8 = option4.getDescription();
        java.lang.String str9 = option4.getValue();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        java.lang.Object obj20 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String str12 = option4.getDescription();
        java.lang.String str13 = option4.getLongOpt();
        boolean boolean14 = option4.hasArg();
        java.lang.String str15 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option:    [ARG] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setValueSeparator('\000');
        java.lang.String str14 = option4.getValue();
        java.lang.Object obj15 = option4.clone();
        boolean boolean16 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        option4.setValueSeparator('\000');
        option4.clearValues();
        option4.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
        option4.addValueForProcessing("[ option: a   :: null ]");
        boolean boolean19 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((-1));
        boolean boolean10 = option6.equals((java.lang.Object) optionBuilder9);
        boolean boolean11 = option6.hasArgName();
        java.lang.Object obj12 = option6.getType();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("a", false, "");
        option16.clearValues();
        boolean boolean18 = option16.hasValueSeparator();
        boolean boolean19 = option16.hasArgs();
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
        java.lang.String str40 = option24.getValue((int) (byte) 1);
        org.apache.commons.cli.Option option45 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean46 = option45.hasLongOpt();
        option45.setRequired(false);
        boolean boolean49 = option24.equals((java.lang.Object) option45);
        java.lang.Class<?> wildcardClass50 = option24.getClass();
        option16.setType((java.lang.Class) wildcardClass50);
        org.apache.commons.cli.OptionBuilder optionBuilder52 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass50);
        org.apache.commons.cli.OptionBuilder optionBuilder53 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass50);
        option6.setType((java.lang.Class) wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str38, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(optionBuilder52);
        org.junit.Assert.assertNotNull(optionBuilder53);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        java.lang.String str20 = option4.getOpt();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        java.lang.String str24 = option13.toString();
        java.lang.Object obj25 = option13.clone();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str24, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        boolean boolean12 = option4.hasArgName();
        boolean boolean13 = option4.isRequired();
        boolean boolean14 = option4.hasArgName();
        char char15 = option4.getValueSeparator();
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("a");
        java.lang.String str2 = option1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            option1.addValueForProcessing("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String[] strArray12 = option4.getValues();
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean15 = option4.acceptsArg();
        option4.setValueSeparator('4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        option4.setValueSeparator('#');
        boolean boolean15 = option4.hasArgs();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        option20.setRequired(false);
        boolean boolean24 = option20.hasArg();
        boolean boolean25 = option20.acceptsArg();
        boolean boolean26 = option20.hasLongOpt();
        java.lang.String[] strArray27 = option20.getValues();
        boolean boolean28 = option20.requiresArg();
        boolean boolean29 = option20.isRequired();
        option20.setOptionalArg(false);
        char char32 = option20.getValueSeparator();
        org.apache.commons.cli.Option option37 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean38 = option37.hasLongOpt();
        boolean boolean39 = option37.isRequired();
        option37.setArgName("hi!");
        java.lang.Class<?> wildcardClass42 = option37.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder43 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        org.apache.commons.cli.OptionBuilder optionBuilder44 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        org.apache.commons.cli.OptionBuilder optionBuilder45 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        org.apache.commons.cli.OptionBuilder optionBuilder46 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        option20.setType((java.lang.Class) wildcardClass42);
        org.apache.commons.cli.OptionBuilder optionBuilder48 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        org.apache.commons.cli.OptionBuilder optionBuilder49 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass42);
        option4.setType((java.lang.Class) wildcardClass42);
        boolean boolean51 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(optionBuilder43);
        org.junit.Assert.assertNotNull(optionBuilder44);
        org.junit.Assert.assertNotNull(optionBuilder45);
        org.junit.Assert.assertNotNull(optionBuilder46);
        org.junit.Assert.assertNotNull(optionBuilder48);
        org.junit.Assert.assertNotNull(optionBuilder49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        boolean boolean20 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        java.lang.String str11 = option4.getValue(1);
        boolean boolean12 = option4.hasArg();
        java.lang.String str13 = option4.getArgName();
        option4.addValueForProcessing("[ option: a  [ARG] :: a ]");
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option:    [ARG] :: a ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
        boolean boolean19 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        option4.setValueSeparator(' ');
        boolean boolean19 = option4.requiresArg();
        java.lang.String[] strArray20 = option4.getValues();
        java.lang.String str21 = option4.toString();
        option4.setArgName("[ option: a a  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str21, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean21 = option20.requiresArg();
        boolean boolean22 = option20.isRequired();
        java.lang.Class<?> wildcardClass23 = option20.getClass();
        option4.setType((java.lang.Class) wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        java.lang.String str22 = option4.getKey();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        java.lang.String[] strArray38 = option28.getValues();
        boolean boolean39 = option28.requiresArg();
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
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.clearValues();
        java.lang.String str14 = option4.getValue("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        java.lang.String str16 = option4.getValue("[ option: a   :: null ]");
        option4.setLongOpt("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        option4.setLongOpt("[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]" + "'", str14, "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: a   :: null ]" + "'", str16, "[ option: a   :: null ]");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        org.apache.commons.cli.OptionBuilder optionBuilder39 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass36);
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
        org.junit.Assert.assertNotNull(optionBuilder39);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  [ARG] :: a ]", true, "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  [ARG] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        boolean boolean17 = option4.acceptsArg();
        option4.setArgs((int) (short) 0);
        boolean boolean20 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(option14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.toString();
        boolean boolean11 = option4.isRequired();
        boolean boolean12 = option4.hasValueSeparator();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "hi!");
        option2.setRequired(false);
        java.lang.String str5 = option2.getKey();
        java.lang.String str7 = option2.getValue("[ option:    [ARG] :: [ option:   ::  ] ]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] :: [ option:   ::  ] ]" + "'", str7, "[ option:    [ARG] :: [ option:   ::  ] ]");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        char char11 = option4.getValueSeparator();
        option4.setArgName("[ option: a  [ARG] :: a ]");
        option4.setValueSeparator('4');
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        java.lang.String str22 = option20.getKey();
        boolean boolean23 = option20.hasArgs();
        java.lang.Class class24 = null;
        option20.setType(class24);
        java.lang.String str26 = option20.getValue();
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean32 = option31.hasLongOpt();
        option31.setRequired(false);
        boolean boolean35 = option31.requiresArg();
        org.apache.commons.cli.Option option40 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean41 = option40.hasLongOpt();
        option40.setRequired(false);
        boolean boolean44 = option40.hasArg();
        boolean boolean45 = option40.acceptsArg();
        boolean boolean46 = option40.hasLongOpt();
        java.lang.String[] strArray47 = option40.getValues();
        boolean boolean48 = option40.requiresArg();
        option40.setValueSeparator('4');
        boolean boolean51 = option40.hasArg();
        java.lang.String str52 = option40.getValue();
        java.lang.String str54 = option40.getValue("[ option:    [ARG] ::  ]");
        option40.setArgName("a");
        java.lang.String str57 = option40.getValue();
        org.apache.commons.cli.Option option62 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean63 = option62.hasLongOpt();
        boolean boolean64 = option62.isRequired();
        option62.setArgName("hi!");
        java.lang.Class<?> wildcardClass67 = option62.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder68 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass67);
        org.apache.commons.cli.OptionBuilder optionBuilder69 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass67);
        option40.setType((java.lang.Class) wildcardClass67);
        option31.setType((java.lang.Class) wildcardClass67);
        option20.setType((java.lang.Class) wildcardClass67);
        int int73 = option20.getArgs();
        boolean boolean74 = option20.acceptsArg();
        boolean boolean75 = option4.equals((java.lang.Object) option20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str54, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(optionBuilder68);
        org.junit.Assert.assertNotNull(optionBuilder69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
        java.lang.String str15 = option4.getDescription();
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
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setArgName("hi!");
        java.lang.String str13 = option4.getKey();
        option4.addValueForProcessing("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        java.lang.String[] strArray9 = option4.getValues();
        boolean boolean10 = option4.hasArgs();
        boolean boolean11 = option4.isRequired();
        boolean boolean12 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        option4.setLongOpt("");
        boolean boolean15 = option4.hasOptionalArg();
        boolean boolean16 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        org.apache.commons.cli.Option option23 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean24 = option23.hasLongOpt();
        option23.setRequired(false);
        boolean boolean27 = option23.hasArg();
        boolean boolean28 = option23.acceptsArg();
        boolean boolean29 = option23.hasLongOpt();
        java.lang.String[] strArray30 = option23.getValues();
        option23.setDescription("a");
        java.lang.String[] strArray33 = option23.getValues();
        org.apache.commons.cli.Option option36 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class37 = null;
        option36.setType(class37);
        option36.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Class<?> wildcardClass41 = option36.getClass();
        option23.setType((java.lang.Class) wildcardClass41);
        org.apache.commons.cli.OptionBuilder optionBuilder43 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass41);
        option4.setType((java.lang.Class) wildcardClass41);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = option4.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(optionBuilder43);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
        boolean boolean30 = option4.hasArgName();
        java.lang.Object obj31 = option4.getType();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class org.apache.commons.cli.Option");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.util.List list10 = option4.getValuesList();
        java.lang.Class class11 = null;
        option4.setType(class11);
        java.lang.String str14 = option4.getValue((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((-1));
        boolean boolean10 = option6.equals((java.lang.Object) optionBuilder9);
        java.lang.String str11 = option6.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option: a  :: hi! ]" + "'", str11, "[ option: a  :: hi! ]");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: null :: class org.apache.commons.cli.Option ]", true, "[ option: a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String[] strArray11 = option4.getValues();
        int int12 = option4.getArgs();
        java.lang.String str13 = option4.getArgName();
        boolean boolean14 = option4.isRequired();
        int int15 = option4.getArgs();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        option20.setRequired(false);
        boolean boolean24 = option20.hasArg();
        boolean boolean25 = option20.acceptsArg();
        java.lang.String str26 = option20.toString();
        char char27 = option20.getValueSeparator();
        option20.setArgName("[ option: a  [ARG] :: a ]");
        boolean boolean30 = option20.hasArgName();
        boolean boolean31 = option20.requiresArg();
        boolean boolean32 = option4.equals((java.lang.Object) option20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str26, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        option4.setArgs((int) 'a');
        boolean boolean11 = option4.hasArgs();
        java.lang.Object obj12 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        int int9 = option1.getId();
        java.lang.Object obj10 = option1.clone();
        java.lang.String str11 = option1.getDescription();
        int int12 = option1.getArgs();
        java.lang.String str13 = option1.getValue();
        boolean boolean14 = option1.requiresArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getOpt();
        java.lang.Object obj11 = option4.clone();
        boolean boolean12 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        boolean boolean14 = option4.hasArgName();
        boolean boolean15 = option4.isRequired();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        boolean boolean22 = option20.isRequired();
        java.lang.String str23 = option20.getOpt();
        option20.setLongOpt("hi!");
        option20.setValueSeparator('4');
        boolean boolean28 = option20.hasArgName();
        boolean boolean29 = option20.acceptsArg();
        boolean boolean30 = option4.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.acceptsArg();
        java.lang.String str13 = option4.getLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = option4.addValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.requiresArg();
        boolean boolean12 = option4.hasOptionalArg();
        option4.setArgName("hi!");
        java.lang.String str15 = option4.getValue();
        option4.setRequired(false);
        option4.setArgs((int) (short) 1);
        java.lang.String str20 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.util.List list10 = option4.getValuesList();
        java.lang.Object obj11 = option4.getType();
        boolean boolean12 = option4.hasValueSeparator();
        option4.setLongOpt("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
            boolean boolean21 = option2.addValue("[ option:  [ARG...] :: hi! ]");
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
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        java.lang.String str7 = option4.getArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.String[] strArray9 = option4.getValues();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = option4.addValue("[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "");
        option3.clearValues();
        option3.setLongOpt("a");
        java.util.List list7 = option3.getValuesList();
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "a");
        java.lang.Object obj4 = option3.getType();
        boolean boolean5 = option3.hasArg();
        java.lang.String str7 = option3.getValue("[ option:    [ARG] :: [ option:   ::  ] ]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] :: [ option:   ::  ] ]" + "'", str7, "[ option:    [ARG] :: [ option:   ::  ] ]");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: a :: class org.apache.commons.cli.Option ]", "[ option:  [ARG...] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        boolean boolean8 = option2.acceptsArg();
        option2.setValueSeparator(' ');
        java.lang.String str12 = option2.getValue(0);
        boolean boolean13 = option2.hasLongOpt();
        option2.setLongOpt("[ option: a  :: a ]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        java.lang.String str16 = option4.getDescription();
        java.lang.String str17 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str15, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        java.lang.String str6 = option4.getOpt();
        option4.addValueForProcessing("[ option: a  :: a ]");
        java.lang.String str9 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
        java.lang.String str33 = option4.toString();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]" + "'", str33, "[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a [ option:    [ARG] :: hi! ]  :: a ]", false, "[ option: a [ARG...] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ option:    [ARG] :: hi! ]  :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "[ option: a  [ARG] :: a ]");
        boolean boolean5 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
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
        // The following exception was thrown during execution in test generation
        try {
            option4.addValueForProcessing("[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Cannot add value, list full.");
        } catch (java.lang.RuntimeException e) {
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
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
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
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        boolean boolean2 = option1.hasArgs();
        java.lang.Object obj3 = option1.clone();
        java.lang.String str4 = option1.getValue();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
// flaky "2) test2794(org.apache.commons.cli.RegressionTest5)":         org.junit.Assert.assertEquals(obj3.toString(), "[ option:   :: null ]");
// flaky "1) test2794(org.apache.commons.cli.RegressionTest5)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[ option:   :: null ]");
// flaky "1) test2794(org.apache.commons.cli.RegressionTest5)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[ option:   :: null ]");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        java.lang.String str20 = option11.getValue();
        char char21 = option11.getValueSeparator();
        java.util.List list22 = option11.getValuesList();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setArgName("hi!");
        option4.setDescription("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str16 = option4.getValue();
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        java.lang.String str21 = option4.getValue("[ option:   [ARG...] ::  ]");
        boolean boolean22 = option4.hasLongOpt();
        java.lang.Class<?> wildcardClass23 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str21, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str9 = option4.getValue("");
        java.lang.String str10 = option4.getValue();
        org.apache.commons.cli.Option option12 = org.apache.commons.cli.OptionBuilder.create('a');
        option12.setRequired(false);
        java.lang.String str15 = option12.getLongOpt();
        int int16 = option12.getArgs();
        java.lang.String str18 = option12.getValue((int) (short) 10);
        java.lang.String str19 = option12.getOpt();
        boolean boolean20 = option12.isRequired();
        boolean boolean21 = option4.equals((java.lang.Object) boolean20);
        java.lang.String str22 = option4.getLongOpt();
        option4.setValueSeparator('a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(option12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "a" + "'", str19, "a");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getLongOpt();
        java.lang.Object obj9 = option4.clone();
        boolean boolean10 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        option4.setLongOpt("");
        boolean boolean12 = option4.hasOptionalArg();
        java.lang.String str13 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str13, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.hasArgName();
        java.lang.Object obj10 = option4.getType();
        boolean boolean11 = option4.hasValueSeparator();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
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
        boolean boolean21 = option4.requiresArg();
        option4.setRequired(true);
        boolean boolean24 = option4.hasLongOpt();
        java.lang.String str25 = option4.getLongOpt();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        option4.setArgs(1);
        boolean boolean18 = option4.hasValueSeparator();
        option4.setArgs((int) (byte) 100);
        java.lang.String str21 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getDescription();
        option1.setOptionalArg(false);
        char char10 = option1.getValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        int int9 = option1.getId();
        java.lang.Object obj10 = option1.clone();
        java.lang.String str11 = option1.getDescription();
        int int12 = option1.getArgs();
        java.lang.String str13 = option1.getValue();
        java.lang.String str14 = option1.getArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[ option: a  :: null ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[ option: a  :: null ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[ option: a  :: null ]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        java.util.List list23 = option4.getValuesList();
        java.lang.String str24 = option4.getLongOpt();
        boolean boolean25 = option4.acceptsArg();
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
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        option4.setLongOpt("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean13 = option12.hasLongOpt();
        option12.setRequired(false);
        boolean boolean16 = option12.hasArg();
        boolean boolean17 = option12.acceptsArg();
        boolean boolean18 = option12.hasLongOpt();
        java.lang.String[] strArray19 = option12.getValues();
        option12.setDescription("a");
        java.lang.String[] strArray22 = option12.getValues();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class26 = null;
        option25.setType(class26);
        option25.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Class<?> wildcardClass30 = option25.getClass();
        option12.setType((java.lang.Class) wildcardClass30);
        option12.setDescription("a");
        boolean boolean34 = option2.equals((java.lang.Object) option12);
        org.apache.commons.cli.Option option39 = new org.apache.commons.cli.Option("", "", true, "");
        option39.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean42 = option39.hasValueSeparator();
        java.lang.String str43 = option39.getValue();
        java.lang.String[] strArray44 = option39.getValues();
        java.lang.String str45 = option39.getLongOpt();
        boolean boolean46 = option12.equals((java.lang.Object) str45);
        option12.setArgs((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str45, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.hasValueSeparator();
        boolean boolean4 = option2.hasArgName();
        int int5 = option2.getArgs();
        option2.setArgs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        int int17 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        java.lang.String[] strArray10 = option4.getValues();
        java.lang.String str11 = option4.getKey();
        java.lang.String str12 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        option4.setArgName("a");
        option4.clearValues();
        java.lang.String str20 = option4.getOpt();
        java.lang.String str22 = option4.getValue("[ option:    ::  :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ option:    ::  :: class org.apache.commons.cli.Option ]" + "'", str22, "[ option:    ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        boolean boolean17 = option4.hasArg();
        option4.setArgs((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "a");
        java.lang.String str5 = option3.getValue("");
        option3.setDescription("[ option: a  :: null ]");
        java.lang.String str8 = option3.getDescription();
        boolean boolean9 = option3.isRequired();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option: a  :: null ]" + "'", str8, "[ option: a  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        java.lang.String str23 = option4.getArgName();
        java.lang.String str25 = option4.getValue(97);
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", false, "[ option:    ::  :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        option4.setRequired(false);
        option4.setArgName("[ option:    [ARG] ::  ]");
        option4.clearValues();
        java.util.List list14 = option4.getValuesList();
        java.lang.String str15 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.String str5 = option3.getValue("[ option:   ::  ]");
        option3.setLongOpt("[ option:   :: a ]");
        java.lang.String str8 = option3.getDescription();
        java.util.List list9 = option3.getValuesList();
        option3.setOptionalArg(true);
        option3.setLongOpt("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        option3.setValueSeparator('\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   ::  ]" + "'", str5, "[ option:   ::  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean10 = option9.hasLongOpt();
        boolean boolean11 = option9.isRequired();
        option9.setArgName("hi!");
        java.lang.Class<?> wildcardClass14 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        option2.setType((java.lang.Class) wildcardClass14);
        org.apache.commons.cli.OptionBuilder optionBuilder17 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass18 = optionBuilder17.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder19 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
        org.junit.Assert.assertNotNull(optionBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(optionBuilder19);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "a");
        java.lang.String[] strArray4 = option3.getValues();
        java.lang.String str6 = option3.getValue("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str6, "[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        boolean boolean26 = option18.acceptsArg();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("hi!", "[ option: a   :: null ]", true, "[ option:    [ARG] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "");
        option3.clearValues();
        option3.setLongOpt("a");
        java.lang.String str7 = option3.toString();
        boolean boolean8 = option3.hasLongOpt();
        option3.clearValues();
        option3.clearValues();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option: a a  ::  ]" + "'", str7, "[ option: a a  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        java.util.List list20 = option4.getValuesList();
        boolean boolean21 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:   ::  ]" + "'", str19, "[ option:   ::  ]");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        option4.setArgs((int) 'a');
        boolean boolean11 = option4.hasArgs();
        option4.setArgs(52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        option4.setRequired(false);
        option4.setArgName("[ option:    [ARG] ::  ]");
        option4.clearValues();
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        boolean boolean12 = option4.hasArgName();
        java.lang.Object obj13 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        java.lang.Object obj18 = option4.clone();
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:   ::  ]", true, "a");
        java.util.List list5 = option4.getValuesList();
        boolean boolean6 = option4.hasArg();
        java.lang.String str7 = option4.getValue();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        option2.setArgs((int) '4');
        boolean boolean14 = option2.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setOptionalArg(false);
        boolean boolean9 = option4.hasArgs();
        boolean boolean10 = option4.hasLongOpt();
        java.util.List list11 = option4.getValuesList();
        java.util.List list12 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]", "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        option4.setRequired(false);
        boolean boolean8 = option4.hasLongOpt();
        java.lang.String str10 = option4.getValue(10);
        java.lang.String str11 = option4.getLongOpt();
        boolean boolean12 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        option4.setLongOpt("a");
        option4.setRequired(false);
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean21 = option20.hasLongOpt();
        boolean boolean22 = option20.isRequired();
        option20.setArgName("hi!");
        boolean boolean25 = option20.hasArg();
        boolean boolean26 = option20.acceptsArg();
        java.lang.String str27 = option20.getArgName();
        option20.setValueSeparator('#');
        boolean boolean30 = option20.acceptsArg();
        org.apache.commons.cli.Option option32 = org.apache.commons.cli.OptionBuilder.create('\000');
        boolean boolean33 = option32.hasValueSeparator();
        boolean boolean34 = option32.hasArgs();
        boolean boolean35 = option20.equals((java.lang.Object) boolean34);
        boolean boolean36 = option4.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(option32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        boolean boolean18 = option4.hasLongOpt();
        java.lang.String str20 = option4.getValue((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        boolean boolean8 = option2.acceptsArg();
        option2.setValueSeparator(' ');
        java.lang.String str12 = option2.getValue(0);
        java.lang.String str14 = option2.getValue((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.acceptsArg();
        java.lang.String str11 = option4.getArgName();
        java.lang.String str12 = option4.getArgName();
        java.lang.String str13 = option4.getDescription();
        boolean boolean14 = option4.hasOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = option4.getId();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]", true, "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        boolean boolean4 = option3.hasArg();
        boolean boolean5 = option3.hasArgName();
        option3.setLongOpt("[ option: a  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        option4.clearValues();
        java.lang.String str12 = option4.getOpt();
        java.lang.String str13 = option4.getValue();
        java.lang.String[] strArray14 = option4.getValues();
        java.lang.String str15 = option4.getDescription();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   ::  ]", false, "[ option:   ::  ]");
        option4.setOptionalArg(false);
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean12 = option11.hasLongOpt();
        option11.setRequired(false);
        boolean boolean15 = option11.hasArg();
        boolean boolean16 = option11.acceptsArg();
        boolean boolean17 = option11.hasLongOpt();
        option11.setOptionalArg(true);
        java.lang.Object obj20 = option11.clone();
        option11.setOptionalArg(true);
        org.apache.commons.cli.Option option27 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean28 = option27.hasLongOpt();
        option27.setRequired(false);
        boolean boolean31 = option27.hasArg();
        boolean boolean32 = option27.acceptsArg();
        boolean boolean33 = option27.hasLongOpt();
        java.lang.String[] strArray34 = option27.getValues();
        option27.setDescription("a");
        java.lang.String[] strArray37 = option27.getValues();
        org.apache.commons.cli.Option option40 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class41 = null;
        option40.setType(class41);
        option40.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.Class<?> wildcardClass45 = option40.getClass();
        option27.setType((java.lang.Class) wildcardClass45);
        option11.setType((java.lang.Class) wildcardClass45);
        option4.setType((java.lang.Class) wildcardClass45);
        boolean boolean49 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        option4.clearValues();
        java.lang.String str14 = option4.getValue("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        java.lang.String str16 = option4.getValue("[ option: a   :: null ]");
        option4.setArgs(10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]" + "'", str14, "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: a   :: null ]" + "'", str16, "[ option: a   :: null ]");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str2 = option1.getKey();
        boolean boolean3 = option1.hasArgs();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = option1.addValue("[ option:    ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("\000", "[ option:    ::  ]", true, "a");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str10 = option4.getArgName();
        java.lang.String str11 = option4.getOpt();
        java.lang.String str13 = option4.getValue((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        java.lang.String str10 = option4.getValue((int) (short) -1);
        char char11 = option4.getValueSeparator();
        java.lang.String[] strArray12 = option4.getValues();
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        boolean boolean15 = option4.hasArgs();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = option4.addValue("[ option: a [ARG...] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
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
        java.lang.String str22 = option4.getLongOpt();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        boolean boolean17 = option4.isRequired();
        java.lang.Class<?> wildcardClass18 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
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
        java.lang.String str19 = option7.toString();
        boolean boolean20 = option7.acceptsArg();
        java.lang.String str21 = option7.getKey();
        boolean boolean22 = option2.equals((java.lang.Object) option7);
        boolean boolean23 = option7.hasArgName();
        option7.setArgName("[ option: a  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str19, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setDescription("a");
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
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        char char5 = option2.getValueSeparator();
        java.lang.String str7 = option2.getValue("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        boolean boolean8 = option2.hasOptionalArg();
        option2.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str7, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getLongOpt();
        boolean boolean8 = option1.hasLongOpt();
        java.lang.String str9 = option1.getDescription();
        option1.setLongOpt("[ option:    ::  ]");
        option1.setDescription("[ option:  [ option:   ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        option4.setArgName("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        java.lang.String str27 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        option2.setLongOpt("[ option: a  [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
        char char22 = option4.getValueSeparator();
        option4.setValueSeparator('#');
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
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
        option4.addValueForProcessing("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option:  [ option:   ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.isRequired();
        boolean boolean11 = option4.hasArgs();
        boolean boolean12 = option4.hasArg();
        boolean boolean13 = option4.hasArgName();
        java.lang.String str14 = option4.getLongOpt();
        option4.setArgs((-2));
        option4.setOptionalArg(true);
        java.lang.String str19 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        boolean boolean11 = option4.requiresArg();
        boolean boolean12 = option4.hasOptionalArg();
        java.lang.String str13 = option4.getOpt();
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        char char16 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        java.lang.String str9 = option2.getKey();
        java.util.List list10 = option2.getValuesList();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a a  ::  ]", true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        java.lang.Class class8 = null;
        option4.setType(class8);
        java.lang.String str10 = option4.getLongOpt();
        java.lang.Object obj11 = option4.clone();
        option4.setLongOpt("[ option:    ::  ]");
        option4.addValueForProcessing("[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        java.lang.String str25 = option13.getValue("[ option:    [ARG] :: a ]");
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean31 = option30.hasLongOpt();
        boolean boolean32 = option30.isRequired();
        boolean boolean33 = option30.hasArgName();
        java.lang.String str34 = option30.getArgName();
        java.lang.Object obj35 = option30.clone();
        java.lang.String str36 = option30.getLongOpt();
        boolean boolean37 = option13.equals((java.lang.Object) option30);
        boolean boolean38 = option30.hasArgName();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ option:    [ARG] :: a ]" + "'", str25, "[ option:    [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        java.lang.String str13 = option4.getKey();
        option4.setOptionalArg(false);
        java.lang.String str16 = option4.getLongOpt();
        java.lang.String str17 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.lang.String str10 = option4.getArgName();
        option4.clearValues();
        java.util.List list12 = option4.getValuesList();
        boolean boolean13 = option4.hasLongOpt();
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getKey();
        option4.setOptionalArg(false);
        boolean boolean11 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  :: a :: class org.apache.commons.cli.Option ]", "[ option:    [ARG] :: [ option:   ::  ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
        option4.setOptionalArg(false);
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean26 = option25.hasLongOpt();
        boolean boolean27 = option25.isRequired();
        option25.setArgName("hi!");
        option25.setArgs((int) (byte) 0);
        boolean boolean32 = option25.hasOptionalArg();
        boolean boolean33 = option25.hasArgs();
        boolean boolean34 = option25.isRequired();
        java.lang.String[] strArray35 = option25.getValues();
        java.lang.Class class36 = null;
        option25.setType(class36);
        int int38 = option25.getArgs();
        int int39 = option25.getArgs();
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("", "", true, "");
        option44.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean47 = option44.hasValueSeparator();
        java.lang.String str48 = option44.getValue();
        boolean boolean49 = option44.hasOptionalArg();
        java.util.List list50 = option44.getValuesList();
        option44.setOptionalArg(true);
        java.lang.Class<?> wildcardClass53 = option44.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder54 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass53);
        org.apache.commons.cli.OptionBuilder optionBuilder55 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass53);
        option25.setType((java.lang.Class) wildcardClass53);
        option25.setArgs((int) (short) 100);
        boolean boolean59 = option4.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(optionBuilder54);
        org.junit.Assert.assertNotNull(optionBuilder55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        java.lang.String str22 = option4.getValue((-2));
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        option1.clearValues();
        option1.setOptionalArg(true);
        java.lang.String str7 = option1.toString();
        java.lang.Class<?> wildcardClass8 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass8);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option: a  :: null ]" + "'", str7, "[ option: a  :: null ]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        boolean boolean11 = option4.hasValueSeparator();
        char char12 = option4.getValueSeparator();
        java.lang.String str14 = option4.getValue("hi!");
        java.lang.Object obj15 = option4.clone();
        java.lang.String str16 = option4.getDescription();
        java.util.List list17 = option4.getValuesList();
        int int18 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'a' + "'", char12 == 'a');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        java.lang.String str7 = option4.getKey();
        java.util.List list8 = option4.getValuesList();
        option4.setRequired(false);
        option4.setDescription("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String str13 = option4.getKey();
        boolean boolean14 = option4.isRequired();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]", "[ option: a [ARG...] :: a :: class org.apache.commons.cli.Option ]", true, "[ option: a  :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        java.util.List list10 = option4.getValuesList();
        option4.setOptionalArg(true);
        java.lang.String[] strArray13 = option4.getValues();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", false, "[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        java.lang.String str6 = option4.getValue();
        boolean boolean7 = option4.acceptsArg();
        java.lang.String str8 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        boolean boolean15 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        option1.clearValues();
        java.lang.String str7 = option1.toString();
        java.lang.Object obj8 = option1.getType();
        boolean boolean9 = option1.isRequired();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option: a  :: null :: class org.apache.commons.cli.Option ]" + "'", str7, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str11 = option4.getValue("a");
        option4.addValueForProcessing("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        java.lang.String str14 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  ::  :: class org.apache.commons.cli.Option ]", "[ option: a   [ARG] :: null :: class org.apache.commons.cli.Option ]", false, "[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        boolean boolean9 = option4.hasArgName();
        java.lang.String str10 = option4.getArgName();
        boolean boolean11 = option4.hasArgs();
        boolean boolean12 = option4.acceptsArg();
        boolean boolean13 = option4.hasOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        option2.setDescription("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str6 = option2.getValue((int) (byte) 100);
        boolean boolean7 = option2.hasArgName();
        java.lang.String str9 = option2.getValue(97);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        boolean boolean8 = option4.hasArgName();
        option4.setArgName("a");
        option4.setDescription("[ option: a  :: a ]");
        boolean boolean13 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasArg();
        java.lang.String str11 = option4.getKey();
        java.lang.String str12 = option4.getDescription();
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.acceptsArg();
        option4.setValueSeparator('a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        option4.setValueSeparator('\000');
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
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        java.lang.String str23 = option4.getArgName();
        option4.addValueForProcessing("[ option: a a  ::  ]");
        boolean boolean26 = option4.hasValueSeparator();
        java.lang.String str28 = option4.getValue("[ option: a  [ARG] :: a ]");
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ option: a a  ::  ]" + "'", str28, "[ option: a a  ::  ]");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.clearValues();
        boolean boolean8 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        option2.setLongOpt("[ option: a   :: null ]");
        boolean boolean25 = option2.acceptsArg();
        option2.setArgName("[ option:   :: a ]");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArg();
        java.lang.String str8 = option4.getValue();
        char char9 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        boolean boolean20 = option14.hasArgs();
        boolean boolean21 = option14.requiresArg();
        java.lang.String str22 = option14.getArgName();
        boolean boolean23 = option14.hasArgs();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "[ option:    [ARG] :: hi! ]");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        boolean boolean39 = option26.isRequired();
        java.lang.String str41 = option26.getValue("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[ option: a  ::  :: class org.apache.commons.cli.Option ]" + "'", str41, "[ option: a  ::  :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        java.util.List list10 = option4.getValuesList();
        option4.setOptionalArg(true);
        java.lang.String str13 = option4.getKey();
        option4.addValueForProcessing("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        option4.setArgs(0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        java.lang.String str20 = option4.getOpt();
        java.lang.String str21 = option4.getValue();
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        boolean boolean10 = option4.hasLongOpt();
        int int11 = option4.getArgs();
        boolean boolean12 = option4.hasArgName();
        option4.setArgName("");
        java.lang.String[] strArray15 = option4.getValues();
        java.lang.String str16 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        option4.setRequired(false);
        java.lang.String str8 = option4.toString();
        java.lang.String str10 = option4.getValue((int) '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str8, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]", false, "[ option: a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        int int9 = option1.getId();
        boolean boolean10 = option1.hasArgs();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
// flaky "3) test2901(org.apache.commons.cli.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str7);
// flaky "2) test2901(org.apache.commons.cli.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
// flaky "2) test2901(org.apache.commons.cli.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        boolean boolean15 = option4.isRequired();
        java.lang.Object obj16 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[ option:    ::  ]");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        option4.addValueForProcessing("");
        boolean boolean11 = option4.acceptsArg();
        java.lang.Class<?> wildcardClass12 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        java.lang.String str21 = option4.getOpt();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.hasOptionalArg();
        boolean boolean10 = option4.isRequired();
        option4.setValueSeparator('a');
        java.lang.Object obj13 = option4.getType();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str19 = option18.getValue();
        java.lang.String str20 = option18.getOpt();
        boolean boolean21 = option18.hasArg();
        boolean boolean22 = option18.hasArg();
        boolean boolean23 = option18.hasArgName();
        java.lang.Object obj24 = option18.getType();
        boolean boolean25 = option4.equals(obj24);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        boolean boolean13 = option4.hasArgName();
        java.lang.String str14 = option4.toString();
        boolean boolean15 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    ::  ]" + "'", str14, "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.util.List list5 = option2.getValuesList();
        java.lang.Object obj6 = option2.getType();
        boolean boolean7 = option2.requiresArg();
        java.lang.String str8 = option2.getLongOpt();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: null :: class org.apache.commons.cli.Option ]", "[ option:   :: hi! ]", false, "[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        org.apache.commons.cli.Option option35 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean36 = option35.hasLongOpt();
        boolean boolean37 = option35.isRequired();
        option35.setArgName("hi!");
        option35.setArgs((int) (byte) 0);
        boolean boolean42 = option35.hasOptionalArg();
        boolean boolean43 = option35.hasArgs();
        boolean boolean44 = option35.isRequired();
        java.lang.String[] strArray45 = option35.getValues();
        java.lang.Class class46 = null;
        option35.setType(class46);
        int int48 = option35.getArgs();
        int int49 = option35.getArgs();
        boolean boolean50 = option35.hasArgs();
        boolean boolean51 = option4.equals((java.lang.Object) boolean50);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", true, "hi!");
        boolean boolean5 = option4.hasOptionalArg();
        option4.setValueSeparator('#');
        java.util.List list8 = option4.getValuesList();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean14 = option13.hasLongOpt();
        option13.setRequired(false);
        boolean boolean17 = option13.hasArg();
        boolean boolean18 = option13.acceptsArg();
        boolean boolean19 = option13.hasLongOpt();
        java.lang.String[] strArray20 = option13.getValues();
        boolean boolean21 = option13.requiresArg();
        option13.setValueSeparator('4');
        boolean boolean24 = option13.hasArg();
        java.lang.String str25 = option13.getValue();
        java.lang.String str27 = option13.getValue("[ option:    [ARG] ::  ]");
        option13.setArgName("a");
        boolean boolean30 = option13.hasArgName();
        java.lang.String[] strArray31 = option13.getValues();
        boolean boolean32 = option4.equals((java.lang.Object) option13);
        java.lang.String str33 = option13.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str27, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
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
        boolean boolean19 = option4.hasOptionalArg();
        option4.setArgName("[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.util.List list6 = option1.getValuesList();
        int int7 = option1.getId();
        option1.setLongOpt("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.lang.String[] strArray10 = option1.getValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        option4.setValueSeparator('#');
        java.lang.String str8 = option4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str8, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: null ]", "[ option:   :: [ option: a  :: null :: class org.apache.commons.cli.Option ] ]", true, "[ option:    [ARG] :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        boolean boolean21 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.setArgName("");
        char char15 = option4.getValueSeparator();
        java.lang.Class<?> wildcardClass16 = option4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder17 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass16);
        org.apache.commons.cli.OptionBuilder optionBuilder18 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(optionBuilder17);
        org.junit.Assert.assertNotNull(optionBuilder18);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        boolean boolean13 = option4.hasArgName();
        int int14 = option4.getArgs();
        java.lang.String str16 = option4.getValue("[ option:   :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:   :: hi! ]" + "'", str16, "[ option:   :: hi! ]");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option:    [ARG] :: a ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getDescription();
        option1.setValueSeparator(' ');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] :: a ]" + "'", str4, "[ option:    [ARG] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        option4.setRequired(false);
        option4.setArgName("[ option:    [ARG] ::  ]");
        option4.clearValues();
        java.lang.String str14 = option4.getLongOpt();
        option4.setArgName("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
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
        boolean boolean17 = option4.hasOptionalArg();
        int int18 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: a :: class org.apache.commons.cli.Option ]", "", true, "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: a :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a [ARG...] :: a ]", "a", false, "[ option:  [ option:   ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ARG...] :: a ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        option4.setOptionalArg(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getLongOpt();
        boolean boolean8 = option1.hasLongOpt();
        java.lang.String str9 = option1.getDescription();
        option1.setLongOpt("[ option: a  :: null ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        boolean boolean12 = option4.hasValueSeparator();
        option4.setRequired(false);
        java.lang.String str15 = option4.getLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]", "[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]", true, "[ option:   :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a  ::  ]", "[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        java.lang.String str16 = option1.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "a" + "'", str16, "a");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:  [ option:   ::  ]  [ARG] ::  ]", false, "[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:  [ option:   ::  ]  [ARG] ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
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
        java.lang.String str17 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:    [ARG] :: [ option: a [ option:   ::  ]  :: a ] ]" + "'", str17, "[ option:    [ARG] :: [ option: a [ option:   ::  ]  :: a ] ]");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.Object obj6 = option4.getType();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getDescription();
        option4.addValueForProcessing("[ option: a  [ARG] :: a ]");
        option4.setArgs((int) '4');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "\000", false, "[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        option4.clearValues();
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        java.lang.String str10 = option4.getValue((int) (byte) -1);
        boolean boolean11 = option4.hasValueSeparator();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        option4.setArgName("hi!");
        boolean boolean14 = option4.hasValueSeparator();
        option4.setArgs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]", "[ option:    [ARG] :: hi! ]", false, "[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        int int19 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        option2.setArgName("[ option:    [ARG] ::  ]");
        boolean boolean7 = option2.hasArgs();
        java.lang.Object obj8 = option2.getType();
        java.lang.Object obj9 = null;
        boolean boolean10 = option2.equals(obj9);
        boolean boolean11 = option2.hasValueSeparator();
        boolean boolean12 = option2.hasArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
        option4.setRequired(true);
        boolean boolean24 = option4.hasOptionalArg();
        java.lang.String str25 = option4.getValue();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        boolean boolean2 = option1.hasArgs();
        int int3 = option1.getArgs();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean9 = option8.hasLongOpt();
        option8.setRequired(false);
        boolean boolean12 = option8.hasArg();
        boolean boolean13 = option8.acceptsArg();
        boolean boolean14 = option8.hasLongOpt();
        java.lang.String[] strArray15 = option8.getValues();
        boolean boolean16 = option8.requiresArg();
        java.lang.String[] strArray17 = option8.getValues();
        java.lang.String[] strArray18 = option8.getValues();
        option8.setDescription("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        option8.setArgName("");
        boolean boolean23 = option8.hasValueSeparator();
        java.lang.String str24 = option8.getLongOpt();
        java.lang.String str26 = option8.getValue("");
        boolean boolean27 = option1.equals((java.lang.Object) "");
        java.lang.Object obj28 = option1.clone();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "[ option:  [ARG...] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "[ option:  [ARG...] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "[ option:  [ARG...] :: null :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        java.lang.Object obj25 = option4.getType();
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
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        option1.setDescription("a");
        java.lang.String str10 = option1.toString();
        option1.setRequired(false);
        java.lang.String str13 = option1.toString();
        java.lang.String str14 = option1.getValue();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a  :: a ]" + "'", str10, "[ option: a  :: a ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option: a  :: a ]" + "'", str13, "[ option: a  :: a ]");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
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
        option4.setArgs((int) (short) 100);
        java.lang.String str18 = option4.toString();
        char char19 = option4.getValueSeparator();
        boolean boolean20 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:   [ARG...] ::  ]" + "'", str18, "[ option:   [ARG...] ::  ]");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        java.util.List list8 = option2.getValuesList();
        boolean boolean9 = option2.hasArg();
        boolean boolean10 = option2.hasLongOpt();
        option2.setLongOpt("[ option:    [ARG] :: a ]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        option4.clearValues();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasOptionalArg();
        java.lang.String str11 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
        java.lang.String str32 = option18.getArgName();
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
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        int int5 = option1.getArgs();
        java.lang.String str7 = option1.getValue((int) (short) 10);
        boolean boolean8 = option1.hasOptionalArg();
        int int9 = option1.getId();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean15 = option14.hasLongOpt();
        option14.setRequired(false);
        boolean boolean18 = option14.hasArg();
        boolean boolean19 = option14.acceptsArg();
        option14.setValueSeparator('4');
        boolean boolean22 = option14.hasArgs();
        option14.setLongOpt("");
        java.lang.String[] strArray25 = option14.getValues();
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean31 = option30.hasLongOpt();
        boolean boolean32 = option30.isRequired();
        boolean boolean33 = option30.hasArgName();
        java.lang.String str35 = option30.getValue("");
        option30.setLongOpt("[ option:    [ARG] ::  ]");
        java.lang.String str38 = option30.getArgName();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.Class<?> wildcardClass41 = option40.getClass();
        option30.setType((java.lang.Class) wildcardClass41);
        option14.setType((java.lang.Class) wildcardClass41);
        option1.setType((java.lang.Class) wildcardClass41);
        org.apache.commons.cli.OptionBuilder optionBuilder45 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass41);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(optionBuilder45);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:    [ARG] :: [ option: a [ option:   ::  ]  :: a ] ]", false, "[ option:  [ option: a [ option:   ::  ]  :: a ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    [ARG] :: [ option: a [ option:   ::  ]  :: a ] ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        java.lang.String[] strArray13 = option4.getValues();
        boolean boolean14 = option4.hasLongOpt();
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str17 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
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
        option4.setArgName("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
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
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
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
        option4.setRequired(false);
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
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        // The following exception was thrown during execution in test generation
        try {
            int int50 = option25.getId();
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
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
        option4.setLongOpt("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
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
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
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
        java.lang.Object obj18 = option2.getType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str6 = option2.getArgName();
        java.lang.Class<?> wildcardClass7 = option2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]", "[ option:  [ option:   ::  ]  [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ARG...] :: null :: class org.apache.commons.cli.Option ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        boolean boolean9 = option4.requiresArg();
        boolean boolean10 = option4.hasValueSeparator();
        boolean boolean11 = option4.requiresArg();
        java.lang.Object obj12 = option4.clone();
        java.lang.String str14 = option4.getValue(1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        java.lang.String str17 = option4.getValue("[ option: a [ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]  :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str17, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: null ]", true, "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "[ option: a  :: [ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ] ]");
        boolean boolean4 = option3.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        boolean boolean11 = option4.hasLongOpt();
        java.lang.String str13 = option4.getValue("");
        boolean boolean14 = option4.hasOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.acceptsArg();
        java.lang.String str9 = option4.getValue(0);
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        java.lang.String str12 = option4.getLongOpt();
        boolean boolean13 = option4.hasLongOpt();
        int int14 = option4.getArgs();
        option4.clearValues();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        int int9 = option4.getArgs();
        java.lang.String str11 = option4.getValue((int) ' ');
        option4.setLongOpt("[ option: a  :: null ]");
        java.lang.String[] strArray14 = option4.getValues();
        int int15 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        java.lang.String[] strArray12 = option4.getValues();
        java.lang.String str13 = option4.getKey();
        option4.clearValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        java.lang.Class class3 = null;
        option2.setType(class3);
        option2.clearValues();
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.getOpt();
        option4.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str10 = option4.getValue("[ option:    [ARG] :: [ option:   ::  ] ]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] :: [ option:   ::  ] ]" + "'", str10, "[ option:    [ARG] :: [ option:   ::  ] ]");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        option4.setRequired(false);
        boolean boolean11 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("a");
        option1.setLongOpt("[ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]");
        char char4 = option1.getValueSeparator();
        java.lang.Object obj5 = option1.clone();
        option1.setArgName("[ option:  [ option: a  :: null :: class org.apache.commons.cli.Option ]  ::  ]");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(obj5);
// flaky "4) test2971(org.apache.commons.cli.RegressionTest5)":         org.junit.Assert.assertEquals(obj5.toString(), "[ option: a [ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]  :: null ]");
// flaky "3) test2971(org.apache.commons.cli.RegressionTest5)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option: a [ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]  :: null ]");
// flaky "3) test2971(org.apache.commons.cli.RegressionTest5)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option: a [ option:    [ARG] ::  :: class org.apache.commons.cli.Option ]  :: null ]");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        java.lang.String str5 = option2.getDescription();
        java.lang.String str7 = option2.getValue((int) (byte) 100);
        boolean boolean8 = option2.acceptsArg();
        java.lang.String str9 = option2.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.toString();
        option4.setRequired(true);
        java.lang.String str10 = option4.toString();
        java.lang.Object obj11 = option4.getType();
        option4.clearValues();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean18 = option17.hasLongOpt();
        boolean boolean19 = option17.isRequired();
        boolean boolean20 = option17.hasArgName();
        java.lang.String str21 = option17.getArgName();
        java.lang.Object obj22 = option17.clone();
        java.lang.String str23 = option17.toString();
        option17.setRequired(true);
        option17.clearValues();
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean32 = option31.hasLongOpt();
        java.lang.String str33 = option31.getKey();
        option31.setLongOpt("[ option:    [ARG] ::  ]");
        option31.setRequired(false);
        java.lang.String str38 = option31.getValue();
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean44 = option43.hasLongOpt();
        boolean boolean45 = option43.isRequired();
        option43.setArgName("hi!");
        java.lang.Class<?> wildcardClass48 = option43.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder49 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass48);
        org.apache.commons.cli.OptionBuilder optionBuilder50 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass48);
        option31.setType((java.lang.Class) wildcardClass48);
        option17.setType((java.lang.Class) wildcardClass48);
        option4.setType((java.lang.Class) wildcardClass48);
        java.lang.Object obj54 = option4.getType();
        boolean boolean55 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str23, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(optionBuilder49);
        org.junit.Assert.assertNotNull(optionBuilder50);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        boolean boolean11 = option4.hasOptionalArg();
        boolean boolean12 = option4.hasArgs();
        boolean boolean13 = option4.isRequired();
        option4.setValueSeparator('a');
        option4.setOptionalArg(true);
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        option4.setOptionalArg(true);
        option4.setLongOpt("");
        java.lang.String[] strArray15 = option4.getValues();
        boolean boolean16 = option4.hasValueSeparator();
        boolean boolean17 = option4.isRequired();
        char char18 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        option4.setLongOpt("");
        java.lang.String str12 = option4.getOpt();
        option4.addValueForProcessing("[ option: a  :: [ option:  [ option:    [ARG] ::  ]  [ARG] ::  ] ]");
        option4.setValueSeparator('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = option4.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        java.lang.String str8 = option4.getOpt();
        java.lang.String str10 = option4.getValue("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        boolean boolean11 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]" + "'", str10, "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str7 = option4.getOpt();
        option4.setLongOpt("hi!");
        option4.setValueSeparator('4');
        boolean boolean12 = option4.hasArgName();
        java.lang.String str14 = option4.getValue((int) ' ');
        java.lang.Object obj15 = option4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = option4.addValue("[ option:    [ARG] ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        java.lang.String str65 = option2.toString();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[ option:   :: hi! ]" + "'", str65, "[ option:   :: hi! ]");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
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
        java.lang.String str26 = option4.getKey();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
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
        boolean boolean26 = option4.hasLongOpt();
        boolean boolean27 = option4.hasLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = option4.addValue("[ option:  hi!  :: [ option: a  [ARG] :: a ] ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        java.lang.Object obj6 = option1.getType();
        java.lang.String str7 = option1.getLongOpt();
        option1.setRequired(false);
        option1.setOptionalArg(true);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String[] strArray11 = option4.getValues();
        boolean boolean12 = option4.acceptsArg();
        java.lang.String str13 = option4.getKey();
        option4.setValueSeparator('a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        boolean boolean6 = option4.hasArgs();
        int int7 = option4.getArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "hi!");
        java.lang.String str4 = option3.getArgName();
        java.lang.String str5 = option3.getArgName();
        boolean boolean6 = option3.requiresArg();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
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
        option2.setValueSeparator('\000');
        option2.setLongOpt("[ option:   :: hi! ]");
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
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getLongOpt();
        option4.setOptionalArg(true);
        java.lang.Class<?> wildcardClass11 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
        java.lang.String str21 = option4.getOpt();
        option4.setValueSeparator(' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
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
        option4.setRequired(true);
        boolean boolean24 = option4.hasOptionalArg();
        option4.setOptionalArg(false);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        boolean boolean18 = option4.hasLongOpt();
        boolean boolean19 = option4.hasValueSeparator();
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("a", "[ option:    [ARG] ::  ]", false, "hi!");
        boolean boolean5 = option4.hasLongOpt();
        char char6 = option4.getValueSeparator();
        option4.setValueSeparator('\000');
        java.lang.String str10 = option4.getValue("[ option: a  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a  :: null ]" + "'", str10, "[ option: a  :: null ]");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        java.lang.String str4 = option3.getValue();
        java.lang.String str5 = option3.getOpt();
        java.lang.String str6 = option3.getValue();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String str4 = option1.getLongOpt();
        boolean boolean5 = option1.isRequired();
        option1.setArgs((int) (short) 1);
        char char8 = option1.getValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
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
        boolean boolean28 = option4.hasOptionalArg();
        option4.setArgName("[ option:   ::  ]");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("[ option:    [ARG] :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:    [ARG] :: hi! ]" + "'", str8, "[ option:    [ARG] :: hi! ]");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
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
        boolean boolean19 = option4.hasValueSeparator();
        java.lang.String str20 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ option:    ::  ]" + "'", str20, "[ option:    ::  ]");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
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
        boolean boolean18 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str11 = option4.getValue("a");
        java.lang.String str12 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
        option4.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }
}
