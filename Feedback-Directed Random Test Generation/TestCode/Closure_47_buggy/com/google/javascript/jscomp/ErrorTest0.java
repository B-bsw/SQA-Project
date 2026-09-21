package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) '4', (int) (short) 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection1 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("", 10, (int) (short) -1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (int) '4');
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '4', (int) (byte) 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(100, (int) 'a');
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection4 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 100, 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(1, (int) ' ');
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 10, 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine(100, (int) (short) 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", 0, (int) (byte) 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection7 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 1, (int) '#');
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) '#', (int) (short) 10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 1, (int) 'a');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("hi!", 100, 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", 100, 100);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", 10, (int) (short) 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 10, (int) '#');
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', (int) (short) 100);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("", (int) '4', (int) (short) -1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection7 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", 100, 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, (int) ' ');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", 1, (int) (byte) 10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", 1, 100);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 1, 100);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(1, (-1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, 100);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) 'a', 100);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(1, (int) (byte) -1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) '4', (int) (short) 100);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', (int) (byte) 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", 100, 100);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) 'a', 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(10, (int) (short) 100);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 1, (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', (int) 'a');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 10, 10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) -1, 10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", 100, (int) (byte) 100);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(10, (int) ' ');
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) '4', (int) '#');
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) ' ', (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 1, (int) (byte) 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 1, 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (-1), (int) 'a');
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', (int) (short) 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", 1, 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) 'a', (int) (short) 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) '4', 10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (int) (byte) 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection7 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) (short) 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 0, 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", 100, (int) (byte) -1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', (int) (short) 10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 1, 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) (byte) 100);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) '4', (int) (byte) 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) '4', (int) (short) -1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", 0, 10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (-1), (int) (short) 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", 10, (int) 'a');
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 100, (-1));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) '#', (int) (byte) 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) '#', 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) '4', (int) ' ');
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) '#', (int) '#');
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) '4', 10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(10, (int) ' ');
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 1, (int) ' ');
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) '4', (int) (short) 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) '#', (int) (short) 100);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 100, 10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(100, (int) (byte) 100);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(1, (int) (byte) 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", 10, (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) '#', (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (-1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(1, (int) (short) 100);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) '4', (int) (byte) 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 100, 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (-1), 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", 0, 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(100, (int) (short) 100);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("hi!", 10, (int) ' ');
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, 10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) '4', 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (-1), (int) (byte) 1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) -1, 100);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) '4', 100);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', (int) (byte) 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 10, 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) -1, 100);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) -1, 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) '#');
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) ' ');
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 10, (int) ' ');
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) 'a', (int) (short) -1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", 0, 100);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 100, (int) (byte) 10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, (-1));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, 1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, 10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) ' ', 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 1, (int) '#');
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', 1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(100, (int) (short) 1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection4 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, 10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, 100);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 100, 100);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, 1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) '4', 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '4', 10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 100, 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (-1), 10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 10, (int) (byte) -1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) '4');
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("hi!", (-1), (-1));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) '#', (int) 'a');
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (-1), (int) (byte) 10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '#', 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", 1, (int) (byte) 100);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", 1, (int) (byte) 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", 1, 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) '4');
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, 100);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", 0, (int) (byte) 100);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) (byte) 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '#', (int) (short) -1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(100, (int) ' ');
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection4 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, (int) '#');
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) -1, (int) '4');
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '#', 1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(10, (int) (short) 1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(1, (int) 'a');
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(10, (-1));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) -1, 100);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(10, (int) (short) 10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 100, 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', (-1));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(1, (int) (byte) 100);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (int) (byte) 100);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 100, (-1));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", 0, 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", 10, (int) (short) 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) ' ');
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (-1));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, (int) '#');
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine(1, (int) (short) 1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", 0, (int) (short) 10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) ' ', (int) (short) -1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (-1), (int) ' ');
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) '#', 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) '#', (int) (byte) 10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", (-1), (int) (short) -1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (-1), (int) (byte) 100);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, (int) ' ');
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 0, 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 100, 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(10, (int) (byte) 10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) '#', (int) (short) -1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping24 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection4 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("", (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) '4');
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) 'a');
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '#', 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) '#', (int) (short) 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", 10, (int) (byte) 1);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '4', (int) ' ');
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) '4', (int) (byte) 10);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) (byte) 1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 100, 10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) '#', (int) (short) 1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", 0, (int) '4');
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) '#', (int) (short) 100);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', 10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) '4');
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 10, 100);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 100, 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) 'a', (int) (short) 1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '4', 1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", 0, (int) (byte) 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (int) (short) 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection7 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", (int) 'a', (int) (short) 1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 100, (int) 'a');
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 100, (-1));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) '#');
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) 'a');
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) '#');
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(100, (-1));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 10, 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(1, (-1));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection25 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '4', (int) (byte) 1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '#', (-1));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) '#', 1);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", 10, (int) (short) 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', 100);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 1, 100);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 0, 100);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine(10, (int) ' ');
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", 0, (int) (byte) 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection4 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(1, (int) (byte) 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, (int) 'a');
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) 'a', (int) '4');
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", 10, (int) '4');
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(1, (int) (short) -1);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', (int) (short) -1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 100, 10);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 1, (int) ' ');
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) (byte) -1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) (byte) -1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection4 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) -1, 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '4', (-1));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping24 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (int) (byte) -1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(10, (int) '#');
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 0, (int) (byte) 10);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) '4', (int) 'a');
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (int) ' ');
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine(10, (int) (byte) -1);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, 10);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", 0, 100);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(100, (int) (byte) -1);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(1, (int) 'a');
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(10, (int) (byte) 10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) -1, 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 100, (int) '4');
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) (byte) 100);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", 0, (int) (short) 1);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, 10);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) 'a', (int) (byte) 1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection25 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) ' ', (int) (short) 1);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 100, (int) 'a');
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", 10, (int) ' ');
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection25 = sourceMapConsumerV3_0.getReverseMapping("", (int) ' ', 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) -1, 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '4', (int) (short) 1);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) '4', (int) '4');
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 0, (int) '#');
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, 10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(1, 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) (short) 10);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) ' ', (int) 'a');
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) '4', (int) '#');
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(1, (int) (byte) 10);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) '#', (int) (byte) -1);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(100, (int) '#');
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) 'a', (int) '#');
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (-1), (-1));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", 100, (int) (byte) -1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) '#');
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (-1), (int) '#');
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", 10, (int) (short) 10);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(10, 100);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, 10);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '#', (int) (short) -1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection25 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(100, (int) ' ');
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '4', (int) (short) -1);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 100, (int) 'a');
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 0, (int) ' ');
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) '#', (int) (byte) 1);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, (-1));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) ' ', (int) ' ');
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, 10);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (-1));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", 10, (int) (short) 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", 0, (int) (byte) 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) -1, (-1));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, 1);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 0, (int) '4');
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) '4', 100);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection25 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 100, 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) -1, 1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) -1, 10);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", 0, (int) (byte) 100);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(1, (int) (byte) 100);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", 1, (int) (short) 10);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection4 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) 'a');
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) 'a');
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 10, (int) '#');
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (-1), (int) 'a');
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (int) (short) 10);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection22 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection22 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping24 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 100, (int) 'a');
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection7 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(100, (int) (short) 1);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '4', (int) '#');
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", 0, (int) ' ');
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", 10, (int) (short) 10);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, (int) '#');
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (-1), (int) 'a');
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) ' ', (int) (short) 1);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 0, (int) (short) 1);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", 0, (int) (short) 10);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) -1, 100);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection25 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, (int) '4');
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping24 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection28 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 10, 10);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) -1, 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 100, (int) ' ');
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 1, 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (-1));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("", (int) '#', (int) '#');
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (-1), (int) (byte) 1);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection4 = sourceMapConsumerV3_0.getReverseMapping("", 10, 1);
    }
}

