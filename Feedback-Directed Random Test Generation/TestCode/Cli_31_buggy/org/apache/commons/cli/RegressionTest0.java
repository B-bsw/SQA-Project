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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_SYNTAX_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "usage: " + "'", str0, "usage: ");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("usage: ", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'usage: ' contains an illegal character : ':'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option0 = org.apache.commons.cli.OptionBuilder.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify longopt");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_DESC_PAD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'usage: ' contains an illegal character : ':'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) '4');
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + " " + "'", str0, " ");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        java.lang.String str2 = option1.getDescription();
        org.junit.Assert.assertNotNull(option1);
// flaky "1) test011(org.apache.commons.cli.RegressionTest0)":         org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        int int4 = option1.getId();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) int4);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        int int4 = option1.getId();
        java.lang.String str5 = option1.getArgName();
        boolean boolean6 = option1.hasArgName();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.junit.Assert.assertNotNull(optionBuilder0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        int int4 = option1.getId();
        int int5 = option1.getId();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 74 + "'", int0 == 74);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        java.lang.Class<?> wildcardClass4 = option1.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArg();
        org.junit.Assert.assertNotNull(optionBuilder0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArg(true);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.withValueSeparator();
        org.junit.Assert.assertNotNull(optionBuilder0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = option1.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("arg", "arg");
        boolean boolean3 = option2.hasArg();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("usage: ");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("arg", "arg");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = option2.addValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        option1.setOptionalArg(false);
        java.lang.String str6 = option1.getDescription();
        boolean boolean7 = option1.acceptsArg();
        org.junit.Assert.assertNotNull(option1);
// flaky "2) test025(org.apache.commons.cli.RegressionTest0)":         org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasArg();
        org.junit.Assert.assertNotNull(optionBuilder0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        java.lang.String str5 = option1.getValue("usage: ");
        java.lang.String str6 = option1.getOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = option1.addValue(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_OPT_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int0 = org.apache.commons.cli.Option.UNLIMITED_VALUES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArg(false);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getArgName();
        option1.clearValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("hi!");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LEFT_PAD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        option1.setLongOpt("hi!");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        java.util.List list5 = option1.getValuesList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = option1.addValue("[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("usage: ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'usage: ' contains an illegal character : ':'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('a');
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(100);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("a");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        option1.setRequired(false);
        option1.setLongOpt("arg");
        java.lang.String str9 = option1.getValue((int) (short) -1);
        boolean boolean10 = option1.isRequired();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "3) test040(org.apache.commons.cli.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int0 = org.apache.commons.cli.Option.UNINITIALIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        java.lang.String str4 = option1.getLongOpt();
        option1.clearValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        boolean boolean4 = option1.hasArgs();
        java.util.List list5 = option1.getValuesList();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        java.lang.String str5 = option1.getValue("usage: ");
        option1.setType((java.lang.Object) (byte) 1);
        java.lang.String[] strArray8 = option1.getValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getArgName();
        java.lang.String str7 = option1.getArgName();
        java.lang.String str9 = option1.getValue("a");
        java.lang.String str10 = option1.getDescription();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_ARG_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "arg" + "'", str0, "arg");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--" + "'", str0, "--");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        int int4 = option1.getArgs();
        option1.setLongOpt("hi!");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        java.lang.String str5 = option1.getValue("usage: ");
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.isRequired(false);
        boolean boolean8 = option1.equals((java.lang.Object) optionBuilder7);
        java.lang.String str9 = option1.getDescription();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        boolean boolean4 = option1.hasArgs();
        boolean boolean5 = option1.isRequired();
        java.lang.String str6 = option1.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("-", true, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '-'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        option1.setRequired(false);
        option1.clearValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription(" ");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        java.util.List list5 = option1.getValuesList();
        int int6 = option1.getId();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a  :: null ]", true, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        java.util.List list5 = option1.getValuesList();
        java.lang.String[] strArray6 = option1.getValues();
        java.lang.String str8 = option1.getValue((int) '4');
        boolean boolean9 = option1.hasArgs();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        int int4 = option1.getId();
        java.lang.String str5 = option1.getArgName();
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create('a');
        option7.setOptionalArg(false);
        boolean boolean10 = option7.hasArgs();
        option7.setOptionalArg(false);
        option1.setType((java.lang.Object) false);
        boolean boolean14 = option1.hasOptionalArg();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) boolean14);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionBuilder15);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getArgName();
        java.lang.String[] strArray7 = option1.getValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        boolean boolean4 = option1.requiresArg();
        java.lang.String str5 = option1.getOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getArgName();
        boolean boolean7 = option1.hasArg();
        // The following exception was thrown during execution in test generation
        try {
            option1.addValueForProcessing("a");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        int int4 = option1.getId();
        java.lang.String str5 = option1.getArgName();
        option1.clearValues();
        java.lang.Object obj7 = option1.getType();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getArgName();
        option1.setArgName(" ");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("-");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option(" ", "arg", false, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name ' '");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        boolean boolean4 = option1.hasArgs();
        boolean boolean5 = option1.hasArgs();
        java.lang.Object obj6 = option1.getType();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        boolean boolean4 = option1.requiresArg();
        boolean boolean5 = option1.hasValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.io.PrintWriter printWriter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter1, (int) (short) 10, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        int int4 = option1.getId();
        option1.setDescription("arg");
        java.lang.String str8 = option1.getValue("");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        option1.setRequired(false);
        option1.setLongOpt("arg");
        boolean boolean8 = option1.hasArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        java.lang.String str5 = option1.getValue("usage: ");
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.isRequired(false);
        boolean boolean8 = option1.equals((java.lang.Object) optionBuilder7);
        java.lang.Object obj9 = option1.getType();
        boolean boolean10 = option1.hasLongOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("arg", true, "arg");
        boolean boolean4 = option3.isRequired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("usage: ", "-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'usage: ' contains an illegal character : ':'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        option1.setRequired(false);
        option1.setLongOpt("arg");
        java.lang.Object obj8 = option1.clone();
        boolean boolean9 = option1.hasArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[ option: a arg  :: null ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[ option: a arg  :: null ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[ option: a arg  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "-";
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "", " ", options7, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        int int4 = option1.getId();
        java.lang.String str5 = option1.getArgName();
        option1.setArgName("");
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('a');
        option9.setOptionalArg(false);
        java.lang.String str13 = option9.getValue("usage: ");
        option9.setType((java.lang.Object) (byte) 1);
        option9.setArgName("hi!");
        option1.setType((java.lang.Object) "hi!");
        java.lang.String str19 = option1.toString();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option: a  :: null :: hi! ]" + "'", str19, "[ option: a  :: null :: hi! ]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        option1.setRequired(false);
        java.lang.String str6 = option1.getKey();
        java.lang.String str7 = option1.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getArgName();
        java.lang.Object obj7 = option1.getType();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        option1.setRequired(false);
        option1.setLongOpt("arg");
        java.lang.String str9 = option1.getValue((int) (short) -1);
        java.lang.String str10 = option1.getLongOpt();
        java.lang.String[] strArray11 = option1.getValues();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "a";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter4, 100, "hi!", options7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("a");
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "--", "[ option: a  :: null :: hi! ]", options7, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", " ", options4, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getArgName();
        java.lang.String str7 = option1.getDescription();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        option1.setOptionalArg(false);
        java.lang.String str6 = option1.getDescription();
        boolean boolean7 = option1.hasLongOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getArgName();
        boolean boolean7 = option1.hasArg();
        java.lang.String str8 = option1.getLongOpt();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 10);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "", options4, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("          ");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        option1.setRequired(false);
        option1.setArgs((int) (byte) 1);
        boolean boolean8 = option1.hasArgs();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("arg", "arg");
        java.util.List list3 = option2.getValuesList();
        java.lang.String str5 = option2.getValue((int) (short) -1);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        boolean boolean4 = option1.hasArgs();
        boolean boolean5 = option1.hasArg();
        boolean boolean6 = option1.isRequired();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        boolean boolean4 = option1.hasArgs();
        boolean boolean5 = option1.hasArgs();
        char char6 = option1.getValueSeparator();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "a";
        int int3 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) -1, "[ option: a  :: null :: hi! ]", "arg", options7, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        java.util.List list5 = option1.getValuesList();
        java.lang.String[] strArray6 = option1.getValues();
        java.lang.String[] strArray7 = option1.getValues();
        java.lang.String str8 = option1.toString();
        boolean boolean9 = option1.isRequired();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option: a  :: null ]" + "'", str8, "[ option: a  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("arg", true, "arg");
        java.lang.String str4 = option3.getOpt();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str3 = helpFormatter0.createPadding(10);
        helpFormatter0.setLeftPadding((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("a");
        java.lang.String str3 = option1.getValue("--");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('\000');
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str2 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding((-1));
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "usage: " + "'", str2, "usage: ");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        option1.setOptionalArg(false);
        boolean boolean7 = option1.equals((java.lang.Object) "-");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str3 = helpFormatter0.createPadding(10);
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = 1;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", " ", options9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str2 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.rtrim("a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "usage: " + "'", str2, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        boolean boolean4 = option1.requiresArg();
        // The following exception was thrown during execution in test generation
        try {
            option1.addValueForProcessing("[ option: a  :: arg ]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("a");
        helpFormatter0.setNewLine(" ");
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, (int) '4', "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str2 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.createPadding((int) (short) 100);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        helpFormatter0.setLongOptPrefix("hi!");
        int int9 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 97, "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "usage: " + "'", str2, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "-";
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "arg", "          ", options7, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str2 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding((-1));
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "                                                                                                    ", options7, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "usage: " + "'", str2, "usage: ");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasArgs();
        org.junit.Assert.assertNotNull(optionBuilder0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        boolean boolean4 = option1.hasArgs();
        boolean boolean5 = option1.hasArgs();
        java.lang.String str6 = option1.getKey();
        java.lang.String str7 = option1.toString();
        int int8 = option1.getId();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option: a [ARG...] :: null ]" + "'", str7, "[ option: a [ARG...] :: null ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '#'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str3 = helpFormatter0.createPadding(10);
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.setArgName("[ option: a  :: null :: hi! ]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "a";
        java.util.Comparator comparator3 = helpFormatter0.optionComparator;
        java.lang.String str4 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "[ option: a  :: null ]", "[ option: a  :: arg ]", options5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        int int4 = option1.getId();
        java.lang.String str5 = option1.getArgName();
        option1.setArgName("");
        java.lang.String str8 = option1.getArgName();
        java.lang.String str9 = option1.getValue();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        java.util.List list5 = option1.getValuesList();
        java.lang.String[] strArray6 = option1.getValues();
        java.lang.String str7 = option1.getValue();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLeftPad = 0;
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter3.defaultNewLine = "a";
        java.util.Comparator comparator6 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator6;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter8.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter11.defaultNewLine = "a";
        java.util.Comparator comparator14 = helpFormatter11.getOptionComparator();
        helpFormatter8.optionComparator = comparator14;
        helpFormatter0.optionComparator = comparator14;
        helpFormatter0.defaultDescPad = (-2);
        helpFormatter0.setLongOptPrefix("[ option: a  :: null ]");
        int int21 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str3 = helpFormatter0.createPadding(10);
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = 1;
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderOptions(stringBuffer7, (int) (short) 0, options9, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "a";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str5 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        option1.setRequired(false);
        option1.setLongOpt("arg");
        java.lang.String str8 = option1.getArgName();
        java.lang.String str9 = option1.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("arg", "arg");
        boolean boolean3 = option2.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("arg", true, "arg");
        option3.setArgs(0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        java.util.List list5 = option1.getValuesList();
        java.lang.String[] strArray6 = option1.getValues();
        java.lang.String[] strArray7 = option1.getValues();
        java.lang.String str8 = option1.toString();
        option1.setOptionalArg(false);
        java.lang.String str11 = option1.getKey();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option: a  :: null ]" + "'", str8, "[ option: a  :: null ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("[ option: a [ARG...] :: null ]", false, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a [ARG...] :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("          ", true, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '          ' contains an illegal character : ' '");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: null ]", "[ option: a  :: null ]", true, "[ option: a [ARG...] :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("[ option: a  :: arg ]");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        java.lang.String str5 = option1.getValue("usage: ");
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.isRequired(false);
        boolean boolean8 = option1.equals((java.lang.Object) optionBuilder7);
        java.lang.Object obj9 = option1.getType();
        option1.setArgName(" ");
        option1.setArgName("arg");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("a", "-");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "-";
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((-2), " ", " ", options7, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter3.defaultNewLine = "a";
        java.util.Comparator comparator6 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator6;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter8.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter11.defaultNewLine = "a";
        java.util.Comparator comparator14 = helpFormatter11.getOptionComparator();
        helpFormatter8.optionComparator = comparator14;
        helpFormatter0.optionComparator = comparator14;
        helpFormatter0.defaultDescPad = (-2);
        java.lang.String str19 = helpFormatter0.defaultNewLine;
        java.lang.String str20 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str2 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.createPadding((int) (short) 100);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        helpFormatter0.setLongOptPrefix("hi!");
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.setNewLine("usage: ");
        int int15 = helpFormatter0.findWrapPos("          ", 3, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "usage: " + "'", str2, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.isRequired();
        java.lang.Class<?> wildcardClass1 = optionBuilder0.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str3 = helpFormatter0.createPadding(10);
        java.lang.String str4 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        java.lang.String str5 = option1.getValue("usage: ");
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.isRequired(false);
        boolean boolean8 = option1.equals((java.lang.Object) optionBuilder7);
        // The following exception was thrown during execution in test generation
        try {
            option1.addValueForProcessing("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        boolean boolean4 = option1.hasArgs();
        boolean boolean5 = option1.hasArgs();
        java.lang.String str6 = option1.getKey();
        java.lang.String str7 = option1.toString();
        option1.setDescription("arg");
        java.lang.String str10 = option1.toString();
        java.lang.String str12 = option1.getValue((int) (short) -1);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option: a  :: null ]" + "'", str7, "[ option: a  :: null ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ option: a  :: arg ]" + "'", str10, "[ option: a  :: arg ]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        java.util.List list5 = option1.getValuesList();
        java.lang.String[] strArray6 = option1.getValues();
        java.lang.String str8 = option1.getValue((int) '4');
        option1.setRequired(false);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("\n", "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '?'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str2 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "[ option: a  :: null :: hi! ]";
        org.apache.commons.cli.HelpFormatter helpFormatter5 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter6.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter9.defaultNewLine = "a";
        java.util.Comparator comparator12 = helpFormatter9.getOptionComparator();
        helpFormatter6.optionComparator = comparator12;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter14.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter17.defaultNewLine = "a";
        java.util.Comparator comparator20 = helpFormatter17.getOptionComparator();
        helpFormatter14.optionComparator = comparator20;
        helpFormatter6.optionComparator = comparator20;
        helpFormatter5.optionComparator = comparator20;
        helpFormatter0.optionComparator = comparator20;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "usage: " + "'", str2, "usage: ");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        option1.setOptionalArg(false);
        int int6 = option1.getId();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str2 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.createPadding((int) (short) 100);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        helpFormatter0.setLongOptPrefix("hi!");
        int int9 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter11.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter14.defaultNewLine = "a";
        java.util.Comparator comparator17 = helpFormatter14.getOptionComparator();
        helpFormatter11.optionComparator = comparator17;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter19.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter22.defaultNewLine = "a";
        java.util.Comparator comparator25 = helpFormatter22.getOptionComparator();
        helpFormatter19.optionComparator = comparator25;
        helpFormatter11.optionComparator = comparator25;
        helpFormatter10.optionComparator = comparator25;
        helpFormatter0.setOptionComparator(comparator25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "usage: " + "'", str2, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator25);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        java.lang.String str5 = option1.getValue("usage: ");
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.isRequired(false);
        boolean boolean8 = option1.equals((java.lang.Object) optionBuilder7);
        java.lang.Object obj9 = option1.getType();
        option1.setArgName(" ");
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean14 = option13.isRequired();
        java.lang.String str15 = option13.getArgName();
        option13.setRequired(false);
        option13.setLongOpt("arg");
        boolean boolean20 = option1.equals((java.lang.Object) option13);
        option13.setArgs((int) '\000');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "a";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = helpFormatter0.createPadding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        option1.setRequired(false);
        option1.setLongOpt("arg");
        java.lang.String str9 = option1.getValue((int) (short) -1);
        java.lang.String str10 = option1.getLongOpt();
        option1.setRequired(true);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        java.util.List list5 = option1.getValuesList();
        java.lang.String[] strArray6 = option1.getValues();
        java.lang.String str8 = option1.getValue((int) '4');
        java.lang.String str10 = option1.getValue((int) (byte) 10);
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        int int12 = helpFormatter11.getDescPadding();
        helpFormatter11.setDescPadding((int) '\000');
        helpFormatter11.defaultLeftPad = (short) 0;
        helpFormatter11.defaultSyntaxPrefix = "";
        boolean boolean19 = option1.equals((java.lang.Object) helpFormatter11);
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter11.printHelp(printWriter20, (-2), "arg", "\n", options24, (int) 'a', 3, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter3.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter6.defaultNewLine = "a";
        java.util.Comparator comparator9 = helpFormatter6.getOptionComparator();
        helpFormatter3.optionComparator = comparator9;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter11.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter14.defaultNewLine = "a";
        java.util.Comparator comparator17 = helpFormatter14.getOptionComparator();
        helpFormatter11.optionComparator = comparator17;
        helpFormatter3.optionComparator = comparator17;
        option1.setType((java.lang.Object) helpFormatter3);
        java.lang.String str21 = helpFormatter3.getLongOptPrefix();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("a");
        java.util.Comparator comparator4 = helpFormatter0.getOptionComparator();
        helpFormatter0.setWidth((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 'a';
        java.util.Comparator comparator4 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(comparator4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 'a';
        helpFormatter0.defaultOptPrefix = "[ option: a [ARG...] :: null ]";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.requiresArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        java.util.List list5 = option1.getValuesList();
        java.lang.String[] strArray6 = option1.getValues();
        java.lang.String str8 = option1.getValue((int) '4');
        java.lang.String str10 = option1.getValue((int) (byte) 10);
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        int int12 = helpFormatter11.getDescPadding();
        helpFormatter11.setDescPadding((int) '\000');
        helpFormatter11.defaultLeftPad = (short) 0;
        helpFormatter11.defaultSyntaxPrefix = "";
        boolean boolean19 = option1.equals((java.lang.Object) helpFormatter11);
        java.lang.String str20 = helpFormatter11.getLongOptPrefix();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        option1.setRequired(false);
        option1.setLongOpt("arg");
        java.lang.String str9 = option1.getValue((int) (short) -1);
        boolean boolean10 = option1.hasLongOpt();
        int int11 = option1.getId();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter3.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter6.defaultNewLine = "a";
        java.util.Comparator comparator9 = helpFormatter6.getOptionComparator();
        helpFormatter3.optionComparator = comparator9;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter11.defaultOptPrefix = "[ option: a  :: null ]";
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter14.defaultNewLine = "a";
        java.util.Comparator comparator17 = helpFormatter14.getOptionComparator();
        helpFormatter11.optionComparator = comparator17;
        helpFormatter3.optionComparator = comparator17;
        option1.setType((java.lang.Object) helpFormatter3);
        helpFormatter3.defaultLongOptPrefix = "[ option: a  :: null :: hi! ]";
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str3 = helpFormatter0.createPadding(10);
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", " ", options6, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        option1.setOptionalArg(false);
        java.lang.String str5 = option1.getValue("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        int int7 = helpFormatter6.getDescPadding();
        java.lang.String str8 = helpFormatter6.getSyntaxPrefix();
        helpFormatter6.setLeftPadding((-1));
        int int11 = helpFormatter6.getDescPadding();
        option1.setType((java.lang.Object) helpFormatter6);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("a");
        java.util.Comparator comparator4 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, (-2), "hi!", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "a";
        helpFormatter0.setArgName("");
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("          ");
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, (int) (byte) 100, options10, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("-", false, "[ option: a  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '-'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "a";
        java.util.Comparator comparator3 = helpFormatter0.optionComparator;
        helpFormatter0.setArgName("-");
        java.lang.String str6 = helpFormatter0.getLongOptSeparator();
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ option: a  :: null :: hi! ]", "[ option: a  :: null :: hi! ]", false, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option: a  :: null :: hi! ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str3 = helpFormatter0.createPadding(10);
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setNewLine("a");
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("a");
        helpFormatter0.setNewLine(" ");
        java.util.Comparator comparator6 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
        org.junit.Assert.assertNotNull(comparator6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("arg", "-");
        option2.setArgName("");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getArgName();
        boolean boolean7 = option1.hasArg();
        java.lang.Object obj8 = option1.getType();
        java.lang.String str9 = option1.getValue();
        boolean boolean10 = option1.acceptsArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str2 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.createPadding((int) (short) 100);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderWrappedText(stringBuffer7, 74, (int) (short) 10, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "usage: " + "'", str2, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getDescPadding();
        java.lang.String str2 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.createPadding((int) (short) 100);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setDescPadding((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "usage: " + "'", str2, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str4 = option1.getValue("hi!");
        boolean boolean5 = option1.acceptsArg();
        java.lang.String str6 = option1.getArgName();
        boolean boolean7 = option1.hasArg();
        java.lang.Object obj8 = option1.getType();
        java.lang.String str9 = option1.getValue();
        // The following exception was thrown during execution in test generation
        try {
            option1.addValueForProcessing("                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        boolean boolean2 = option1.isRequired();
        java.lang.String str3 = option1.getArgName();
        int int4 = option1.getId();
        boolean boolean5 = option1.requiresArg();
        boolean boolean6 = option1.requiresArg();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "[ option: a  :: null ]";
        helpFormatter0.defaultSyntaxPrefix = "";
        int int5 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }
}
