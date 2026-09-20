package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray18 = posixParser11.flatten(options12, strArray16, true);
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray25 = posixParser11.flatten(options19, strArray23, false);
        java.lang.String[] strArray27 = posixParser2.flatten(options10, strArray23, true);
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray36 = posixParser29.flatten(options30, strArray34, true);
        java.lang.String[] strArray38 = posixParser2.flatten(options28, strArray36, false);
        java.lang.String[] strArray40 = posixParser0.flatten(options1, strArray36, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray56 = posixParser42.flatten(options50, strArray54, false);
        java.lang.String[] strArray58 = posixParser0.flatten(options41, strArray54, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray18 = posixParser11.flatten(options12, strArray16, true);
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray25 = posixParser11.flatten(options19, strArray23, false);
        java.lang.String[] strArray27 = posixParser2.flatten(options10, strArray23, true);
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray36 = posixParser29.flatten(options30, strArray34, true);
        java.lang.String[] strArray38 = posixParser2.flatten(options28, strArray36, false);
        java.lang.String[] strArray40 = posixParser0.flatten(options1, strArray36, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray56 = posixParser42.flatten(options50, strArray54, false);
        java.lang.String[] strArray58 = posixParser0.flatten(options41, strArray54, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option74 = null;
        java.util.ListIterator listIterator75 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option74, listIterator75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray24 = posixParser17.flatten(options18, strArray22, true);
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray33 = posixParser26.flatten(options27, strArray31, true);
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray40 = posixParser26.flatten(options34, strArray38, false);
        java.lang.String[] strArray42 = posixParser17.flatten(options25, strArray38, true);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        java.lang.String[] strArray53 = posixParser17.flatten(options43, strArray51, false);
        java.lang.String[] strArray55 = posixParser15.flatten(options16, strArray51, false);
        java.lang.String[] strArray57 = posixParser0.flatten(options14, strArray55, true);
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray66 = posixParser59.flatten(options60, strArray64, true);
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray73 = posixParser59.flatten(options67, strArray71, false);
        org.apache.commons.cli.Options options74 = null;
        org.apache.commons.cli.PosixParser posixParser75 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options76 = null;
        java.lang.String[] strArray80 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray82 = posixParser75.flatten(options76, strArray80, true);
        java.lang.String[] strArray84 = posixParser59.flatten(options74, strArray80, true);
        java.lang.String[] strArray86 = posixParser0.flatten(options58, strArray80, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray24 = posixParser17.flatten(options18, strArray22, true);
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray33 = posixParser26.flatten(options27, strArray31, true);
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray40 = posixParser26.flatten(options34, strArray38, false);
        java.lang.String[] strArray42 = posixParser17.flatten(options25, strArray38, true);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        java.lang.String[] strArray53 = posixParser17.flatten(options43, strArray51, false);
        java.lang.String[] strArray55 = posixParser15.flatten(options16, strArray51, false);
        java.lang.String[] strArray57 = posixParser0.flatten(options14, strArray55, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option73 = null;
        java.util.ListIterator listIterator74 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option73, listIterator74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray22 = posixParser15.flatten(options16, strArray20, true);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray31 = posixParser24.flatten(options25, strArray29, true);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray38 = posixParser24.flatten(options32, strArray36, false);
        java.lang.String[] strArray40 = posixParser15.flatten(options23, strArray36, true);
        posixParser15.burstToken("", true);
        posixParser15.burstToken("", false);
        posixParser15.burstToken("", false);
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray58 = posixParser51.flatten(options52, strArray56, true);
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray65 = posixParser51.flatten(options59, strArray63, false);
        java.lang.String[] strArray67 = posixParser15.flatten(options50, strArray65, false);
        java.lang.String[] strArray69 = posixParser0.flatten(options14, strArray65, false);
        org.apache.commons.cli.Options options70 = null;
        org.apache.commons.cli.PosixParser posixParser71 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray76 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray78 = posixParser71.flatten(options72, strArray76, true);
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray83 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray85 = posixParser71.flatten(options79, strArray83, false);
        java.lang.String[] strArray87 = posixParser0.flatten(options70, strArray83, false);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray26 = posixParser19.flatten(options20, strArray24, true);
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray33 = posixParser19.flatten(options27, strArray31, false);
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray42 = posixParser35.flatten(options36, strArray40, true);
        java.lang.String[] strArray44 = posixParser19.flatten(options34, strArray40, true);
        java.lang.String[] strArray46 = posixParser0.flatten(options18, strArray40, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray58 = posixParser51.flatten(options52, strArray56, true);
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray65 = posixParser51.flatten(options59, strArray63, false);
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray74 = posixParser67.flatten(options68, strArray72, true);
        java.lang.String[] strArray76 = posixParser51.flatten(options66, strArray72, false);
        java.util.Properties properties77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine79 = posixParser0.parse(options50, strArray72, properties77, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray53 = posixParser46.flatten(options47, strArray51, true);
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray60 = posixParser46.flatten(options54, strArray58, false);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray69 = posixParser62.flatten(options63, strArray67, true);
        java.lang.String[] strArray71 = posixParser46.flatten(options61, strArray67, false);
        java.lang.String[] strArray73 = posixParser44.flatten(options45, strArray71, true);
        java.lang.String[] strArray75 = posixParser0.flatten(options43, strArray73, false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass47 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        posixParser27.burstToken("", true);
        posixParser27.burstToken("", false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray56 = posixParser42.flatten(options50, strArray54, false);
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray65 = posixParser58.flatten(options59, strArray63, true);
        java.lang.String[] strArray67 = posixParser42.flatten(options57, strArray63, false);
        org.apache.commons.cli.Options options68 = null;
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray76 = posixParser69.flatten(options70, strArray74, true);
        java.lang.String[] strArray78 = posixParser42.flatten(options68, strArray76, true);
        java.lang.String[] strArray80 = posixParser27.flatten(options41, strArray76, false);
        java.lang.String[] strArray82 = posixParser0.flatten(options26, strArray80, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray18 = posixParser11.flatten(options12, strArray16, true);
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray25 = posixParser11.flatten(options19, strArray23, false);
        java.lang.String[] strArray27 = posixParser2.flatten(options10, strArray23, true);
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray36 = posixParser29.flatten(options30, strArray34, true);
        java.lang.String[] strArray38 = posixParser2.flatten(options28, strArray36, false);
        java.lang.String[] strArray40 = posixParser0.flatten(options1, strArray36, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray58 = posixParser44.flatten(options52, strArray56, false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray67 = posixParser60.flatten(options61, strArray65, true);
        java.lang.String[] strArray69 = posixParser44.flatten(options59, strArray65, false);
        java.lang.String[] strArray71 = posixParser42.flatten(options43, strArray69, true);
        java.lang.String[] strArray73 = posixParser0.flatten(options41, strArray69, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray60 = posixParser53.flatten(options54, strArray58, true);
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray67 = posixParser53.flatten(options61, strArray65, false);
        java.lang.String[] strArray69 = posixParser44.flatten(options52, strArray65, true);
        org.apache.commons.cli.Options options70 = null;
        org.apache.commons.cli.PosixParser posixParser71 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray76 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray78 = posixParser71.flatten(options72, strArray76, true);
        java.lang.String[] strArray80 = posixParser44.flatten(options70, strArray78, false);
        java.lang.String[] strArray82 = posixParser42.flatten(options43, strArray78, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine83 = posixParser0.parse(options41, strArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        java.lang.String[] strArray34 = posixParser9.flatten(options24, strArray30, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options8, strArray30, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options29 = null;
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray37 = posixParser30.flatten(options31, strArray35, true);
        posixParser30.burstToken("", true);
        posixParser30.burstToken("", false);
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray54 = posixParser47.flatten(options48, strArray52, true);
        org.apache.commons.cli.Options options55 = null;
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray63 = posixParser56.flatten(options57, strArray61, true);
        org.apache.commons.cli.Options options64 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray70 = posixParser56.flatten(options64, strArray68, false);
        java.lang.String[] strArray72 = posixParser47.flatten(options55, strArray68, true);
        org.apache.commons.cli.Options options73 = null;
        org.apache.commons.cli.PosixParser posixParser74 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options75 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray81 = posixParser74.flatten(options75, strArray79, true);
        java.lang.String[] strArray83 = posixParser47.flatten(options73, strArray81, false);
        java.lang.String[] strArray85 = posixParser45.flatten(options46, strArray81, false);
        java.lang.String[] strArray87 = posixParser30.flatten(options44, strArray85, true);
        java.lang.String[] strArray89 = posixParser0.flatten(options29, strArray85, true);
        java.lang.Class<?> wildcardClass90 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options11 = null;
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray19 = posixParser12.flatten(options13, strArray17, true);
        java.lang.String[] strArray21 = posixParser0.flatten(options11, strArray19, false);
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray30 = posixParser23.flatten(options24, strArray28, true);
        org.apache.commons.cli.Options options31 = null;
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options33 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray39 = posixParser32.flatten(options33, strArray37, true);
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray46 = posixParser32.flatten(options40, strArray44, false);
        org.apache.commons.cli.Options options47 = null;
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray55 = posixParser48.flatten(options49, strArray53, true);
        java.lang.String[] strArray57 = posixParser32.flatten(options47, strArray53, true);
        java.lang.String[] strArray59 = posixParser23.flatten(options31, strArray53, false);
        posixParser23.burstToken("", true);
        posixParser23.burstToken("", true);
        posixParser23.burstToken("", true);
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray77 = posixParser70.flatten(options71, strArray75, true);
        org.apache.commons.cli.Options options78 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray84 = posixParser70.flatten(options78, strArray82, false);
        java.lang.String[] strArray86 = posixParser23.flatten(options69, strArray82, false);
        java.lang.String[] strArray88 = posixParser0.flatten(options22, strArray82, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options92 = null;
        java.lang.String[] strArray93 = null;
        java.util.Properties properties94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine95 = posixParser0.parse(options92, strArray93, properties94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray53 = posixParser39.flatten(options47, strArray51, false);
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray62 = posixParser55.flatten(options56, strArray60, true);
        java.lang.String[] strArray64 = posixParser39.flatten(options54, strArray60, true);
        java.lang.String[] strArray66 = posixParser0.flatten(options38, strArray64, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option76 = null;
        java.util.ListIterator listIterator77 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option76, listIterator77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray18 = posixParser11.flatten(options12, strArray16, true);
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray25 = posixParser11.flatten(options19, strArray23, false);
        java.lang.String[] strArray27 = posixParser2.flatten(options10, strArray23, true);
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray36 = posixParser29.flatten(options30, strArray34, true);
        java.lang.String[] strArray38 = posixParser2.flatten(options28, strArray36, false);
        java.lang.String[] strArray40 = posixParser0.flatten(options1, strArray36, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray22 = posixParser15.flatten(options16, strArray20, true);
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray29 = posixParser15.flatten(options23, strArray27, false);
        org.apache.commons.cli.Options options30 = null;
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray38 = posixParser31.flatten(options32, strArray36, true);
        java.lang.String[] strArray40 = posixParser15.flatten(options30, strArray36, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        java.lang.String[] strArray51 = posixParser15.flatten(options41, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options14, strArray49, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        org.apache.commons.cli.Options options33 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray39 = posixParser25.flatten(options33, strArray37, false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        java.lang.String[] strArray50 = posixParser25.flatten(options40, strArray46, false);
        posixParser25.burstToken("", false);
        posixParser25.burstToken("", true);
        posixParser25.burstToken("", true);
        posixParser25.burstToken("", false);
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray71 = posixParser64.flatten(options65, strArray69, true);
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray76 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray78 = posixParser64.flatten(options72, strArray76, false);
        org.apache.commons.cli.Options options79 = null;
        org.apache.commons.cli.PosixParser posixParser80 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options81 = null;
        java.lang.String[] strArray85 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray87 = posixParser80.flatten(options81, strArray85, true);
        java.lang.String[] strArray89 = posixParser64.flatten(options79, strArray85, true);
        java.lang.String[] strArray91 = posixParser25.flatten(options63, strArray89, true);
        java.lang.String[] strArray93 = posixParser0.flatten(options24, strArray91, true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray41 = posixParser27.flatten(options35, strArray39, false);
        posixParser27.burstToken("", true);
        posixParser27.burstToken("", true);
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray56 = posixParser49.flatten(options50, strArray54, true);
        java.lang.String[] strArray58 = posixParser27.flatten(options48, strArray56, false);
        java.lang.String[] strArray60 = posixParser0.flatten(options26, strArray58, true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass64 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray18 = posixParser11.flatten(options12, strArray16, true);
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray25 = posixParser11.flatten(options19, strArray23, false);
        java.lang.String[] strArray27 = posixParser2.flatten(options10, strArray23, true);
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray36 = posixParser29.flatten(options30, strArray34, true);
        java.lang.String[] strArray38 = posixParser2.flatten(options28, strArray36, false);
        java.lang.String[] strArray40 = posixParser0.flatten(options1, strArray36, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray56 = posixParser42.flatten(options50, strArray54, false);
        java.lang.String[] strArray58 = posixParser0.flatten(options41, strArray54, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option74 = null;
        java.util.ListIterator listIterator75 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option74, listIterator75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray40 = posixParser33.flatten(options34, strArray38, true);
        org.apache.commons.cli.Options options41 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray47 = posixParser33.flatten(options41, strArray45, false);
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray56 = posixParser49.flatten(options50, strArray54, true);
        java.lang.String[] strArray58 = posixParser33.flatten(options48, strArray54, true);
        java.lang.String[] strArray60 = posixParser0.flatten(options32, strArray54, true);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray69 = posixParser62.flatten(options63, strArray67, true);
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray76 = posixParser62.flatten(options70, strArray74, false);
        java.lang.String[] strArray78 = posixParser0.flatten(options61, strArray76, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass91 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser41.flatten(options49, strArray53, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        java.lang.String[] strArray66 = posixParser41.flatten(options56, strArray62, true);
        java.lang.String[] strArray68 = posixParser0.flatten(options40, strArray62, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass78 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options29 = null;
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray37 = posixParser30.flatten(options31, strArray35, true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray53 = posixParser39.flatten(options47, strArray51, false);
        java.lang.String[] strArray55 = posixParser30.flatten(options38, strArray51, true);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        java.lang.String[] strArray66 = posixParser30.flatten(options56, strArray64, false);
        java.lang.String[] strArray68 = posixParser0.flatten(options29, strArray66, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        java.lang.String[] strArray25 = posixParser0.flatten(options8, strArray21, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options49 = null;
        org.apache.commons.cli.PosixParser posixParser50 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options51 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray57 = posixParser50.flatten(options51, strArray55, true);
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray66 = posixParser59.flatten(options60, strArray64, true);
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray73 = posixParser59.flatten(options67, strArray71, false);
        java.lang.String[] strArray75 = posixParser50.flatten(options58, strArray71, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine77 = posixParser0.parse(options49, strArray71, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        posixParser27.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        org.apache.commons.cli.Options options47 = null;
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray55 = posixParser48.flatten(options49, strArray53, true);
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray62 = posixParser48.flatten(options56, strArray60, false);
        java.lang.String[] strArray64 = posixParser39.flatten(options47, strArray60, true);
        java.lang.String[] strArray66 = posixParser27.flatten(options38, strArray64, false);
        java.lang.String[] strArray68 = posixParser0.flatten(options26, strArray66, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options78 = null;
        java.lang.String[] strArray79 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray81 = posixParser0.flatten(options78, strArray79, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray22 = posixParser15.flatten(options16, strArray20, true);
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray29 = posixParser15.flatten(options23, strArray27, false);
        org.apache.commons.cli.Options options30 = null;
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray38 = posixParser31.flatten(options32, strArray36, true);
        java.lang.String[] strArray40 = posixParser15.flatten(options30, strArray36, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        java.lang.String[] strArray51 = posixParser15.flatten(options41, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options14, strArray49, false);
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray71 = posixParser57.flatten(options65, strArray69, false);
        org.apache.commons.cli.Options options72 = null;
        org.apache.commons.cli.PosixParser posixParser73 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options74 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray80 = posixParser73.flatten(options74, strArray78, true);
        java.lang.String[] strArray82 = posixParser57.flatten(options72, strArray78, false);
        java.lang.String[] strArray84 = posixParser55.flatten(options56, strArray82, true);
        java.lang.String[] strArray86 = posixParser0.flatten(options54, strArray84, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option90 = null;
        java.util.ListIterator listIterator91 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option90, listIterator91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser2.flatten(options10, strArray14, false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        java.lang.String[] strArray27 = posixParser2.flatten(options17, strArray23, false);
        java.lang.String[] strArray29 = posixParser0.flatten(options1, strArray27, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray44 = posixParser37.flatten(options38, strArray42, true);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray53 = posixParser46.flatten(options47, strArray51, true);
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray60 = posixParser46.flatten(options54, strArray58, false);
        java.lang.String[] strArray62 = posixParser37.flatten(options45, strArray58, true);
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray71 = posixParser64.flatten(options65, strArray69, true);
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray76 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray78 = posixParser64.flatten(options72, strArray76, false);
        org.apache.commons.cli.Options options79 = null;
        org.apache.commons.cli.PosixParser posixParser80 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options81 = null;
        java.lang.String[] strArray85 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray87 = posixParser80.flatten(options81, strArray85, true);
        java.lang.String[] strArray89 = posixParser64.flatten(options79, strArray85, false);
        java.lang.String[] strArray91 = posixParser37.flatten(options63, strArray89, true);
        java.lang.String[] strArray93 = posixParser0.flatten(options36, strArray91, false);
        java.lang.Class<?> wildcardClass94 = strArray91.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray43 = posixParser36.flatten(options37, strArray41, true);
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray52 = posixParser45.flatten(options46, strArray50, true);
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray59 = posixParser45.flatten(options53, strArray57, false);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray68 = posixParser61.flatten(options62, strArray66, true);
        java.lang.String[] strArray70 = posixParser45.flatten(options60, strArray66, true);
        java.lang.String[] strArray72 = posixParser36.flatten(options44, strArray66, false);
        posixParser36.burstToken("", true);
        posixParser36.burstToken("", true);
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray84 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray86 = posixParser36.flatten(options79, strArray84, false);
        java.lang.String[] strArray88 = posixParser0.flatten(options35, strArray86, true);
        java.lang.Class<?> wildcardClass89 = strArray88.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        java.lang.String[] strArray34 = posixParser9.flatten(options24, strArray30, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options8, strArray30, false);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray45 = posixParser38.flatten(options39, strArray43, true);
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray52 = posixParser38.flatten(options46, strArray50, false);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray61 = posixParser54.flatten(options55, strArray59, true);
        java.lang.String[] strArray63 = posixParser38.flatten(options53, strArray59, false);
        java.lang.String[] strArray65 = posixParser0.flatten(options37, strArray59, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option84 = null;
        java.util.ListIterator listIterator85 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option84, listIterator85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray43 = posixParser36.flatten(options37, strArray41, true);
        java.lang.String[] strArray45 = posixParser0.flatten(options35, strArray41, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray69 = posixParser62.flatten(options63, strArray67, true);
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray76 = posixParser62.flatten(options70, strArray74, false);
        org.apache.commons.cli.Options options77 = null;
        org.apache.commons.cli.PosixParser posixParser78 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray83 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray85 = posixParser78.flatten(options79, strArray83, true);
        java.lang.String[] strArray87 = posixParser62.flatten(options77, strArray83, false);
        java.lang.String[] strArray89 = posixParser0.flatten(options61, strArray83, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option93 = null;
        java.util.ListIterator listIterator94 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option93, listIterator94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        org.apache.commons.cli.Options options33 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray39 = posixParser25.flatten(options33, strArray37, false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        org.apache.commons.cli.Options options49 = null;
        org.apache.commons.cli.PosixParser posixParser50 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options51 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray57 = posixParser50.flatten(options51, strArray55, true);
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray64 = posixParser50.flatten(options58, strArray62, false);
        java.lang.String[] strArray66 = posixParser41.flatten(options49, strArray62, true);
        org.apache.commons.cli.Options options67 = null;
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray75 = posixParser68.flatten(options69, strArray73, true);
        java.lang.String[] strArray77 = posixParser41.flatten(options67, strArray75, false);
        java.lang.String[] strArray79 = posixParser25.flatten(options40, strArray75, true);
        java.lang.String[] strArray81 = posixParser0.flatten(options24, strArray75, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray18 = posixParser11.flatten(options12, strArray16, true);
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray25 = posixParser11.flatten(options19, strArray23, false);
        java.lang.String[] strArray27 = posixParser2.flatten(options10, strArray23, true);
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray36 = posixParser29.flatten(options30, strArray34, true);
        java.lang.String[] strArray38 = posixParser2.flatten(options28, strArray36, false);
        java.lang.String[] strArray40 = posixParser0.flatten(options1, strArray36, false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        java.lang.String[] strArray34 = posixParser9.flatten(options24, strArray30, false);
        posixParser9.burstToken("", false);
        posixParser9.burstToken("", false);
        posixParser9.burstToken("", false);
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray52 = posixParser45.flatten(options46, strArray50, true);
        java.lang.String[] strArray54 = posixParser9.flatten(options44, strArray50, true);
        java.lang.String[] strArray56 = posixParser0.flatten(options8, strArray50, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray64 = null;
        java.util.Properties properties65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine67 = posixParser0.parse(options63, strArray64, properties65, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser2.flatten(options10, strArray14, false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        java.lang.String[] strArray27 = posixParser2.flatten(options17, strArray23, false);
        java.lang.String[] strArray29 = posixParser0.flatten(options1, strArray27, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option48 = null;
        java.util.ListIterator listIterator49 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option48, listIterator49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        java.lang.String[] strArray34 = posixParser9.flatten(options24, strArray30, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options8, strArray30, false);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray45 = posixParser38.flatten(options39, strArray43, true);
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray52 = posixParser38.flatten(options46, strArray50, false);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray61 = posixParser54.flatten(options55, strArray59, true);
        java.lang.String[] strArray63 = posixParser38.flatten(options53, strArray59, false);
        java.lang.String[] strArray65 = posixParser0.flatten(options37, strArray59, false);
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray74 = posixParser67.flatten(options68, strArray72, true);
        java.lang.String[] strArray76 = posixParser0.flatten(options66, strArray72, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray43 = posixParser36.flatten(options37, strArray41, true);
        java.lang.String[] strArray45 = posixParser0.flatten(options35, strArray41, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray40 = posixParser33.flatten(options34, strArray38, true);
        org.apache.commons.cli.Options options41 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray47 = posixParser33.flatten(options41, strArray45, false);
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray56 = posixParser49.flatten(options50, strArray54, true);
        posixParser49.burstToken("", false);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray68 = posixParser61.flatten(options62, strArray66, true);
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray77 = posixParser70.flatten(options71, strArray75, true);
        org.apache.commons.cli.Options options78 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray84 = posixParser70.flatten(options78, strArray82, false);
        java.lang.String[] strArray86 = posixParser61.flatten(options69, strArray82, true);
        java.lang.String[] strArray88 = posixParser49.flatten(options60, strArray86, false);
        java.lang.String[] strArray90 = posixParser33.flatten(options48, strArray86, false);
        java.util.Properties properties91 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine92 = posixParser0.parse(options32, strArray90, properties91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser2.flatten(options10, strArray14, false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        java.lang.String[] strArray27 = posixParser2.flatten(options17, strArray23, false);
        java.lang.String[] strArray29 = posixParser0.flatten(options1, strArray27, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray41 = posixParser34.flatten(options35, strArray39, true);
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray48 = posixParser34.flatten(options42, strArray46, false);
        org.apache.commons.cli.Options options49 = null;
        org.apache.commons.cli.PosixParser posixParser50 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options51 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray57 = posixParser50.flatten(options51, strArray55, true);
        java.lang.String[] strArray59 = posixParser34.flatten(options49, strArray55, false);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray68 = posixParser61.flatten(options62, strArray66, true);
        java.lang.String[] strArray70 = posixParser34.flatten(options60, strArray68, true);
        java.lang.String[] strArray72 = posixParser0.flatten(options33, strArray70, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray80 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine81 = posixParser0.parse(options79, strArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options49 = null;
        org.apache.commons.cli.PosixParser posixParser50 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options51 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray57 = posixParser50.flatten(options51, strArray55, true);
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray64 = posixParser50.flatten(options58, strArray62, false);
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.PosixParser posixParser66 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray73 = posixParser66.flatten(options67, strArray71, true);
        java.lang.String[] strArray75 = posixParser50.flatten(options65, strArray71, true);
        java.lang.String[] strArray77 = posixParser0.flatten(options49, strArray71, false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray52 = posixParser45.flatten(options46, strArray50, true);
        java.lang.String[] strArray54 = posixParser0.flatten(options44, strArray50, true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        java.lang.String[] strArray34 = posixParser9.flatten(options24, strArray30, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options8, strArray30, false);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray45 = posixParser38.flatten(options39, strArray43, true);
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray52 = posixParser38.flatten(options46, strArray50, false);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray61 = posixParser54.flatten(options55, strArray59, true);
        java.lang.String[] strArray63 = posixParser38.flatten(options53, strArray59, false);
        java.lang.String[] strArray65 = posixParser0.flatten(options37, strArray59, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options75 = null;
        org.apache.commons.cli.PosixParser posixParser76 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options77 = null;
        java.lang.String[] strArray81 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray83 = posixParser76.flatten(options77, strArray81, true);
        org.apache.commons.cli.Options options84 = null;
        java.lang.String[] strArray88 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray90 = posixParser76.flatten(options84, strArray88, false);
        java.lang.String[] strArray92 = posixParser0.flatten(options75, strArray88, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option96 = null;
        java.util.ListIterator listIterator97 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option96, listIterator97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray18 = posixParser11.flatten(options12, strArray16, true);
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray25 = posixParser11.flatten(options19, strArray23, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser11.flatten(options26, strArray32, false);
        java.lang.String[] strArray38 = posixParser9.flatten(options10, strArray36, true);
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.PosixParser posixParser40 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options41 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray47 = posixParser40.flatten(options41, strArray45, true);
        org.apache.commons.cli.Options options48 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray54 = posixParser40.flatten(options48, strArray52, false);
        org.apache.commons.cli.Options options55 = null;
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray63 = posixParser56.flatten(options57, strArray61, true);
        java.lang.String[] strArray65 = posixParser40.flatten(options55, strArray61, false);
        java.lang.String[] strArray67 = posixParser9.flatten(options39, strArray65, true);
        org.apache.commons.cli.Options options68 = null;
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray76 = posixParser69.flatten(options70, strArray74, true);
        org.apache.commons.cli.Options options77 = null;
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray83 = posixParser69.flatten(options77, strArray81, false);
        org.apache.commons.cli.Options options84 = null;
        org.apache.commons.cli.PosixParser posixParser85 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options86 = null;
        java.lang.String[] strArray90 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray92 = posixParser85.flatten(options86, strArray90, true);
        java.lang.String[] strArray94 = posixParser69.flatten(options84, strArray90, false);
        java.lang.String[] strArray96 = posixParser9.flatten(options68, strArray94, true);
        java.lang.String[] strArray98 = posixParser0.flatten(options8, strArray94, true);
        java.lang.Class<?> wildcardClass99 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray98);
        org.junit.Assert.assertArrayEquals(strArray98, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray22 = posixParser15.flatten(options16, strArray20, true);
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray29 = posixParser15.flatten(options23, strArray27, false);
        org.apache.commons.cli.Options options30 = null;
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray38 = posixParser31.flatten(options32, strArray36, true);
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray45 = posixParser31.flatten(options39, strArray43, false);
        org.apache.commons.cli.Options options46 = null;
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray54 = posixParser47.flatten(options48, strArray52, true);
        java.lang.String[] strArray56 = posixParser31.flatten(options46, strArray52, false);
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray65 = posixParser58.flatten(options59, strArray63, true);
        java.lang.String[] strArray67 = posixParser31.flatten(options57, strArray65, true);
        java.lang.String[] strArray69 = posixParser15.flatten(options30, strArray65, false);
        java.lang.String[] strArray71 = posixParser0.flatten(options14, strArray69, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options21 = null;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray29 = posixParser22.flatten(options23, strArray27, true);
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray36 = posixParser22.flatten(options30, strArray34, false);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray45 = posixParser38.flatten(options39, strArray43, true);
        java.lang.String[] strArray47 = posixParser22.flatten(options37, strArray43, false);
        posixParser22.burstToken("", false);
        posixParser22.burstToken("", true);
        posixParser22.burstToken("", true);
        posixParser22.burstToken("", false);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray68 = posixParser61.flatten(options62, strArray66, true);
        org.apache.commons.cli.Options options69 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray75 = posixParser61.flatten(options69, strArray73, false);
        org.apache.commons.cli.Options options76 = null;
        org.apache.commons.cli.PosixParser posixParser77 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options78 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray84 = posixParser77.flatten(options78, strArray82, true);
        java.lang.String[] strArray86 = posixParser61.flatten(options76, strArray82, true);
        java.lang.String[] strArray88 = posixParser22.flatten(options60, strArray86, true);
        java.lang.String[] strArray90 = posixParser0.flatten(options21, strArray86, false);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass94 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser2.flatten(options10, strArray14, false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        java.lang.String[] strArray27 = posixParser2.flatten(options17, strArray23, false);
        java.lang.String[] strArray29 = posixParser0.flatten(options1, strArray27, true);
        org.apache.commons.cli.Options options30 = null;
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray38 = posixParser31.flatten(options32, strArray36, true);
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray45 = posixParser31.flatten(options39, strArray43, false);
        org.apache.commons.cli.Options options46 = null;
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray54 = posixParser47.flatten(options48, strArray52, true);
        java.lang.String[] strArray56 = posixParser31.flatten(options46, strArray52, true);
        java.lang.String[] strArray58 = posixParser0.flatten(options30, strArray56, true);
        org.apache.commons.cli.Option option59 = null;
        java.util.ListIterator listIterator60 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option59, listIterator60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        java.lang.String[] strArray34 = posixParser9.flatten(options24, strArray30, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options8, strArray30, false);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray45 = posixParser38.flatten(options39, strArray43, true);
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray52 = posixParser38.flatten(options46, strArray50, false);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray61 = posixParser54.flatten(options55, strArray59, true);
        java.lang.String[] strArray63 = posixParser38.flatten(options53, strArray59, false);
        java.lang.String[] strArray65 = posixParser0.flatten(options37, strArray59, false);
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray74 = posixParser67.flatten(options68, strArray72, true);
        java.lang.String[] strArray76 = posixParser0.flatten(options66, strArray72, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option86 = null;
        java.util.ListIterator listIterator87 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option86, listIterator87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        java.lang.String[] strArray34 = posixParser9.flatten(options24, strArray30, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options8, strArray30, false);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray45 = posixParser38.flatten(options39, strArray43, true);
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray52 = posixParser38.flatten(options46, strArray50, false);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray61 = posixParser54.flatten(options55, strArray59, true);
        java.lang.String[] strArray63 = posixParser38.flatten(options53, strArray59, false);
        java.lang.String[] strArray65 = posixParser0.flatten(options37, strArray59, false);
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray74 = posixParser67.flatten(options68, strArray72, true);
        java.lang.String[] strArray76 = posixParser0.flatten(options66, strArray72, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray52 = posixParser45.flatten(options46, strArray50, true);
        java.lang.String[] strArray54 = posixParser0.flatten(options44, strArray50, true);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray52 = posixParser45.flatten(options46, strArray50, true);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray61 = posixParser54.flatten(options55, strArray59, true);
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray68 = posixParser54.flatten(options62, strArray66, false);
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray77 = posixParser70.flatten(options71, strArray75, true);
        java.lang.String[] strArray79 = posixParser54.flatten(options69, strArray75, true);
        java.lang.String[] strArray81 = posixParser45.flatten(options53, strArray75, false);
        java.lang.String[] strArray83 = posixParser0.flatten(options44, strArray81, true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray41 = posixParser34.flatten(options35, strArray39, true);
        posixParser34.burstToken("", true);
        posixParser34.burstToken("", false);
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray58 = posixParser51.flatten(options52, strArray56, true);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray67 = posixParser60.flatten(options61, strArray65, true);
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray74 = posixParser60.flatten(options68, strArray72, false);
        java.lang.String[] strArray76 = posixParser51.flatten(options59, strArray72, true);
        org.apache.commons.cli.Options options77 = null;
        org.apache.commons.cli.PosixParser posixParser78 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray83 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray85 = posixParser78.flatten(options79, strArray83, true);
        java.lang.String[] strArray87 = posixParser51.flatten(options77, strArray85, false);
        java.lang.String[] strArray89 = posixParser49.flatten(options50, strArray85, false);
        java.lang.String[] strArray91 = posixParser34.flatten(options48, strArray85, false);
        java.lang.String[] strArray93 = posixParser25.flatten(options33, strArray85, true);
        java.lang.String[] strArray95 = posixParser0.flatten(options24, strArray93, true);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass99 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "--", "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray60 = posixParser53.flatten(options54, strArray58, true);
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray67 = posixParser53.flatten(options61, strArray65, false);
        java.lang.String[] strArray69 = posixParser44.flatten(options52, strArray65, true);
        org.apache.commons.cli.Options options70 = null;
        org.apache.commons.cli.PosixParser posixParser71 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray76 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray78 = posixParser71.flatten(options72, strArray76, true);
        java.lang.String[] strArray80 = posixParser44.flatten(options70, strArray78, false);
        java.lang.String[] strArray82 = posixParser42.flatten(options43, strArray78, false);
        java.lang.String[] strArray84 = posixParser0.flatten(options41, strArray82, true);
        org.apache.commons.cli.Options options85 = null;
        org.apache.commons.cli.PosixParser posixParser86 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options87 = null;
        java.lang.String[] strArray91 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray93 = posixParser86.flatten(options87, strArray91, true);
        java.util.Properties properties94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine96 = posixParser0.parse(options85, strArray91, properties94, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        java.lang.String[] strArray34 = posixParser9.flatten(options24, strArray30, false);
        posixParser9.burstToken("", false);
        posixParser9.burstToken("", false);
        posixParser9.burstToken("", false);
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray52 = posixParser45.flatten(options46, strArray50, true);
        java.lang.String[] strArray54 = posixParser9.flatten(options44, strArray50, true);
        java.lang.String[] strArray56 = posixParser0.flatten(options8, strArray50, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option63 = null;
        java.util.ListIterator listIterator64 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option63, listIterator64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options29 = null;
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray37 = posixParser30.flatten(options31, strArray35, true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray53 = posixParser39.flatten(options47, strArray51, false);
        java.lang.String[] strArray55 = posixParser30.flatten(options38, strArray51, true);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        java.lang.String[] strArray66 = posixParser30.flatten(options56, strArray64, false);
        java.lang.String[] strArray68 = posixParser0.flatten(options29, strArray66, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray41 = posixParser34.flatten(options35, strArray39, true);
        posixParser34.burstToken("", false);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray53 = posixParser46.flatten(options47, strArray51, true);
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray62 = posixParser55.flatten(options56, strArray60, true);
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray69 = posixParser55.flatten(options63, strArray67, false);
        java.lang.String[] strArray71 = posixParser46.flatten(options54, strArray67, true);
        java.lang.String[] strArray73 = posixParser34.flatten(options45, strArray71, false);
        java.lang.String[] strArray75 = posixParser0.flatten(options33, strArray73, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray41 = posixParser27.flatten(options35, strArray39, false);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray50 = posixParser43.flatten(options44, strArray48, true);
        java.lang.String[] strArray52 = posixParser27.flatten(options42, strArray48, false);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray61 = posixParser54.flatten(options55, strArray59, true);
        java.lang.String[] strArray63 = posixParser27.flatten(options53, strArray61, true);
        java.lang.String[] strArray65 = posixParser0.flatten(options26, strArray63, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option78 = null;
        java.util.ListIterator listIterator79 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option78, listIterator79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "--", "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray56 = posixParser0.flatten(options53, strArray54, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray24 = posixParser17.flatten(options18, strArray22, true);
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray33 = posixParser26.flatten(options27, strArray31, true);
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray40 = posixParser26.flatten(options34, strArray38, false);
        java.lang.String[] strArray42 = posixParser17.flatten(options25, strArray38, true);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        java.lang.String[] strArray53 = posixParser17.flatten(options43, strArray51, false);
        java.lang.String[] strArray55 = posixParser15.flatten(options16, strArray51, false);
        java.lang.String[] strArray57 = posixParser0.flatten(options14, strArray55, true);
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray66 = posixParser59.flatten(options60, strArray64, true);
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray73 = posixParser59.flatten(options67, strArray71, false);
        org.apache.commons.cli.Options options74 = null;
        org.apache.commons.cli.PosixParser posixParser75 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options76 = null;
        java.lang.String[] strArray80 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray82 = posixParser75.flatten(options76, strArray80, true);
        java.lang.String[] strArray84 = posixParser59.flatten(options74, strArray80, true);
        java.lang.String[] strArray86 = posixParser0.flatten(options58, strArray80, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options93 = null;
        java.lang.String[] strArray94 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray96 = posixParser0.flatten(options93, strArray94, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray22 = posixParser15.flatten(options16, strArray20, true);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray31 = posixParser24.flatten(options25, strArray29, true);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray38 = posixParser24.flatten(options32, strArray36, false);
        java.lang.String[] strArray40 = posixParser15.flatten(options23, strArray36, true);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray58 = posixParser51.flatten(options52, strArray56, true);
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray65 = posixParser51.flatten(options59, strArray63, false);
        java.lang.String[] strArray67 = posixParser42.flatten(options50, strArray63, true);
        java.lang.String[] strArray69 = posixParser15.flatten(options41, strArray63, false);
        java.lang.String[] strArray71 = posixParser0.flatten(options14, strArray69, true);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass75 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray24 = posixParser17.flatten(options18, strArray22, true);
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray33 = posixParser26.flatten(options27, strArray31, true);
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray40 = posixParser26.flatten(options34, strArray38, false);
        java.lang.String[] strArray42 = posixParser17.flatten(options25, strArray38, true);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        java.lang.String[] strArray53 = posixParser17.flatten(options43, strArray51, false);
        java.lang.String[] strArray55 = posixParser15.flatten(options16, strArray51, false);
        java.lang.String[] strArray57 = posixParser0.flatten(options14, strArray55, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray73 = posixParser0.flatten(options70, strArray71, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        java.lang.String[] strArray25 = posixParser0.flatten(options8, strArray21, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, false);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.PosixParser posixParser40 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options41 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray47 = posixParser40.flatten(options41, strArray45, true);
        org.apache.commons.cli.Options options48 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray54 = posixParser40.flatten(options48, strArray52, false);
        org.apache.commons.cli.Options options55 = null;
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray63 = posixParser56.flatten(options57, strArray61, true);
        java.lang.String[] strArray65 = posixParser40.flatten(options55, strArray61, false);
        java.lang.String[] strArray67 = posixParser38.flatten(options39, strArray65, true);
        java.lang.String[] strArray69 = posixParser0.flatten(options37, strArray65, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray37 = null;
        java.util.Properties properties38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options36, strArray37, properties38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray11 = posixParser4.flatten(options5, strArray9, true);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray20 = posixParser13.flatten(options14, strArray18, true);
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray27 = posixParser13.flatten(options21, strArray25, false);
        java.lang.String[] strArray29 = posixParser4.flatten(options12, strArray25, true);
        org.apache.commons.cli.Options options30 = null;
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray38 = posixParser31.flatten(options32, strArray36, true);
        java.lang.String[] strArray40 = posixParser4.flatten(options30, strArray38, false);
        java.lang.String[] strArray42 = posixParser2.flatten(options3, strArray38, false);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray58 = posixParser44.flatten(options52, strArray56, false);
        java.lang.String[] strArray60 = posixParser2.flatten(options43, strArray56, false);
        java.lang.String[] strArray62 = posixParser0.flatten(options1, strArray56, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        posixParser27.burstToken("", true);
        posixParser27.burstToken("", false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray56 = posixParser42.flatten(options50, strArray54, false);
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray65 = posixParser58.flatten(options59, strArray63, true);
        java.lang.String[] strArray67 = posixParser42.flatten(options57, strArray63, false);
        org.apache.commons.cli.Options options68 = null;
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray76 = posixParser69.flatten(options70, strArray74, true);
        java.lang.String[] strArray78 = posixParser42.flatten(options68, strArray76, true);
        java.lang.String[] strArray80 = posixParser27.flatten(options41, strArray76, false);
        java.lang.String[] strArray82 = posixParser0.flatten(options26, strArray80, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        java.lang.String[] strArray25 = posixParser0.flatten(options8, strArray21, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options49 = null;
        org.apache.commons.cli.PosixParser posixParser50 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options51 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray57 = posixParser50.flatten(options51, strArray55, true);
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray64 = posixParser50.flatten(options58, strArray62, false);
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.PosixParser posixParser66 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray73 = posixParser66.flatten(options67, strArray71, true);
        java.lang.String[] strArray75 = posixParser50.flatten(options65, strArray71, true);
        java.lang.String[] strArray77 = posixParser0.flatten(options49, strArray75, false);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray32 = posixParser18.flatten(options26, strArray30, false);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray41 = posixParser34.flatten(options35, strArray39, true);
        java.lang.String[] strArray43 = posixParser18.flatten(options33, strArray39, true);
        java.lang.String[] strArray45 = posixParser9.flatten(options17, strArray39, false);
        org.apache.commons.cli.Options options46 = null;
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray54 = posixParser47.flatten(options48, strArray52, true);
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray61 = posixParser47.flatten(options55, strArray59, false);
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray70 = posixParser63.flatten(options64, strArray68, true);
        java.lang.String[] strArray72 = posixParser47.flatten(options62, strArray68, false);
        java.lang.String[] strArray74 = posixParser9.flatten(options46, strArray68, false);
        java.lang.String[] strArray76 = posixParser0.flatten(options8, strArray74, false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray41 = posixParser27.flatten(options35, strArray39, false);
        java.lang.String[] strArray43 = posixParser18.flatten(options26, strArray39, true);
        posixParser18.burstToken("", true);
        posixParser18.burstToken("", false);
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray58 = posixParser51.flatten(options52, strArray56, true);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray67 = posixParser60.flatten(options61, strArray65, true);
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray74 = posixParser60.flatten(options68, strArray72, false);
        org.apache.commons.cli.Options options75 = null;
        org.apache.commons.cli.PosixParser posixParser76 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options77 = null;
        java.lang.String[] strArray81 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray83 = posixParser76.flatten(options77, strArray81, true);
        java.lang.String[] strArray85 = posixParser60.flatten(options75, strArray81, true);
        java.lang.String[] strArray87 = posixParser51.flatten(options59, strArray81, false);
        java.lang.String[] strArray89 = posixParser18.flatten(options50, strArray81, true);
        java.lang.String[] strArray91 = posixParser0.flatten(options17, strArray89, false);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass95 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser41.flatten(options49, strArray53, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        java.lang.String[] strArray66 = posixParser41.flatten(options56, strArray62, true);
        java.lang.String[] strArray68 = posixParser0.flatten(options40, strArray62, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        posixParser18.burstToken("", true);
        posixParser18.burstToken("", false);
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray40 = posixParser33.flatten(options34, strArray38, true);
        org.apache.commons.cli.Options options41 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray47 = posixParser33.flatten(options41, strArray45, false);
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray56 = posixParser49.flatten(options50, strArray54, true);
        java.lang.String[] strArray58 = posixParser33.flatten(options48, strArray54, false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray67 = posixParser60.flatten(options61, strArray65, true);
        java.lang.String[] strArray69 = posixParser33.flatten(options59, strArray67, true);
        java.lang.String[] strArray71 = posixParser18.flatten(options32, strArray67, false);
        java.lang.String[] strArray73 = posixParser0.flatten(options17, strArray71, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options11 = null;
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray19 = posixParser12.flatten(options13, strArray17, true);
        java.lang.String[] strArray21 = posixParser0.flatten(options11, strArray19, false);
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray30 = posixParser23.flatten(options24, strArray28, true);
        org.apache.commons.cli.Options options31 = null;
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options33 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray39 = posixParser32.flatten(options33, strArray37, true);
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray46 = posixParser32.flatten(options40, strArray44, false);
        org.apache.commons.cli.Options options47 = null;
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray55 = posixParser48.flatten(options49, strArray53, true);
        java.lang.String[] strArray57 = posixParser32.flatten(options47, strArray53, true);
        java.lang.String[] strArray59 = posixParser23.flatten(options31, strArray53, false);
        posixParser23.burstToken("", true);
        posixParser23.burstToken("", true);
        posixParser23.burstToken("", true);
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray77 = posixParser70.flatten(options71, strArray75, true);
        org.apache.commons.cli.Options options78 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray84 = posixParser70.flatten(options78, strArray82, false);
        java.lang.String[] strArray86 = posixParser23.flatten(options69, strArray82, false);
        java.lang.String[] strArray88 = posixParser0.flatten(options22, strArray82, false);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        org.apache.commons.cli.Options options33 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray39 = posixParser25.flatten(options33, strArray37, false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        org.apache.commons.cli.Options options49 = null;
        org.apache.commons.cli.PosixParser posixParser50 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options51 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray57 = posixParser50.flatten(options51, strArray55, true);
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray64 = posixParser50.flatten(options58, strArray62, false);
        java.lang.String[] strArray66 = posixParser41.flatten(options49, strArray62, true);
        org.apache.commons.cli.Options options67 = null;
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray75 = posixParser68.flatten(options69, strArray73, true);
        java.lang.String[] strArray77 = posixParser41.flatten(options67, strArray75, false);
        java.lang.String[] strArray79 = posixParser25.flatten(options40, strArray75, true);
        java.lang.String[] strArray81 = posixParser0.flatten(options24, strArray75, true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser2.flatten(options10, strArray14, false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        java.lang.String[] strArray27 = posixParser2.flatten(options17, strArray23, false);
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray36 = posixParser29.flatten(options30, strArray34, true);
        posixParser29.burstToken("", false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        org.apache.commons.cli.Options options49 = null;
        org.apache.commons.cli.PosixParser posixParser50 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options51 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray57 = posixParser50.flatten(options51, strArray55, true);
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray64 = posixParser50.flatten(options58, strArray62, false);
        java.lang.String[] strArray66 = posixParser41.flatten(options49, strArray62, true);
        java.lang.String[] strArray68 = posixParser29.flatten(options40, strArray66, false);
        java.lang.String[] strArray70 = posixParser2.flatten(options28, strArray68, false);
        java.lang.String[] strArray72 = posixParser0.flatten(options1, strArray68, true);
        org.apache.commons.cli.Options options73 = null;
        java.lang.String[] strArray74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine75 = posixParser0.parse(options73, strArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "--", "", "hi!", "hi!" });
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser2.flatten(options10, strArray14, false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        java.lang.String[] strArray27 = posixParser2.flatten(options17, strArray23, false);
        java.lang.String[] strArray29 = posixParser0.flatten(options1, strArray27, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options11 = null;
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray19 = posixParser12.flatten(options13, strArray17, true);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray28 = posixParser21.flatten(options22, strArray26, true);
        posixParser21.burstToken("", true);
        posixParser21.burstToken("", false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray45 = posixParser38.flatten(options39, strArray43, true);
        org.apache.commons.cli.Options options46 = null;
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray54 = posixParser47.flatten(options48, strArray52, true);
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray61 = posixParser47.flatten(options55, strArray59, false);
        java.lang.String[] strArray63 = posixParser38.flatten(options46, strArray59, true);
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray72 = posixParser65.flatten(options66, strArray70, true);
        java.lang.String[] strArray74 = posixParser38.flatten(options64, strArray72, false);
        java.lang.String[] strArray76 = posixParser36.flatten(options37, strArray72, false);
        java.lang.String[] strArray78 = posixParser21.flatten(options35, strArray72, false);
        java.lang.String[] strArray80 = posixParser12.flatten(options20, strArray78, true);
        java.lang.String[] strArray82 = posixParser0.flatten(options11, strArray80, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options89 = null;
        java.lang.String[] strArray90 = new java.lang.String[] {};
        java.lang.String[] strArray92 = posixParser0.flatten(options89, strArray90, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass99 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass41 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray53 = posixParser39.flatten(options47, strArray51, false);
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray62 = posixParser55.flatten(options56, strArray60, true);
        java.lang.String[] strArray64 = posixParser39.flatten(options54, strArray60, true);
        java.lang.String[] strArray66 = posixParser0.flatten(options38, strArray64, true);
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray68 = null;
        java.util.Properties properties69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine71 = posixParser0.parse(options67, strArray68, properties69, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        java.lang.String[] strArray34 = posixParser9.flatten(options24, strArray30, false);
        posixParser9.burstToken("", false);
        posixParser9.burstToken("", false);
        posixParser9.burstToken("", false);
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray52 = posixParser45.flatten(options46, strArray50, true);
        java.lang.String[] strArray54 = posixParser9.flatten(options44, strArray50, true);
        java.lang.String[] strArray56 = posixParser0.flatten(options8, strArray50, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray68 = posixParser61.flatten(options62, strArray66, true);
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray77 = posixParser70.flatten(options71, strArray75, true);
        org.apache.commons.cli.Options options78 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray84 = posixParser70.flatten(options78, strArray82, false);
        java.lang.String[] strArray86 = posixParser61.flatten(options69, strArray82, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine88 = posixParser0.parse(options60, strArray86, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray53 = posixParser39.flatten(options47, strArray51, false);
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray62 = posixParser55.flatten(options56, strArray60, true);
        java.lang.String[] strArray64 = posixParser39.flatten(options54, strArray60, true);
        java.lang.String[] strArray66 = posixParser0.flatten(options38, strArray64, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options76 = null;
        java.lang.String[] strArray77 = null;
        java.util.Properties properties78 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine79 = posixParser0.parse(options76, strArray77, properties78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options21 = null;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray31 = posixParser24.flatten(options25, strArray29, true);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray38 = posixParser24.flatten(options32, strArray36, false);
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.PosixParser posixParser40 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options41 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray47 = posixParser40.flatten(options41, strArray45, true);
        java.lang.String[] strArray49 = posixParser24.flatten(options39, strArray45, false);
        java.lang.String[] strArray51 = posixParser22.flatten(options23, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options21, strArray49, true);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser41.flatten(options49, strArray53, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        java.lang.String[] strArray66 = posixParser41.flatten(options56, strArray62, true);
        java.lang.String[] strArray68 = posixParser0.flatten(options40, strArray62, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray22 = posixParser15.flatten(options16, strArray20, true);
        posixParser15.burstToken("", true);
        posixParser15.burstToken("", false);
        org.apache.commons.cli.Options options29 = null;
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray37 = posixParser30.flatten(options31, strArray35, true);
        org.apache.commons.cli.Options options38 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray44 = posixParser30.flatten(options38, strArray42, false);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray53 = posixParser46.flatten(options47, strArray51, true);
        java.lang.String[] strArray55 = posixParser30.flatten(options45, strArray51, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        java.lang.String[] strArray66 = posixParser30.flatten(options56, strArray64, true);
        java.lang.String[] strArray68 = posixParser15.flatten(options29, strArray64, false);
        java.util.Properties properties69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine71 = posixParser0.parse(options14, strArray68, properties69, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray43 = posixParser36.flatten(options37, strArray41, true);
        java.lang.String[] strArray45 = posixParser0.flatten(options35, strArray41, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray22 = posixParser15.flatten(options16, strArray20, true);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray31 = posixParser24.flatten(options25, strArray29, true);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray38 = posixParser24.flatten(options32, strArray36, false);
        java.lang.String[] strArray40 = posixParser15.flatten(options23, strArray36, true);
        posixParser15.burstToken("", true);
        posixParser15.burstToken("", false);
        org.apache.commons.cli.Options options47 = null;
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray55 = posixParser48.flatten(options49, strArray53, true);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray71 = posixParser57.flatten(options65, strArray69, false);
        org.apache.commons.cli.Options options72 = null;
        org.apache.commons.cli.PosixParser posixParser73 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options74 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray80 = posixParser73.flatten(options74, strArray78, true);
        java.lang.String[] strArray82 = posixParser57.flatten(options72, strArray78, true);
        java.lang.String[] strArray84 = posixParser48.flatten(options56, strArray78, false);
        java.lang.String[] strArray86 = posixParser15.flatten(options47, strArray78, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine87 = posixParser0.parse(options14, strArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        java.lang.String[] strArray25 = posixParser0.flatten(options8, strArray21, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.lang.String[] strArray50 = posixParser0.flatten(options46, strArray48, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "" });
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options29 = null;
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray37 = posixParser30.flatten(options31, strArray35, true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray53 = posixParser39.flatten(options47, strArray51, false);
        java.lang.String[] strArray55 = posixParser30.flatten(options38, strArray51, true);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        java.lang.String[] strArray66 = posixParser30.flatten(options56, strArray64, false);
        java.lang.String[] strArray68 = posixParser0.flatten(options29, strArray66, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option84 = null;
        java.util.ListIterator listIterator85 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option84, listIterator85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        java.lang.String[] strArray25 = posixParser0.flatten(options8, strArray21, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        java.lang.String[] strArray25 = posixParser0.flatten(options8, strArray21, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray43 = posixParser36.flatten(options37, strArray41, true);
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray50 = posixParser36.flatten(options44, strArray48, false);
        java.lang.String[] strArray52 = posixParser27.flatten(options35, strArray48, true);
        java.lang.String[] strArray54 = posixParser0.flatten(options26, strArray48, false);
        org.apache.commons.cli.Options options55 = null;
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray65 = posixParser58.flatten(options59, strArray63, true);
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray72 = posixParser58.flatten(options66, strArray70, false);
        org.apache.commons.cli.Options options73 = null;
        org.apache.commons.cli.PosixParser posixParser74 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options75 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray81 = posixParser74.flatten(options75, strArray79, true);
        java.lang.String[] strArray83 = posixParser58.flatten(options73, strArray79, false);
        java.lang.String[] strArray85 = posixParser56.flatten(options57, strArray83, true);
        java.lang.String[] strArray87 = posixParser0.flatten(options55, strArray83, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option91 = null;
        java.util.ListIterator listIterator92 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option91, listIterator92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        java.lang.String[] strArray25 = posixParser0.flatten(options8, strArray21, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        org.apache.commons.cli.Options options47 = null;
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray55 = posixParser48.flatten(options49, strArray53, true);
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray62 = posixParser48.flatten(options56, strArray60, false);
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray71 = posixParser64.flatten(options65, strArray69, true);
        java.lang.String[] strArray73 = posixParser48.flatten(options63, strArray69, true);
        java.lang.String[] strArray75 = posixParser39.flatten(options47, strArray69, false);
        posixParser39.burstToken("", true);
        posixParser39.burstToken("", true);
        org.apache.commons.cli.Options options82 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray89 = posixParser39.flatten(options82, strArray87, false);
        java.lang.String[] strArray91 = posixParser0.flatten(options38, strArray87, false);
        java.lang.Class<?> wildcardClass92 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray41 = posixParser27.flatten(options35, strArray39, false);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray50 = posixParser43.flatten(options44, strArray48, true);
        java.lang.String[] strArray52 = posixParser27.flatten(options42, strArray48, false);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray61 = posixParser54.flatten(options55, strArray59, true);
        java.lang.String[] strArray63 = posixParser27.flatten(options53, strArray61, true);
        java.lang.String[] strArray65 = posixParser0.flatten(options26, strArray63, true);
        java.lang.Class<?> wildcardClass66 = strArray63.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "--", "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass46 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser2.flatten(options10, strArray14, false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        java.lang.String[] strArray27 = posixParser2.flatten(options17, strArray23, false);
        java.lang.String[] strArray29 = posixParser0.flatten(options1, strArray27, true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray18 = posixParser11.flatten(options12, strArray16, true);
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray25 = posixParser11.flatten(options19, strArray23, false);
        java.lang.String[] strArray27 = posixParser2.flatten(options10, strArray23, true);
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray36 = posixParser29.flatten(options30, strArray34, true);
        java.lang.String[] strArray38 = posixParser2.flatten(options28, strArray36, false);
        java.lang.String[] strArray40 = posixParser0.flatten(options1, strArray36, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray56 = posixParser42.flatten(options50, strArray54, false);
        java.lang.String[] strArray58 = posixParser0.flatten(options41, strArray54, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options74 = null;
        org.apache.commons.cli.PosixParser posixParser75 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options76 = null;
        java.lang.String[] strArray80 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray82 = posixParser75.flatten(options76, strArray80, true);
        java.lang.String[] strArray84 = posixParser0.flatten(options74, strArray80, true);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options11 = null;
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray19 = posixParser12.flatten(options13, strArray17, true);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray28 = posixParser21.flatten(options22, strArray26, true);
        org.apache.commons.cli.Options options29 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray35 = posixParser21.flatten(options29, strArray33, false);
        java.lang.String[] strArray37 = posixParser12.flatten(options20, strArray33, true);
        java.lang.String[] strArray39 = posixParser0.flatten(options11, strArray37, false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser41.flatten(options49, strArray53, false);
        posixParser41.burstToken("", false);
        posixParser41.burstToken("", false);
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray72 = posixParser65.flatten(options66, strArray70, true);
        org.apache.commons.cli.Options options73 = null;
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray79 = posixParser65.flatten(options73, strArray77, false);
        org.apache.commons.cli.Options options80 = null;
        org.apache.commons.cli.PosixParser posixParser81 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options82 = null;
        java.lang.String[] strArray86 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray88 = posixParser81.flatten(options82, strArray86, true);
        java.lang.String[] strArray90 = posixParser65.flatten(options80, strArray86, false);
        java.lang.String[] strArray92 = posixParser63.flatten(options64, strArray90, true);
        java.lang.String[] strArray94 = posixParser41.flatten(options62, strArray90, true);
        java.lang.String[] strArray96 = posixParser0.flatten(options40, strArray90, false);
        java.lang.Class<?> wildcardClass97 = strArray96.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options21 = null;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray29 = posixParser22.flatten(options23, strArray27, true);
        java.lang.String[] strArray31 = posixParser0.flatten(options21, strArray29, false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        java.lang.String[] strArray34 = posixParser9.flatten(options24, strArray30, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options8, strArray30, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        java.lang.String[] strArray25 = posixParser0.flatten(options8, strArray21, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray56 = posixParser42.flatten(options50, strArray54, false);
        posixParser42.burstToken("", false);
        posixParser42.burstToken("", false);
        posixParser42.burstToken("", false);
        posixParser42.burstToken("", true);
        posixParser42.burstToken("", false);
        posixParser42.burstToken("", true);
        posixParser42.burstToken("", false);
        org.apache.commons.cli.Options options78 = null;
        org.apache.commons.cli.PosixParser posixParser79 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options80 = null;
        java.lang.String[] strArray84 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray86 = posixParser79.flatten(options80, strArray84, true);
        org.apache.commons.cli.Options options87 = null;
        java.lang.String[] strArray91 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray93 = posixParser79.flatten(options87, strArray91, false);
        java.lang.String[] strArray95 = posixParser42.flatten(options78, strArray91, false);
        java.util.Properties properties96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine97 = posixParser0.parse(options41, strArray91, properties96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options29 = null;
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray37 = posixParser30.flatten(options31, strArray35, true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray53 = posixParser39.flatten(options47, strArray51, false);
        java.lang.String[] strArray55 = posixParser30.flatten(options38, strArray51, true);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        java.lang.String[] strArray66 = posixParser30.flatten(options56, strArray64, false);
        java.lang.String[] strArray68 = posixParser0.flatten(options29, strArray66, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = posixParser16.flatten(options17, strArray21, true);
        java.lang.String[] strArray25 = posixParser0.flatten(options15, strArray21, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray40 = posixParser33.flatten(options34, strArray38, true);
        org.apache.commons.cli.Options options41 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray47 = posixParser33.flatten(options41, strArray45, false);
        java.lang.String[] strArray49 = posixParser0.flatten(options32, strArray47, true);
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray58 = posixParser51.flatten(options52, strArray56, true);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray67 = posixParser60.flatten(options61, strArray65, true);
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray74 = posixParser60.flatten(options68, strArray72, false);
        org.apache.commons.cli.Options options75 = null;
        org.apache.commons.cli.PosixParser posixParser76 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options77 = null;
        java.lang.String[] strArray81 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray83 = posixParser76.flatten(options77, strArray81, true);
        java.lang.String[] strArray85 = posixParser60.flatten(options75, strArray81, true);
        java.lang.String[] strArray87 = posixParser51.flatten(options59, strArray81, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine88 = posixParser0.parse(options50, strArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        java.lang.String[] strArray25 = posixParser0.flatten(options8, strArray21, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray25 = posixParser18.flatten(options19, strArray23, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        posixParser27.burstToken("", true);
        posixParser27.burstToken("", false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray60 = posixParser53.flatten(options54, strArray58, true);
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray67 = posixParser53.flatten(options61, strArray65, false);
        java.lang.String[] strArray69 = posixParser44.flatten(options52, strArray65, true);
        org.apache.commons.cli.Options options70 = null;
        org.apache.commons.cli.PosixParser posixParser71 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray76 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray78 = posixParser71.flatten(options72, strArray76, true);
        java.lang.String[] strArray80 = posixParser44.flatten(options70, strArray78, false);
        java.lang.String[] strArray82 = posixParser42.flatten(options43, strArray78, false);
        java.lang.String[] strArray84 = posixParser27.flatten(options41, strArray78, false);
        java.lang.String[] strArray86 = posixParser18.flatten(options26, strArray84, true);
        java.lang.String[] strArray88 = posixParser0.flatten(options17, strArray86, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options95 = null;
        java.lang.String[] strArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine97 = posixParser0.parse(options95, strArray96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = posixParser0.parse(options20, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = posixParser9.flatten(options17, strArray21, false);
        java.lang.String[] strArray25 = posixParser0.flatten(options8, strArray21, true);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options46 = null;
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray56 = posixParser49.flatten(options50, strArray54, true);
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray65 = posixParser58.flatten(options59, strArray63, true);
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray72 = posixParser58.flatten(options66, strArray70, false);
        java.lang.String[] strArray74 = posixParser49.flatten(options57, strArray70, true);
        org.apache.commons.cli.Options options75 = null;
        org.apache.commons.cli.PosixParser posixParser76 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options77 = null;
        java.lang.String[] strArray81 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray83 = posixParser76.flatten(options77, strArray81, true);
        java.lang.String[] strArray85 = posixParser49.flatten(options75, strArray83, false);
        java.lang.String[] strArray87 = posixParser47.flatten(options48, strArray83, false);
        java.lang.String[] strArray89 = posixParser0.flatten(options46, strArray83, false);
        java.lang.Class<?> wildcardClass90 = strArray89.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass90);
    }
}

