package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (int) (short) 1);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 100, 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", 0, (int) (byte) -1);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (-1), (int) (byte) 0);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        java.util.Collection<java.lang.String> strCollection25 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) '4', (int) (short) 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) '4', (int) (short) 0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", 1, (int) (byte) 0);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, 100);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) ' ');
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection7 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) (short) 10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, 0);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection22 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection22 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 100, 1);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("hi!", 100, 10);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) '4', (int) (short) -1);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((-1), 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", 100, 0);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, 100);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(10, (int) (byte) 1);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) 'a');
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping24 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) '#', (int) '4');
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, (int) '4');
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection13 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) ' ', 0);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) ' ', (int) (byte) 10);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 1, 0);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) '#');
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("", 100, (int) (byte) 100);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '#');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection10 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '#', (int) 'a');
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection7 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) '4', (int) (short) 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection22 = sourceMapConsumerV3_0.getReverseMapping("hi!", 0, (-1));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection22 = sourceMapConsumerV3_0.getOriginalSources();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("", (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection19 = sourceMapConsumerV3_0.getReverseMapping("", (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> originalMappingCollection16 = sourceMapConsumerV3_0.getReverseMapping("hi!", (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine(0, (int) '4');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = sourceMapConsumerV3_0.getOriginalSources();
    }
}

