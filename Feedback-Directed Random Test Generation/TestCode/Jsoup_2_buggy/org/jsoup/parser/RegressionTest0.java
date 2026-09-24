package org.jsoup.parser;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!");
        java.lang.Class<?> wildcardClass3 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        java.lang.Class<?> wildcardClass3 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.lang.Class<?> wildcardClass3 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.Class<?> wildcardClass3 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.Class<?> wildcardClass3 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        java.lang.Class<?> wildcardClass3 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test9");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

