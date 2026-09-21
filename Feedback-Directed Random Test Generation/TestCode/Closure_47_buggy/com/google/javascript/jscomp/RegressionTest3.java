package com.google.javascript.jscomp;

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
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setStartingPosition((int) (byte) 1, (int) (byte) 10);
        sourceMap1.setStartingPosition(0, (int) (byte) 1);
        sourceMap1.validate(false);
        sourceMap1.setStartingPosition((int) ' ', (int) (byte) 10);
        sourceMap1.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.validate(true);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("hi!");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.reset();
        sourceMap2.reset();
        sourceMap2.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format7 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap8 = format7.getInstance();
        sourceMap8.setWrapperPrefix("");
        sourceMap8.reset();
        sourceMap8.setWrapperPrefix("");
        sourceMap8.validate(true);
        sourceMap8.validate(true);
        sourceMap8.validate(true);
        sourceMap8.reset();
        sourceMap8.validate(false);
        sourceMap8.validate(false);
        sourceMap8.setWrapperPrefix("");
        sourceMap8.setWrapperPrefix("hi!");
        sourceMap8.reset();
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        sourceMap31.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping36 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping39 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str40 = locationMapping39.prefix;
        java.lang.String str41 = locationMapping39.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping44 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str45 = locationMapping44.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray46 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping36, locationMapping39, locationMapping44 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList47 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList47, locationMappingArray46);
        sourceMap31.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList47);
        sourceMap8.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList47);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList47);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(format7);
        org.junit.Assert.assertNotNull(sourceMap8);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format16 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap17 = format16.getInstance();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.reset();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.reset();
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping34 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str35 = locationMapping34.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray39 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping34, locationMapping38 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList40 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40, locationMappingArray39);
        sourceMap31.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap17.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        com.google.javascript.jscomp.SourceMap.Format format45 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap46 = format45.getInstance();
        sourceMap46.setWrapperPrefix("");
        sourceMap46.reset();
        sourceMap46.setWrapperPrefix("");
        sourceMap46.validate(true);
        sourceMap46.validate(true);
        sourceMap46.validate(true);
        sourceMap46.reset();
        com.google.javascript.jscomp.SourceMap.Format format59 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap60 = format59.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping63 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str64 = locationMapping63.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping67 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray68 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping63, locationMapping67 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList69 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList69, locationMappingArray68);
        sourceMap60.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList69);
        sourceMap46.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList69);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList69);
        sourceMap1.setStartingPosition((int) (byte) 10, 0);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("hi!");
        java.lang.Class<?> wildcardClass81 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertNotNull(sourceMap17);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(format45);
        org.junit.Assert.assertNotNull(sourceMap46);
        org.junit.Assert.assertNotNull(format59);
        org.junit.Assert.assertNotNull(sourceMap60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping6 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping9 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str10 = locationMapping9.prefix;
        java.lang.String str11 = locationMapping9.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping14 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str15 = locationMapping14.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray16 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping6, locationMapping9, locationMapping14 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList17 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17, locationMappingArray16);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17);
        sourceMap1.setStartingPosition((int) (short) 100, 0);
        sourceMap1.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format18 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap19 = format18.getInstance();
        sourceMap19.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping24 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping27 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str28 = locationMapping27.prefix;
        java.lang.String str29 = locationMapping27.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping32 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str33 = locationMapping32.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray34 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping24, locationMapping27, locationMapping32 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList35 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList35, locationMappingArray34);
        sourceMap19.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList35);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList35);
        sourceMap1.setStartingPosition(0, 1);
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format43 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap44 = format43.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap45 = format43.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap46 = format43.getInstance();
        sourceMap46.reset();
        sourceMap46.validate(false);
        sourceMap46.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format52 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap53 = format52.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping56 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str57 = locationMapping56.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray61 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping56, locationMapping60 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList62 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList62, locationMappingArray61);
        sourceMap53.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList62);
        sourceMap46.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList62);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList62);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format18);
        org.junit.Assert.assertNotNull(sourceMap19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(format43);
        org.junit.Assert.assertNotNull(sourceMap44);
        org.junit.Assert.assertNotNull(sourceMap45);
        org.junit.Assert.assertNotNull(sourceMap46);
        org.junit.Assert.assertNotNull(format52);
        org.junit.Assert.assertNotNull(sourceMap53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap7 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap8 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap9 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap10 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap11 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap12 = format0.getInstance();
        sourceMap12.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(sourceMap8);
        org.junit.Assert.assertNotNull(sourceMap9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(sourceMap11);
        org.junit.Assert.assertNotNull(sourceMap12);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 1);
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap3.appendTo(appendable4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) ' ', (int) (short) 100);
        sourceMap1.setStartingPosition((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V3;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setStartingPosition((int) (short) 10, (int) (byte) 0);
        sourceMap2.setWrapperPrefix("hi!");
        sourceMap2.validate(false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.debugging.sourcemap.FilePosition filePosition11 = null;
        com.google.debugging.sourcemap.FilePosition filePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap2.addMapping(node10, filePosition11, filePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format23 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap24 = format23.getInstance();
        sourceMap24.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping29 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping32 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str33 = locationMapping32.prefix;
        java.lang.String str34 = locationMapping32.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping37 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str38 = locationMapping37.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray39 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping29, locationMapping32, locationMapping37 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList40 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40, locationMappingArray39);
        sourceMap24.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.validate(true);
        java.lang.Appendable appendable46 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable46, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format23);
        org.junit.Assert.assertNotNull(sourceMap24);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        java.lang.Class<?> wildcardClass13 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap7 = format0.getInstance();
        sourceMap7.setWrapperPrefix("hi!");
        sourceMap7.reset();
        sourceMap7.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(sourceMap7);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.validate(true);
        sourceMap1.reset();
        com.google.javascript.rhino.Node node8 = null;
        com.google.debugging.sourcemap.FilePosition filePosition9 = null;
        com.google.debugging.sourcemap.FilePosition filePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node8, filePosition9, filePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.reset();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.reset();
        sourceMap27.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format42 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap43 = format42.getInstance();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.reset();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.reset();
        com.google.javascript.jscomp.SourceMap.Format format56 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap57 = format56.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str61 = locationMapping60.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping64 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray65 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping60, locationMapping64 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList66 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66, locationMappingArray65);
        sourceMap57.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        sourceMap1.validate(true);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(format56);
        org.junit.Assert.assertNotNull(sourceMap57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) (byte) 100, (int) (byte) 100);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition((int) 'a', 0);
        sourceMap1.setStartingPosition((int) (byte) 100, 100);
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format23 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap24 = format23.getInstance();
        sourceMap24.setWrapperPrefix("");
        sourceMap24.reset();
        sourceMap24.setWrapperPrefix("");
        sourceMap24.validate(true);
        sourceMap24.validate(true);
        sourceMap24.validate(true);
        sourceMap24.reset();
        sourceMap24.validate(false);
        sourceMap24.validate(false);
        sourceMap24.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping45 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping48 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str49 = locationMapping48.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping52 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping55 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str56 = locationMapping55.prefix;
        java.lang.String str57 = locationMapping55.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str61 = locationMapping60.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping64 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str65 = locationMapping64.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping68 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str69 = locationMapping68.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping72 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str73 = locationMapping72.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping76 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str77 = locationMapping76.prefix;
        java.lang.String str78 = locationMapping76.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray79 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping45, locationMapping48, locationMapping52, locationMapping55, locationMapping60, locationMapping64, locationMapping68, locationMapping72, locationMapping76 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList80 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList80, locationMappingArray79);
        sourceMap24.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList80);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList80);
        java.lang.Appendable appendable84 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable84, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format23);
        org.junit.Assert.assertNotNull(sourceMap24);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locationMappingArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) ' ');
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier14 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("hi!", sourceMapSupplier14);
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 1");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) (byte) 100, 0);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        com.google.javascript.rhino.Node node17 = null;
        com.google.debugging.sourcemap.FilePosition filePosition18 = null;
        com.google.debugging.sourcemap.FilePosition filePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node17, filePosition18, filePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.reset();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.reset();
        sourceMap27.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format42 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap43 = format42.getInstance();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.reset();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.reset();
        com.google.javascript.jscomp.SourceMap.Format format56 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap57 = format56.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str61 = locationMapping60.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping64 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray65 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping60, locationMapping64 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList66 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66, locationMappingArray65);
        sourceMap57.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        sourceMap1.reset();
        sourceMap1.setStartingPosition(0, (int) (short) 10);
        java.lang.Appendable appendable82 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable82, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(format56);
        org.junit.Assert.assertNotNull(sourceMap57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) (byte) 100, (int) (byte) 100);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition((int) 'a', 0);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(false);
        sourceMap1.setStartingPosition((int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.reset();
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        sourceMap5.reset();
        sourceMap5.validate(false);
        sourceMap5.setWrapperPrefix("");
        sourceMap5.setStartingPosition(10, (int) 'a');
        com.google.javascript.jscomp.SourceMap.Format format14 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap15 = format14.getInstance();
        sourceMap15.setWrapperPrefix("");
        sourceMap15.reset();
        sourceMap15.setWrapperPrefix("");
        sourceMap15.validate(true);
        sourceMap15.validate(true);
        sourceMap15.setStartingPosition((int) ' ', (int) (short) 100);
        sourceMap15.validate(true);
        sourceMap15.setWrapperPrefix("");
        sourceMap15.reset();
        sourceMap15.reset();
        sourceMap15.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format36 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap37 = format36.getInstance();
        sourceMap37.validate(true);
        sourceMap37.validate(true);
        sourceMap37.reset();
        com.google.javascript.jscomp.SourceMap.Format format43 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap44 = format43.getInstance();
        sourceMap44.setWrapperPrefix("");
        sourceMap44.reset();
        sourceMap44.setWrapperPrefix("");
        sourceMap44.reset();
        sourceMap44.reset();
        sourceMap44.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format54 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap55 = format54.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping58 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str59 = locationMapping58.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping62 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray63 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping58, locationMapping62 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList64 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64, locationMappingArray63);
        sourceMap55.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64);
        sourceMap44.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64);
        sourceMap37.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format14);
        org.junit.Assert.assertNotNull(sourceMap15);
        org.junit.Assert.assertNotNull(format36);
        org.junit.Assert.assertNotNull(sourceMap37);
        org.junit.Assert.assertNotNull(format43);
        org.junit.Assert.assertNotNull(sourceMap44);
        org.junit.Assert.assertNotNull(format54);
        org.junit.Assert.assertNotNull(sourceMap55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) ' ', (int) (short) 100);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) (short) 100, (int) (short) 1);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping6 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping9 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str10 = locationMapping9.prefix;
        java.lang.String str11 = locationMapping9.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping14 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str15 = locationMapping14.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray16 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping6, locationMapping9, locationMapping14 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList17 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17, locationMappingArray16);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17);
        sourceMap1.reset();
        sourceMap1.validate(false);
        java.lang.Appendable appendable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable23, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format23 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap24 = format23.getInstance();
        sourceMap24.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping29 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping32 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str33 = locationMapping32.prefix;
        java.lang.String str34 = locationMapping32.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping37 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str38 = locationMapping37.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray39 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping29, locationMapping32, locationMapping37 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList40 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40, locationMappingArray39);
        sourceMap24.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setStartingPosition((int) '#', 10);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format23);
        org.junit.Assert.assertNotNull(sourceMap24);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        sourceMap1.setStartingPosition((int) (byte) 1, (int) 'a');
        com.google.javascript.rhino.Node node12 = null;
        com.google.debugging.sourcemap.FilePosition filePosition13 = null;
        com.google.debugging.sourcemap.FilePosition filePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node12, filePosition13, filePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.reset();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.reset();
        sourceMap27.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format42 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap43 = format42.getInstance();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.reset();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.reset();
        com.google.javascript.jscomp.SourceMap.Format format56 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap57 = format56.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str61 = locationMapping60.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping64 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray65 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping60, locationMapping64 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList66 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66, locationMappingArray65);
        sourceMap57.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) (byte) 1, 10);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(format56);
        org.junit.Assert.assertNotNull(sourceMap57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.reset();
        sourceMap1.setStartingPosition(0, 0);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.prefix;
        java.lang.String str5 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        org.json.JSONObject jSONObject22 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse(jSONObject22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        sourceMap6.setWrapperPrefix("");
        sourceMap6.setStartingPosition((int) (byte) 100, (int) (byte) 1);
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap6.appendTo(appendable12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(false);
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.reset();
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier20 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("hi!", sourceMapSupplier20);
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 1");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format15 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap16 = format15.getInstance();
        sourceMap16.setWrapperPrefix("");
        sourceMap16.reset();
        sourceMap16.setWrapperPrefix("");
        sourceMap16.validate(true);
        sourceMap16.validate(true);
        sourceMap16.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format28 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap29 = format28.getInstance();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.reset();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format41 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap42 = format41.getInstance();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.reset();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.reset();
        sourceMap42.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format57 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap58 = format57.getInstance();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.reset();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.reset();
        com.google.javascript.jscomp.SourceMap.Format format71 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap72 = format71.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping75 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str76 = locationMapping75.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping79 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray80 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping75, locationMapping79 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList81 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81, locationMappingArray80);
        sourceMap72.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap58.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap42.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap29.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap16.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.reset();
        com.google.javascript.rhino.Node node91 = null;
        com.google.debugging.sourcemap.FilePosition filePosition92 = null;
        com.google.debugging.sourcemap.FilePosition filePosition93 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node91, filePosition92, filePosition93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format15);
        org.junit.Assert.assertNotNull(sourceMap16);
        org.junit.Assert.assertNotNull(format28);
        org.junit.Assert.assertNotNull(sourceMap29);
        org.junit.Assert.assertNotNull(format41);
        org.junit.Assert.assertNotNull(sourceMap42);
        org.junit.Assert.assertNotNull(format57);
        org.junit.Assert.assertNotNull(sourceMap58);
        org.junit.Assert.assertNotNull(format71);
        org.junit.Assert.assertNotNull(sourceMap72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.reset();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.reset();
        sourceMap5.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format20 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap21 = format20.getInstance();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.reset();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.reset();
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str39 = locationMapping38.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping42 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray43 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping38, locationMapping42 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList44 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44, locationMappingArray43);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap21.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(sourceMap21);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format14 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap15 = format14.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping18 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str19 = locationMapping18.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping22 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray23 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping18, locationMapping22 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList24 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24, locationMappingArray23);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        com.google.javascript.jscomp.SourceMap.Format format28 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap29 = format28.getInstance();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.reset();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format41 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap42 = format41.getInstance();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.reset();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.reset();
        sourceMap42.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format57 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap58 = format57.getInstance();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.reset();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.reset();
        com.google.javascript.jscomp.SourceMap.Format format71 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap72 = format71.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping75 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str76 = locationMapping75.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping79 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray80 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping75, locationMapping79 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList81 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81, locationMappingArray80);
        sourceMap72.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap58.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap42.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap29.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.setStartingPosition(0, 10);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format14);
        org.junit.Assert.assertNotNull(sourceMap15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(format28);
        org.junit.Assert.assertNotNull(sourceMap29);
        org.junit.Assert.assertNotNull(format41);
        org.junit.Assert.assertNotNull(sourceMap42);
        org.junit.Assert.assertNotNull(format57);
        org.junit.Assert.assertNotNull(sourceMap58);
        org.junit.Assert.assertNotNull(format71);
        org.junit.Assert.assertNotNull(sourceMap72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 1");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping4 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str5 = locationMapping4.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray9 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping4, locationMapping8 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList10 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList10, locationMappingArray9);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList10);
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.setStartingPosition((int) (byte) 100, (int) (byte) 100);
        sourceMap14.setWrapperPrefix("hi!");
        sourceMap14.setStartingPosition((int) 'a', 0);
        sourceMap14.validate(false);
        sourceMap14.reset();
        com.google.javascript.jscomp.SourceMap.Format format35 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap36 = format35.getInstance();
        sourceMap36.setWrapperPrefix("");
        sourceMap36.reset();
        sourceMap36.setWrapperPrefix("");
        sourceMap36.validate(true);
        sourceMap36.validate(true);
        sourceMap36.validate(true);
        sourceMap36.reset();
        sourceMap36.validate(false);
        sourceMap36.validate(false);
        sourceMap36.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping57 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str61 = locationMapping60.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping64 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping67 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str68 = locationMapping67.prefix;
        java.lang.String str69 = locationMapping67.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping72 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str73 = locationMapping72.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping76 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str77 = locationMapping76.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping80 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str81 = locationMapping80.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping84 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str85 = locationMapping84.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping88 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str89 = locationMapping88.prefix;
        java.lang.String str90 = locationMapping88.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray91 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping57, locationMapping60, locationMapping64, locationMapping67, locationMapping72, locationMapping76, locationMapping80, locationMapping84, locationMapping88 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList92 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList92, locationMappingArray91);
        sourceMap36.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList92);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList92);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList92);
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format35);
        org.junit.Assert.assertNotNull(sourceMap36);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(locationMappingArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.reset();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.reset();
        sourceMap5.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format20 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap21 = format20.getInstance();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.reset();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.reset();
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str39 = locationMapping38.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping42 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray43 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping38, locationMapping42 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList44 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44, locationMappingArray43);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap21.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.setStartingPosition((int) (short) 0, (int) (short) 100);
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        java.lang.Class<?> wildcardClass57 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(sourceMap21);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.reset();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.reset();
        sourceMap5.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format20 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap21 = format20.getInstance();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.reset();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.reset();
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str39 = locationMapping38.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping42 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray43 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping38, locationMapping42 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList44 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44, locationMappingArray43);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap21.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.setStartingPosition((int) (short) 0, (int) (short) 100);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(false);
        java.lang.Appendable appendable59 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable59, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(sourceMap21);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format6 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap7 = format6.getInstance();
        sourceMap7.setWrapperPrefix("");
        sourceMap7.reset();
        sourceMap7.setWrapperPrefix("");
        sourceMap7.validate(true);
        sourceMap7.validate(true);
        sourceMap7.validate(true);
        sourceMap7.reset();
        com.google.javascript.jscomp.SourceMap.Format format20 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap21 = format20.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping24 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str25 = locationMapping24.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping28 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray29 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping24, locationMapping28 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList30 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30, locationMappingArray29);
        sourceMap21.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30);
        sourceMap7.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30);
        sourceMap5.setWrapperPrefix("");
        sourceMap5.validate(false);
        sourceMap5.setWrapperPrefix("");
        sourceMap5.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(sourceMap21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format14 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap15 = format14.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping18 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str19 = locationMapping18.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping22 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray23 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping18, locationMapping22 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList24 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24, locationMappingArray23);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        com.google.javascript.jscomp.SourceMap.Format format28 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap29 = format28.getInstance();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.reset();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format41 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap42 = format41.getInstance();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.reset();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.reset();
        sourceMap42.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format57 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap58 = format57.getInstance();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.reset();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.reset();
        com.google.javascript.jscomp.SourceMap.Format format71 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap72 = format71.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping75 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str76 = locationMapping75.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping79 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray80 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping75, locationMapping79 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList81 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81, locationMappingArray80);
        sourceMap72.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap58.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap42.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap29.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) '4', 1);
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format14);
        org.junit.Assert.assertNotNull(sourceMap15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(format28);
        org.junit.Assert.assertNotNull(sourceMap29);
        org.junit.Assert.assertNotNull(format41);
        org.junit.Assert.assertNotNull(sourceMap42);
        org.junit.Assert.assertNotNull(format57);
        org.junit.Assert.assertNotNull(sourceMap58);
        org.junit.Assert.assertNotNull(format71);
        org.junit.Assert.assertNotNull(sourceMap72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) ' ', (int) (short) 100);
        sourceMap1.setStartingPosition((int) ' ', (int) (byte) 100);
        com.google.javascript.jscomp.SourceMap.Format format17 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap18 = format17.getInstance();
        sourceMap18.setWrapperPrefix("");
        sourceMap18.reset();
        sourceMap18.setWrapperPrefix("");
        sourceMap18.validate(true);
        sourceMap18.validate(true);
        sourceMap18.setStartingPosition((int) (byte) 100, (int) (byte) 100);
        sourceMap18.setWrapperPrefix("hi!");
        sourceMap18.setStartingPosition((int) 'a', 0);
        com.google.javascript.jscomp.SourceMap.Format format36 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap37 = format36.getInstance();
        sourceMap37.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format40 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap41 = format40.getInstance();
        sourceMap41.setWrapperPrefix("");
        sourceMap41.reset();
        sourceMap41.setWrapperPrefix("");
        sourceMap41.validate(true);
        sourceMap41.validate(true);
        sourceMap41.validate(true);
        sourceMap41.reset();
        sourceMap41.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format56 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap57 = format56.getInstance();
        sourceMap57.setWrapperPrefix("");
        sourceMap57.reset();
        sourceMap57.setWrapperPrefix("");
        sourceMap57.validate(true);
        sourceMap57.validate(true);
        sourceMap57.validate(true);
        sourceMap57.reset();
        com.google.javascript.jscomp.SourceMap.Format format70 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap71 = format70.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping74 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str75 = locationMapping74.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping78 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray79 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping74, locationMapping78 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList80 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList80, locationMappingArray79);
        sourceMap71.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList80);
        sourceMap57.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList80);
        sourceMap41.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList80);
        sourceMap37.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList80);
        sourceMap18.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList80);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList80);
        sourceMap1.setStartingPosition(1, (int) (byte) 1);
        sourceMap1.setStartingPosition((int) '#', 10);
        java.lang.Appendable appendable94 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable94, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format17);
        org.junit.Assert.assertNotNull(sourceMap18);
        org.junit.Assert.assertNotNull(format36);
        org.junit.Assert.assertNotNull(sourceMap37);
        org.junit.Assert.assertNotNull(format40);
        org.junit.Assert.assertNotNull(sourceMap41);
        org.junit.Assert.assertNotNull(format56);
        org.junit.Assert.assertNotNull(sourceMap57);
        org.junit.Assert.assertNotNull(format70);
        org.junit.Assert.assertNotNull(sourceMap71);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.reset();
        sourceMap14.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format29 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap30 = format29.getInstance();
        sourceMap30.setWrapperPrefix("");
        sourceMap30.reset();
        sourceMap30.setWrapperPrefix("");
        sourceMap30.validate(true);
        sourceMap30.validate(true);
        sourceMap30.validate(true);
        sourceMap30.reset();
        com.google.javascript.jscomp.SourceMap.Format format43 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap44 = format43.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping47 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str48 = locationMapping47.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping51 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray52 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping47, locationMapping51 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList53 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53, locationMappingArray52);
        sourceMap44.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap30.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        java.lang.Class<?> wildcardClass59 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format29);
        org.junit.Assert.assertNotNull(sourceMap30);
        org.junit.Assert.assertNotNull(format43);
        org.junit.Assert.assertNotNull(sourceMap44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.prefix;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.prefix;
        java.lang.String str10 = locationMapping2.prefix;
        java.lang.String str11 = locationMapping2.replacement;
        java.lang.String str12 = locationMapping2.prefix;
        java.lang.String str13 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format6 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap7 = format6.getInstance();
        sourceMap7.setWrapperPrefix("");
        sourceMap7.reset();
        sourceMap7.setWrapperPrefix("");
        sourceMap7.validate(true);
        sourceMap7.validate(true);
        sourceMap7.validate(true);
        sourceMap7.reset();
        com.google.javascript.jscomp.SourceMap.Format format20 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap21 = format20.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping24 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str25 = locationMapping24.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping28 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray29 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping24, locationMapping28 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList30 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30, locationMappingArray29);
        sourceMap21.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30);
        sourceMap7.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30);
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        sourceMap35.setWrapperPrefix("");
        sourceMap35.reset();
        sourceMap35.setWrapperPrefix("");
        sourceMap35.validate(true);
        sourceMap35.validate(true);
        sourceMap35.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format47 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap48 = format47.getInstance();
        sourceMap48.setWrapperPrefix("");
        sourceMap48.reset();
        sourceMap48.setWrapperPrefix("");
        sourceMap48.validate(true);
        sourceMap48.validate(true);
        sourceMap48.validate(true);
        sourceMap48.reset();
        sourceMap48.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format63 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap64 = format63.getInstance();
        sourceMap64.setWrapperPrefix("");
        sourceMap64.reset();
        sourceMap64.setWrapperPrefix("");
        sourceMap64.validate(true);
        sourceMap64.validate(true);
        sourceMap64.validate(true);
        sourceMap64.reset();
        com.google.javascript.jscomp.SourceMap.Format format77 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap78 = format77.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping81 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str82 = locationMapping81.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping85 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray86 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping81, locationMapping85 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList87 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList87, locationMappingArray86);
        sourceMap78.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList87);
        sourceMap64.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList87);
        sourceMap48.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList87);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList87);
        sourceMap7.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList87);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList87);
        sourceMap1.validate(false);
        java.lang.Appendable appendable97 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable97, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(sourceMap21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertNotNull(format47);
        org.junit.Assert.assertNotNull(sourceMap48);
        org.junit.Assert.assertNotNull(format63);
        org.junit.Assert.assertNotNull(sourceMap64);
        org.junit.Assert.assertNotNull(format77);
        org.junit.Assert.assertNotNull(sourceMap78);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setStartingPosition(100, 1);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format7 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap8 = format7.getInstance();
        sourceMap8.setWrapperPrefix("");
        sourceMap8.reset();
        sourceMap8.setWrapperPrefix("");
        sourceMap8.validate(true);
        sourceMap8.validate(true);
        sourceMap8.validate(true);
        sourceMap8.reset();
        sourceMap8.validate(false);
        sourceMap8.validate(false);
        sourceMap8.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping29 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping32 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str33 = locationMapping32.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping36 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping39 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str40 = locationMapping39.prefix;
        java.lang.String str41 = locationMapping39.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping44 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str45 = locationMapping44.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping48 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str49 = locationMapping48.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping52 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str53 = locationMapping52.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping56 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str57 = locationMapping56.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str61 = locationMapping60.prefix;
        java.lang.String str62 = locationMapping60.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray63 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping29, locationMapping32, locationMapping36, locationMapping39, locationMapping44, locationMapping48, locationMapping52, locationMapping56, locationMapping60 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList64 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64, locationMappingArray63);
        sourceMap8.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64);
        sourceMap6.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64);
        sourceMap6.setWrapperPrefix("");
        com.google.javascript.rhino.Node node70 = null;
        com.google.debugging.sourcemap.FilePosition filePosition71 = null;
        com.google.debugging.sourcemap.FilePosition filePosition72 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap6.addMapping(node70, filePosition71, filePosition72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(format7);
        org.junit.Assert.assertNotNull(sourceMap8);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locationMappingArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) ' ', (int) (short) 100);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        java.lang.Class<?> wildcardClass22 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.reset();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.reset();
        sourceMap27.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format42 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap43 = format42.getInstance();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.reset();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.reset();
        com.google.javascript.jscomp.SourceMap.Format format56 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap57 = format56.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str61 = locationMapping60.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping64 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray65 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping60, locationMapping64 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList66 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66, locationMappingArray65);
        sourceMap57.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        sourceMap1.validate(true);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(format56);
        org.junit.Assert.assertNotNull(sourceMap57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        org.json.JSONObject jSONObject16 = null;
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier17 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse(jSONObject16, sourceMapSupplier17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format16 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap17 = format16.getInstance();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.reset();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.reset();
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping34 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str35 = locationMapping34.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray39 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping34, locationMapping38 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList40 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40, locationMappingArray39);
        sourceMap31.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap17.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setStartingPosition((int) (byte) 100, 0);
        sourceMap1.setStartingPosition((int) '4', (int) '4');
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertNotNull(sourceMap17);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) -1);
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("hi!", sourceMapSupplier11);
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 1");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) (byte) 10, 100);
        sourceMap1.setStartingPosition((int) '4', (int) (short) 10);
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format15 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap16 = format15.getInstance();
        sourceMap16.setWrapperPrefix("");
        sourceMap16.reset();
        sourceMap16.setWrapperPrefix("");
        sourceMap16.validate(true);
        sourceMap16.validate(true);
        sourceMap16.validate(true);
        sourceMap16.reset();
        sourceMap16.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format31 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap32 = format31.getInstance();
        sourceMap32.setWrapperPrefix("");
        sourceMap32.reset();
        sourceMap32.setWrapperPrefix("");
        sourceMap32.validate(true);
        sourceMap32.validate(true);
        sourceMap32.validate(true);
        sourceMap32.reset();
        com.google.javascript.jscomp.SourceMap.Format format45 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap46 = format45.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping49 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str50 = locationMapping49.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping53 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray54 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping49, locationMapping53 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList55 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList55, locationMappingArray54);
        sourceMap46.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList55);
        sourceMap32.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList55);
        sourceMap16.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList55);
        sourceMap16.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format62 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap63 = format62.getInstance();
        sourceMap63.setWrapperPrefix("");
        sourceMap63.reset();
        sourceMap63.setStartingPosition((int) (byte) 10, 100);
        sourceMap63.setStartingPosition((int) '4', (int) (short) 10);
        sourceMap63.reset();
        com.google.javascript.jscomp.SourceMap.Format format74 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap75 = format74.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap76 = format74.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap77 = format74.getInstance();
        sourceMap77.reset();
        sourceMap77.validate(false);
        sourceMap77.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format83 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap84 = format83.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping87 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str88 = locationMapping87.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping91 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray92 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping87, locationMapping91 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList93 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList93, locationMappingArray92);
        sourceMap84.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList93);
        sourceMap77.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList93);
        sourceMap63.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList93);
        sourceMap16.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList93);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList93);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format15);
        org.junit.Assert.assertNotNull(sourceMap16);
        org.junit.Assert.assertNotNull(format31);
        org.junit.Assert.assertNotNull(sourceMap32);
        org.junit.Assert.assertNotNull(format45);
        org.junit.Assert.assertNotNull(sourceMap46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(format62);
        org.junit.Assert.assertNotNull(sourceMap63);
        org.junit.Assert.assertNotNull(format74);
        org.junit.Assert.assertNotNull(sourceMap75);
        org.junit.Assert.assertNotNull(sourceMap76);
        org.junit.Assert.assertNotNull(sourceMap77);
        org.junit.Assert.assertNotNull(format83);
        org.junit.Assert.assertNotNull(sourceMap84);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("");
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.reset();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.reset();
        sourceMap27.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format42 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap43 = format42.getInstance();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.reset();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.reset();
        com.google.javascript.jscomp.SourceMap.Format format56 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap57 = format56.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str61 = locationMapping60.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping64 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray65 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping60, locationMapping64 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList66 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66, locationMappingArray65);
        sourceMap57.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        sourceMap1.reset();
        sourceMap1.setStartingPosition(0, (int) (short) 10);
        com.google.javascript.rhino.Node node82 = null;
        com.google.debugging.sourcemap.FilePosition filePosition83 = null;
        com.google.debugging.sourcemap.FilePosition filePosition84 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node82, filePosition83, filePosition84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(format56);
        org.junit.Assert.assertNotNull(sourceMap57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str3 = locationMapping2.prefix;
        java.lang.String str4 = locationMapping2.prefix;
        java.lang.String str5 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format14 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap15 = format14.getInstance();
        sourceMap15.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format18 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap19 = format18.getInstance();
        sourceMap19.setWrapperPrefix("");
        sourceMap19.reset();
        sourceMap19.setWrapperPrefix("");
        sourceMap19.validate(true);
        sourceMap19.validate(true);
        sourceMap19.validate(true);
        sourceMap19.reset();
        sourceMap19.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        sourceMap35.setWrapperPrefix("");
        sourceMap35.reset();
        sourceMap35.setWrapperPrefix("");
        sourceMap35.validate(true);
        sourceMap35.validate(true);
        sourceMap35.validate(true);
        sourceMap35.reset();
        com.google.javascript.jscomp.SourceMap.Format format48 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap49 = format48.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping52 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str53 = locationMapping52.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping56 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray57 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping52, locationMapping56 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList58 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58, locationMappingArray57);
        sourceMap49.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap19.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        com.google.javascript.jscomp.SourceMap.Format format64 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap65 = format64.getInstance();
        sourceMap65.setWrapperPrefix("");
        sourceMap65.reset();
        sourceMap65.setWrapperPrefix("");
        sourceMap65.validate(true);
        sourceMap65.validate(true);
        sourceMap65.validate(true);
        sourceMap65.reset();
        com.google.javascript.jscomp.SourceMap.Format format78 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap79 = format78.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping82 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str83 = locationMapping82.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping86 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray87 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping82, locationMapping86 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList88 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList88, locationMappingArray87);
        sourceMap79.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList88);
        sourceMap65.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList88);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList88);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList88);
        sourceMap1.setStartingPosition((int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format14);
        org.junit.Assert.assertNotNull(sourceMap15);
        org.junit.Assert.assertNotNull(format18);
        org.junit.Assert.assertNotNull(sourceMap19);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertNotNull(format48);
        org.junit.Assert.assertNotNull(sourceMap49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(format64);
        org.junit.Assert.assertNotNull(sourceMap65);
        org.junit.Assert.assertNotNull(format78);
        org.junit.Assert.assertNotNull(sourceMap79);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format14 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap15 = format14.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping18 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str19 = locationMapping18.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping22 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray23 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping18, locationMapping22 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList24 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24, locationMappingArray23);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        com.google.javascript.jscomp.SourceMap.Format format28 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap29 = format28.getInstance();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.reset();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format41 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap42 = format41.getInstance();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.reset();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.reset();
        sourceMap42.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format57 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap58 = format57.getInstance();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.reset();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.reset();
        com.google.javascript.jscomp.SourceMap.Format format71 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap72 = format71.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping75 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str76 = locationMapping75.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping79 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray80 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping75, locationMapping79 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList81 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81, locationMappingArray80);
        sourceMap72.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap58.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap42.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap29.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.setStartingPosition((int) (byte) 100, 0);
        sourceMap1.validate(true);
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format14);
        org.junit.Assert.assertNotNull(sourceMap15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(format28);
        org.junit.Assert.assertNotNull(sourceMap29);
        org.junit.Assert.assertNotNull(format41);
        org.junit.Assert.assertNotNull(sourceMap42);
        org.junit.Assert.assertNotNull(format57);
        org.junit.Assert.assertNotNull(sourceMap58);
        org.junit.Assert.assertNotNull(format71);
        org.junit.Assert.assertNotNull(sourceMap72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier23 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("", sourceMapSupplier23);
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format14 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap15 = format14.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping18 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str19 = locationMapping18.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping22 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray23 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping18, locationMapping22 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList24 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24, locationMappingArray23);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        com.google.javascript.jscomp.SourceMap.Format format28 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap29 = format28.getInstance();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.reset();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format41 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap42 = format41.getInstance();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.reset();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.reset();
        sourceMap42.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format57 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap58 = format57.getInstance();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.reset();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.reset();
        com.google.javascript.jscomp.SourceMap.Format format71 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap72 = format71.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping75 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str76 = locationMapping75.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping79 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray80 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping75, locationMapping79 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList81 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81, locationMappingArray80);
        sourceMap72.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap58.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap42.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap29.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(true);
        com.google.javascript.rhino.Node node96 = null;
        com.google.debugging.sourcemap.FilePosition filePosition97 = null;
        com.google.debugging.sourcemap.FilePosition filePosition98 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node96, filePosition97, filePosition98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format14);
        org.junit.Assert.assertNotNull(sourceMap15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(format28);
        org.junit.Assert.assertNotNull(sourceMap29);
        org.junit.Assert.assertNotNull(format41);
        org.junit.Assert.assertNotNull(sourceMap42);
        org.junit.Assert.assertNotNull(format57);
        org.junit.Assert.assertNotNull(sourceMap58);
        org.junit.Assert.assertNotNull(format71);
        org.junit.Assert.assertNotNull(sourceMap72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("hi!");
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping24 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        org.json.JSONObject jSONObject25 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse(jSONObject25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
        org.junit.Assert.assertNull(originalMapping24);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping4 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str5 = locationMapping4.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray9 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping4, locationMapping8 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList10 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList10, locationMappingArray9);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList10);
        sourceMap1.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.prefix;
        java.lang.String str9 = locationMapping2.prefix;
        java.lang.Class<?> wildcardClass10 = locationMapping2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format16 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap17 = format16.getInstance();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.reset();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.reset();
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping34 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str35 = locationMapping34.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray39 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping34, locationMapping38 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList40 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40, locationMappingArray39);
        sourceMap31.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap17.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setStartingPosition(100, 1);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertNotNull(sourceMap17);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.reset();
        sourceMap2.reset();
        // The following exception was thrown during execution in test generation
        try {
            sourceMap2.setStartingPosition((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.validate(true);
        com.google.javascript.rhino.Node node9 = null;
        com.google.debugging.sourcemap.FilePosition filePosition10 = null;
        com.google.debugging.sourcemap.FilePosition filePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node9, filePosition10, filePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap7 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap8 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap9 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap10 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap11 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap12 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap13 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap14 = format0.getInstance();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(sourceMap8);
        org.junit.Assert.assertNotNull(sourceMap9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(sourceMap11);
        org.junit.Assert.assertNotNull(sourceMap12);
        org.junit.Assert.assertNotNull(sourceMap13);
        org.junit.Assert.assertNotNull(sourceMap14);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        java.lang.Class<?> wildcardClass8 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("");
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.prefix;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.replacement;
        java.lang.String str10 = locationMapping2.replacement;
        java.lang.String str11 = locationMapping2.prefix;
        java.lang.String str12 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format6 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap7 = format6.getInstance();
        sourceMap7.setWrapperPrefix("");
        sourceMap7.reset();
        sourceMap7.setWrapperPrefix("");
        sourceMap7.validate(true);
        sourceMap7.validate(true);
        sourceMap7.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format19 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap20 = format19.getInstance();
        sourceMap20.setWrapperPrefix("");
        sourceMap20.reset();
        sourceMap20.setWrapperPrefix("");
        sourceMap20.validate(true);
        sourceMap20.validate(true);
        sourceMap20.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format32 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap33 = format32.getInstance();
        sourceMap33.setWrapperPrefix("");
        sourceMap33.reset();
        sourceMap33.setWrapperPrefix("");
        sourceMap33.validate(true);
        sourceMap33.validate(true);
        sourceMap33.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format45 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap46 = format45.getInstance();
        sourceMap46.setWrapperPrefix("");
        sourceMap46.reset();
        sourceMap46.setWrapperPrefix("");
        sourceMap46.validate(true);
        sourceMap46.validate(true);
        sourceMap46.validate(true);
        sourceMap46.reset();
        sourceMap46.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format61 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap62 = format61.getInstance();
        sourceMap62.setWrapperPrefix("");
        sourceMap62.reset();
        sourceMap62.setWrapperPrefix("");
        sourceMap62.validate(true);
        sourceMap62.validate(true);
        sourceMap62.validate(true);
        sourceMap62.reset();
        com.google.javascript.jscomp.SourceMap.Format format75 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap76 = format75.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping79 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str80 = locationMapping79.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping83 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray84 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping79, locationMapping83 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList85 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList85, locationMappingArray84);
        sourceMap76.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList85);
        sourceMap62.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList85);
        sourceMap46.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList85);
        sourceMap33.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList85);
        sourceMap20.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList85);
        sourceMap7.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList85);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList85);
        sourceMap5.reset();
        com.google.javascript.rhino.Node node95 = null;
        com.google.debugging.sourcemap.FilePosition filePosition96 = null;
        com.google.debugging.sourcemap.FilePosition filePosition97 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap5.addMapping(node95, filePosition96, filePosition97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(format19);
        org.junit.Assert.assertNotNull(sourceMap20);
        org.junit.Assert.assertNotNull(format32);
        org.junit.Assert.assertNotNull(sourceMap33);
        org.junit.Assert.assertNotNull(format45);
        org.junit.Assert.assertNotNull(sourceMap46);
        org.junit.Assert.assertNotNull(format61);
        org.junit.Assert.assertNotNull(sourceMap62);
        org.junit.Assert.assertNotNull(format75);
        org.junit.Assert.assertNotNull(sourceMap76);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), 100);
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format16 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap17 = format16.getInstance();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.reset();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.reset();
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping34 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str35 = locationMapping34.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray39 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping34, locationMapping38 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList40 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40, locationMappingArray39);
        sourceMap31.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap17.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setWrapperPrefix("hi!");
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList47 = null;
        sourceMap1.setPrefixMappings(locationMappingList47);
        sourceMap1.setStartingPosition((int) (short) 10, (int) ' ');
        sourceMap1.setWrapperPrefix("hi!");
        java.lang.Class<?> wildcardClass54 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertNotNull(sourceMap17);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V3;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setStartingPosition((int) (short) 10, (int) (byte) 0);
        sourceMap2.setStartingPosition((int) 'a', (int) (byte) 1);
        sourceMap2.reset();
        sourceMap2.setStartingPosition(0, (int) (short) 10);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.reset();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.reset();
        sourceMap27.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format42 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap43 = format42.getInstance();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.reset();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.reset();
        com.google.javascript.jscomp.SourceMap.Format format56 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap57 = format56.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str61 = locationMapping60.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping64 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray65 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping60, locationMapping64 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList66 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66, locationMappingArray65);
        sourceMap57.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(format56);
        org.junit.Assert.assertNotNull(sourceMap57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("");
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.reset();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.reset();
        sourceMap5.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format20 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap21 = format20.getInstance();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.reset();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.reset();
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str39 = locationMapping38.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping42 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray43 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping38, locationMapping42 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList44 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44, locationMappingArray43);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap21.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.setStartingPosition((int) (short) 0, (int) (short) 100);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition((int) 'a', 0);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(sourceMap21);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping6 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str7 = locationMapping6.prefix;
        java.lang.String str8 = locationMapping6.replacement;
        java.lang.String str9 = locationMapping6.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping12 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping15 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str16 = locationMapping15.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping19 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str20 = locationMapping19.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping23 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str24 = locationMapping23.prefix;
        java.lang.String str25 = locationMapping23.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping28 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping31 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str32 = locationMapping31.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping35 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str36 = locationMapping35.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping39 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        java.lang.String str40 = locationMapping39.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping43 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str44 = locationMapping43.prefix;
        java.lang.String str45 = locationMapping43.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping48 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str49 = locationMapping48.replacement;
        java.lang.String str50 = locationMapping48.replacement;
        java.lang.String str51 = locationMapping48.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping54 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        java.lang.String str55 = locationMapping54.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping58 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping61 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str62 = locationMapping61.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping65 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str66 = locationMapping65.replacement;
        java.lang.String str67 = locationMapping65.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping70 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str71 = locationMapping70.prefix;
        java.lang.String str72 = locationMapping70.replacement;
        java.lang.String str73 = locationMapping70.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping76 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str77 = locationMapping76.replacement;
        java.lang.String str78 = locationMapping76.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping81 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping84 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str85 = locationMapping84.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray86 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping6, locationMapping12, locationMapping15, locationMapping19, locationMapping23, locationMapping28, locationMapping31, locationMapping35, locationMapping39, locationMapping43, locationMapping48, locationMapping54, locationMapping58, locationMapping61, locationMapping65, locationMapping70, locationMapping76, locationMapping81, locationMapping84 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList87 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList87, locationMappingArray86);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList87);
        sourceMap1.validate(true);
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(locationMappingArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition(0, (int) '#');
        sourceMap1.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.reset();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format39 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap40 = format39.getInstance();
        sourceMap40.setWrapperPrefix("");
        sourceMap40.reset();
        sourceMap40.setWrapperPrefix("");
        sourceMap40.validate(true);
        sourceMap40.validate(true);
        sourceMap40.validate(true);
        sourceMap40.reset();
        sourceMap40.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format55 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap56 = format55.getInstance();
        sourceMap56.setWrapperPrefix("");
        sourceMap56.reset();
        sourceMap56.setWrapperPrefix("");
        sourceMap56.validate(true);
        sourceMap56.validate(true);
        sourceMap56.validate(true);
        sourceMap56.reset();
        com.google.javascript.jscomp.SourceMap.Format format69 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap70 = format69.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping73 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str74 = locationMapping73.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping77 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray78 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping73, locationMapping77 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList79 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList79, locationMappingArray78);
        sourceMap70.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList79);
        sourceMap56.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList79);
        sourceMap40.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList79);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList79);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList79);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList79);
        sourceMap1.validate(false);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setStartingPosition((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format39);
        org.junit.Assert.assertNotNull(sourceMap40);
        org.junit.Assert.assertNotNull(format55);
        org.junit.Assert.assertNotNull(sourceMap56);
        org.junit.Assert.assertNotNull(format69);
        org.junit.Assert.assertNotNull(sourceMap70);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        org.json.JSONObject jSONObject4 = null;
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse(jSONObject4, sourceMapSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping4 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str5 = locationMapping4.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray9 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping4, locationMapping8 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList10 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList10, locationMappingArray9);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList10);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        sourceMap1.reset();
        java.lang.Class<?> wildcardClass20 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition((int) (byte) 1, (int) (byte) 100);
        sourceMap1.reset();
        com.google.javascript.rhino.Node node17 = null;
        com.google.debugging.sourcemap.FilePosition filePosition18 = null;
        com.google.debugging.sourcemap.FilePosition filePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node17, filePosition18, filePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        java.lang.Class<?> wildcardClass12 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping6 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping9 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str10 = locationMapping9.prefix;
        java.lang.String str11 = locationMapping9.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping14 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str15 = locationMapping14.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray16 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping6, locationMapping9, locationMapping14 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList17 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17, locationMappingArray16);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.setStartingPosition(0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.setStartingPosition((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        java.lang.String str3 = locationMapping2.prefix;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format2 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap3 = format2.getInstance();
        sourceMap3.setWrapperPrefix("");
        sourceMap3.reset();
        sourceMap3.setWrapperPrefix("");
        sourceMap3.validate(true);
        sourceMap3.validate(true);
        sourceMap3.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format15 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap16 = format15.getInstance();
        sourceMap16.setWrapperPrefix("");
        sourceMap16.reset();
        sourceMap16.setWrapperPrefix("");
        sourceMap16.validate(true);
        sourceMap16.validate(true);
        sourceMap16.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format28 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap29 = format28.getInstance();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.reset();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        sourceMap29.reset();
        sourceMap29.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format44 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap45 = format44.getInstance();
        sourceMap45.setWrapperPrefix("");
        sourceMap45.reset();
        sourceMap45.setWrapperPrefix("");
        sourceMap45.validate(true);
        sourceMap45.validate(true);
        sourceMap45.validate(true);
        sourceMap45.reset();
        com.google.javascript.jscomp.SourceMap.Format format58 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap59 = format58.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping62 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str63 = locationMapping62.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping66 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray67 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping62, locationMapping66 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList68 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68, locationMappingArray67);
        sourceMap59.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        sourceMap45.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        sourceMap29.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        sourceMap16.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        sourceMap3.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        sourceMap1.setStartingPosition((int) '#', (int) '#');
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(format15);
        org.junit.Assert.assertNotNull(sourceMap16);
        org.junit.Assert.assertNotNull(format28);
        org.junit.Assert.assertNotNull(sourceMap29);
        org.junit.Assert.assertNotNull(format44);
        org.junit.Assert.assertNotNull(sourceMap45);
        org.junit.Assert.assertNotNull(format58);
        org.junit.Assert.assertNotNull(sourceMap59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        java.lang.Class<?> wildcardClass4 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format16 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap17 = format16.getInstance();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.reset();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.reset();
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping34 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str35 = locationMapping34.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray39 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping34, locationMapping38 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList40 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40, locationMappingArray39);
        sourceMap31.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap17.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertNotNull(sourceMap17);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        sourceMap3.validate(false);
        sourceMap3.reset();
        sourceMap3.setWrapperPrefix("");
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap3.appendTo(appendable9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setStartingPosition((int) ' ', (int) (short) 100);
        sourceMap2.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping24 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        org.json.JSONObject jSONObject25 = null;
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier26 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse(jSONObject25, sourceMapSupplier26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
        org.junit.Assert.assertNull(originalMapping24);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap7 = format0.getInstance();
        com.google.javascript.rhino.Node node8 = null;
        com.google.debugging.sourcemap.FilePosition filePosition9 = null;
        com.google.debugging.sourcemap.FilePosition filePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap7.addMapping(node8, filePosition9, filePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(sourceMap7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 100);
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.reset();
        sourceMap27.setWrapperPrefix("");
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.validate(true);
        sourceMap27.reset();
        sourceMap27.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format42 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap43 = format42.getInstance();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.reset();
        sourceMap43.setWrapperPrefix("");
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.validate(true);
        sourceMap43.reset();
        com.google.javascript.jscomp.SourceMap.Format format56 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap57 = format56.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str61 = locationMapping60.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping64 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray65 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping60, locationMapping64 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList66 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66, locationMappingArray65);
        sourceMap57.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList66);
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.setStartingPosition((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(format56);
        org.junit.Assert.assertNotNull(sourceMap57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.replacement;
        java.lang.String str10 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping22 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping25 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str26 = locationMapping25.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping29 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping32 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str33 = locationMapping32.prefix;
        java.lang.String str34 = locationMapping32.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping37 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str38 = locationMapping37.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping41 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str42 = locationMapping41.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping45 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str46 = locationMapping45.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping49 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str50 = locationMapping49.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping53 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str54 = locationMapping53.prefix;
        java.lang.String str55 = locationMapping53.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray56 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping22, locationMapping25, locationMapping29, locationMapping32, locationMapping37, locationMapping41, locationMapping45, locationMapping49, locationMapping53 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList57 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57, locationMappingArray56);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        com.google.javascript.jscomp.SourceMap.Format format60 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap61 = format60.getInstance();
        sourceMap61.setWrapperPrefix("");
        sourceMap61.reset();
        sourceMap61.setWrapperPrefix("");
        sourceMap61.validate(true);
        sourceMap61.validate(true);
        sourceMap61.validate(true);
        sourceMap61.reset();
        com.google.javascript.jscomp.SourceMap.Format format74 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap75 = format74.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping78 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str79 = locationMapping78.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping82 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray83 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping78, locationMapping82 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList84 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84, locationMappingArray83);
        sourceMap75.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84);
        sourceMap61.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84);
        sourceMap1.setStartingPosition((int) (short) 1, 1);
        sourceMap1.reset();
        sourceMap1.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locationMappingArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(format60);
        org.junit.Assert.assertNotNull(sourceMap61);
        org.junit.Assert.assertNotNull(format74);
        org.junit.Assert.assertNotNull(sourceMap75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format14 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap15 = format14.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping18 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str19 = locationMapping18.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping22 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray23 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping18, locationMapping22 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList24 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24, locationMappingArray23);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        com.google.javascript.jscomp.SourceMap.Format format28 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap29 = format28.getInstance();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.reset();
        sourceMap29.setWrapperPrefix("");
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        sourceMap29.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format41 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap42 = format41.getInstance();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.reset();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.reset();
        sourceMap42.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format57 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap58 = format57.getInstance();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.reset();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.reset();
        com.google.javascript.jscomp.SourceMap.Format format71 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap72 = format71.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping75 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str76 = locationMapping75.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping79 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray80 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping75, locationMapping79 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList81 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81, locationMappingArray80);
        sourceMap72.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap58.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap42.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap29.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap1.setStartingPosition((int) (byte) 100, 0);
        sourceMap1.setStartingPosition((int) '#', 0);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format14);
        org.junit.Assert.assertNotNull(sourceMap15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(format28);
        org.junit.Assert.assertNotNull(sourceMap29);
        org.junit.Assert.assertNotNull(format41);
        org.junit.Assert.assertNotNull(sourceMap42);
        org.junit.Assert.assertNotNull(format57);
        org.junit.Assert.assertNotNull(sourceMap58);
        org.junit.Assert.assertNotNull(format71);
        org.junit.Assert.assertNotNull(sourceMap72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        sourceMap3.reset();
        sourceMap3.setWrapperPrefix("");
        sourceMap3.setStartingPosition(10, 100);
        com.google.javascript.rhino.Node node10 = null;
        com.google.debugging.sourcemap.FilePosition filePosition11 = null;
        com.google.debugging.sourcemap.FilePosition filePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap3.addMapping(node10, filePosition11, filePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) ' ', (int) (short) 100);
        sourceMap1.setStartingPosition((int) ' ', (int) (byte) 100);
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format19 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap20 = format19.getInstance();
        sourceMap20.setWrapperPrefix("");
        sourceMap20.reset();
        sourceMap20.setWrapperPrefix("");
        sourceMap20.validate(true);
        sourceMap20.validate(true);
        sourceMap20.validate(true);
        sourceMap20.reset();
        sourceMap20.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format35 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap36 = format35.getInstance();
        sourceMap36.setWrapperPrefix("");
        sourceMap36.reset();
        sourceMap36.setWrapperPrefix("");
        sourceMap36.validate(true);
        sourceMap36.validate(true);
        sourceMap36.validate(true);
        sourceMap36.reset();
        com.google.javascript.jscomp.SourceMap.Format format49 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap50 = format49.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping53 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str54 = locationMapping53.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping57 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray58 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping53, locationMapping57 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList59 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59, locationMappingArray58);
        sourceMap50.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59);
        sourceMap36.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59);
        sourceMap20.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59);
        java.lang.Appendable appendable65 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable65, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format19);
        org.junit.Assert.assertNotNull(sourceMap20);
        org.junit.Assert.assertNotNull(format35);
        org.junit.Assert.assertNotNull(sourceMap36);
        org.junit.Assert.assertNotNull(format49);
        org.junit.Assert.assertNotNull(sourceMap50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format16 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap17 = format16.getInstance();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.reset();
        sourceMap17.setWrapperPrefix("");
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.validate(true);
        sourceMap17.reset();
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping34 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str35 = locationMapping34.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray39 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping34, locationMapping38 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList40 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40, locationMappingArray39);
        sourceMap31.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap17.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap1.setStartingPosition((int) ' ', 100);
        sourceMap1.setStartingPosition(100, 0);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertNotNull(sourceMap17);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap7 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap8 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap9 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap10 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap11 = format0.getInstance();
        sourceMap11.reset();
        com.google.javascript.rhino.Node node13 = null;
        com.google.debugging.sourcemap.FilePosition filePosition14 = null;
        com.google.debugging.sourcemap.FilePosition filePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap11.addMapping(node13, filePosition14, filePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(sourceMap8);
        org.junit.Assert.assertNotNull(sourceMap9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(sourceMap11);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.reset();
        sourceMap14.setWrapperPrefix("");
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.validate(true);
        sourceMap14.reset();
        sourceMap14.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format29 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap30 = format29.getInstance();
        sourceMap30.setWrapperPrefix("");
        sourceMap30.reset();
        sourceMap30.setWrapperPrefix("");
        sourceMap30.validate(true);
        sourceMap30.validate(true);
        sourceMap30.validate(true);
        sourceMap30.reset();
        com.google.javascript.jscomp.SourceMap.Format format43 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap44 = format43.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping47 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str48 = locationMapping47.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping51 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray52 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping47, locationMapping51 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList53 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53, locationMappingArray52);
        sourceMap44.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap30.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap1.reset();
        java.lang.Class<?> wildcardClass60 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format29);
        org.junit.Assert.assertNotNull(sourceMap30);
        org.junit.Assert.assertNotNull(format43);
        org.junit.Assert.assertNotNull(sourceMap44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition((int) (byte) 1, (int) (byte) 100);
        sourceMap1.reset();
        java.lang.Class<?> wildcardClass17 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) (byte) 100, (int) (byte) 100);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition((int) 'a', 0);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.reset();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.reset();
        sourceMap5.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format20 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap21 = format20.getInstance();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.reset();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.reset();
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str39 = locationMapping38.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping42 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray43 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping38, locationMapping42 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList44 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44, locationMappingArray43);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap21.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.validate(true);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(sourceMap21);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format6 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap7 = format6.getInstance();
        sourceMap7.setWrapperPrefix("");
        sourceMap7.reset();
        sourceMap7.setWrapperPrefix("");
        sourceMap7.validate(true);
        sourceMap7.validate(true);
        sourceMap7.validate(true);
        sourceMap7.reset();
        com.google.javascript.jscomp.SourceMap.Format format20 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap21 = format20.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping24 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str25 = locationMapping24.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping28 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray29 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping24, locationMapping28 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList30 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30, locationMappingArray29);
        sourceMap21.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30);
        sourceMap7.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30);
        sourceMap5.setWrapperPrefix("");
        sourceMap5.validate(false);
        sourceMap5.setWrapperPrefix("");
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList41 = null;
        sourceMap5.setPrefixMappings(locationMappingList41);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(sourceMap21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) ' ', (int) (short) 100);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setStartingPosition((int) (short) 0, (int) 'a');
        com.google.javascript.rhino.Node node19 = null;
        com.google.debugging.sourcemap.FilePosition filePosition20 = null;
        com.google.debugging.sourcemap.FilePosition filePosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node19, filePosition20, filePosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.reset();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.setStartingPosition((int) ' ', (int) (short) 100);
        sourceMap5.setStartingPosition((int) ' ', (int) (byte) 100);
        com.google.javascript.jscomp.SourceMap.Format format21 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap22 = format21.getInstance();
        sourceMap22.setWrapperPrefix("");
        sourceMap22.reset();
        sourceMap22.setWrapperPrefix("");
        sourceMap22.validate(true);
        sourceMap22.validate(true);
        sourceMap22.setStartingPosition((int) (byte) 100, (int) (byte) 100);
        sourceMap22.setWrapperPrefix("hi!");
        sourceMap22.setStartingPosition((int) 'a', 0);
        com.google.javascript.jscomp.SourceMap.Format format40 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap41 = format40.getInstance();
        sourceMap41.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format44 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap45 = format44.getInstance();
        sourceMap45.setWrapperPrefix("");
        sourceMap45.reset();
        sourceMap45.setWrapperPrefix("");
        sourceMap45.validate(true);
        sourceMap45.validate(true);
        sourceMap45.validate(true);
        sourceMap45.reset();
        sourceMap45.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format60 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap61 = format60.getInstance();
        sourceMap61.setWrapperPrefix("");
        sourceMap61.reset();
        sourceMap61.setWrapperPrefix("");
        sourceMap61.validate(true);
        sourceMap61.validate(true);
        sourceMap61.validate(true);
        sourceMap61.reset();
        com.google.javascript.jscomp.SourceMap.Format format74 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap75 = format74.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping78 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str79 = locationMapping78.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping82 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray83 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping78, locationMapping82 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList84 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84, locationMappingArray83);
        sourceMap75.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84);
        sourceMap61.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84);
        sourceMap45.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84);
        sourceMap41.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84);
        sourceMap22.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84);
        sourceMap3.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList84);
        sourceMap3.reset();
        sourceMap3.reset();
        sourceMap3.validate(true);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format21);
        org.junit.Assert.assertNotNull(sourceMap22);
        org.junit.Assert.assertNotNull(format40);
        org.junit.Assert.assertNotNull(sourceMap41);
        org.junit.Assert.assertNotNull(format44);
        org.junit.Assert.assertNotNull(sourceMap45);
        org.junit.Assert.assertNotNull(format60);
        org.junit.Assert.assertNotNull(sourceMap61);
        org.junit.Assert.assertNotNull(format74);
        org.junit.Assert.assertNotNull(sourceMap75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(false);
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        java.lang.Appendable appendable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable19, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V3;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        java.lang.Class<?> wildcardClass5 = format0.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        sourceMap3.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format6 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap7 = format6.getInstance();
        sourceMap7.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format10 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap11 = format10.getInstance();
        sourceMap11.setWrapperPrefix("");
        sourceMap11.reset();
        sourceMap11.setStartingPosition((int) (byte) 10, 100);
        com.google.javascript.jscomp.SourceMap.Format format18 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap19 = format18.getInstance();
        sourceMap19.setWrapperPrefix("");
        sourceMap19.reset();
        sourceMap19.setWrapperPrefix("");
        sourceMap19.validate(true);
        sourceMap19.validate(true);
        sourceMap19.validate(true);
        sourceMap19.reset();
        sourceMap19.validate(false);
        sourceMap19.validate(false);
        sourceMap19.setWrapperPrefix("");
        sourceMap19.setWrapperPrefix("hi!");
        sourceMap19.reset();
        com.google.javascript.jscomp.SourceMap.Format format41 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap42 = format41.getInstance();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.reset();
        sourceMap42.setWrapperPrefix("");
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.validate(true);
        sourceMap42.reset();
        sourceMap42.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format57 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap58 = format57.getInstance();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.reset();
        sourceMap58.setWrapperPrefix("");
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.validate(true);
        sourceMap58.reset();
        com.google.javascript.jscomp.SourceMap.Format format71 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap72 = format71.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping75 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str76 = locationMapping75.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping79 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray80 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping75, locationMapping79 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList81 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81, locationMappingArray80);
        sourceMap72.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap58.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap42.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap19.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap11.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap7.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        sourceMap3.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList81);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(format10);
        org.junit.Assert.assertNotNull(sourceMap11);
        org.junit.Assert.assertNotNull(format18);
        org.junit.Assert.assertNotNull(sourceMap19);
        org.junit.Assert.assertNotNull(format41);
        org.junit.Assert.assertNotNull(sourceMap42);
        org.junit.Assert.assertNotNull(format57);
        org.junit.Assert.assertNotNull(sourceMap58);
        org.junit.Assert.assertNotNull(format71);
        org.junit.Assert.assertNotNull(sourceMap72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.reset();
        sourceMap5.setWrapperPrefix("");
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.validate(true);
        sourceMap5.reset();
        sourceMap5.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format20 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap21 = format20.getInstance();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.reset();
        sourceMap21.setWrapperPrefix("");
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.validate(true);
        sourceMap21.reset();
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str39 = locationMapping38.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping42 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray43 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping38, locationMapping42 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList44 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44, locationMappingArray43);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap21.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44);
        sourceMap1.setStartingPosition((int) (short) 0, (int) (short) 100);
        sourceMap1.setStartingPosition((int) 'a', (int) (short) 10);
        java.lang.Appendable appendable56 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable56, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(sourceMap21);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(locationMappingArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition((int) (byte) 100, (int) (byte) 100);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition((int) (byte) 10, (int) (byte) 0);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }
}

