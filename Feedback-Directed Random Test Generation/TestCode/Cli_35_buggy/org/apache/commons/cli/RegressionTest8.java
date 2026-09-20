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
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List list9 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options15 = options10.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList17 = options15.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options22 = options15.addOption("", "hi!", false, "");
        java.util.List list23 = options22.getRequiredOptions();
        java.util.List list24 = options22.getRequiredOptions();
        org.apache.commons.cli.Options options28 = options22.addOption("", false, "");
        java.lang.String str29 = options28.toString();
        org.apache.commons.cli.Options options34 = options28.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options41 = options36.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection42 = options36.getOptions();
        org.apache.commons.cli.Option option44 = options36.getOption("hi!");
        org.apache.commons.cli.Options options45 = options35.addOption(option44);
        org.apache.commons.cli.OptionGroup optionGroup46 = options34.getOptionGroup(option44);
        org.apache.commons.cli.OptionGroup optionGroup47 = options0.getOptionGroup(option44);
        boolean boolean49 = options0.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection50 = options0.getOptions();
        boolean boolean52 = options0.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList53 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection54 = options0.getOptionGroups();
        boolean boolean56 = options0.hasLongOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str29, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(optionCollection42);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNull(optionGroup46);
        org.junit.Assert.assertNull(optionGroup47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(optionCollection50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(optionList53);
        org.junit.Assert.assertNotNull(optionGroupCollection54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options19 = options14.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList21 = options19.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options26 = options19.addOption("", "hi!", false, "");
        boolean boolean28 = options19.hasOption("");
        org.apache.commons.cli.Options options31 = options19.addOption("", "");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options37 = options32.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection38 = options32.getOptions();
        org.apache.commons.cli.Option option40 = options32.getOption("hi!");
        org.apache.commons.cli.Options options41 = options19.addOption(option40);
        org.apache.commons.cli.Options options42 = options12.addOption(option40);
        org.apache.commons.cli.Option option44 = options42.getOption("");
        java.util.List<java.lang.String> strList46 = options42.getMatchingOptions("[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List list47 = options42.getRequiredOptions();
        java.util.List<java.lang.String> strList49 = options42.getMatchingOptions("");
        java.util.List<java.lang.String> strList51 = options42.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options54 = options42.addOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(optionCollection38);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList51);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.List list18 = options5.getRequiredOptions();
        java.util.List<java.lang.String> strList20 = options5.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection21 = options5.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options5.getOptions();
        boolean boolean24 = options5.hasOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(optionGroupCollection21);
        org.junit.Assert.assertNotNull(optionCollection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        java.util.List list15 = options12.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList16 = options12.helpOptions();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options22 = options17.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList24 = options22.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options29 = options22.addOption("", "hi!", false, "");
        boolean boolean31 = options22.hasOption("");
        org.apache.commons.cli.Options options34 = options22.addOption("", "");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options40 = options35.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options35.getOptions();
        org.apache.commons.cli.Option option43 = options35.getOption("hi!");
        org.apache.commons.cli.Options options44 = options22.addOption(option43);
        org.apache.commons.cli.Options options45 = options12.addOption(option43);
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options51 = options46.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList53 = options51.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options58 = options51.addOption("", "hi!", false, "");
        boolean boolean60 = options51.hasOption("");
        org.apache.commons.cli.Options options63 = options51.addOption("", "");
        org.apache.commons.cli.Option option65 = options63.getOption("hi!");
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options71 = options66.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection72 = options66.getOptions();
        org.apache.commons.cli.Option option74 = options66.getOption("hi!");
        org.apache.commons.cli.Option option76 = options66.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup77 = options63.getOptionGroup(option76);
        org.apache.commons.cli.Options options78 = options12.addOption(option76);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection79 = options12.getOptionGroups();
        boolean boolean81 = options12.hasLongOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList82 = options12.helpOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(optionList16);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(optionCollection41);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(option65);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(optionCollection72);
        org.junit.Assert.assertNotNull(option74);
        org.junit.Assert.assertNotNull(option76);
        org.junit.Assert.assertNull(optionGroup77);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(optionGroupCollection79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(optionList82);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options19 = options5.addOption("", "", false, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList21 = options5.helpOptions();
        java.util.List<java.lang.String> strList23 = options5.getMatchingOptions("hi!");
        boolean boolean25 = options5.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option27 = options5.getOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection28 = options5.getOptionGroups();
        java.util.List list29 = options5.getRequiredOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(optionList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(option27);
        org.junit.Assert.assertNotNull(optionGroupCollection28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        org.apache.commons.cli.Options options24 = options18.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        boolean boolean26 = options24.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.lang.String str27 = options24.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options32 = options24.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:  hi!  [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]" + "'", str27, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        boolean boolean15 = options12.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List list16 = options12.getRequiredOptions();
        boolean boolean18 = options12.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList19 = options12.helpOptions();
        java.lang.String str20 = options12.toString();
        java.util.List<org.apache.commons.cli.Option> optionList21 = options12.helpOptions();
        org.apache.commons.cli.Options options24 = options12.addOption("", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList26 = options12.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]" + "'", str20, "[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionList21);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        org.apache.commons.cli.Option option8 = options0.getOption("hi!");
        boolean boolean10 = options0.hasShortOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options0.getOptions();
        boolean boolean13 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options17 = options0.addOption("", false, "[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.lang.String str18 = options17.toString();
        boolean boolean20 = options17.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List list21 = options17.getRequiredOptions();
        java.lang.String str22 = options17.toString();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(option8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str18, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str22, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options23 = options18.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection24 = options18.getOptions();
        org.apache.commons.cli.Option option26 = options18.getOption("hi!");
        org.apache.commons.cli.Options options27 = options5.addOption(option26);
        org.apache.commons.cli.Options options32 = options27.addOption("", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        boolean boolean34 = options27.hasShortOption("");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(optionCollection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        java.util.List<java.lang.String> strList16 = options5.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List list17 = options5.getRequiredOptions();
        java.util.List<java.lang.String> strList19 = options5.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List list20 = options5.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList21 = options5.helpOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(optionList21);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        java.lang.String str12 = options5.toString();
        java.util.List<java.lang.String> strList14 = options5.getMatchingOptions("");
        java.util.List list15 = options5.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection16 = options5.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList17 = options5.helpOptions();
        boolean boolean19 = options5.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean21 = options5.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        boolean boolean23 = options5.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        boolean boolean25 = options5.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options5.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options31 = options5.addOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(optionGroupCollection16);
        org.junit.Assert.assertNotNull(optionList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(optionCollection26);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options19 = options5.addOption("", "", false, "");
        org.apache.commons.cli.Option option21 = options19.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options27 = options22.addOption("", "hi!", true, "");
        boolean boolean29 = options27.hasOption("");
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options35 = options30.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList37 = options35.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options42 = options35.addOption("", "hi!", false, "");
        java.util.List list43 = options42.getRequiredOptions();
        java.util.List list44 = options42.getRequiredOptions();
        java.util.List list45 = options42.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList46 = options42.helpOptions();
        org.apache.commons.cli.Options options47 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options52 = options47.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList54 = options52.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options59 = options52.addOption("", "hi!", false, "");
        boolean boolean61 = options52.hasOption("");
        org.apache.commons.cli.Options options64 = options52.addOption("", "");
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options70 = options65.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection71 = options65.getOptions();
        org.apache.commons.cli.Option option73 = options65.getOption("hi!");
        org.apache.commons.cli.Options options74 = options52.addOption(option73);
        org.apache.commons.cli.Options options75 = options42.addOption(option73);
        org.apache.commons.cli.Options options76 = options27.addOption(option73);
        org.apache.commons.cli.OptionGroup optionGroup77 = options19.getOptionGroup(option73);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options81 = options19.addOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]", true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNull(option21);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(optionList46);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNotNull(optionCollection71);
        org.junit.Assert.assertNotNull(option73);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNull(optionGroup77);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        org.apache.commons.cli.Option option8 = options0.getOption("hi!");
        boolean boolean10 = options0.hasShortOption("");
        java.util.List<java.lang.String> strList12 = options0.getMatchingOptions("hi!");
        boolean boolean14 = options0.hasLongOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList16 = options0.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList18 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = options0.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(option8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(optionCollection19);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        boolean boolean16 = options5.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList17 = options5.helpOptions();
        boolean boolean19 = options5.hasLongOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection20 = options5.getOptionGroups();
        java.util.List<java.lang.String> strList22 = options5.getMatchingOptions("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(optionList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        boolean boolean15 = options12.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean17 = options12.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean19 = options12.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options23 = options12.addOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options11.helpOptions();
        boolean boolean14 = options11.hasLongOption("");
        java.lang.String str15 = options11.toString();
        boolean boolean17 = options11.hasLongOption("hi!");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str15, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        boolean boolean7 = options5.hasShortOption("");
        boolean boolean9 = options5.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options5.getOptions();
        boolean boolean12 = options5.hasShortOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList13 = options5.helpOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionList13);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList8 = options0.helpOptions();
        boolean boolean10 = options0.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options15 = options0.addOption("", "[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]", false, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options19 = options15.addOption("[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options15);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList9 = options0.helpOptions();
        boolean boolean11 = options0.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options0.getOptions();
        boolean boolean14 = options0.hasShortOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection15 = options0.getOptionGroups();
        boolean boolean17 = options0.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(optionList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options12.getOptions();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options22 = options17.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options17.getOptions();
        org.apache.commons.cli.Option option25 = options17.getOption("hi!");
        org.apache.commons.cli.Options options26 = options16.addOption(option25);
        org.apache.commons.cli.Options options27 = options12.addOption(option25);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection28 = options27.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList29 = options27.helpOptions();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options35 = options30.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection36 = options30.getOptions();
        java.util.List<java.lang.String> strList38 = options30.getMatchingOptions("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection39 = options30.getOptionGroups();
        org.apache.commons.cli.Option option41 = options30.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup42 = options27.getOptionGroup(option41);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(optionGroupCollection28);
        org.junit.Assert.assertNotNull(optionList29);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(optionCollection36);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(optionGroupCollection39);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertNull(optionGroup42);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options19 = options5.addOption("", "", false, "");
        org.apache.commons.cli.Option option21 = options19.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options24 = options19.addOption("", "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        java.lang.String str25 = options24.toString();
        java.util.List<java.lang.String> strList27 = options24.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options32 = options24.addOption("", "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        boolean boolean34 = options24.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNull(option21);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]" + "'", str25, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options19 = options5.addOption("", "", false, "");
        boolean boolean21 = options19.hasOption("hi!");
        org.apache.commons.cli.Options options25 = options19.addOption("", true, "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List list26 = options19.getRequiredOptions();
        boolean boolean28 = options19.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option30 = options19.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options35 = options19.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(option30);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList9 = options0.helpOptions();
        boolean boolean11 = options0.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList13 = options0.getMatchingOptions("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean15 = options0.hasLongOption("[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.lang.String str16 = options0.toString();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(optionList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str16, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.List list18 = options5.getRequiredOptions();
        java.util.List list19 = options5.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList20 = options5.helpOptions();
        java.util.List<java.lang.String> strList22 = options5.getMatchingOptions("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection23 = options5.getOptionGroups();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options29 = options24.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList31 = options29.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options36 = options29.addOption("", "hi!", false, "");
        boolean boolean38 = options29.hasOption("");
        org.apache.commons.cli.Options options41 = options29.addOption("", "");
        java.util.List list42 = options41.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection43 = options41.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList44 = options41.helpOptions();
        org.apache.commons.cli.Options options48 = options41.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection49 = options48.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection50 = options48.getOptions();
        java.util.List<java.lang.String> strList52 = options48.getMatchingOptions("[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option54 = options48.getOption("hi!");
        org.apache.commons.cli.Options options55 = options5.addOption(option54);
        java.util.List<org.apache.commons.cli.Option> optionList56 = options55.helpOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(optionList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(optionGroupCollection23);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(optionCollection43);
        org.junit.Assert.assertNotNull(optionList44);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(optionCollection49);
        org.junit.Assert.assertNotNull(optionCollection50);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(option54);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNotNull(optionList56);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList9 = options0.helpOptions();
        boolean boolean11 = options0.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List list12 = options0.getRequiredOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options16 = options0.addOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(optionList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.lang.String str18 = options5.toString();
        java.lang.String str19 = options5.toString();
        java.util.List<java.lang.String> strList21 = options5.getMatchingOptions("");
        java.util.List list22 = options5.getRequiredOptions();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options28 = options23.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection29 = options23.getOptions();
        org.apache.commons.cli.Option option31 = options23.getOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection32 = options23.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection33 = options23.getOptionGroups();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options39 = options34.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList41 = options39.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options46 = options39.addOption("", "hi!", false, "");
        boolean boolean48 = options39.hasOption("");
        org.apache.commons.cli.Options options51 = options39.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection52 = options39.getOptions();
        java.util.List list53 = options39.getRequiredOptions();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options59 = options54.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection60 = options54.getOptions();
        boolean boolean62 = options54.hasLongOption("hi!");
        boolean boolean64 = options54.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option66 = options54.getOption("hi!");
        org.apache.commons.cli.Options options67 = options39.addOption(option66);
        org.apache.commons.cli.Options options68 = options23.addOption(option66);
        org.apache.commons.cli.OptionGroup optionGroup69 = options5.getOptionGroup(option66);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str18, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(optionCollection29);
        org.junit.Assert.assertNotNull(option31);
        org.junit.Assert.assertNotNull(optionCollection32);
        org.junit.Assert.assertNotNull(optionGroupCollection33);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(optionCollection52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(optionCollection60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(option66);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNull(optionGroup69);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.util.List list19 = options5.getRequiredOptions();
        org.apache.commons.cli.Options options23 = options5.addOption("", false, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.lang.String str24 = options23.toString();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options30 = options25.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection31 = options25.getOptions();
        java.util.List list32 = options25.getRequiredOptions();
        org.apache.commons.cli.Options options37 = options25.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection38 = options37.getOptions();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options44 = options39.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList46 = options44.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options51 = options44.addOption("", "hi!", false, "");
        boolean boolean53 = options44.hasOption("");
        org.apache.commons.cli.Options options56 = options44.addOption("", "");
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options62 = options57.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection63 = options57.getOptions();
        org.apache.commons.cli.Option option65 = options57.getOption("hi!");
        org.apache.commons.cli.Options options66 = options44.addOption(option65);
        org.apache.commons.cli.Options options67 = options37.addOption(option65);
        org.apache.commons.cli.Options options68 = options23.addOption(option65);
        boolean boolean70 = options68.hasOption("[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str24, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(optionCollection31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(optionCollection38);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(optionCollection63);
        org.junit.Assert.assertNotNull(option65);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        boolean boolean19 = options5.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        org.apache.commons.cli.Options options25 = options5.addOption("", "", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options31 = options26.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList33 = options31.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options38 = options31.addOption("", "hi!", false, "");
        java.util.List list39 = options38.getRequiredOptions();
        java.util.List list40 = options38.getRequiredOptions();
        java.util.List list41 = options38.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList42 = options38.helpOptions();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options48 = options43.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList50 = options48.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options55 = options48.addOption("", "hi!", false, "");
        boolean boolean57 = options48.hasOption("");
        org.apache.commons.cli.Options options60 = options48.addOption("", "");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options66 = options61.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection67 = options61.getOptions();
        org.apache.commons.cli.Option option69 = options61.getOption("hi!");
        org.apache.commons.cli.Options options70 = options48.addOption(option69);
        org.apache.commons.cli.Options options71 = options38.addOption(option69);
        org.apache.commons.cli.OptionGroup optionGroup72 = options5.getOptionGroup(option69);
        org.apache.commons.cli.Options options75 = options5.addOption("", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean77 = options75.hasShortOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.lang.String str78 = options75.toString();
        boolean boolean80 = options75.hasLongOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean82 = options75.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean84 = options75.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.lang.String str85 = options75.toString();
        java.util.List<java.lang.String> strList87 = options75.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(optionList42);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(optionCollection67);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNull(optionGroup72);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]" + "'", str78, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]" + "'", str85, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList87);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        java.util.List list20 = options18.getRequiredOptions();
        org.apache.commons.cli.Option option22 = options18.getOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List list23 = options18.getRequiredOptions();
        org.apache.commons.cli.OptionGroup optionGroup24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options25 = options18.addOptionGroup(optionGroup24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.OptionGroup.isRequired()\" because \"group\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(option22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        java.util.List<java.lang.String> strList16 = options5.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean18 = options5.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options23 = options5.addOption("", "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "");
        org.apache.commons.cli.Option option25 = options5.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options32 = options27.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options27.getOptions();
        org.apache.commons.cli.Option option35 = options27.getOption("hi!");
        org.apache.commons.cli.Options options36 = options26.addOption(option35);
        java.util.List<org.apache.commons.cli.Option> optionList37 = options36.helpOptions();
        org.apache.commons.cli.Option option39 = options36.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup40 = options5.getOptionGroup(option39);
        java.lang.String str41 = options5.toString();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNull(option25);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(option35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(optionList37);
        org.junit.Assert.assertNotNull(option39);
        org.junit.Assert.assertNull(optionGroup40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]" + "'", str41, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.List<org.apache.commons.cli.Option> optionList13 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection14 = options0.getOptionGroups();
        boolean boolean16 = options0.hasOption("[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options22 = options17.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList24 = options22.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options29 = options22.addOption("", "hi!", false, "");
        boolean boolean31 = options22.hasOption("");
        org.apache.commons.cli.Options options34 = options22.addOption("", "");
        org.apache.commons.cli.Option option36 = options34.getOption("hi!");
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options42 = options37.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection43 = options37.getOptions();
        org.apache.commons.cli.Option option45 = options37.getOption("hi!");
        org.apache.commons.cli.Option option47 = options37.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup48 = options34.getOptionGroup(option47);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection49 = options34.getOptions();
        java.util.List list50 = options34.getRequiredOptions();
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options56 = options51.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList58 = options56.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options63 = options56.addOption("", "hi!", false, "");
        boolean boolean65 = options56.hasOption("");
        org.apache.commons.cli.Options options68 = options56.addOption("", "");
        org.apache.commons.cli.Option option70 = options68.getOption("hi!");
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options76 = options71.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection77 = options71.getOptions();
        org.apache.commons.cli.Option option79 = options71.getOption("hi!");
        org.apache.commons.cli.Option option81 = options71.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup82 = options68.getOptionGroup(option81);
        org.apache.commons.cli.Options options83 = options34.addOption(option81);
        org.apache.commons.cli.OptionGroup optionGroup84 = options0.getOptionGroup(option81);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionList13);
        org.junit.Assert.assertNotNull(optionGroupCollection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(optionCollection43);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNotNull(option47);
        org.junit.Assert.assertNull(optionGroup48);
        org.junit.Assert.assertNotNull(optionCollection49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(option70);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNotNull(optionCollection77);
        org.junit.Assert.assertNotNull(option79);
        org.junit.Assert.assertNotNull(option81);
        org.junit.Assert.assertNull(optionGroup82);
        org.junit.Assert.assertNotNull(options83);
        org.junit.Assert.assertNull(optionGroup84);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        boolean boolean19 = options5.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        org.apache.commons.cli.Options options25 = options5.addOption("", "", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options31 = options26.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList33 = options31.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options38 = options31.addOption("", "hi!", false, "");
        java.util.List list39 = options38.getRequiredOptions();
        java.util.List list40 = options38.getRequiredOptions();
        java.util.List list41 = options38.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList42 = options38.helpOptions();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options48 = options43.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList50 = options48.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options55 = options48.addOption("", "hi!", false, "");
        boolean boolean57 = options48.hasOption("");
        org.apache.commons.cli.Options options60 = options48.addOption("", "");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options66 = options61.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection67 = options61.getOptions();
        org.apache.commons.cli.Option option69 = options61.getOption("hi!");
        org.apache.commons.cli.Options options70 = options48.addOption(option69);
        org.apache.commons.cli.Options options71 = options38.addOption(option69);
        org.apache.commons.cli.OptionGroup optionGroup72 = options5.getOptionGroup(option69);
        org.apache.commons.cli.Options options75 = options5.addOption("", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean77 = options75.hasShortOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection78 = options75.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(optionList42);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(optionCollection67);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNull(optionGroup72);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(optionCollection78);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        org.apache.commons.cli.Option option8 = options0.getOption("hi!");
        boolean boolean10 = options0.hasShortOption("");
        java.util.List<java.lang.String> strList12 = options0.getMatchingOptions("hi!");
        boolean boolean14 = options0.hasLongOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList16 = options0.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option18 = options0.getOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option20 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList22 = options0.getMatchingOptions("[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        boolean boolean24 = options0.hasShortOption("");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(option8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertNull(option20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        boolean boolean19 = options5.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        org.apache.commons.cli.Options options25 = options5.addOption("", "", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean27 = options5.hasLongOption("");
        java.lang.String str28 = options5.toString();
        org.apache.commons.cli.Options options32 = options5.addOption("", true, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean34 = options32.hasOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]" + "'", str28, "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<java.lang.String> strList10 = options0.getMatchingOptions("");
        boolean boolean12 = options0.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean14 = options0.hasOption("");
        org.apache.commons.cli.Options options19 = options0.addOption("", "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options19.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList21 = options19.helpOptions();
        java.util.List<java.lang.String> strList23 = options19.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options26 = options19.addOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(optionList21);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options12.getOptions();
        java.util.List list15 = options12.getRequiredOptions();
        java.util.List list16 = options12.getRequiredOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        org.apache.commons.cli.Option option8 = options0.getOption("hi!");
        boolean boolean10 = options0.hasShortOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options0.getOptions();
        org.apache.commons.cli.Option option13 = options0.getOption("[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        boolean boolean15 = options0.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option17 = options0.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(option8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<java.lang.String> strList10 = options0.getMatchingOptions("");
        boolean boolean12 = options0.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean14 = options0.hasShortOption("hi!");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options20 = options15.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options15.getOptions();
        boolean boolean23 = options15.hasLongOption("hi!");
        boolean boolean25 = options15.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option27 = options15.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup28 = options0.getOptionGroup(option27);
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options34 = options29.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList36 = options34.getMatchingOptions("hi!");
        boolean boolean38 = options34.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList40 = options34.getMatchingOptions("hi!");
        boolean boolean42 = options34.hasLongOption("hi!");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options48 = options43.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList50 = options48.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options55 = options48.addOption("", "hi!", false, "");
        boolean boolean57 = options48.hasOption("");
        org.apache.commons.cli.Options options60 = options48.addOption("", "");
        org.apache.commons.cli.Option option62 = options60.getOption("hi!");
        org.apache.commons.cli.Options options63 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options68 = options63.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection69 = options63.getOptions();
        org.apache.commons.cli.Option option71 = options63.getOption("hi!");
        org.apache.commons.cli.Option option73 = options63.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup74 = options60.getOptionGroup(option73);
        org.apache.commons.cli.OptionGroup optionGroup75 = options34.getOptionGroup(option73);
        org.apache.commons.cli.Options options76 = options0.addOption(option73);
        java.util.List<org.apache.commons.cli.Option> optionList77 = options76.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList78 = options76.helpOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertNull(optionGroup28);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(option62);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(optionCollection69);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNotNull(option73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertNull(optionGroup75);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNotNull(optionList77);
        org.junit.Assert.assertNotNull(optionList78);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options5.getMatchingOptions("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options15 = options10.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList17 = options15.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options22 = options15.addOption("", "hi!", false, "");
        boolean boolean24 = options15.hasOption("");
        org.apache.commons.cli.Options options27 = options15.addOption("", "");
        org.apache.commons.cli.Option option29 = options27.getOption("hi!");
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options35 = options30.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection36 = options30.getOptions();
        org.apache.commons.cli.Option option38 = options30.getOption("hi!");
        org.apache.commons.cli.Option option40 = options30.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup41 = options27.getOptionGroup(option40);
        org.apache.commons.cli.OptionGroup optionGroup42 = options5.getOptionGroup(option40);
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options48 = options43.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList50 = options48.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options55 = options48.addOption("", "hi!", false, "");
        boolean boolean57 = options48.hasOption("");
        org.apache.commons.cli.Options options60 = options48.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection61 = options48.getOptions();
        java.util.List list62 = options48.getRequiredOptions();
        org.apache.commons.cli.Options options66 = options48.addOption("", false, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean68 = options66.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean70 = options66.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option72 = options66.getOption("hi!");
        org.apache.commons.cli.Options options73 = options5.addOption(option72);
        java.util.List<org.apache.commons.cli.Option> optionList74 = options5.helpOptions();
        org.apache.commons.cli.Option option76 = options5.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option78 = options5.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(option29);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(optionCollection36);
        org.junit.Assert.assertNotNull(option38);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNull(optionGroup41);
        org.junit.Assert.assertNull(optionGroup42);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(optionCollection61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(option72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(optionList74);
        org.junit.Assert.assertNull(option76);
        org.junit.Assert.assertNull(option78);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        boolean boolean19 = options5.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        org.apache.commons.cli.Options options25 = options5.addOption("", "", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options5.getOptions();
        boolean boolean28 = options5.hasLongOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        boolean boolean30 = options5.hasOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        boolean boolean32 = options5.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<java.lang.String> strList10 = options0.getMatchingOptions("");
        boolean boolean12 = options0.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options18 = options13.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = options13.getOptions();
        org.apache.commons.cli.Option option21 = options13.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup22 = options0.getOptionGroup(option21);
        java.util.List<org.apache.commons.cli.Option> optionList23 = options0.helpOptions();
        java.lang.String str24 = options0.toString();
        org.apache.commons.cli.Options options27 = options0.addOption("", "[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options30 = options27.addOption("", "[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option32 = options27.getOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Option option34 = options27.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(option21);
        org.junit.Assert.assertNull(optionGroup22);
        org.junit.Assert.assertNotNull(optionList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str24, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNull(option32);
        org.junit.Assert.assertNull(option34);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection15 = options5.getOptionGroups();
        boolean boolean17 = options5.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        boolean boolean19 = options5.hasLongOption("[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options22 = options5.addOption("", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.lang.String str23 = options5.toString();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options29 = options24.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection30 = options24.getOptions();
        boolean boolean32 = options24.hasShortOption("");
        java.util.List<java.lang.String> strList34 = options24.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection35 = options24.getOptionGroups();
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options41 = options36.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList43 = options41.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options48 = options41.addOption("", "hi!", false, "");
        boolean boolean50 = options41.hasOption("");
        org.apache.commons.cli.Options options53 = options41.addOption("", "");
        java.util.List list54 = options41.getRequiredOptions();
        java.util.List list55 = options41.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList56 = options41.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection57 = options41.getOptionGroups();
        boolean boolean59 = options41.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options60 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options65 = options60.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList67 = options65.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options72 = options65.addOption("", "hi!", false, "");
        boolean boolean74 = options65.hasOption("");
        org.apache.commons.cli.Options options77 = options65.addOption("", "");
        org.apache.commons.cli.Options options78 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options83 = options78.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection84 = options78.getOptions();
        boolean boolean86 = options78.hasLongOption("hi!");
        boolean boolean88 = options78.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option90 = options78.getOption("hi!");
        org.apache.commons.cli.Options options91 = options77.addOption(option90);
        org.apache.commons.cli.OptionGroup optionGroup92 = options41.getOptionGroup(option90);
        org.apache.commons.cli.Options options93 = options24.addOption(option90);
        org.apache.commons.cli.OptionGroup optionGroup94 = options5.getOptionGroup(option90);
        java.util.List<java.lang.String> strList96 = options5.getMatchingOptions("");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(optionGroupCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str23, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(optionCollection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(optionGroupCollection35);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(optionList56);
        org.junit.Assert.assertNotNull(optionGroupCollection57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(options77);
        org.junit.Assert.assertNotNull(options83);
        org.junit.Assert.assertNotNull(optionCollection84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(option90);
        org.junit.Assert.assertNotNull(options91);
        org.junit.Assert.assertNull(optionGroup92);
        org.junit.Assert.assertNotNull(options93);
        org.junit.Assert.assertNull(optionGroup94);
        org.junit.Assert.assertNotNull(strList96);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        org.apache.commons.cli.Option option8 = options0.getOption("hi!");
        boolean boolean10 = options0.hasShortOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options0.getOptions();
        boolean boolean13 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.lang.String str14 = options0.toString();
        java.util.List list15 = options0.getRequiredOptions();
        org.apache.commons.cli.Option option17 = options0.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean19 = options0.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(option8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str14, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        java.util.List list15 = options12.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList16 = options12.helpOptions();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options22 = options17.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList24 = options22.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options29 = options22.addOption("", "hi!", false, "");
        boolean boolean31 = options22.hasOption("");
        org.apache.commons.cli.Options options34 = options22.addOption("", "");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options40 = options35.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options35.getOptions();
        org.apache.commons.cli.Option option43 = options35.getOption("hi!");
        org.apache.commons.cli.Options options44 = options22.addOption(option43);
        org.apache.commons.cli.Options options45 = options12.addOption(option43);
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options51 = options46.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList53 = options51.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options58 = options51.addOption("", "hi!", false, "");
        boolean boolean60 = options51.hasOption("");
        org.apache.commons.cli.Options options63 = options51.addOption("", "");
        org.apache.commons.cli.Option option65 = options63.getOption("hi!");
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options71 = options66.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection72 = options66.getOptions();
        org.apache.commons.cli.Option option74 = options66.getOption("hi!");
        org.apache.commons.cli.Option option76 = options66.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup77 = options63.getOptionGroup(option76);
        org.apache.commons.cli.Options options78 = options12.addOption(option76);
        java.lang.String str79 = options78.toString();
        java.util.List<java.lang.String> strList81 = options78.getMatchingOptions("hi!");
        org.apache.commons.cli.Option option83 = options78.getOption("[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList85 = options78.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(optionList16);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(optionCollection41);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(option65);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(optionCollection72);
        org.junit.Assert.assertNotNull(option74);
        org.junit.Assert.assertNotNull(option76);
        org.junit.Assert.assertNull(optionGroup77);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str79, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNull(option83);
        org.junit.Assert.assertNotNull(strList85);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        org.apache.commons.cli.Options options24 = options18.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options31 = options26.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection32 = options26.getOptions();
        org.apache.commons.cli.Option option34 = options26.getOption("hi!");
        org.apache.commons.cli.Options options35 = options25.addOption(option34);
        org.apache.commons.cli.OptionGroup optionGroup36 = options24.getOptionGroup(option34);
        org.apache.commons.cli.Option option38 = options24.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option40 = options24.getOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(optionCollection32);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNull(optionGroup36);
        org.junit.Assert.assertNull(option38);
        org.junit.Assert.assertNull(option40);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        boolean boolean7 = options5.hasShortOption("");
        boolean boolean9 = options5.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List list10 = options5.getRequiredOptions();
        java.util.List list11 = options5.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options5.getOptions();
        boolean boolean14 = options5.hasLongOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options20 = options15.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList22 = options20.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options27 = options20.addOption("", "hi!", false, "");
        boolean boolean29 = options20.hasOption("");
        org.apache.commons.cli.Options options32 = options20.addOption("", "");
        java.util.List list33 = options32.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection34 = options32.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList35 = options32.helpOptions();
        org.apache.commons.cli.Options options39 = options32.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection40 = options39.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList41 = options39.helpOptions();
        boolean boolean43 = options39.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option45 = options39.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup46 = options5.getOptionGroup(option45);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection47 = options5.getOptionGroups();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(optionCollection34);
        org.junit.Assert.assertNotNull(optionList35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(optionCollection40);
        org.junit.Assert.assertNotNull(optionList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNull(optionGroup46);
        org.junit.Assert.assertNotNull(optionGroupCollection47);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        boolean boolean15 = options12.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean17 = options12.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList19 = options12.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List list20 = options12.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options12.getOptions();
        java.util.List list22 = options12.getRequiredOptions();
        java.lang.Class<?> wildcardClass23 = list22.getClass();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.util.List list19 = options5.getRequiredOptions();
        java.util.List list20 = options5.getRequiredOptions();
        org.apache.commons.cli.Options options25 = options5.addOption("", "", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean27 = options25.hasShortOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList28 = options25.helpOptions();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options34 = options29.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList36 = options34.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options41 = options34.addOption("", "hi!", false, "");
        java.util.List list42 = options41.getRequiredOptions();
        java.util.List list43 = options41.getRequiredOptions();
        java.util.List list44 = options41.getRequiredOptions();
        org.apache.commons.cli.Options options45 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options50 = options45.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList52 = options50.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options57 = options50.addOption("", "hi!", false, "");
        boolean boolean59 = options50.hasOption("");
        org.apache.commons.cli.Options options62 = options50.addOption("", "");
        org.apache.commons.cli.Options options63 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options68 = options63.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection69 = options63.getOptions();
        org.apache.commons.cli.Option option71 = options63.getOption("hi!");
        org.apache.commons.cli.Options options72 = options50.addOption(option71);
        org.apache.commons.cli.Options options73 = options41.addOption(option71);
        org.apache.commons.cli.Options options74 = options25.addOption(option71);
        org.apache.commons.cli.Option option76 = options74.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass77 = option76.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(optionList28);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(optionCollection69);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNull(option76);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        java.lang.String str12 = options5.toString();
        java.util.List<java.lang.String> strList14 = options5.getMatchingOptions("");
        java.util.List list15 = options5.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection16 = options5.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList17 = options5.helpOptions();
        boolean boolean19 = options5.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean21 = options5.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        boolean boolean23 = options5.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        boolean boolean25 = options5.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options5.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(optionGroupCollection16);
        org.junit.Assert.assertNotNull(optionList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(optionCollection26);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        boolean boolean15 = options12.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List list16 = options12.getRequiredOptions();
        boolean boolean18 = options12.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList19 = options12.helpOptions();
        boolean boolean21 = options12.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        java.util.List<java.lang.String> strList24 = options22.getMatchingOptions("");
        java.lang.String str25 = options22.toString();
        java.util.List<java.lang.String> strList27 = options22.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options34 = options29.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection35 = options29.getOptions();
        org.apache.commons.cli.Option option37 = options29.getOption("hi!");
        org.apache.commons.cli.Options options38 = options28.addOption(option37);
        java.util.List<org.apache.commons.cli.Option> optionList39 = options38.helpOptions();
        org.apache.commons.cli.Option option41 = options38.getOption("");
        org.apache.commons.cli.Options options42 = options22.addOption(option41);
        org.apache.commons.cli.Options options43 = options12.addOption(option41);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str25, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(optionCollection35);
        org.junit.Assert.assertNotNull(option37);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(optionList39);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(options43);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("");
        org.apache.commons.cli.Option option21 = options17.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList23 = options17.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList25 = options17.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList27 = options17.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(option21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options0.getOptions();
        boolean boolean9 = options0.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean11 = options0.hasShortOption("");
        boolean boolean13 = options0.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection14 = options0.getOptionGroups();
        java.lang.String str15 = options0.toString();
        org.apache.commons.cli.Options options19 = options0.addOption("", false, "");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection20 = options0.getOptionGroups();
        boolean boolean22 = options0.hasShortOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options0.getOptions();
        org.apache.commons.cli.Option option25 = options0.getOption("[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str15, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(optionGroupCollection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertNull(option25);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        boolean boolean19 = options5.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options5.getOptions();
        boolean boolean23 = options5.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList24 = options5.helpOptions();
        java.util.List<java.lang.String> strList26 = options5.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean28 = options5.hasOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(optionList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        org.apache.commons.cli.Option option19 = options17.getOption("hi!");
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options25 = options20.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options20.getOptions();
        org.apache.commons.cli.Option option28 = options20.getOption("hi!");
        org.apache.commons.cli.Option option30 = options20.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup31 = options17.getOptionGroup(option30);
        boolean boolean33 = options17.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList34 = options17.helpOptions();
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options40 = options35.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList42 = options40.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options46 = options40.addOption("", true, "");
        java.lang.String str47 = options40.toString();
        java.util.List<java.lang.String> strList49 = options40.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection50 = options40.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection51 = options40.getOptionGroups();
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options57 = options52.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList59 = options57.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options64 = options57.addOption("", "hi!", false, "");
        java.util.List list65 = options64.getRequiredOptions();
        java.util.List list66 = options64.getRequiredOptions();
        org.apache.commons.cli.Options options70 = options64.addOption("", false, "");
        java.lang.String str71 = options70.toString();
        org.apache.commons.cli.Options options76 = options70.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        org.apache.commons.cli.Options options77 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options78 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options83 = options78.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection84 = options78.getOptions();
        org.apache.commons.cli.Option option86 = options78.getOption("hi!");
        org.apache.commons.cli.Options options87 = options77.addOption(option86);
        org.apache.commons.cli.OptionGroup optionGroup88 = options76.getOptionGroup(option86);
        org.apache.commons.cli.Options options89 = options40.addOption(option86);
        org.apache.commons.cli.Options options90 = options17.addOption(option86);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options95 = options90.addOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(option28);
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(optionList34);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str47, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(optionGroupCollection50);
        org.junit.Assert.assertNotNull(optionGroupCollection51);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str71, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNotNull(options83);
        org.junit.Assert.assertNotNull(optionCollection84);
        org.junit.Assert.assertNotNull(option86);
        org.junit.Assert.assertNotNull(options87);
        org.junit.Assert.assertNull(optionGroup88);
        org.junit.Assert.assertNotNull(options89);
        org.junit.Assert.assertNotNull(options90);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        boolean boolean19 = options5.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        boolean boolean22 = options5.hasLongOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options28 = options23.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList30 = options28.getMatchingOptions("hi!");
        boolean boolean32 = options28.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList34 = options28.getMatchingOptions("hi!");
        boolean boolean36 = options28.hasLongOption("hi!");
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options42 = options37.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList44 = options42.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options49 = options42.addOption("", "hi!", false, "");
        boolean boolean51 = options42.hasOption("");
        org.apache.commons.cli.Options options54 = options42.addOption("", "");
        org.apache.commons.cli.Option option56 = options54.getOption("hi!");
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options62 = options57.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection63 = options57.getOptions();
        org.apache.commons.cli.Option option65 = options57.getOption("hi!");
        org.apache.commons.cli.Option option67 = options57.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup68 = options54.getOptionGroup(option67);
        org.apache.commons.cli.OptionGroup optionGroup69 = options28.getOptionGroup(option67);
        org.apache.commons.cli.Options options70 = options5.addOption(option67);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options75 = options70.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(optionCollection63);
        org.junit.Assert.assertNotNull(option65);
        org.junit.Assert.assertNotNull(option67);
        org.junit.Assert.assertNull(optionGroup68);
        org.junit.Assert.assertNull(optionGroup69);
        org.junit.Assert.assertNotNull(options70);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        java.lang.String str12 = options5.toString();
        java.util.List<java.lang.String> strList14 = options5.getMatchingOptions("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList16 = options5.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        boolean boolean18 = options5.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        org.apache.commons.cli.Options options24 = options18.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        java.lang.String str25 = options18.toString();
        org.apache.commons.cli.Options options28 = options18.addOption("", "[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList30 = options28.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList32 = options28.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]" + "'", str25, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List list9 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options15 = options10.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList17 = options15.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options22 = options15.addOption("", "hi!", false, "");
        java.util.List list23 = options22.getRequiredOptions();
        java.util.List list24 = options22.getRequiredOptions();
        org.apache.commons.cli.Options options28 = options22.addOption("", false, "");
        java.lang.String str29 = options28.toString();
        org.apache.commons.cli.Options options34 = options28.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options41 = options36.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection42 = options36.getOptions();
        org.apache.commons.cli.Option option44 = options36.getOption("hi!");
        org.apache.commons.cli.Options options45 = options35.addOption(option44);
        org.apache.commons.cli.OptionGroup optionGroup46 = options34.getOptionGroup(option44);
        org.apache.commons.cli.OptionGroup optionGroup47 = options0.getOptionGroup(option44);
        java.util.List list48 = options0.getRequiredOptions();
        boolean boolean50 = options0.hasShortOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList52 = options0.getMatchingOptions("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options57 = options0.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str29, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(optionCollection42);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNull(optionGroup46);
        org.junit.Assert.assertNull(optionGroup47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strList52);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options23 = options18.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection24 = options18.getOptions();
        org.apache.commons.cli.Option option26 = options18.getOption("hi!");
        org.apache.commons.cli.Options options27 = options5.addOption(option26);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection28 = options5.getOptionGroups();
        org.apache.commons.cli.Options options31 = options5.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options37 = options32.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList39 = options37.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options44 = options37.addOption("", "hi!", false, "");
        boolean boolean46 = options37.hasOption("");
        org.apache.commons.cli.Options options49 = options37.addOption("", "");
        org.apache.commons.cli.Option option51 = options49.getOption("hi!");
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options57 = options52.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection58 = options52.getOptions();
        org.apache.commons.cli.Option option60 = options52.getOption("hi!");
        org.apache.commons.cli.Option option62 = options52.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup63 = options49.getOptionGroup(option62);
        org.apache.commons.cli.OptionGroup optionGroup64 = options5.getOptionGroup(option62);
        java.util.List<java.lang.String> strList66 = options5.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(optionCollection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(optionGroupCollection28);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(optionCollection58);
        org.junit.Assert.assertNotNull(option60);
        org.junit.Assert.assertNotNull(option62);
        org.junit.Assert.assertNull(optionGroup63);
        org.junit.Assert.assertNull(optionGroup64);
        org.junit.Assert.assertNotNull(strList66);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        boolean boolean7 = options5.hasOption("");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options13 = options8.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList15 = options13.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options20 = options13.addOption("", "hi!", false, "");
        java.util.List list21 = options20.getRequiredOptions();
        java.util.List list22 = options20.getRequiredOptions();
        java.util.List list23 = options20.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList24 = options20.helpOptions();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options30 = options25.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList32 = options30.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options37 = options30.addOption("", "hi!", false, "");
        boolean boolean39 = options30.hasOption("");
        org.apache.commons.cli.Options options42 = options30.addOption("", "");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options48 = options43.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection49 = options43.getOptions();
        org.apache.commons.cli.Option option51 = options43.getOption("hi!");
        org.apache.commons.cli.Options options52 = options30.addOption(option51);
        org.apache.commons.cli.Options options53 = options20.addOption(option51);
        org.apache.commons.cli.Options options54 = options5.addOption(option51);
        java.util.List<org.apache.commons.cli.Option> optionList55 = options54.helpOptions();
        boolean boolean57 = options54.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option59 = options54.getOption("hi!");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(optionList24);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(optionCollection49);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(optionList55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(option59);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options11.getOptions();
        java.util.List<java.lang.String> strList14 = options11.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.lang.String str15 = options11.toString();
        java.util.List<java.lang.String> strList17 = options11.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str15, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<java.lang.String> strList10 = options0.getMatchingOptions("");
        boolean boolean12 = options0.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean14 = options0.hasShortOption("hi!");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options20 = options15.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options15.getOptions();
        boolean boolean23 = options15.hasLongOption("hi!");
        boolean boolean25 = options15.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option27 = options15.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup28 = options0.getOptionGroup(option27);
        java.util.List<java.lang.String> strList30 = options0.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean32 = options0.hasShortOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options0.getOptions();
        boolean boolean35 = options0.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean37 = options0.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        java.util.List list38 = options0.getRequiredOptions();
        java.util.List list39 = options0.getRequiredOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options43 = options0.addOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertNull(optionGroup28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options0.getOptions();
        boolean boolean9 = options0.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean11 = options0.hasShortOption("");
        boolean boolean13 = options0.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options0.getOptions();
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options20 = options15.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options15.getOptions();
        java.util.List list22 = options15.getRequiredOptions();
        org.apache.commons.cli.Options options27 = options15.addOption("", "", true, "hi!");
        java.util.List<org.apache.commons.cli.Option> optionList28 = options15.helpOptions();
        boolean boolean30 = options15.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList31 = options15.helpOptions();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options37 = options32.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList39 = options37.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options44 = options37.addOption("", "hi!", false, "");
        boolean boolean46 = options37.hasOption("");
        org.apache.commons.cli.Options options49 = options37.addOption("", "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("");
        org.apache.commons.cli.Option option53 = options49.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean55 = options49.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options61 = options56.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection62 = options56.getOptions();
        org.apache.commons.cli.Option option64 = options56.getOption("hi!");
        boolean boolean66 = options56.hasShortOption("");
        java.util.List<java.lang.String> strList68 = options56.getMatchingOptions("hi!");
        boolean boolean70 = options56.hasLongOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList72 = options56.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option74 = options56.getOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options75 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options80 = options75.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList82 = options80.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options87 = options80.addOption("", "hi!", false, "");
        boolean boolean89 = options80.hasOption("");
        org.apache.commons.cli.Options options92 = options80.addOption("", "");
        org.apache.commons.cli.Option option94 = options92.getOption("hi!");
        org.apache.commons.cli.Options options95 = options56.addOption(option94);
        org.apache.commons.cli.OptionGroup optionGroup96 = options49.getOptionGroup(option94);
        org.apache.commons.cli.OptionGroup optionGroup97 = options15.getOptionGroup(option94);
        org.apache.commons.cli.Options options98 = options0.addOption(option94);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection99 = options0.getOptionGroups();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(optionList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(optionList31);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNull(option53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(optionCollection62);
        org.junit.Assert.assertNotNull(option64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNull(option74);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(options87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(options92);
        org.junit.Assert.assertNotNull(option94);
        org.junit.Assert.assertNotNull(options95);
        org.junit.Assert.assertNull(optionGroup96);
        org.junit.Assert.assertNull(optionGroup97);
        org.junit.Assert.assertNotNull(options98);
        org.junit.Assert.assertNotNull(optionGroupCollection99);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        boolean boolean9 = options5.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean11 = options5.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options16 = options5.addOption("", "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options21 = options16.addOption("[ Options: [ short {} ] [ long {} ]", "", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options16);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.util.List list19 = options5.getRequiredOptions();
        org.apache.commons.cli.Options options23 = options5.addOption("", false, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean25 = options5.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options29 = options5.addOption("", true, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options35 = options30.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection36 = options30.getOptions();
        org.apache.commons.cli.Option option38 = options30.getOption("hi!");
        boolean boolean40 = options30.hasShortOption("");
        java.util.List<java.lang.String> strList42 = options30.getMatchingOptions("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options48 = options43.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList50 = options48.getMatchingOptions("hi!");
        boolean boolean52 = options48.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList54 = options48.getMatchingOptions("hi!");
        boolean boolean56 = options48.hasLongOption("hi!");
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options62 = options57.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection63 = options57.getOptions();
        boolean boolean65 = options57.hasShortOption("");
        java.util.List<java.lang.String> strList67 = options57.getMatchingOptions("");
        boolean boolean69 = options57.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options75 = options70.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection76 = options70.getOptions();
        org.apache.commons.cli.Option option78 = options70.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup79 = options57.getOptionGroup(option78);
        org.apache.commons.cli.OptionGroup optionGroup80 = options48.getOptionGroup(option78);
        org.apache.commons.cli.OptionGroup optionGroup81 = options30.getOptionGroup(option78);
        org.apache.commons.cli.OptionGroup optionGroup82 = options29.getOptionGroup(option78);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection83 = options29.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(optionCollection36);
        org.junit.Assert.assertNotNull(option38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(optionCollection63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertNotNull(optionCollection76);
        org.junit.Assert.assertNotNull(option78);
        org.junit.Assert.assertNull(optionGroup79);
        org.junit.Assert.assertNull(optionGroup80);
        org.junit.Assert.assertNull(optionGroup81);
        org.junit.Assert.assertNull(optionGroup82);
        org.junit.Assert.assertNotNull(optionCollection83);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.List list18 = options5.getRequiredOptions();
        java.util.List list19 = options5.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList20 = options5.helpOptions();
        java.util.List<java.lang.String> strList22 = options5.getMatchingOptions("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection23 = options5.getOptionGroups();
        java.lang.String str24 = options5.toString();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(optionList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(optionGroupCollection23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str24, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.util.List list19 = options5.getRequiredOptions();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options25 = options20.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options20.getOptions();
        boolean boolean28 = options20.hasLongOption("hi!");
        boolean boolean30 = options20.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option32 = options20.getOption("hi!");
        org.apache.commons.cli.Options options33 = options5.addOption(option32);
        org.apache.commons.cli.Options options36 = options5.addOption("", "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options41 = options5.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]", false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(option32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(options36);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options19 = options5.addOption("", "", false, "");
        org.apache.commons.cli.Option option21 = options19.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options19.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options26 = options19.addOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNull(option21);
        org.junit.Assert.assertNotNull(optionCollection22);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        boolean boolean7 = options5.hasShortOption("");
        java.util.List<java.lang.String> strList9 = options5.getMatchingOptions("");
        org.apache.commons.cli.Option option11 = options5.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List list12 = options5.getRequiredOptions();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options18 = options13.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList20 = options18.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList22 = options18.getMatchingOptions("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options28 = options23.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList30 = options28.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options35 = options28.addOption("", "hi!", false, "");
        boolean boolean37 = options28.hasOption("");
        org.apache.commons.cli.Options options40 = options28.addOption("", "");
        org.apache.commons.cli.Option option42 = options40.getOption("hi!");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options48 = options43.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection49 = options43.getOptions();
        org.apache.commons.cli.Option option51 = options43.getOption("hi!");
        org.apache.commons.cli.Option option53 = options43.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup54 = options40.getOptionGroup(option53);
        org.apache.commons.cli.OptionGroup optionGroup55 = options18.getOptionGroup(option53);
        org.apache.commons.cli.OptionGroup optionGroup56 = options5.getOptionGroup(option53);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(optionCollection49);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertNotNull(option53);
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertNull(optionGroup56);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.lang.String str19 = options5.toString();
        org.apache.commons.cli.Options options22 = options5.addOption("", "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection23 = options5.getOptionGroups();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(optionGroupCollection23);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection14 = options12.getOptionGroups();
        java.util.List<java.lang.String> strList16 = options12.getMatchingOptions("");
        java.util.List<org.apache.commons.cli.Option> optionList17 = options12.helpOptions();
        boolean boolean19 = options12.hasShortOption("[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList21 = options12.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList23 = options12.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList24 = options12.helpOptions();
        boolean boolean26 = options12.hasShortOption("");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(optionGroupCollection14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(optionList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(optionList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection15 = options5.getOptionGroups();
        java.lang.String str16 = options5.toString();
        boolean boolean18 = options5.hasLongOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList20 = options5.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList22 = options5.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options25 = options5.addOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(optionGroupCollection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str16, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<java.lang.String> strList2 = options0.getMatchingOptions("");
        java.lang.String str3 = options0.toString();
        java.util.List<java.lang.String> strList5 = options0.getMatchingOptions("hi!");
        boolean boolean7 = options0.hasLongOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        org.apache.commons.cli.Option option19 = options17.getOption("hi!");
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options25 = options20.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options20.getOptions();
        org.apache.commons.cli.Option option28 = options20.getOption("hi!");
        org.apache.commons.cli.Option option30 = options20.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup31 = options17.getOptionGroup(option30);
        java.util.List<java.lang.String> strList33 = options17.getMatchingOptions("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean35 = options17.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        boolean boolean37 = options17.hasShortOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean39 = options17.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(option28);
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        boolean boolean7 = options0.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        boolean boolean9 = options5.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList11 = options5.getMatchingOptions("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options5.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList13 = options5.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options5.getOptions();
        boolean boolean16 = options5.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(optionList13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection1 = options0.getOptionGroups();
        boolean boolean3 = options0.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList4 = options0.helpOptions();
        org.junit.Assert.assertNotNull(optionGroupCollection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionList4);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.util.List list19 = options5.getRequiredOptions();
        org.apache.commons.cli.Option option21 = options5.getOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List list22 = options5.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection23 = options5.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection24 = options5.getOptionGroups();
        java.lang.String str25 = options5.toString();
        java.util.List<org.apache.commons.cli.Option> optionList26 = options5.helpOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(option21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(optionGroupCollection23);
        org.junit.Assert.assertNotNull(optionGroupCollection24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str25, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionList26);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        org.apache.commons.cli.Options options24 = options18.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        java.lang.String str25 = options18.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options18.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]" + "'", str25, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionCollection26);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options12.getOptions();
        java.util.List list16 = options12.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection17 = options12.getOptionGroups();
        org.apache.commons.cli.Options options21 = options12.addOption("", false, "");
        boolean boolean23 = options12.hasOption("[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList25 = options12.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options12.getOptions();
        java.util.List list27 = options12.getRequiredOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options31 = options12.addOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(optionGroupCollection17);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        boolean boolean16 = options5.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList17 = options5.helpOptions();
        org.apache.commons.cli.Option option19 = options5.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean21 = options5.hasOption("");
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options27 = options22.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options34 = options27.addOption("", "hi!", false, "");
        boolean boolean36 = options27.hasOption("");
        org.apache.commons.cli.Options options41 = options27.addOption("", "", false, "");
        org.apache.commons.cli.Option option43 = options41.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option45 = options41.getOption("");
        org.apache.commons.cli.Options options46 = options5.addOption(option45);
        java.util.List<org.apache.commons.cli.Option> optionList47 = options46.helpOptions();
        java.util.List<java.lang.String> strList49 = options46.getMatchingOptions("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean51 = options46.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(optionList17);
        org.junit.Assert.assertNull(option19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNull(option43);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(optionList47);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        org.apache.commons.cli.Option option19 = options17.getOption("hi!");
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options25 = options20.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList27 = options25.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options32 = options25.addOption("", "hi!", false, "");
        boolean boolean34 = options25.hasOption("");
        org.apache.commons.cli.Options options37 = options25.addOption("", "");
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options43 = options38.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection44 = options38.getOptions();
        boolean boolean46 = options38.hasLongOption("hi!");
        boolean boolean48 = options38.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option50 = options38.getOption("hi!");
        org.apache.commons.cli.Options options51 = options37.addOption(option50);
        org.apache.commons.cli.OptionGroup optionGroup52 = options17.getOptionGroup(option50);
        java.util.List<org.apache.commons.cli.Option> optionList53 = options17.helpOptions();
        boolean boolean55 = options17.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(optionCollection44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(option50);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNull(optionGroup52);
        org.junit.Assert.assertNotNull(optionList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        java.util.List list8 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection9 = options0.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options0.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(optionGroupCollection9);
        org.junit.Assert.assertNotNull(optionCollection10);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.util.List list19 = options5.getRequiredOptions();
        java.util.List list20 = options5.getRequiredOptions();
        org.apache.commons.cli.Options options25 = options5.addOption("", "", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.lang.String str26 = options25.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection27 = options25.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]" + "'", str26, "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionCollection27);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection14 = options12.getOptionGroups();
        java.util.List<java.lang.String> strList16 = options12.getMatchingOptions("");
        java.util.List<java.lang.String> strList18 = options12.getMatchingOptions("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList19 = options12.helpOptions();
        boolean boolean21 = options12.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean23 = options12.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options27 = options12.addOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(optionGroupCollection14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(optionList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options6 = options1.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options1.getOptions();
        org.apache.commons.cli.Option option9 = options1.getOption("hi!");
        org.apache.commons.cli.Options options10 = options0.addOption(option9);
        java.util.List<org.apache.commons.cli.Option> optionList11 = options10.helpOptions();
        org.apache.commons.cli.Option option13 = options10.getOption("");
        java.lang.String str14 = options10.toString();
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str14, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options12.getOptions();
        boolean boolean16 = options12.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean18 = options12.hasLongOption("[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection19 = options12.getOptionGroups();
        boolean boolean21 = options12.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options23 = options12.addOption(option22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.util.List list19 = options5.getRequiredOptions();
        java.util.List list20 = options5.getRequiredOptions();
        org.apache.commons.cli.Options options25 = options5.addOption("", "", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean27 = options25.hasShortOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList28 = options25.helpOptions();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options34 = options29.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList36 = options34.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options41 = options34.addOption("", "hi!", false, "");
        java.util.List list42 = options41.getRequiredOptions();
        java.util.List list43 = options41.getRequiredOptions();
        java.util.List list44 = options41.getRequiredOptions();
        org.apache.commons.cli.Options options45 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options50 = options45.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList52 = options50.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options57 = options50.addOption("", "hi!", false, "");
        boolean boolean59 = options50.hasOption("");
        org.apache.commons.cli.Options options62 = options50.addOption("", "");
        org.apache.commons.cli.Options options63 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options68 = options63.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection69 = options63.getOptions();
        org.apache.commons.cli.Option option71 = options63.getOption("hi!");
        org.apache.commons.cli.Options options72 = options50.addOption(option71);
        org.apache.commons.cli.Options options73 = options41.addOption(option71);
        org.apache.commons.cli.Options options74 = options25.addOption(option71);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection75 = options25.getOptionGroups();
        java.util.List<java.lang.String> strList77 = options25.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection78 = options25.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(optionList28);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(optionCollection69);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(optionGroupCollection75);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(optionCollection78);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options11 = options6.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList13 = options11.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options18 = options11.addOption("", "hi!", false, "");
        boolean boolean20 = options11.hasOption("");
        org.apache.commons.cli.Options options23 = options11.addOption("", "");
        org.apache.commons.cli.Option option25 = options23.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup26 = options0.getOptionGroup(option25);
        java.util.List<org.apache.commons.cli.Option> optionList27 = options0.helpOptions();
        java.lang.String str28 = options0.toString();
        java.lang.String str29 = options0.toString();
        boolean boolean31 = options0.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options35 = options0.addOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(optionList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str28, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str29, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        java.util.List list20 = options18.getRequiredOptions();
        java.util.List list21 = options18.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList22 = options18.helpOptions();
        boolean boolean24 = options18.hasLongOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options30 = options25.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList32 = options30.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options37 = options30.addOption("", "hi!", false, "");
        boolean boolean39 = options30.hasOption("");
        org.apache.commons.cli.Options options42 = options30.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection43 = options30.getOptions();
        java.util.List list44 = options30.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection45 = options30.getOptions();
        boolean boolean47 = options30.hasOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options50 = options30.addOption("", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options56 = options51.addOption("", "hi!", true, "");
        boolean boolean58 = options56.hasShortOption("");
        boolean boolean60 = options56.hasLongOption("");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options66 = options61.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList68 = options66.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options73 = options66.addOption("", "hi!", false, "");
        boolean boolean75 = options66.hasOption("");
        org.apache.commons.cli.Options options78 = options66.addOption("", "");
        org.apache.commons.cli.Option option80 = options78.getOption("hi!");
        org.apache.commons.cli.Options options81 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options86 = options81.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection87 = options81.getOptions();
        org.apache.commons.cli.Option option89 = options81.getOption("hi!");
        org.apache.commons.cli.Option option91 = options81.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup92 = options78.getOptionGroup(option91);
        org.apache.commons.cli.OptionGroup optionGroup93 = options56.getOptionGroup(option91);
        org.apache.commons.cli.Options options94 = options30.addOption(option91);
        org.apache.commons.cli.OptionGroup optionGroup95 = options18.getOptionGroup(option91);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection96 = options18.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(optionCollection43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(optionCollection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(option80);
        org.junit.Assert.assertNotNull(options86);
        org.junit.Assert.assertNotNull(optionCollection87);
        org.junit.Assert.assertNotNull(option89);
        org.junit.Assert.assertNotNull(option91);
        org.junit.Assert.assertNull(optionGroup92);
        org.junit.Assert.assertNull(optionGroup93);
        org.junit.Assert.assertNotNull(options94);
        org.junit.Assert.assertNull(optionGroup95);
        org.junit.Assert.assertNotNull(optionCollection96);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<java.lang.String> strList10 = options0.getMatchingOptions("");
        boolean boolean12 = options0.hasLongOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        boolean boolean14 = options0.hasOption("");
        boolean boolean16 = options0.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        boolean boolean18 = options0.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        boolean boolean20 = options0.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options26 = options21.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList28 = options26.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options33 = options26.addOption("", "hi!", false, "");
        boolean boolean35 = options26.hasOption("");
        org.apache.commons.cli.Options options38 = options26.addOption("", "");
        java.util.List list39 = options26.getRequiredOptions();
        java.util.List list40 = options26.getRequiredOptions();
        boolean boolean42 = options26.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean44 = options26.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection45 = options26.getOptions();
        org.apache.commons.cli.Option option47 = options26.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup48 = options0.getOptionGroup(option47);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(optionCollection45);
        org.junit.Assert.assertNotNull(option47);
        org.junit.Assert.assertNull(optionGroup48);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options12.getOptions();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options22 = options17.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options17.getOptions();
        org.apache.commons.cli.Option option25 = options17.getOption("hi!");
        org.apache.commons.cli.Options options26 = options16.addOption(option25);
        org.apache.commons.cli.Options options27 = options12.addOption(option25);
        boolean boolean29 = options12.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection30 = options12.getOptionGroups();
        org.apache.commons.cli.Option option32 = options12.getOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(optionGroupCollection30);
        org.junit.Assert.assertNull(option32);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        boolean boolean7 = options5.hasShortOption("");
        boolean boolean9 = options5.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList11 = options5.getMatchingOptions("hi!");
        boolean boolean13 = options5.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options5.getOptions();
        java.lang.Class<?> wildcardClass15 = optionCollection14.getClass();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.util.List list19 = options5.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        java.util.List<java.lang.String> strList22 = options5.getMatchingOptions("");
        org.apache.commons.cli.Option option24 = options5.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.lang.String str25 = options5.toString();
        java.util.List list26 = options5.getRequiredOptions();
        boolean boolean28 = options5.hasLongOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option30 = options5.getOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option32 = options5.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(option24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str25, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(option30);
        org.junit.Assert.assertNull(option32);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        boolean boolean19 = options5.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        org.apache.commons.cli.Options options25 = options5.addOption("", "", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options5.getOptions();
        java.lang.String str27 = options5.toString();
        boolean boolean29 = options5.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]" + "'", str27, "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        org.apache.commons.cli.Options options24 = options18.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        boolean boolean26 = options24.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options32 = options27.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList34 = options32.getMatchingOptions("hi!");
        boolean boolean36 = options32.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList38 = options32.getMatchingOptions("hi!");
        boolean boolean40 = options32.hasLongOption("hi!");
        org.apache.commons.cli.Options options41 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options46 = options41.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList48 = options46.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options53 = options46.addOption("", "hi!", false, "");
        boolean boolean55 = options46.hasOption("");
        org.apache.commons.cli.Options options58 = options46.addOption("", "");
        org.apache.commons.cli.Option option60 = options58.getOption("hi!");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options66 = options61.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection67 = options61.getOptions();
        org.apache.commons.cli.Option option69 = options61.getOption("hi!");
        org.apache.commons.cli.Option option71 = options61.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup72 = options58.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup73 = options32.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup74 = options24.getOptionGroup(option71);
        java.lang.String str75 = options24.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection76 = options24.getOptions();
        java.util.List list77 = options24.getRequiredOptions();
        java.lang.String str78 = options24.toString();
        java.util.List<java.lang.String> strList80 = options24.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(option60);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(optionCollection67);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNull(optionGroup72);
        org.junit.Assert.assertNull(optionGroup73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]" + "'", str75, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionCollection76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]" + "'", str78, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList80);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        java.util.List<java.lang.String> strList13 = options5.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList15 = options5.getMatchingOptions("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options19 = options5.addOption("", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option21 = options19.getOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        java.util.List list22 = options19.getRequiredOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNull(option21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        boolean boolean16 = options5.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList17 = options5.helpOptions();
        org.apache.commons.cli.Option option19 = options5.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean21 = options5.hasOption("");
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options27 = options22.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options34 = options27.addOption("", "hi!", false, "");
        boolean boolean36 = options27.hasOption("");
        org.apache.commons.cli.Options options41 = options27.addOption("", "", false, "");
        org.apache.commons.cli.Option option43 = options41.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option45 = options41.getOption("");
        org.apache.commons.cli.Options options46 = options5.addOption(option45);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection47 = options5.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList48 = options5.helpOptions();
        java.util.List list49 = options5.getRequiredOptions();
        org.apache.commons.cli.Option option51 = options5.getOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options55 = options5.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(optionList17);
        org.junit.Assert.assertNull(option19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNull(option43);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(optionGroupCollection47);
        org.junit.Assert.assertNotNull(optionList48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNull(option51);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        org.apache.commons.cli.Options options24 = options18.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        boolean boolean26 = options24.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options32 = options27.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList34 = options32.getMatchingOptions("hi!");
        boolean boolean36 = options32.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList38 = options32.getMatchingOptions("hi!");
        boolean boolean40 = options32.hasLongOption("hi!");
        org.apache.commons.cli.Options options41 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options46 = options41.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList48 = options46.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options53 = options46.addOption("", "hi!", false, "");
        boolean boolean55 = options46.hasOption("");
        org.apache.commons.cli.Options options58 = options46.addOption("", "");
        org.apache.commons.cli.Option option60 = options58.getOption("hi!");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options66 = options61.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection67 = options61.getOptions();
        org.apache.commons.cli.Option option69 = options61.getOption("hi!");
        org.apache.commons.cli.Option option71 = options61.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup72 = options58.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup73 = options32.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup74 = options24.getOptionGroup(option71);
        java.lang.String str75 = options24.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection76 = options24.getOptions();
        java.util.List list77 = options24.getRequiredOptions();
        java.util.List list78 = options24.getRequiredOptions();
        java.lang.Class<?> wildcardClass79 = options24.getClass();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(option60);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(optionCollection67);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNull(optionGroup72);
        org.junit.Assert.assertNull(optionGroup73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]" + "'", str75, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionCollection76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        boolean boolean7 = options5.hasShortOption("");
        boolean boolean9 = options5.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options5.getOptions();
        org.apache.commons.cli.Option option12 = options5.getOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean14 = options5.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        org.apache.commons.cli.Options options24 = options18.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        java.lang.String str25 = options18.toString();
        org.apache.commons.cli.Options options28 = options18.addOption("", "[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        boolean boolean30 = options28.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList31 = options28.helpOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options36 = options28.addOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]" + "'", str25, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(optionList31);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        java.util.List<java.lang.String> strList16 = options5.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean18 = options5.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options23 = options5.addOption("", "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection24 = options23.getOptions();
        boolean boolean26 = options23.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options32 = options27.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList34 = options32.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options39 = options32.addOption("", "hi!", false, "");
        java.util.List list40 = options39.getRequiredOptions();
        java.util.List list41 = options39.getRequiredOptions();
        java.util.List list42 = options39.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList43 = options39.helpOptions();
        org.apache.commons.cli.Options options44 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options49 = options44.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options56 = options49.addOption("", "hi!", false, "");
        boolean boolean58 = options49.hasOption("");
        org.apache.commons.cli.Options options61 = options49.addOption("", "");
        org.apache.commons.cli.Options options62 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options67 = options62.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection68 = options62.getOptions();
        org.apache.commons.cli.Option option70 = options62.getOption("hi!");
        org.apache.commons.cli.Options options71 = options49.addOption(option70);
        org.apache.commons.cli.Options options72 = options39.addOption(option70);
        java.util.List<org.apache.commons.cli.Option> optionList73 = options39.helpOptions();
        org.apache.commons.cli.Options options74 = new org.apache.commons.cli.Options();
        java.util.List<java.lang.String> strList76 = options74.getMatchingOptions("");
        boolean boolean78 = options74.hasOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options79 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options84 = options79.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection85 = options79.getOptions();
        boolean boolean87 = options79.hasLongOption("hi!");
        boolean boolean89 = options79.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option91 = options79.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup92 = options74.getOptionGroup(option91);
        org.apache.commons.cli.OptionGroup optionGroup93 = options39.getOptionGroup(option91);
        org.apache.commons.cli.OptionGroup optionGroup94 = options23.getOptionGroup(option91);
        java.lang.String str95 = options23.toString();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(optionCollection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(optionList43);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(optionCollection68);
        org.junit.Assert.assertNotNull(option70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNotNull(optionList73);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(options84);
        org.junit.Assert.assertNotNull(optionCollection85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(option91);
        org.junit.Assert.assertNull(optionGroup92);
        org.junit.Assert.assertNull(optionGroup93);
        org.junit.Assert.assertNull(optionGroup94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]" + "'", str95, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<java.lang.String> strList10 = options0.getMatchingOptions("");
        boolean boolean12 = options0.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options18 = options13.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = options13.getOptions();
        org.apache.commons.cli.Option option21 = options13.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup22 = options0.getOptionGroup(option21);
        java.util.List<org.apache.commons.cli.Option> optionList23 = options0.helpOptions();
        java.lang.String str24 = options0.toString();
        org.apache.commons.cli.Options options27 = options0.addOption("", "[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options30 = options27.addOption("", "[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        java.util.List list31 = options30.getRequiredOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(option21);
        org.junit.Assert.assertNull(optionGroup22);
        org.junit.Assert.assertNotNull(optionList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str24, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.util.List list19 = options5.getRequiredOptions();
        org.apache.commons.cli.Options options23 = options5.addOption("", false, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.lang.Class<?> wildcardClass24 = options23.getClass();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection14 = options12.getOptionGroups();
        java.util.List<java.lang.String> strList16 = options12.getMatchingOptions("");
        java.util.List<java.lang.String> strList18 = options12.getMatchingOptions("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList20 = options12.getMatchingOptions("[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options26 = options21.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList28 = options26.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options33 = options26.addOption("", "hi!", false, "");
        boolean boolean35 = options26.hasOption("");
        org.apache.commons.cli.Options options38 = options26.addOption("", "");
        boolean boolean40 = options26.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options26.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection42 = options26.getOptions();
        boolean boolean44 = options26.hasLongOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options45 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options50 = options45.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList52 = options50.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options57 = options50.addOption("", "hi!", false, "");
        java.util.List list58 = options57.getRequiredOptions();
        java.util.List list59 = options57.getRequiredOptions();
        org.apache.commons.cli.Options options63 = options57.addOption("", false, "");
        org.apache.commons.cli.Options options64 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options69 = options64.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection70 = options64.getOptions();
        org.apache.commons.cli.Option option72 = options64.getOption("hi!");
        org.apache.commons.cli.Option option74 = options64.getOption("hi!");
        org.apache.commons.cli.Options options75 = options57.addOption(option74);
        org.apache.commons.cli.OptionGroup optionGroup76 = options26.getOptionGroup(option74);
        org.apache.commons.cli.Options options77 = options12.addOption(option74);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(optionGroupCollection14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(optionCollection41);
        org.junit.Assert.assertNotNull(optionCollection42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNotNull(optionCollection70);
        org.junit.Assert.assertNotNull(option72);
        org.junit.Assert.assertNotNull(option74);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertNull(optionGroup76);
        org.junit.Assert.assertNotNull(options77);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        java.util.List<java.lang.String> strList16 = options5.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean18 = options5.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options23 = options5.addOption("", "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "");
        boolean boolean25 = options23.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.lang.String str26 = options23.toString();
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options32 = options27.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList34 = options32.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options39 = options32.addOption("", "hi!", false, "");
        boolean boolean41 = options32.hasOption("");
        org.apache.commons.cli.Options options44 = options32.addOption("", "");
        java.util.List list45 = options32.getRequiredOptions();
        java.util.List list46 = options32.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList47 = options32.helpOptions();
        boolean boolean49 = options32.hasOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options55 = options50.addOption("", "hi!", true, "");
        boolean boolean57 = options55.hasShortOption("");
        java.util.List list58 = options55.getRequiredOptions();
        boolean boolean60 = options55.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options66 = options61.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList68 = options66.getMatchingOptions("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList69 = options66.helpOptions();
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options76 = options71.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection77 = options71.getOptions();
        org.apache.commons.cli.Option option79 = options71.getOption("hi!");
        org.apache.commons.cli.Options options80 = options70.addOption(option79);
        org.apache.commons.cli.Options options81 = options66.addOption(option79);
        org.apache.commons.cli.OptionGroup optionGroup82 = options55.getOptionGroup(option79);
        org.apache.commons.cli.OptionGroup optionGroup83 = options32.getOptionGroup(option79);
        org.apache.commons.cli.OptionGroup optionGroup84 = options23.getOptionGroup(option79);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection85 = options23.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]" + "'", str26, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(optionList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(optionList69);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNotNull(optionCollection77);
        org.junit.Assert.assertNotNull(option79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNull(optionGroup82);
        org.junit.Assert.assertNull(optionGroup83);
        org.junit.Assert.assertNull(optionGroup84);
        org.junit.Assert.assertNotNull(optionCollection85);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<java.lang.String> strList2 = options0.getMatchingOptions("");
        java.lang.String str3 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection4 = options0.getOptionGroups();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options10 = options5.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList12 = options10.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options17 = options10.addOption("", "hi!", false, "");
        java.util.List list18 = options17.getRequiredOptions();
        java.util.List list19 = options17.getRequiredOptions();
        org.apache.commons.cli.Options options23 = options17.addOption("", false, "");
        java.lang.String str24 = options23.toString();
        org.apache.commons.cli.Options options29 = options23.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options36 = options31.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection37 = options31.getOptions();
        org.apache.commons.cli.Option option39 = options31.getOption("hi!");
        org.apache.commons.cli.Options options40 = options30.addOption(option39);
        org.apache.commons.cli.OptionGroup optionGroup41 = options29.getOptionGroup(option39);
        org.apache.commons.cli.Options options42 = options0.addOption(option39);
        org.apache.commons.cli.Options options46 = options42.addOption("", true, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection47 = options42.getOptions();
        java.lang.Class<?> wildcardClass48 = options42.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection4);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str24, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(optionCollection37);
        org.junit.Assert.assertNotNull(option39);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNull(optionGroup41);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(optionCollection47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        boolean boolean14 = options12.hasOption("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options17 = options12.addOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<java.lang.String> strList2 = options0.getMatchingOptions("");
        java.lang.String str3 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection4 = options0.getOptionGroups();
        boolean boolean6 = options0.hasShortOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        boolean boolean8 = options0.hasOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasLongOption("hi!");
        boolean boolean10 = options0.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList12 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option14 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options17 = options0.addOption("", "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.lang.String str20 = options17.toString();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options26 = options21.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList28 = options26.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options33 = options26.addOption("", "hi!", false, "");
        boolean boolean35 = options26.hasOption("");
        java.util.List<java.lang.String> strList37 = options26.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean39 = options26.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options44 = options26.addOption("", "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection45 = options44.getOptions();
        boolean boolean47 = options44.hasOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options48 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options53 = options48.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection54 = options48.getOptions();
        java.util.List list55 = options48.getRequiredOptions();
        org.apache.commons.cli.Options options60 = options48.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection61 = options60.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection62 = options60.getOptions();
        boolean boolean64 = options60.hasLongOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option66 = options60.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option68 = options60.getOption("");
        org.apache.commons.cli.Options options69 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options74 = options69.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection75 = options69.getOptions();
        org.apache.commons.cli.Option option77 = options69.getOption("hi!");
        org.apache.commons.cli.Option option79 = options69.getOption("hi!");
        org.apache.commons.cli.Options options80 = options60.addOption(option79);
        org.apache.commons.cli.OptionGroup optionGroup81 = options44.getOptionGroup(option79);
        org.apache.commons.cli.Options options82 = options17.addOption(option79);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str20, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(optionCollection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(optionCollection54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(optionCollection61);
        org.junit.Assert.assertNotNull(optionCollection62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(option66);
        org.junit.Assert.assertNotNull(option68);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(optionCollection75);
        org.junit.Assert.assertNotNull(option77);
        org.junit.Assert.assertNotNull(option79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNull(optionGroup81);
        org.junit.Assert.assertNotNull(options82);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options12.getOptions();
        boolean boolean16 = options12.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection17 = options12.getOptionGroups();
        org.apache.commons.cli.Option option19 = options12.getOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options25 = options20.addOption("", "hi!", true, "");
        boolean boolean27 = options25.hasShortOption("");
        boolean boolean29 = options25.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List list30 = options25.getRequiredOptions();
        java.util.List list31 = options25.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection32 = options25.getOptions();
        boolean boolean34 = options25.hasLongOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options40 = options35.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList42 = options40.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options47 = options40.addOption("", "hi!", false, "");
        boolean boolean49 = options40.hasOption("");
        org.apache.commons.cli.Options options52 = options40.addOption("", "");
        java.util.List list53 = options52.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection54 = options52.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList55 = options52.helpOptions();
        org.apache.commons.cli.Options options59 = options52.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection60 = options59.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList61 = options59.helpOptions();
        boolean boolean63 = options59.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option65 = options59.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup66 = options25.getOptionGroup(option65);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection67 = options25.getOptions();
        org.apache.commons.cli.Option option69 = options25.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup70 = options12.getOptionGroup(option69);
        java.util.List list71 = options12.getRequiredOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection17);
        org.junit.Assert.assertNull(option19);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(optionCollection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(optionCollection54);
        org.junit.Assert.assertNotNull(optionList55);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(optionCollection60);
        org.junit.Assert.assertNotNull(optionList61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(option65);
        org.junit.Assert.assertNull(optionGroup66);
        org.junit.Assert.assertNotNull(optionCollection67);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertNull(optionGroup70);
        org.junit.Assert.assertNotNull(list71);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.List<org.apache.commons.cli.Option> optionList13 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection14 = options0.getOptionGroups();
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options20 = options15.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList22 = options20.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options27 = options20.addOption("", "hi!", false, "");
        boolean boolean29 = options20.hasOption("");
        org.apache.commons.cli.Options options32 = options20.addOption("", "");
        java.util.List<java.lang.String> strList34 = options32.getMatchingOptions("");
        org.apache.commons.cli.Option option36 = options32.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean38 = options32.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options44 = options39.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection45 = options39.getOptions();
        org.apache.commons.cli.Option option47 = options39.getOption("hi!");
        boolean boolean49 = options39.hasShortOption("");
        java.util.List<java.lang.String> strList51 = options39.getMatchingOptions("hi!");
        boolean boolean53 = options39.hasLongOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList55 = options39.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option57 = options39.getOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options58 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options63 = options58.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList65 = options63.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options70 = options63.addOption("", "hi!", false, "");
        boolean boolean72 = options63.hasOption("");
        org.apache.commons.cli.Options options75 = options63.addOption("", "");
        org.apache.commons.cli.Option option77 = options75.getOption("hi!");
        org.apache.commons.cli.Options options78 = options39.addOption(option77);
        org.apache.commons.cli.OptionGroup optionGroup79 = options32.getOptionGroup(option77);
        org.apache.commons.cli.Options options80 = options0.addOption(option77);
        boolean boolean82 = options0.hasShortOption("");
        boolean boolean84 = options0.hasShortOption("");
        java.util.List<java.lang.String> strList86 = options0.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        boolean boolean88 = options0.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionList13);
        org.junit.Assert.assertNotNull(optionGroupCollection14);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(option36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(optionCollection45);
        org.junit.Assert.assertNotNull(option47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNull(option57);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertNotNull(option77);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNull(optionGroup79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.List<org.apache.commons.cli.Option> optionList18 = options5.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = options5.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection20 = options5.getOptionGroups();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionList18);
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(optionGroupCollection20);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<java.lang.String> strList2 = options0.getMatchingOptions("");
        java.lang.String str3 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection4 = options0.getOptionGroups();
        boolean boolean6 = options0.hasShortOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        boolean boolean8 = options0.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        java.util.List<java.lang.String> strList10 = options0.getMatchingOptions("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options0.getOptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionCollection11);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.List list18 = options5.getRequiredOptions();
        java.util.List list19 = options5.getRequiredOptions();
        boolean boolean21 = options5.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList22 = options5.helpOptions();
        boolean boolean24 = options5.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        java.util.List list25 = options5.getRequiredOptions();
        boolean boolean27 = options5.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        java.util.List list15 = options12.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList16 = options12.helpOptions();
        boolean boolean18 = options12.hasOption("hi!");
        boolean boolean20 = options12.hasOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.lang.String str21 = options12.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection22 = options12.getOptionGroups();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(optionList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str21, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection22);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options0.getOptions();
        boolean boolean9 = options0.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean11 = options0.hasShortOption("");
        boolean boolean13 = options0.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection14 = options0.getOptionGroups();
        java.lang.String str15 = options0.toString();
        org.apache.commons.cli.Options options19 = options0.addOption("", false, "");
        boolean boolean21 = options0.hasOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options27 = options22.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options34 = options27.addOption("", "hi!", false, "");
        boolean boolean36 = options27.hasOption("");
        org.apache.commons.cli.Options options41 = options27.addOption("", "", false, "");
        org.apache.commons.cli.Option option43 = options41.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options44 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options49 = options44.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options56 = options49.addOption("", "hi!", false, "");
        boolean boolean58 = options49.hasOption("");
        org.apache.commons.cli.Options options61 = options49.addOption("", "");
        org.apache.commons.cli.Option option63 = options61.getOption("hi!");
        org.apache.commons.cli.Options options64 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options69 = options64.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection70 = options64.getOptions();
        org.apache.commons.cli.Option option72 = options64.getOption("hi!");
        org.apache.commons.cli.Option option74 = options64.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup75 = options61.getOptionGroup(option74);
        org.apache.commons.cli.Options options76 = options41.addOption(option74);
        org.apache.commons.cli.Options options77 = options0.addOption(option74);
        boolean boolean79 = options0.hasShortOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.lang.String str80 = options0.toString();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str15, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNull(option43);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(option63);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNotNull(optionCollection70);
        org.junit.Assert.assertNotNull(option72);
        org.junit.Assert.assertNotNull(option74);
        org.junit.Assert.assertNull(optionGroup75);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNotNull(options77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str80, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("");
        java.util.List<org.apache.commons.cli.Option> optionList8 = options0.helpOptions();
        boolean boolean10 = options0.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.lang.String str11 = options0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options16 = options0.addOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:  hi!  [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(optionList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str11, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.List list18 = options5.getRequiredOptions();
        org.apache.commons.cli.Options options22 = options5.addOption("", true, "[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List list23 = options5.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection24 = options5.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection25 = options5.getOptions();
        boolean boolean27 = options5.hasOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(optionCollection24);
        org.junit.Assert.assertNotNull(optionCollection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        org.apache.commons.cli.Option option8 = options0.getOption("hi!");
        boolean boolean10 = options0.hasShortOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options0.getOptions();
        boolean boolean13 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options0.getOptions();
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options20 = options15.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options15.getOptions();
        java.util.List list22 = options15.getRequiredOptions();
        org.apache.commons.cli.Options options27 = options15.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection28 = options27.getOptions();
        boolean boolean30 = options27.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options35 = options27.addOption("", "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList37 = options35.getMatchingOptions("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options43 = options38.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection44 = options38.getOptions();
        java.util.List list45 = options38.getRequiredOptions();
        org.apache.commons.cli.Options options50 = options38.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection51 = options50.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection52 = options50.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection53 = options50.getOptions();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options60 = options55.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection61 = options55.getOptions();
        org.apache.commons.cli.Option option63 = options55.getOption("hi!");
        org.apache.commons.cli.Options options64 = options54.addOption(option63);
        org.apache.commons.cli.Options options65 = options50.addOption(option63);
        org.apache.commons.cli.Options options66 = options35.addOption(option63);
        org.apache.commons.cli.OptionGroup optionGroup67 = options0.getOptionGroup(option63);
        org.apache.commons.cli.Options options71 = options0.addOption("", false, "hi!");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(option8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(optionCollection28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(optionCollection44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(optionCollection51);
        org.junit.Assert.assertNotNull(optionCollection52);
        org.junit.Assert.assertNotNull(optionCollection53);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(optionCollection61);
        org.junit.Assert.assertNotNull(option63);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNull(optionGroup67);
        org.junit.Assert.assertNotNull(options71);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        java.util.List list15 = options12.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList16 = options12.helpOptions();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options22 = options17.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList24 = options22.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options29 = options22.addOption("", "hi!", false, "");
        boolean boolean31 = options22.hasOption("");
        org.apache.commons.cli.Options options34 = options22.addOption("", "");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options40 = options35.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options35.getOptions();
        org.apache.commons.cli.Option option43 = options35.getOption("hi!");
        org.apache.commons.cli.Options options44 = options22.addOption(option43);
        org.apache.commons.cli.Options options45 = options12.addOption(option43);
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options51 = options46.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList53 = options51.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options58 = options51.addOption("", "hi!", false, "");
        boolean boolean60 = options51.hasOption("");
        org.apache.commons.cli.Options options63 = options51.addOption("", "");
        org.apache.commons.cli.Option option65 = options63.getOption("hi!");
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options71 = options66.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection72 = options66.getOptions();
        org.apache.commons.cli.Option option74 = options66.getOption("hi!");
        org.apache.commons.cli.Option option76 = options66.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup77 = options63.getOptionGroup(option76);
        org.apache.commons.cli.Options options78 = options12.addOption(option76);
        java.lang.String str79 = options78.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection80 = options78.getOptions();
        boolean boolean82 = options78.hasShortOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.lang.String str83 = options78.toString();
        java.util.List list84 = options78.getRequiredOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(optionList16);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(optionCollection41);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(option65);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(optionCollection72);
        org.junit.Assert.assertNotNull(option74);
        org.junit.Assert.assertNotNull(option76);
        org.junit.Assert.assertNull(optionGroup77);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str79, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionCollection80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str83, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(list84);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        java.util.List<java.lang.String> strList16 = options5.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean18 = options5.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options23 = options5.addOption("", "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "");
        org.apache.commons.cli.Option option25 = options5.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.lang.String str26 = options5.toString();
        boolean boolean28 = options5.hasLongOption("[ Options: [ short {=[ option:    [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNull(option25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]" + "'", str26, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options5.getOptions();
        java.util.List list19 = options5.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options5.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(optionCollection21);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options11 = options6.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList13 = options11.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options18 = options11.addOption("", "hi!", false, "");
        boolean boolean20 = options11.hasOption("");
        org.apache.commons.cli.Options options23 = options11.addOption("", "");
        org.apache.commons.cli.Option option25 = options23.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup26 = options0.getOptionGroup(option25);
        java.util.List<java.lang.String> strList28 = options0.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options32 = options0.addOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        org.apache.commons.cli.Options options24 = options18.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        boolean boolean26 = options24.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options32 = options27.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList34 = options32.getMatchingOptions("hi!");
        boolean boolean36 = options32.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList38 = options32.getMatchingOptions("hi!");
        boolean boolean40 = options32.hasLongOption("hi!");
        org.apache.commons.cli.Options options41 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options46 = options41.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList48 = options46.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options53 = options46.addOption("", "hi!", false, "");
        boolean boolean55 = options46.hasOption("");
        org.apache.commons.cli.Options options58 = options46.addOption("", "");
        org.apache.commons.cli.Option option60 = options58.getOption("hi!");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options66 = options61.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection67 = options61.getOptions();
        org.apache.commons.cli.Option option69 = options61.getOption("hi!");
        org.apache.commons.cli.Option option71 = options61.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup72 = options58.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup73 = options32.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup74 = options24.getOptionGroup(option71);
        java.util.List<java.lang.String> strList76 = options24.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList78 = options24.getMatchingOptions("");
        java.util.List<java.lang.String> strList80 = options24.getMatchingOptions("");
        boolean boolean82 = options24.hasOption("");
        java.util.List list83 = options24.getRequiredOptions();
        boolean boolean85 = options24.hasOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.lang.String str86 = options24.toString();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(option60);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(optionCollection67);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNull(optionGroup72);
        org.junit.Assert.assertNull(optionGroup73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]" + "'", str86, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.List list18 = options5.getRequiredOptions();
        java.util.List<java.lang.String> strList20 = options5.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList21 = options5.helpOptions();
        java.lang.String str22 = options5.toString();
        java.util.List<org.apache.commons.cli.Option> optionList23 = options5.helpOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(optionList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str22, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionList23);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection15 = options5.getOptionGroups();
        java.lang.String str16 = options5.toString();
        boolean boolean18 = options5.hasLongOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList20 = options5.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList22 = options5.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options28 = options23.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList30 = options28.getMatchingOptions("hi!");
        boolean boolean32 = options28.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList34 = options28.getMatchingOptions("hi!");
        boolean boolean36 = options28.hasLongOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options42 = options37.addOption("", "hi!", true, "");
        boolean boolean44 = options42.hasOption("");
        org.apache.commons.cli.Options options45 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options50 = options45.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList52 = options50.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options57 = options50.addOption("", "hi!", false, "");
        java.util.List list58 = options57.getRequiredOptions();
        java.util.List list59 = options57.getRequiredOptions();
        java.util.List list60 = options57.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList61 = options57.helpOptions();
        org.apache.commons.cli.Options options62 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options67 = options62.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList69 = options67.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options74 = options67.addOption("", "hi!", false, "");
        boolean boolean76 = options67.hasOption("");
        org.apache.commons.cli.Options options79 = options67.addOption("", "");
        org.apache.commons.cli.Options options80 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options85 = options80.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection86 = options80.getOptions();
        org.apache.commons.cli.Option option88 = options80.getOption("hi!");
        org.apache.commons.cli.Options options89 = options67.addOption(option88);
        org.apache.commons.cli.Options options90 = options57.addOption(option88);
        org.apache.commons.cli.Options options91 = options42.addOption(option88);
        org.apache.commons.cli.OptionGroup optionGroup92 = options28.getOptionGroup(option88);
        org.apache.commons.cli.Options options93 = options5.addOption(option88);
        java.util.List list94 = options5.getRequiredOptions();
        org.apache.commons.cli.Option option96 = options5.getOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(optionGroupCollection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str16, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(optionList61);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(options79);
        org.junit.Assert.assertNotNull(options85);
        org.junit.Assert.assertNotNull(optionCollection86);
        org.junit.Assert.assertNotNull(option88);
        org.junit.Assert.assertNotNull(options89);
        org.junit.Assert.assertNotNull(options90);
        org.junit.Assert.assertNotNull(options91);
        org.junit.Assert.assertNull(optionGroup92);
        org.junit.Assert.assertNotNull(options93);
        org.junit.Assert.assertNotNull(list94);
        org.junit.Assert.assertNull(option96);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.lang.String str7 = options0.toString();
        java.lang.String str8 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection9 = options0.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection10 = options0.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection11 = options0.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList12 = options0.helpOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options16 = options0.addOption("[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str7, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str8, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection9);
        org.junit.Assert.assertNotNull(optionGroupCollection10);
        org.junit.Assert.assertNotNull(optionGroupCollection11);
        org.junit.Assert.assertNotNull(optionList12);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        boolean boolean16 = options5.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList17 = options5.helpOptions();
        org.apache.commons.cli.Option option19 = options5.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean21 = options5.hasOption("");
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options27 = options22.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options34 = options27.addOption("", "hi!", false, "");
        boolean boolean36 = options27.hasOption("");
        org.apache.commons.cli.Options options41 = options27.addOption("", "", false, "");
        org.apache.commons.cli.Option option43 = options41.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option45 = options41.getOption("");
        org.apache.commons.cli.Options options46 = options5.addOption(option45);
        boolean boolean48 = options46.hasOption("hi!");
        boolean boolean50 = options46.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        boolean boolean52 = options46.hasLongOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        boolean boolean54 = options46.hasLongOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(optionList17);
        org.junit.Assert.assertNull(option19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNull(option43);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        java.util.List list15 = options12.getRequiredOptions();
        boolean boolean17 = options12.hasLongOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean19 = options12.hasShortOption("[ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        boolean boolean21 = options12.hasLongOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options12.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionCollection22);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options11.helpOptions();
        java.util.List list13 = options11.getRequiredOptions();
        boolean boolean15 = options11.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList16 = options11.helpOptions();
        boolean boolean18 = options11.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(optionList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        boolean boolean15 = options12.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options20 = options12.addOption("", "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection21 = options12.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList22 = options12.helpOptions();
        java.util.List<java.lang.String> strList24 = options12.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList26 = options12.getMatchingOptions("");
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("");
        boolean boolean31 = options27.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options37 = options32.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList39 = options37.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options44 = options37.addOption("", "hi!", false, "");
        java.util.List list45 = options44.getRequiredOptions();
        java.util.List list46 = options44.getRequiredOptions();
        java.util.List<java.lang.String> strList48 = options44.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options54 = options49.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection55 = options49.getOptions();
        org.apache.commons.cli.Option option57 = options49.getOption("hi!");
        org.apache.commons.cli.Options options58 = options44.addOption(option57);
        org.apache.commons.cli.OptionGroup optionGroup59 = options27.getOptionGroup(option57);
        org.apache.commons.cli.Options options60 = options12.addOption(option57);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options63 = options12.addOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:  hi!  [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(optionGroupCollection21);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(optionCollection55);
        org.junit.Assert.assertNotNull(option57);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNull(optionGroup59);
        org.junit.Assert.assertNotNull(options60);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<java.lang.String> strList10 = options0.getMatchingOptions("");
        boolean boolean12 = options0.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean14 = options0.hasShortOption("hi!");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options20 = options15.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options15.getOptions();
        boolean boolean23 = options15.hasLongOption("hi!");
        boolean boolean25 = options15.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option27 = options15.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup28 = options0.getOptionGroup(option27);
        java.util.List<java.lang.String> strList30 = options0.getMatchingOptions("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean32 = options0.hasShortOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options0.getOptions();
        boolean boolean35 = options0.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean37 = options0.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options43 = options38.addOption("", "hi!", true, "");
        boolean boolean45 = options43.hasShortOption("");
        boolean boolean47 = options43.hasLongOption("");
        org.apache.commons.cli.Options options48 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options53 = options48.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList55 = options53.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options60 = options53.addOption("", "hi!", false, "");
        boolean boolean62 = options53.hasOption("");
        org.apache.commons.cli.Options options65 = options53.addOption("", "");
        org.apache.commons.cli.Option option67 = options65.getOption("hi!");
        org.apache.commons.cli.Options options68 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options73 = options68.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection74 = options68.getOptions();
        org.apache.commons.cli.Option option76 = options68.getOption("hi!");
        org.apache.commons.cli.Option option78 = options68.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup79 = options65.getOptionGroup(option78);
        org.apache.commons.cli.OptionGroup optionGroup80 = options43.getOptionGroup(option78);
        org.apache.commons.cli.Options options81 = options0.addOption(option78);
        boolean boolean83 = options0.hasOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList85 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option87 = options0.getOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertNull(optionGroup28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNotNull(option67);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(optionCollection74);
        org.junit.Assert.assertNotNull(option76);
        org.junit.Assert.assertNotNull(option78);
        org.junit.Assert.assertNull(optionGroup79);
        org.junit.Assert.assertNull(optionGroup80);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNull(option87);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options12.getOptions();
        java.util.List list16 = options12.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection17 = options12.getOptionGroups();
        org.apache.commons.cli.Options options21 = options12.addOption("", false, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options12.getOptions();
        org.apache.commons.cli.Options options27 = options12.addOption("", false, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList29 = options12.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.lang.String str30 = options12.toString();
        java.util.List<org.apache.commons.cli.Option> optionList31 = options12.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection32 = options12.getOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(optionGroupCollection17);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(optionCollection22);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]" + "'", str30, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionList31);
        org.junit.Assert.assertNotNull(optionCollection32);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        boolean boolean7 = options5.hasShortOption("");
        boolean boolean9 = options5.hasLongOption("");
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options15 = options10.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList17 = options15.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options22 = options15.addOption("", "hi!", false, "");
        boolean boolean24 = options15.hasOption("");
        org.apache.commons.cli.Options options27 = options15.addOption("", "");
        org.apache.commons.cli.Option option29 = options27.getOption("hi!");
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options35 = options30.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection36 = options30.getOptions();
        org.apache.commons.cli.Option option38 = options30.getOption("hi!");
        org.apache.commons.cli.Option option40 = options30.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup41 = options27.getOptionGroup(option40);
        org.apache.commons.cli.OptionGroup optionGroup42 = options5.getOptionGroup(option40);
        boolean boolean44 = options5.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean46 = options5.hasShortOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options51 = options5.addOption("", "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option53 = options51.getOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean55 = options51.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options59 = options51.addOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(option29);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(optionCollection36);
        org.junit.Assert.assertNotNull(option38);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNull(optionGroup41);
        org.junit.Assert.assertNull(optionGroup42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNull(option53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.lang.String str18 = options5.toString();
        java.lang.String str19 = options5.toString();
        java.util.List<java.lang.String> strList21 = options5.getMatchingOptions("");
        boolean boolean23 = options5.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.lang.String str24 = options5.toString();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str18, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str24, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        java.util.List list18 = options17.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = options17.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList20 = options17.helpOptions();
        org.apache.commons.cli.Options options24 = options17.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection25 = options24.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList26 = options24.helpOptions();
        boolean boolean28 = options24.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List list29 = options24.getRequiredOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(optionList20);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(optionCollection25);
        org.junit.Assert.assertNotNull(optionList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", "", true, "hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options12.getOptions();
        java.util.List list15 = options12.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList16 = options12.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options12.getOptions();
        boolean boolean19 = options12.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean21 = options12.hasOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(optionList16);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        java.util.List<java.lang.String> strList16 = options5.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean18 = options5.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options23 = options5.addOption("", "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "");
        java.lang.String str24 = options23.toString();
        java.util.List list25 = options23.getRequiredOptions();
        java.util.List list26 = options23.getRequiredOptions();
        org.apache.commons.cli.Option option28 = options23.getOption("");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]" + "'", str24, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(option28);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        boolean boolean19 = options5.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        org.apache.commons.cli.Options options25 = options5.addOption("", "", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options5.getOptions();
        boolean boolean28 = options5.hasLongOption("[ Options: [ short {=[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    [ARG] :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection29 = options5.getOptions();
        boolean boolean31 = options5.hasOption("[ Options: [ short {=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection32 = options5.getOptionGroups();
        java.util.List<java.lang.String> strList34 = options5.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], =[ option:    ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(optionCollection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection32);
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        java.util.List list13 = options12.getRequiredOptions();
        java.util.List list14 = options12.getRequiredOptions();
        org.apache.commons.cli.Options options18 = options12.addOption("", false, "");
        java.lang.String str19 = options18.toString();
        org.apache.commons.cli.Options options24 = options18.addOption("", "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", false, "hi!");
        boolean boolean26 = options24.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options32 = options27.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList34 = options32.getMatchingOptions("hi!");
        boolean boolean36 = options32.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList38 = options32.getMatchingOptions("hi!");
        boolean boolean40 = options32.hasLongOption("hi!");
        org.apache.commons.cli.Options options41 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options46 = options41.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList48 = options46.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options53 = options46.addOption("", "hi!", false, "");
        boolean boolean55 = options46.hasOption("");
        org.apache.commons.cli.Options options58 = options46.addOption("", "");
        org.apache.commons.cli.Option option60 = options58.getOption("hi!");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options66 = options61.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection67 = options61.getOptions();
        org.apache.commons.cli.Option option69 = options61.getOption("hi!");
        org.apache.commons.cli.Option option71 = options61.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup72 = options58.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup73 = options32.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup74 = options24.getOptionGroup(option71);
        java.util.List<java.lang.String> strList76 = options24.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList78 = options24.getMatchingOptions("");
        boolean boolean80 = options24.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection81 = options24.getOptionGroups();
        boolean boolean83 = options24.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str19, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(option60);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(optionCollection67);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNull(optionGroup72);
        org.junit.Assert.assertNull(optionGroup73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        java.lang.String str12 = options5.toString();
        java.util.List<java.lang.String> strList14 = options5.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection15 = options5.getOptionGroups();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options21 = options16.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options16.getOptions();
        boolean boolean24 = options16.hasShortOption("");
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options30 = options25.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection31 = options25.getOptions();
        boolean boolean33 = options25.hasShortOption("");
        java.util.List<java.lang.String> strList35 = options25.getMatchingOptions("");
        boolean boolean37 = options25.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options43 = options38.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection44 = options38.getOptions();
        org.apache.commons.cli.Option option46 = options38.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup47 = options25.getOptionGroup(option46);
        org.apache.commons.cli.Options options48 = options16.addOption(option46);
        org.apache.commons.cli.OptionGroup optionGroup49 = options5.getOptionGroup(option46);
        boolean boolean51 = options5.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        boolean boolean53 = options5.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.lang.String str54 = options5.toString();
        boolean boolean56 = options5.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ], =[ option:    [ARG] :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(optionGroupCollection15);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(optionCollection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(optionCollection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(optionCollection44);
        org.junit.Assert.assertNotNull(option46);
        org.junit.Assert.assertNull(optionGroup47);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNull(optionGroup49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]" + "'", str54, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.List<java.lang.String> strList7 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options12 = options5.addOption("", "hi!", false, "");
        boolean boolean14 = options5.hasOption("");
        org.apache.commons.cli.Options options17 = options5.addOption("", "");
        boolean boolean19 = options5.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options5.getOptions();
        org.apache.commons.cli.Options options25 = options5.addOption("", "", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList27 = options5.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection28 = options5.getOptionGroups();
        java.util.List list29 = options5.getRequiredOptions();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(optionGroupCollection28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options5 = options0.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        boolean boolean8 = options0.hasShortOption("");
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options14 = options9.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options9.getOptions();
        boolean boolean17 = options9.hasShortOption("");
        java.util.List<java.lang.String> strList19 = options9.getMatchingOptions("");
        boolean boolean21 = options9.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options27 = options22.addOption("", "hi!", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection28 = options22.getOptions();
        org.apache.commons.cli.Option option30 = options22.getOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup31 = options9.getOptionGroup(option30);
        org.apache.commons.cli.Options options32 = options0.addOption(option30);
        org.apache.commons.cli.Option option34 = options32.getOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        boolean boolean36 = options32.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean38 = options32.hasLongOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection39 = options32.getOptionGroups();
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(optionCollection28);
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(option34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection39);
    }
}

