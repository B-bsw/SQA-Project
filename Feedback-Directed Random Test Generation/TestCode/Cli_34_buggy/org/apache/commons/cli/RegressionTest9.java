package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasArg();
        option4.setRequired(false);
        java.lang.String str8 = option4.toString();
        boolean boolean9 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str8, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        option17.setLongOpt("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  :: class org.apache.commons.cli.Option ]");
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
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        java.lang.Class<?> wildcardClass16 = option4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:   :: a ]", false, "");
        boolean boolean5 = option4.hasValueSeparator();
        java.lang.String str6 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        boolean boolean3 = option2.requiresArg();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("a", "hi!");
        boolean boolean7 = option2.equals((java.lang.Object) option6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((-1));
        boolean boolean10 = option6.equals((java.lang.Object) optionBuilder9);
        boolean boolean11 = option6.hasLongOpt();
        option6.setArgs(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        java.util.List list20 = option4.getValuesList();
        boolean boolean21 = option4.hasArgs();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("[ option: a  ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.isRequired();
        java.lang.String str10 = option4.getValue("[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        java.util.List list11 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str10, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        option4.setArgs((int) (byte) 0);
        java.lang.String str11 = option4.getOpt();
        boolean boolean12 = option4.hasLongOpt();
        java.lang.String str14 = option4.getValue("");
        char char15 = option4.getValueSeparator();
        java.lang.String str17 = option4.getValue("[ option: a a  ::  ]");
        boolean boolean18 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option: a a  ::  ]" + "'", str17, "[ option: a a  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.Object obj5 = option4.clone();
        java.lang.String str6 = option4.getOpt();
        boolean boolean7 = option4.hasArg();
        boolean boolean8 = option4.hasLongOpt();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", "", true, "");
        option13.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean16 = option13.hasValueSeparator();
        java.lang.String str17 = option13.getValue();
        boolean boolean18 = option13.hasOptionalArg();
        java.util.List list19 = option13.getValuesList();
        option13.setOptionalArg(true);
        java.lang.Class<?> wildcardClass22 = option13.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder23 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass22);
        option4.setType((java.lang.Class) wildcardClass22);
        java.lang.Object obj25 = option4.getType();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(optionBuilder23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class org.apache.commons.cli.Option");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class org.apache.commons.cli.Option");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
        int int23 = option4.getArgs();
        java.lang.String str24 = option4.getDescription();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str24, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'a' + "'", char12 == 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withArgName("");
        boolean boolean12 = option4.equals((java.lang.Object) "");
        option4.addValueForProcessing("a");
        option4.setOptionalArg(false);
        option4.setArgName("[ option: a [ option:    [ARG] :: hi! ]  :: a ]");
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", true, "a");
        java.lang.String str24 = option22.getValue("[ option:   ::  ]");
        boolean boolean25 = option22.acceptsArg();
        boolean boolean26 = option22.hasArgs();
        java.lang.Class<?> wildcardClass27 = option22.getClass();
        option4.setType((java.lang.Class) wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ option:   ::  ]" + "'", str24, "[ option:   ::  ]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        boolean boolean13 = option2.requiresArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = option2.addValue("[ option: a  ::  :: class org.apache.commons.cli.Option ]");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("a", false, "a");
        boolean boolean4 = option3.hasArgName();
        java.lang.Class<?> wildcardClass5 = option3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
        int int18 = option4.getArgs();
        option4.clearValues();
        option4.setLongOpt("[ option: a  :: null :: class org.apache.commons.cli.Option ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        option4.addValueForProcessing("[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        java.lang.String str12 = option4.getValue();
        java.lang.String str13 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        int int35 = option18.getArgs();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        char char11 = option4.getValueSeparator();
        option4.setArgName("[ option: a  [ARG] :: a ]");
        boolean boolean14 = option4.isRequired();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        boolean boolean17 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.hasLongOpt();
        java.lang.String[] strArray11 = option4.getValues();
        option4.setDescription("a");
        java.lang.String str14 = option4.getLongOpt();
        boolean boolean15 = option4.hasOptionalArg();
        option4.addValueForProcessing("[ option:    [ARG] ::  ]");
        char char18 = option4.getValueSeparator();
        java.lang.String str19 = option4.getOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        java.lang.String str4 = option2.getValue("[ option:    [ARG] ::  ]");
        boolean boolean5 = option2.hasArgs();
        option2.setLongOpt("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str9 = option2.getValue("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str11 = option2.getValue((int) (short) 1);
        boolean boolean12 = option2.hasArg();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str4, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: a [ option:   ::  ]  :: a ]" + "'", str9, "[ option: a [ option:   ::  ]  :: a ]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        option4.clearValues();
        option4.setArgName("[ option: a  [ARG] :: a ]");
        option4.setArgs((int) (short) -1);
        java.lang.String str13 = option4.getKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        boolean boolean27 = option4.isRequired();
        boolean boolean28 = option4.hasArg();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getValue();
        java.lang.Object obj6 = option4.getType();
        boolean boolean7 = option4.hasValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setRequired(false);
        java.lang.Class<?> wildcardClass12 = option9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass12);
        option4.setType((java.lang.Class) wildcardClass12);
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass12);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder13);
        org.junit.Assert.assertNotNull(optionBuilder15);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        java.lang.String str30 = option4.getValue();
        boolean boolean31 = option4.acceptsArg();
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
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        java.lang.String str8 = option4.getValue("hi!");
        java.lang.String[] strArray9 = option4.getValues();
        option4.addValueForProcessing("hi!");
        boolean boolean12 = option4.acceptsArg();
        java.lang.String str13 = option4.toString();
        java.lang.String str14 = option4.toString();
        java.lang.String str15 = option4.toString();
        java.lang.Class<?> wildcardClass16 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str13, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str14, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str15, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "hi!");
        option2.setDescription("");
        boolean boolean5 = option2.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.isRequired();
        boolean boolean11 = option4.hasArgs();
        boolean boolean12 = option4.hasArg();
        boolean boolean13 = option4.hasArgName();
        java.util.List list14 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getArgName();
        java.lang.Object obj9 = option4.clone();
        java.lang.String str10 = option4.getLongOpt();
        java.lang.String str11 = option4.getArgName();
        boolean boolean12 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("[ option: a [ARG...] :: a ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", false, "");
        java.lang.String str5 = option4.getOpt();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
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
        java.lang.String str62 = option4.getKey();
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
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
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
        boolean boolean25 = option4.isRequired();
        java.lang.String str26 = option4.getArgName();
        java.lang.String str27 = option4.getDescription();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]" + "'", str27, "[ option: a  [ARG] :: null :: class org.apache.commons.cli.Option ]");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        int int9 = option4.getArgs();
        option4.setOptionalArg(false);
        boolean boolean12 = option4.hasArgName();
        java.lang.String str14 = option4.getValue("[ option: a  :: a ]");
        java.util.List list15 = option4.getValuesList();
        java.lang.String[] strArray16 = option4.getValues();
        boolean boolean17 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option: a  :: a ]" + "'", str14, "[ option: a  :: a ]");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        option4.clearValues();
        boolean boolean20 = option4.requiresArg();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.String str6 = option4.getKey();
        boolean boolean7 = option4.hasArgs();
        option4.clearValues();
        java.lang.String str9 = option4.getLongOpt();
        java.lang.String str11 = option4.getValue(1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
        option14.setDescription("[ option:   :: a ]");
        boolean boolean23 = option14.isRequired();
        option14.setArgs((int) (short) 100);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option: a [ARG...] :: a ]" + "'", str4, "[ option: a [ARG...] :: a ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option:    ::  ]", false, "[ option: a [ARG...] :: a ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:    ::  ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.requiresArg();
        boolean boolean9 = option4.acceptsArg();
        boolean boolean10 = option4.isRequired();
        boolean boolean11 = option4.hasArgs();
        java.lang.String str12 = option4.toString();
        option4.setLongOpt("[ option:   ::  ]");
        option4.setArgName("[ option: a [ option:   ::  ]  :: a ]");
        java.lang.String str17 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str12, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:  [ option:   ::  ]  [ARG] ::  ]" + "'", str17, "[ option:  [ option:   ::  ]  [ARG] ::  ]");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.hasArg();
        java.lang.String str10 = option4.getDescription();
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean16 = option15.hasLongOpt();
        org.apache.commons.cli.Option option18 = org.apache.commons.cli.OptionBuilder.create('4');
        option18.setRequired(false);
        java.lang.Class<?> wildcardClass21 = option18.getClass();
        option15.setType((java.lang.Class) wildcardClass21);
        boolean boolean23 = option4.equals((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(option18);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        option4.setArgName("hi!");
        boolean boolean9 = option4.requiresArg();
        java.lang.String str10 = option4.toString();
        java.lang.Object obj11 = option4.clone();
        java.lang.Object obj12 = option4.getType();
        boolean boolean13 = option4.hasArg();
        java.util.List list14 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "[ option:  hi!  :: [ option: a  [ARG] :: a ] ]", false, "[ option:  [ option: a  :: a :: class org.apache.commons.cli.Option ]  [ARG] ::  ]");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        java.lang.String str8 = option4.getDescription();
        option4.setValueSeparator('a');
        option4.setValueSeparator(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        boolean boolean15 = option4.equals((java.lang.Object) '#');
        option4.setValueSeparator('a');
        boolean boolean18 = option4.acceptsArg();
        java.lang.Class<?> wildcardClass19 = option4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
        java.lang.String str19 = option4.getValue(0);
        java.lang.Object obj20 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str12, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]" + "'", str19, "[ option:  [ option:    [ARG] ::  ]  [ARG] ::  ]");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        boolean boolean24 = option4.acceptsArg();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setRequired(false);
        java.lang.String[] strArray4 = option1.getValues();
        boolean boolean5 = option1.hasArgs();
        java.util.List list6 = option1.getValuesList();
        int int7 = option1.getId();
        java.lang.String[] strArray8 = option1.getValues();
        option1.clearValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "");
        boolean boolean3 = option2.hasArgs();
        option2.setArgs((-2));
        boolean boolean6 = option2.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        org.apache.commons.cli.Option option27 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean28 = option27.hasLongOpt();
        option27.setRequired(false);
        boolean boolean31 = option27.hasArg();
        boolean boolean32 = option27.acceptsArg();
        java.lang.String str33 = option27.toString();
        java.lang.String str34 = option27.getLongOpt();
        int int35 = option27.getArgs();
        java.lang.Object obj36 = option27.clone();
        boolean boolean37 = option14.equals((java.lang.Object) option27);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str33, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
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
        java.lang.Object obj16 = option4.clone();
        boolean boolean17 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        java.util.List list10 = option4.getValuesList();
        option4.setOptionalArg(true);
        boolean boolean13 = option4.requiresArg();
        boolean boolean14 = option4.acceptsArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        option4.clearValues();
        java.lang.String str12 = option4.getOpt();
        java.lang.String str13 = option4.getValue();
        java.lang.Object obj14 = option4.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
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
        boolean boolean15 = option4.requiresArg();
        java.lang.String str16 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        java.lang.Class class6 = null;
        option4.setType(class6);
        boolean boolean8 = option4.hasValueSeparator();
        option4.setOptionalArg(false);
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("a", false, "");
        option14.clearValues();
        boolean boolean16 = option14.hasValueSeparator();
        boolean boolean17 = option14.hasArgs();
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
        java.lang.Class<?> wildcardClass48 = option22.getClass();
        option14.setType((java.lang.Class) wildcardClass48);
        org.apache.commons.cli.OptionBuilder optionBuilder50 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Class) wildcardClass48);
        option4.setType((java.lang.Class) wildcardClass48);
        option4.setArgs(97);
        boolean boolean54 = option4.hasOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(optionBuilder50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
        boolean boolean14 = option4.hasValueSeparator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str7, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str11, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        java.lang.String str10 = option4.getValue((int) (byte) 0);
        option4.setArgName("");
        boolean boolean13 = option4.hasArgs();
        char char14 = option4.getValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = option4.addValue("[ option: a a  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        boolean boolean8 = option4.hasValueSeparator();
        boolean boolean9 = option4.isRequired();
        java.lang.String str11 = option4.getValue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        boolean boolean6 = option4.isRequired();
        boolean boolean7 = option4.hasArgName();
        java.lang.String str8 = option4.getValue();
        java.lang.String str10 = option4.getValue((int) (byte) 0);
        option4.setArgName("");
        char char13 = option4.getValueSeparator();
        java.lang.String str14 = option4.getValue();
        java.lang.String str16 = option4.getValue(100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getValue();
        boolean boolean9 = option4.hasOptionalArg();
        java.util.List list10 = option4.getValuesList();
        option4.setOptionalArg(false);
        java.lang.String str13 = option4.getArgName();
        java.util.List list14 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        option4.setLongOpt("[ option:    [ARG] ::  ]");
        boolean boolean7 = option4.hasValueSeparator();
        java.lang.String str8 = option4.getArgName();
        option4.setArgName("[ option:   ::  ]");
        java.lang.String str12 = option4.getValue((int) ' ');
        option4.setValueSeparator('a');
        option4.setArgName("[ option: a [ARG...] :: a ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
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
        option4.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[ option:    ::  ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[ option:    ::  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean5 = option4.hasLongOpt();
        option4.setRequired(false);
        boolean boolean8 = option4.hasArg();
        boolean boolean9 = option4.acceptsArg();
        java.lang.String str10 = option4.toString();
        java.lang.String str11 = option4.getLongOpt();
        option4.clearValues();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "", true, "");
        boolean boolean18 = option17.hasLongOpt();
        boolean boolean19 = option17.isRequired();
        option17.setArgName("hi!");
        java.util.List list22 = option17.getValuesList();
        java.lang.Class<?> wildcardClass23 = list22.getClass();
        boolean boolean24 = option4.equals((java.lang.Object) list22);
        option4.setRequired(false);
        boolean boolean27 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str10, "[ option:    [ARG] ::  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }
}

