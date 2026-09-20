package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
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
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        posixParser9.burstToken("", true);
        posixParser9.burstToken("", false);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray33 = posixParser26.flatten(options27, strArray31, true);
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray42 = posixParser35.flatten(options36, strArray40, true);
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray49 = posixParser35.flatten(options43, strArray47, false);
        java.lang.String[] strArray51 = posixParser26.flatten(options34, strArray47, true);
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray60 = posixParser53.flatten(options54, strArray58, true);
        java.lang.String[] strArray62 = posixParser26.flatten(options52, strArray60, false);
        java.lang.String[] strArray64 = posixParser24.flatten(options25, strArray60, false);
        java.lang.String[] strArray66 = posixParser9.flatten(options23, strArray60, false);
        java.lang.String[] strArray68 = posixParser0.flatten(options8, strArray66, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options84 = null;
        java.lang.String[] strArray85 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine87 = posixParser0.parse(options84, strArray85, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
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
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray60 = null;
        java.util.Properties properties61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine62 = posixParser0.parse(options59, strArray60, properties61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
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
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        org.apache.commons.cli.Options options33 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray39 = posixParser25.flatten(options33, strArray37, false);
        java.lang.String[] strArray41 = posixParser16.flatten(options24, strArray37, true);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray50 = posixParser43.flatten(options44, strArray48, true);
        java.lang.String[] strArray52 = posixParser16.flatten(options42, strArray50, false);
        java.lang.String[] strArray54 = posixParser0.flatten(options15, strArray50, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
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
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray71 = posixParser57.flatten(options65, strArray69, false);
        java.lang.String[] strArray73 = posixParser15.flatten(options56, strArray69, false);
        posixParser15.burstToken("", false);
        org.apache.commons.cli.Options options77 = null;
        org.apache.commons.cli.PosixParser posixParser78 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray83 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray85 = posixParser78.flatten(options79, strArray83, true);
        org.apache.commons.cli.Options options86 = null;
        java.lang.String[] strArray90 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray92 = posixParser78.flatten(options86, strArray90, false);
        java.lang.String[] strArray94 = posixParser15.flatten(options77, strArray90, false);
        java.util.Properties properties95 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine96 = posixParser0.parse(options14, strArray94, properties95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        posixParser9.burstToken("", true);
        posixParser9.burstToken("", false);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray33 = posixParser26.flatten(options27, strArray31, true);
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray42 = posixParser35.flatten(options36, strArray40, true);
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray49 = posixParser35.flatten(options43, strArray47, false);
        java.lang.String[] strArray51 = posixParser26.flatten(options34, strArray47, true);
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray60 = posixParser53.flatten(options54, strArray58, true);
        java.lang.String[] strArray62 = posixParser26.flatten(options52, strArray60, false);
        java.lang.String[] strArray64 = posixParser24.flatten(options25, strArray60, false);
        java.lang.String[] strArray66 = posixParser9.flatten(options23, strArray60, false);
        java.lang.String[] strArray68 = posixParser0.flatten(options8, strArray66, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option23 = null;
        java.util.ListIterator listIterator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option23, listIterator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        posixParser9.burstToken("", true);
        posixParser9.burstToken("", false);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray33 = posixParser26.flatten(options27, strArray31, true);
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray42 = posixParser35.flatten(options36, strArray40, true);
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray49 = posixParser35.flatten(options43, strArray47, false);
        java.lang.String[] strArray51 = posixParser26.flatten(options34, strArray47, true);
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray60 = posixParser53.flatten(options54, strArray58, true);
        java.lang.String[] strArray62 = posixParser26.flatten(options52, strArray60, false);
        java.lang.String[] strArray64 = posixParser24.flatten(options25, strArray60, false);
        java.lang.String[] strArray66 = posixParser9.flatten(options23, strArray60, false);
        java.lang.String[] strArray68 = posixParser0.flatten(options8, strArray66, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options77 = null;
        java.lang.String[] strArray78 = null;
        java.util.Properties properties79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine80 = posixParser0.parse(options77, strArray78, properties79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
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
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        posixParser2.burstToken("", true);
        posixParser2.burstToken("", false);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray24 = posixParser17.flatten(options18, strArray22, true);
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray31 = posixParser17.flatten(options25, strArray29, false);
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray40 = posixParser33.flatten(options34, strArray38, true);
        java.lang.String[] strArray42 = posixParser17.flatten(options32, strArray38, false);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        java.lang.String[] strArray53 = posixParser17.flatten(options43, strArray51, true);
        java.lang.String[] strArray55 = posixParser2.flatten(options16, strArray51, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
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
        java.lang.String[] strArray84 = posixParser59.flatten(options74, strArray80, false);
        java.lang.String[] strArray86 = posixParser57.flatten(options58, strArray84, true);
        java.lang.String[] strArray88 = posixParser2.flatten(options56, strArray86, true);
        java.lang.String[] strArray90 = posixParser0.flatten(options1, strArray86, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
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
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
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
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass41 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
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
        posixParser0.burstToken("", true);
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
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
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
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray70 = posixParser63.flatten(options64, strArray68, true);
        java.lang.String[] strArray72 = posixParser47.flatten(options62, strArray68, true);
        java.lang.String[] strArray74 = posixParser38.flatten(options46, strArray68, false);
        java.lang.String[] strArray76 = posixParser0.flatten(options37, strArray74, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass98 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
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
        java.lang.String[] strArray55 = posixParser30.flatten(options45, strArray51, true);
        java.lang.String[] strArray57 = posixParser0.flatten(options29, strArray55, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options67 = null;
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray75 = posixParser68.flatten(options69, strArray73, true);
        org.apache.commons.cli.Options options76 = null;
        java.lang.String[] strArray80 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray82 = posixParser68.flatten(options76, strArray80, false);
        java.lang.String[] strArray84 = posixParser0.flatten(options67, strArray80, false);
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
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        java.lang.String[] strArray93 = posixParser0.flatten(options33, strArray91, false);
        java.lang.Class<?> wildcardClass94 = strArray91.getClass();
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
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
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
        posixParser9.burstToken("", true);
        posixParser9.burstToken("", true);
        posixParser9.burstToken("", false);
        posixParser9.burstToken("", true);
        posixParser9.burstToken("", true);
        posixParser9.burstToken("", true);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray64 = posixParser57.flatten(options58, strArray62, true);
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.PosixParser posixParser66 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray73 = posixParser66.flatten(options67, strArray71, true);
        org.apache.commons.cli.Options options74 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray80 = posixParser66.flatten(options74, strArray78, false);
        java.lang.String[] strArray82 = posixParser57.flatten(options65, strArray78, true);
        java.lang.String[] strArray84 = posixParser9.flatten(options56, strArray78, true);
        java.lang.String[] strArray86 = posixParser0.flatten(options8, strArray84, false);
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
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
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
        java.lang.String[] strArray44 = posixParser19.flatten(options34, strArray40, false);
        posixParser19.burstToken("", false);
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
        java.lang.String[] strArray87 = posixParser19.flatten(options48, strArray85, false);
        java.lang.String[] strArray89 = posixParser0.flatten(options18, strArray87, true);
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
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
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
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
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
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = posixParser27.flatten(options28, strArray32, true);
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray41 = posixParser27.flatten(options35, strArray39, false);
        java.lang.String[] strArray43 = posixParser18.flatten(options26, strArray39, true);
        posixParser18.burstToken("", false);
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
        java.lang.String[] strArray75 = posixParser18.flatten(options47, strArray73, true);
        java.lang.String[] strArray77 = posixParser2.flatten(options17, strArray75, false);
        java.lang.String[] strArray79 = posixParser0.flatten(options1, strArray77, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options86 = null;
        java.lang.String[] strArray87 = null;
        java.util.Properties properties88 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine90 = posixParser0.parse(options86, strArray87, properties88, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "--", "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
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
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass93 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
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
        org.apache.commons.cli.Options options90 = null;
        java.lang.String[] strArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray93 = posixParser0.flatten(options90, strArray91, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
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
        posixParser0.burstToken("", true);
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
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
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
        java.lang.String[] strArray57 = posixParser0.flatten(options40, strArray53, false);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
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
        java.lang.String[] strArray87 = posixParser0.flatten(options59, strArray85, true);
        java.lang.Class<?> wildcardClass88 = posixParser0.getClass();
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
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine51 = posixParser0.parse(options49, strArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
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
        posixParser0.burstToken("", true);
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
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray31 = posixParser24.flatten(options25, strArray29, true);
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
        java.lang.String[] strArray60 = posixParser24.flatten(options32, strArray54, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine61 = posixParser0.parse(options23, strArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "--", "", "", "hi!" });
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
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
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
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        org.apache.commons.cli.Options options33 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray39 = posixParser25.flatten(options33, strArray37, false);
        java.lang.String[] strArray41 = posixParser0.flatten(options24, strArray39, false);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray50 = posixParser43.flatten(options44, strArray48, true);
        org.apache.commons.cli.Options options51 = null;
        org.apache.commons.cli.PosixParser posixParser52 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray59 = posixParser52.flatten(options53, strArray57, true);
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray66 = posixParser52.flatten(options60, strArray64, false);
        org.apache.commons.cli.Options options67 = null;
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray75 = posixParser68.flatten(options69, strArray73, true);
        java.lang.String[] strArray77 = posixParser52.flatten(options67, strArray73, true);
        java.lang.String[] strArray79 = posixParser43.flatten(options51, strArray73, false);
        java.lang.String[] strArray81 = posixParser0.flatten(options42, strArray73, false);
        org.apache.commons.cli.Options options82 = null;
        java.lang.String[] strArray83 = null;
        java.util.Properties properties84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine85 = posixParser0.parse(options82, strArray83, properties84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
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
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray76 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine78 = posixParser0.parse(options72, strArray76, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
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
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
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
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass89 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
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
        java.lang.String[] strArray36 = posixParser0.flatten(options26, strArray34, true);
        java.lang.Class<?> wildcardClass37 = posixParser0.getClass();
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
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
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
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray61 = null;
        java.util.Properties properties62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine63 = posixParser0.parse(options60, strArray61, properties62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
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
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray52 = posixParser45.flatten(options46, strArray50, true);
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray59 = posixParser45.flatten(options53, strArray57, false);
        java.lang.String[] strArray61 = posixParser0.flatten(options44, strArray57, false);
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
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
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
        posixParser0.burstToken("", false);
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
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
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
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = posixParser42.flatten(options43, strArray47, true);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray56 = posixParser42.flatten(options50, strArray54, false);
        java.lang.String[] strArray58 = posixParser33.flatten(options41, strArray54, true);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray67 = posixParser60.flatten(options61, strArray65, true);
        java.lang.String[] strArray69 = posixParser33.flatten(options59, strArray67, false);
        posixParser33.burstToken("", true);
        org.apache.commons.cli.Options options73 = null;
        org.apache.commons.cli.PosixParser posixParser74 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options75 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray81 = posixParser74.flatten(options75, strArray79, true);
        org.apache.commons.cli.Options options82 = null;
        java.lang.String[] strArray86 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray88 = posixParser74.flatten(options82, strArray86, false);
        java.lang.String[] strArray90 = posixParser33.flatten(options73, strArray88, false);
        java.util.Properties properties91 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine93 = posixParser0.parse(options32, strArray88, properties91, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
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
        java.lang.String[] strArray56 = posixParser31.flatten(options46, strArray52, false);
        java.lang.String[] strArray58 = posixParser0.flatten(options30, strArray56, true);
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
        java.lang.String[] strArray85 = posixParser60.flatten(options75, strArray81, false);
        java.lang.String[] strArray87 = posixParser0.flatten(options59, strArray85, true);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass91 = posixParser0.getClass();
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
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
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
        posixParser27.burstToken("", true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        java.lang.String[] strArray48 = posixParser27.flatten(options38, strArray46, false);
        java.lang.String[] strArray50 = posixParser0.flatten(options26, strArray46, true);
        org.apache.commons.cli.Options options51 = null;
        org.apache.commons.cli.PosixParser posixParser52 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray59 = posixParser52.flatten(options53, strArray57, true);
        posixParser52.burstToken("", true);
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray71 = posixParser64.flatten(options65, strArray69, true);
        java.lang.String[] strArray73 = posixParser52.flatten(options63, strArray71, false);
        java.lang.String[] strArray75 = posixParser0.flatten(options51, strArray71, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
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
        posixParser0.burstToken("", true);
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
        java.lang.String[] strArray85 = posixParser0.flatten(options57, strArray79, true);
        java.lang.Class<?> wildcardClass86 = strArray79.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
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
        org.apache.commons.cli.Options options47 = null;
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
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
        java.lang.String[] strArray75 = posixParser50.flatten(options65, strArray71, false);
        java.lang.String[] strArray77 = posixParser48.flatten(options49, strArray75, true);
        java.lang.String[] strArray79 = posixParser0.flatten(options47, strArray77, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options83 = null;
        org.apache.commons.cli.PosixParser posixParser84 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options85 = null;
        java.lang.String[] strArray89 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray91 = posixParser84.flatten(options85, strArray89, true);
        java.util.Properties properties92 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine94 = posixParser0.parse(options83, strArray89, properties92, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
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
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
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
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray43 = posixParser36.flatten(options37, strArray41, true);
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray50 = posixParser36.flatten(options44, strArray48, false);
        org.apache.commons.cli.Options options51 = null;
        org.apache.commons.cli.PosixParser posixParser52 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray59 = posixParser52.flatten(options53, strArray57, true);
        java.lang.String[] strArray61 = posixParser36.flatten(options51, strArray57, false);
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray70 = posixParser63.flatten(options64, strArray68, true);
        java.lang.String[] strArray72 = posixParser36.flatten(options62, strArray70, true);
        posixParser36.burstToken("", false);
        org.apache.commons.cli.Options options76 = null;
        org.apache.commons.cli.PosixParser posixParser77 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options78 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray84 = posixParser77.flatten(options78, strArray82, true);
        org.apache.commons.cli.Options options85 = null;
        java.lang.String[] strArray89 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray91 = posixParser77.flatten(options85, strArray89, false);
        java.lang.String[] strArray93 = posixParser36.flatten(options76, strArray89, false);
        java.lang.String[] strArray95 = posixParser0.flatten(options35, strArray93, false);
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
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
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
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray37 = posixParser23.flatten(options31, strArray35, false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        java.lang.String[] strArray48 = posixParser23.flatten(options38, strArray44, false);
        org.apache.commons.cli.Options options49 = null;
        org.apache.commons.cli.PosixParser posixParser50 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options51 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray57 = posixParser50.flatten(options51, strArray55, true);
        java.lang.String[] strArray59 = posixParser23.flatten(options49, strArray57, true);
        posixParser23.burstToken("", false);
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray71 = posixParser64.flatten(options65, strArray69, true);
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray76 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray78 = posixParser64.flatten(options72, strArray76, false);
        java.lang.String[] strArray80 = posixParser23.flatten(options63, strArray76, false);
        java.lang.String[] strArray82 = posixParser0.flatten(options22, strArray80, true);
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "hi!", "hi!" });
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
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
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine71 = posixParser0.parse(options68, strArray69, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
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
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.PosixParser posixParser66 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray73 = posixParser66.flatten(options67, strArray71, true);
        org.apache.commons.cli.Options options74 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray80 = posixParser66.flatten(options74, strArray78, false);
        org.apache.commons.cli.Options options81 = null;
        org.apache.commons.cli.PosixParser posixParser82 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options83 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray89 = posixParser82.flatten(options83, strArray87, true);
        java.lang.String[] strArray91 = posixParser66.flatten(options81, strArray87, false);
        java.lang.String[] strArray93 = posixParser64.flatten(options65, strArray91, true);
        java.lang.String[] strArray95 = posixParser42.flatten(options63, strArray91, true);
        java.util.Properties properties96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine97 = posixParser0.parse(options41, strArray95, properties96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
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
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
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
        posixParser34.burstToken("", false);
        posixParser34.burstToken("", false);
        posixParser34.burstToken("", false);
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray77 = posixParser70.flatten(options71, strArray75, true);
        java.lang.String[] strArray79 = posixParser34.flatten(options69, strArray75, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine81 = posixParser0.parse(options33, strArray79, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray26 = posixParser19.flatten(options20, strArray24, true);
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray33 = posixParser19.flatten(options27, strArray31, false);
        posixParser19.burstToken("", false);
        posixParser19.burstToken("", false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        posixParser41.burstToken("", false);
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray60 = posixParser53.flatten(options54, strArray58, true);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray69 = posixParser62.flatten(options63, strArray67, true);
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray76 = posixParser62.flatten(options70, strArray74, false);
        java.lang.String[] strArray78 = posixParser53.flatten(options61, strArray74, true);
        java.lang.String[] strArray80 = posixParser41.flatten(options52, strArray78, false);
        java.lang.String[] strArray82 = posixParser19.flatten(options40, strArray78, false);
        posixParser19.burstToken("", false);
        posixParser19.burstToken("", true);
        org.apache.commons.cli.Options options89 = null;
        java.lang.String[] strArray91 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray93 = posixParser19.flatten(options89, strArray91, false);
        java.lang.String[] strArray95 = posixParser0.flatten(options18, strArray91, false);
        posixParser0.burstToken("", true);
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
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "hi!" });
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
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray44 = posixParser37.flatten(options38, strArray42, true);
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray51 = posixParser37.flatten(options45, strArray49, false);
        java.util.Properties properties52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine54 = posixParser0.parse(options36, strArray51, properties52, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
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
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray30 = posixParser16.flatten(options24, strArray28, false);
        org.apache.commons.cli.Options options31 = null;
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options33 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray39 = posixParser32.flatten(options33, strArray37, true);
        java.lang.String[] strArray41 = posixParser16.flatten(options31, strArray37, false);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray50 = posixParser43.flatten(options44, strArray48, true);
        java.lang.String[] strArray52 = posixParser16.flatten(options42, strArray50, true);
        java.lang.String[] strArray54 = posixParser0.flatten(options15, strArray50, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options64 = null;
        java.lang.String[] strArray65 = null;
        java.util.Properties properties66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine68 = posixParser0.parse(options64, strArray65, properties66, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
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
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
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
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
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
        posixParser0.burstToken("", true);
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
        java.lang.String[] strArray85 = posixParser0.flatten(options57, strArray79, true);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass89 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option83 = null;
        java.util.ListIterator listIterator84 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option83, listIterator84);
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
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
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
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option52 = null;
        java.util.ListIterator listIterator53 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option52, listIterator53);
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
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
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
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray70 = posixParser63.flatten(options64, strArray68, true);
        java.lang.String[] strArray72 = posixParser47.flatten(options62, strArray68, true);
        java.lang.String[] strArray74 = posixParser38.flatten(options46, strArray68, false);
        java.lang.String[] strArray76 = posixParser0.flatten(options37, strArray74, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
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
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray69 = posixParser62.flatten(options63, strArray67, true);
        posixParser62.burstToken("", true);
        org.apache.commons.cli.Options options73 = null;
        org.apache.commons.cli.PosixParser posixParser74 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options75 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray81 = posixParser74.flatten(options75, strArray79, true);
        java.lang.String[] strArray83 = posixParser62.flatten(options73, strArray81, false);
        java.lang.String[] strArray85 = posixParser0.flatten(options61, strArray83, false);
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
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
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
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray80 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine82 = posixParser0.parse(options79, strArray80, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
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
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray69 = posixParser62.flatten(options63, strArray67, true);
        posixParser62.burstToken("", true);
        org.apache.commons.cli.Options options73 = null;
        org.apache.commons.cli.PosixParser posixParser74 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options75 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray81 = posixParser74.flatten(options75, strArray79, true);
        java.lang.String[] strArray83 = posixParser62.flatten(options73, strArray81, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options61, strArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
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
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray50 = posixParser0.flatten(options43, strArray48, false);
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
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
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
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
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
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray64 = posixParser50.flatten(options58, strArray62, false);
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.PosixParser posixParser66 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray73 = posixParser66.flatten(options67, strArray71, true);
        java.lang.String[] strArray75 = posixParser50.flatten(options65, strArray71, true);
        java.lang.String[] strArray77 = posixParser0.flatten(options49, strArray75, false);
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
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
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
        java.lang.String[] strArray55 = posixParser30.flatten(options45, strArray51, true);
        java.lang.String[] strArray57 = posixParser0.flatten(options29, strArray55, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = posixParser25.flatten(options26, strArray30, true);
        posixParser25.burstToken("", false);
        posixParser25.burstToken("", true);
        posixParser25.burstToken("", true);
        posixParser25.burstToken("", false);
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
        org.apache.commons.cli.Options options72 = null;
        org.apache.commons.cli.PosixParser posixParser73 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options74 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray80 = posixParser73.flatten(options74, strArray78, true);
        java.lang.String[] strArray82 = posixParser46.flatten(options72, strArray80, true);
        java.lang.String[] strArray84 = posixParser25.flatten(options45, strArray82, true);
        java.lang.String[] strArray86 = posixParser0.flatten(options24, strArray82, true);
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "--", "", "", "hi!" });
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
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
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
        posixParser27.burstToken("", true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        java.lang.String[] strArray48 = posixParser27.flatten(options38, strArray46, false);
        java.lang.String[] strArray50 = posixParser0.flatten(options26, strArray46, true);
        org.apache.commons.cli.Options options51 = null;
        org.apache.commons.cli.PosixParser posixParser52 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray59 = posixParser52.flatten(options53, strArray57, true);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray68 = posixParser61.flatten(options62, strArray66, true);
        org.apache.commons.cli.Options options69 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray75 = posixParser61.flatten(options69, strArray73, false);
        java.lang.String[] strArray77 = posixParser52.flatten(options60, strArray73, true);
        org.apache.commons.cli.Options options78 = null;
        org.apache.commons.cli.PosixParser posixParser79 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options80 = null;
        java.lang.String[] strArray84 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray86 = posixParser79.flatten(options80, strArray84, true);
        java.lang.String[] strArray88 = posixParser52.flatten(options78, strArray86, false);
        java.lang.String[] strArray90 = posixParser0.flatten(options51, strArray88, false);
        java.lang.Class<?> wildcardClass91 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
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
        java.lang.String[] strArray57 = posixParser0.flatten(options40, strArray55, false);
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
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
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
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
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
        posixParser0.burstToken("", false);
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
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray74 = posixParser67.flatten(options68, strArray72, true);
        org.apache.commons.cli.Options options75 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray81 = posixParser67.flatten(options75, strArray79, false);
        java.lang.String[] strArray83 = posixParser58.flatten(options66, strArray79, true);
        org.apache.commons.cli.Options options84 = null;
        org.apache.commons.cli.PosixParser posixParser85 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options86 = null;
        java.lang.String[] strArray90 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray92 = posixParser85.flatten(options86, strArray90, true);
        java.lang.String[] strArray94 = posixParser58.flatten(options84, strArray92, false);
        java.lang.String[] strArray96 = posixParser42.flatten(options57, strArray92, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine98 = posixParser0.parse(options41, strArray92, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        posixParser2.burstToken("", true);
        posixParser2.burstToken("", false);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray26 = posixParser19.flatten(options20, strArray24, true);
        org.apache.commons.cli.Options options27 = null;
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray35 = posixParser28.flatten(options29, strArray33, true);
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray42 = posixParser28.flatten(options36, strArray40, false);
        java.lang.String[] strArray44 = posixParser19.flatten(options27, strArray40, true);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray53 = posixParser46.flatten(options47, strArray51, true);
        java.lang.String[] strArray55 = posixParser19.flatten(options45, strArray53, false);
        java.lang.String[] strArray57 = posixParser17.flatten(options18, strArray53, false);
        java.lang.String[] strArray59 = posixParser2.flatten(options16, strArray57, true);
        java.lang.String[] strArray61 = posixParser0.flatten(options1, strArray57, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options46 = null;
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray54 = posixParser47.flatten(options48, strArray52, true);
        posixParser47.burstToken("", true);
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray66 = posixParser59.flatten(options60, strArray64, true);
        java.lang.String[] strArray68 = posixParser47.flatten(options58, strArray66, false);
        java.lang.String[] strArray70 = posixParser0.flatten(options46, strArray68, true);
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
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass85 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
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
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options77 = null;
        org.apache.commons.cli.PosixParser posixParser78 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray83 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray85 = posixParser78.flatten(options79, strArray83, true);
        java.lang.String[] strArray87 = posixParser0.flatten(options77, strArray83, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option94 = null;
        java.util.ListIterator listIterator95 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option94, listIterator95);
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
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
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
        org.apache.commons.cli.Options options89 = null;
        java.lang.String[] strArray90 = null;
        java.util.Properties properties91 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine93 = posixParser0.parse(options89, strArray90, properties91, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
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
        posixParser0.burstToken("", true);
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
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray56 = null;
        java.util.Properties properties57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine59 = posixParser0.parse(options55, strArray56, properties57, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
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
        posixParser43.burstToken("", false);
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray62 = posixParser55.flatten(options56, strArray60, true);
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray71 = posixParser64.flatten(options65, strArray69, true);
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray76 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray78 = posixParser64.flatten(options72, strArray76, false);
        java.lang.String[] strArray80 = posixParser55.flatten(options63, strArray76, true);
        java.lang.String[] strArray82 = posixParser43.flatten(options54, strArray80, false);
        java.lang.String[] strArray84 = posixParser27.flatten(options42, strArray80, false);
        java.lang.String[] strArray86 = posixParser0.flatten(options26, strArray84, true);
        posixParser0.burstToken("", true);
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
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "--", "", "hi!", "hi!" });
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
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
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        posixParser2.burstToken("", true);
        posixParser2.burstToken("", false);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray26 = posixParser19.flatten(options20, strArray24, true);
        org.apache.commons.cli.Options options27 = null;
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray35 = posixParser28.flatten(options29, strArray33, true);
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray42 = posixParser28.flatten(options36, strArray40, false);
        java.lang.String[] strArray44 = posixParser19.flatten(options27, strArray40, true);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray53 = posixParser46.flatten(options47, strArray51, true);
        java.lang.String[] strArray55 = posixParser19.flatten(options45, strArray53, false);
        java.lang.String[] strArray57 = posixParser17.flatten(options18, strArray53, false);
        java.lang.String[] strArray59 = posixParser2.flatten(options16, strArray57, true);
        java.lang.String[] strArray61 = posixParser0.flatten(options1, strArray57, false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.PosixParser posixParser66 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray73 = posixParser66.flatten(options67, strArray71, true);
        org.apache.commons.cli.Options options74 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray80 = posixParser66.flatten(options74, strArray78, false);
        org.apache.commons.cli.Options options81 = null;
        org.apache.commons.cli.PosixParser posixParser82 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options83 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray89 = posixParser82.flatten(options83, strArray87, true);
        java.lang.String[] strArray91 = posixParser66.flatten(options81, strArray87, false);
        java.lang.String[] strArray93 = posixParser0.flatten(options65, strArray87, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option97 = null;
        java.util.ListIterator listIterator98 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option97, listIterator98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = posixParser9.flatten(options10, strArray14, true);
        posixParser9.burstToken("", true);
        posixParser9.burstToken("", false);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray33 = posixParser26.flatten(options27, strArray31, true);
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray42 = posixParser35.flatten(options36, strArray40, true);
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray49 = posixParser35.flatten(options43, strArray47, false);
        java.lang.String[] strArray51 = posixParser26.flatten(options34, strArray47, true);
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray60 = posixParser53.flatten(options54, strArray58, true);
        java.lang.String[] strArray62 = posixParser26.flatten(options52, strArray60, false);
        java.lang.String[] strArray64 = posixParser24.flatten(options25, strArray60, false);
        java.lang.String[] strArray66 = posixParser9.flatten(options23, strArray60, false);
        java.lang.String[] strArray68 = posixParser0.flatten(options8, strArray66, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options81 = null;
        org.apache.commons.cli.PosixParser posixParser82 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options83 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray89 = posixParser82.flatten(options83, strArray87, true);
        java.lang.String[] strArray91 = posixParser0.flatten(options81, strArray87, true);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
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
        posixParser0.burstToken("", false);
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
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray31 = posixParser24.flatten(options25, strArray29, true);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray38 = posixParser24.flatten(options32, strArray36, false);
        posixParser24.burstToken("", false);
        posixParser24.burstToken("", false);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray53 = posixParser46.flatten(options47, strArray51, true);
        posixParser46.burstToken("", false);
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray65 = posixParser58.flatten(options59, strArray63, true);
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray74 = posixParser67.flatten(options68, strArray72, true);
        org.apache.commons.cli.Options options75 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray81 = posixParser67.flatten(options75, strArray79, false);
        java.lang.String[] strArray83 = posixParser58.flatten(options66, strArray79, true);
        java.lang.String[] strArray85 = posixParser46.flatten(options57, strArray83, false);
        java.lang.String[] strArray87 = posixParser24.flatten(options45, strArray85, true);
        java.lang.String[] strArray89 = posixParser0.flatten(options23, strArray87, false);
        posixParser0.burstToken("", true);
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
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "--", "", "hi!", "hi!" });
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
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
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser41.flatten(options49, strArray53, false);
        java.lang.String[] strArray57 = posixParser0.flatten(options40, strArray55, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
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
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray48 = null;
        java.util.Properties properties49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine51 = posixParser0.parse(options47, strArray48, properties49, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
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
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
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
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option72 = null;
        java.util.ListIterator listIterator73 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option72, listIterator73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ListIterator.hasNext()\" because \"iter\" is null");
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
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
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
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray48 = posixParser41.flatten(options42, strArray46, true);
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser41.flatten(options49, strArray53, false);
        java.lang.String[] strArray57 = posixParser0.flatten(options40, strArray55, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
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
        posixParser27.burstToken("", true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray46 = posixParser39.flatten(options40, strArray44, true);
        java.lang.String[] strArray48 = posixParser27.flatten(options38, strArray46, false);
        java.lang.String[] strArray50 = posixParser0.flatten(options26, strArray46, true);
        org.apache.commons.cli.Options options51 = null;
        org.apache.commons.cli.PosixParser posixParser52 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray59 = posixParser52.flatten(options53, strArray57, true);
        posixParser52.burstToken("", true);
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray71 = posixParser64.flatten(options65, strArray69, true);
        java.lang.String[] strArray73 = posixParser52.flatten(options63, strArray71, false);
        java.lang.String[] strArray75 = posixParser0.flatten(options51, strArray71, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray80 = null;
        java.util.Properties properties81 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine83 = posixParser0.parse(options79, strArray80, properties81, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
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
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.PosixParser posixParser66 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray73 = posixParser66.flatten(options67, strArray71, true);
        org.apache.commons.cli.Options options74 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray80 = posixParser66.flatten(options74, strArray78, false);
        org.apache.commons.cli.Options options81 = null;
        org.apache.commons.cli.PosixParser posixParser82 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options83 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray89 = posixParser82.flatten(options83, strArray87, true);
        java.lang.String[] strArray91 = posixParser66.flatten(options81, strArray87, false);
        java.lang.String[] strArray93 = posixParser39.flatten(options65, strArray91, true);
        java.lang.String[] strArray95 = posixParser0.flatten(options38, strArray91, false);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass99 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
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
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
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
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray41 = posixParser34.flatten(options35, strArray39, true);
        posixParser34.burstToken("", true);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray53 = posixParser46.flatten(options47, strArray51, true);
        java.lang.String[] strArray55 = posixParser34.flatten(options45, strArray53, false);
        java.lang.String[] strArray57 = posixParser0.flatten(options33, strArray53, false);
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
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
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
        org.apache.commons.cli.Options options81 = null;
        java.lang.String[] strArray82 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine83 = posixParser0.parse(options81, strArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
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
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass66 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray57 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray59 = posixParser0.flatten(options56, strArray57, false);
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
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
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
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray62 = posixParser55.flatten(options56, strArray60, true);
        java.lang.String[] strArray64 = posixParser39.flatten(options54, strArray60, true);
        java.lang.String[] strArray66 = posixParser30.flatten(options38, strArray60, false);
        posixParser30.burstToken("", true);
        posixParser30.burstToken("", true);
        org.apache.commons.cli.Options options73 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray80 = posixParser30.flatten(options73, strArray78, false);
        java.lang.String[] strArray82 = posixParser0.flatten(options29, strArray80, true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
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
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "hi!", "", "" });
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
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
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray72 = posixParser65.flatten(options66, strArray70, true);
        posixParser65.burstToken("", true);
        org.apache.commons.cli.Options options76 = null;
        org.apache.commons.cli.PosixParser posixParser77 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options78 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray84 = posixParser77.flatten(options78, strArray82, true);
        java.lang.String[] strArray86 = posixParser65.flatten(options76, strArray84, false);
        java.lang.String[] strArray88 = posixParser0.flatten(options64, strArray84, false);
        org.apache.commons.cli.Option option89 = null;
        java.util.ListIterator listIterator90 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option89, listIterator90);
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
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
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
        java.lang.Class<?> wildcardClass81 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        posixParser2.burstToken("", true);
        posixParser2.burstToken("", false);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray26 = posixParser19.flatten(options20, strArray24, true);
        org.apache.commons.cli.Options options27 = null;
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray35 = posixParser28.flatten(options29, strArray33, true);
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray42 = posixParser28.flatten(options36, strArray40, false);
        java.lang.String[] strArray44 = posixParser19.flatten(options27, strArray40, true);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray53 = posixParser46.flatten(options47, strArray51, true);
        java.lang.String[] strArray55 = posixParser19.flatten(options45, strArray53, false);
        java.lang.String[] strArray57 = posixParser17.flatten(options18, strArray53, false);
        java.lang.String[] strArray59 = posixParser2.flatten(options16, strArray57, true);
        java.lang.String[] strArray61 = posixParser0.flatten(options1, strArray57, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass68 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray14 = posixParser0.flatten(options8, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
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
        java.lang.String[] strArray50 = posixParser25.flatten(options40, strArray46, true);
        java.lang.String[] strArray52 = posixParser0.flatten(options24, strArray50, true);
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine80 = posixParser0.parse(options53, strArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "--", "", "", "hi!" });
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
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
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
        org.apache.commons.cli.Options options73 = null;
        java.lang.String[] strArray74 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray76 = posixParser0.flatten(options73, strArray74, false);
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
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
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
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray60 = posixParser53.flatten(options54, strArray58, true);
        posixParser53.burstToken("", true);
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray72 = posixParser65.flatten(options66, strArray70, true);
        java.lang.String[] strArray74 = posixParser53.flatten(options64, strArray72, false);
        java.lang.String[] strArray76 = posixParser0.flatten(options52, strArray72, true);
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
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
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
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
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
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine50 = posixParser0.parse(options47, strArray48, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
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
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray58 = posixParser44.flatten(options52, strArray56, false);
        posixParser44.burstToken("", false);
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray70 = posixParser63.flatten(options64, strArray68, true);
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray77 = posixParser63.flatten(options71, strArray75, false);
        org.apache.commons.cli.Options options78 = null;
        org.apache.commons.cli.PosixParser posixParser79 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options80 = null;
        java.lang.String[] strArray84 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray86 = posixParser79.flatten(options80, strArray84, true);
        java.lang.String[] strArray88 = posixParser63.flatten(options78, strArray84, true);
        java.lang.String[] strArray90 = posixParser44.flatten(options62, strArray84, false);
        java.lang.String[] strArray92 = posixParser0.flatten(options43, strArray84, true);
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
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
        java.lang.String[] strArray73 = posixParser48.flatten(options56, strArray69, true);
        org.apache.commons.cli.Options options74 = null;
        org.apache.commons.cli.PosixParser posixParser75 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options76 = null;
        java.lang.String[] strArray80 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray82 = posixParser75.flatten(options76, strArray80, true);
        java.lang.String[] strArray84 = posixParser48.flatten(options74, strArray82, true);
        java.util.Properties properties85 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine87 = posixParser0.parse(options47, strArray84, properties85, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray9 = posixParser2.flatten(options3, strArray7, true);
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser2.flatten(options10, strArray14, false);
        posixParser2.burstToken("", false);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray28 = posixParser21.flatten(options22, strArray26, true);
        org.apache.commons.cli.Options options29 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray35 = posixParser21.flatten(options29, strArray33, false);
        posixParser21.burstToken("", false);
        posixParser21.burstToken("", false);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
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
        java.lang.String[] strArray70 = posixParser45.flatten(options60, strArray66, false);
        java.lang.String[] strArray72 = posixParser43.flatten(options44, strArray70, true);
        java.lang.String[] strArray74 = posixParser21.flatten(options42, strArray70, true);
        java.lang.String[] strArray76 = posixParser2.flatten(options20, strArray74, true);
        java.lang.String[] strArray78 = posixParser0.flatten(options1, strArray74, false);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "hi!" });
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
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "hi!" });
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
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
        java.lang.Class<?> wildcardClass57 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
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
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
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
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray24 = posixParser17.flatten(options18, strArray22, true);
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray31 = posixParser17.flatten(options25, strArray29, false);
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray40 = posixParser33.flatten(options34, strArray38, true);
        java.lang.String[] strArray42 = posixParser17.flatten(options32, strArray38, false);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray51 = posixParser44.flatten(options45, strArray49, true);
        posixParser44.burstToken("", false);
        org.apache.commons.cli.Options options55 = null;
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray63 = posixParser56.flatten(options57, strArray61, true);
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray72 = posixParser65.flatten(options66, strArray70, true);
        org.apache.commons.cli.Options options73 = null;
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray79 = posixParser65.flatten(options73, strArray77, false);
        java.lang.String[] strArray81 = posixParser56.flatten(options64, strArray77, true);
        java.lang.String[] strArray83 = posixParser44.flatten(options55, strArray81, false);
        java.lang.String[] strArray85 = posixParser17.flatten(options43, strArray83, false);
        java.lang.String[] strArray87 = posixParser15.flatten(options16, strArray83, true);
        java.lang.String[] strArray89 = posixParser0.flatten(options14, strArray87, false);
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
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "--", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "--", "", "hi!", "hi!" });
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = posixParser0.flatten(options1, strArray5, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray28 = posixParser21.flatten(options22, strArray26, true);
        posixParser21.burstToken("", false);
        posixParser21.burstToken("", true);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray43 = posixParser36.flatten(options37, strArray41, true);
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray50 = posixParser36.flatten(options44, strArray48, false);
        org.apache.commons.cli.Options options51 = null;
        org.apache.commons.cli.PosixParser posixParser52 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray59 = posixParser52.flatten(options53, strArray57, true);
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray66 = posixParser52.flatten(options60, strArray64, false);
        org.apache.commons.cli.Options options67 = null;
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray75 = posixParser68.flatten(options69, strArray73, true);
        java.lang.String[] strArray77 = posixParser52.flatten(options67, strArray73, false);
        org.apache.commons.cli.Options options78 = null;
        org.apache.commons.cli.PosixParser posixParser79 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options80 = null;
        java.lang.String[] strArray84 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray86 = posixParser79.flatten(options80, strArray84, true);
        java.lang.String[] strArray88 = posixParser52.flatten(options78, strArray86, true);
        java.lang.String[] strArray90 = posixParser36.flatten(options51, strArray86, false);
        java.lang.String[] strArray92 = posixParser21.flatten(options35, strArray90, true);
        java.lang.String[] strArray94 = posixParser0.flatten(options20, strArray90, true);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "--", "--", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "--", "--", "", "", "hi!" });
    }
}

