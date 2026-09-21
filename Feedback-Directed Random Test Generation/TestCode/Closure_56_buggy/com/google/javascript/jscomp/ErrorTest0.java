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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getNumLines();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region4 = sourceFile1.getRegion(100);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCodeNoCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Reader reader3 = sourceFile1.getCodeReader();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = sourceFile1.getLineOffset((int) (short) 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCodeNoCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = sourceFile1.getLine(10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCodeNoCache();
        java.lang.String str3 = sourceFile1.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = sourceFile1.getLineOffset((int) '4');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCodeNoCache();
        java.lang.String str3 = sourceFile1.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Reader reader4 = sourceFile1.getCodeReader();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        boolean boolean3 = sourceFile1.hasSourceInMemory();
        java.lang.String str4 = sourceFile1.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Reader reader5 = sourceFile1.getCodeReader();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = sourceFile1.getLine(0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        boolean boolean3 = sourceFile1.hasSourceInMemory();
        java.lang.String str4 = sourceFile1.getOriginalPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = sourceFile1.getLineOffset((int) (short) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region6 = sourceFile1.getRegion((int) '#');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCodeNoCache();
        java.lang.String str3 = sourceFile1.getCode();
        sourceFile1.setOriginalPath("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = sourceFile1.getLine(0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        boolean boolean3 = sourceFile1.hasSourceInMemory();
        java.lang.String str4 = sourceFile1.getCode();
        boolean boolean5 = sourceFile1.hasSourceInMemory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = sourceFile1.getLine((int) (byte) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCodeNoCache();
        java.lang.String str3 = sourceFile1.getCode();
        sourceFile1.setOriginalPath("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region7 = sourceFile1.getRegion(100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("");
        java.lang.String str5 = sourceFile1.getCodeNoCache();
        sourceFile1.setOriginalPath("");
        java.lang.String str8 = sourceFile1.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Reader reader9 = sourceFile1.getCodeReader();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCodeNoCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getNumLines();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        boolean boolean3 = sourceFile1.isExtern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = sourceFile1.getRegion(0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("");
        java.lang.String str5 = sourceFile1.getCode();
        java.lang.String str6 = sourceFile1.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = sourceFile1.getLineOffset((int) (short) -1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("");
        java.lang.String str5 = sourceFile1.getCodeNoCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region7 = sourceFile1.getRegion(100);
    }
}

